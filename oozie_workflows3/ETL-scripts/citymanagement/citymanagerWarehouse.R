# 
rm(list=ls())
## Loading library packages
library(rJava)
library(rjson)
library(plyr)
options(scipen = 20)
options(digits = 20)

argv <- commandArgs(TRUE)
Cur_Path <- as.character(argv[1])

HiveInsertFunc <- function(hiveconnection,inputtable,outputtable,impalaurl,step=1000){
  # HiveInsertFunc <- function(hiveconnection,inputtable,outputtable,n=1){
  # # 连接，输入框名，输出表名，分n次写入
  #该函数实现，将结果表写入Hive表中
  # Village_name <- inputtable
  for(eachcolname in names(inputtable)){
    inputtable[,eachcolname] <- gsub("'","***",as.character(inputtable[,eachcolname]))
    inputtable[,eachcolname] <- gsub("\\","***",as.character(inputtable[,eachcolname]),fixed=TRUE)
  }
  
  out_table_information_in <- outputtable
  hiveconnection <- hiveconnection
  m <- ceiling(nrow(inputtable)/step)
  startrow <- 1  
  for(eachnrow in 1:m){
    Village_name <- inputtable[(startrow:(startrow + step-1)),]
    Village_name <- Village_name[!is.na(Village_name$rownames),]
    startrow <- startrow + step
    finalStr <- "paste(Village_name[,1]"
    for (i in 2:(length(Village_name))){
      finalStr <- paste(finalStr,",Village_name[,",i,"]",sep="")
    }
    finalStr <- paste(finalStr,",sep=\"','\",collapse = \"'),('\")")
    sql_values <- paste("('",eval(parse(text = finalStr)),"')",sep="")
    columnames <- paste("(",paste(names(inputtable),collapse = ",",sep=""),")",sep="")
    insertsql <- paste("insert into ",out_table_information_in,columnames," values ",sql_values,sep="")
    insertsql_clean <- gsub("[^[:print:]]", "",insertsql)
    result <- RJDBC::dbSendUpdate(hiveconnection,insertsql_clean)
  }
  system(paste("impala-shell -i ",impalaurl," -q \"INVALIDATE METADATA\"",sep="") )
  print("DONE")
}

inserHiveFunctionV2 <- function(hiveconnection,hivedatabase,impalaurl,step=10000,...){
  cmd <- paste(Cur_Path,"/createHiveTable.sh ",hivedatabase," ",impalaurl,sep="")
  if(length(list(...))>0){
    arg <- list(...)
    for(eachindex in 1:length(arg)){
      if(eachindex %%2 ==0){
        cmd <- paste(cmd,arg[[eachindex]],sep=" ")
      }
    }
    system(cmd)
  }else{
    stop("input args wrong..")
  }
  if(length(list(...))>0){
    arg <- list(...)
    for(eachindex in 1:length(arg)){
      if(eachindex %%2 !=0){
        
        result_dataframe <- arg[[eachindex]]
        result_database <- arg[[eachindex+1]]
        result_dataframe$rownames <- 1:nrow(result_dataframe)
        
        intable <- result_dataframe
        HiveInsertFunc(hiveconnection,intable,result_database,impalaurl,step)
        print(paste("inserted into table:",arg[[eachindex+1]]))
      }
    }
  }else{
    stop("input args wrong..")
  }
  
}



# Cur_Path <- "/data/home/dongliang/datamining/data-mining/projects/v2.0/wareHouse-lanzhou/CITYMANAGER"
jsonPath <- paste(Cur_Path,"/config.json",sep = "")
configData <- fromJSON(file = jsonPath)

intableBaseorg <- as.character(configData[["intableBaseorg"]])
intableCityDisputeReport <- as.character(configData[["intableCityDisputeReport"]])
outtableCityDisputeReport <- as.character(configData[["outtableCityDisputeReport"]])

#read hive parameters
# ****************************************************************
impalaurl <- as.character(configData[["impalaurl"]])
hive_driver_path <- as.character(configData[["hivedriver"]])
hive_name <- as.character(configData[["hiveuser"]])
hive_password <- as.character(configData[["hivepassword"]])
hive_url_in <- as.character(configData[["hiveurlin"]])
hive_url_out <- as.character(configData[["hiveurlout"]])
hivedatabase <- unlist(strsplit(hive_url_in,'/'))
hivedatabase <- hivedatabase[length(hivedatabase)]
# ****************************************************************

# ****************************数据输入****************************
cp <- c(list.files(hive_driver_path, pattern = "[.]jar", full.names = TRUE, recursive = TRUE), recursive = TRUE)
drv <- RJDBC::JDBC(driverClass = "org.apache.hive.jdbc.HiveDriver", classPath = cp)

hiveconnection <- RJDBC::dbConnect(drv, hive_url_in, user = hive_name, password = hive_password)
dispute_report <- RJDBC::dbGetQuery(hiveconnection, 
                                    paste("select createtime,gpsid,reportid,baseorgid,bigtypeid,bigtypename,smalltypeid,smalltypename,subtypeid,subtypename,content,title from ", 
                                          intableCityDisputeReport, " where bigtypeid = '10000016360359'"))
base_org <- RJDBC::dbGetQuery(hiveconnection,paste("select id as baseorgid,orgname,path from ",intableBaseorg, sep=""))

RJDBC::dbDisconnect(hiveconnection)

# setwd(Cur_Path)
# file.remove("InputData.RData")
# save.image("InputData.RData")
# load("InputData.RData")
# ****************************数据操作****************************

result_dispute_report <- plyr::join(dispute_report,base_org,type="left",by="baseorgid")

# result_dispute_report <- result_dispute_report[1:300,]
result_dispute_report$gpsid1 <- gsub((quote("[\"{}:xy]")),"",as.character(result_dispute_report$gpsid))
result_dispute_report$lng <- gsub(",.*","",result_dispute_report$gpsid1)
result_dispute_report$lat <- gsub(".*,","",result_dispute_report$gpsid1)
result_dispute_report$lng <- as.numeric(result_dispute_report$lng)
result_dispute_report$lat <- as.numeric(result_dispute_report$lat)

result_dispute_report_NA <- result_dispute_report[is.na(result_dispute_report$lng),]
result_dispute_report <- result_dispute_report[!is.na(result_dispute_report$lng),]

#实现经纬度位置的统一
swapindex <- result_dispute_report$lng < result_dispute_report$lat
truelat <- result_dispute_report[swapindex,]$lng
result_dispute_report[swapindex,]$lng <- result_dispute_report[swapindex,]$lat
result_dispute_report[swapindex,]$lat <- truelat

coordTranfunc <- function(dataframe = dispute_report){
  #实现兰州2.5v转百度地图
  
  t <- apply(dataframe,1,function(dataframetmp=dataframe,lat,lng){
    R <- 6378137
    R_MINOR <- 6356752.314245179
    d <- 180/pi
    r <- R
    tmp <- R_MINOR /r
    e <- sqrt(1-tmp*tmp)
    ts <- exp((-as.numeric(dataframetmp[lat]))/r)
    phi <- pi/2-2*atan(ts)
    
    i <- 0
    dphi <- 0.1
    while((i < 15) & abs(dphi)>10^(-7)){
      con <- e*sin(phi)
      con = ((1-con)/(1+con))^(e/2)
      dphi <- pi/2-2*atan(ts*con) - phi
      phi = phi + dphi
      i <- i+1
    }
    c(as.numeric(dataframetmp[lng])*d/r,phi*d)
  },lat="lat",lng="lng")
  
  coord <- data.frame(t(t))
  dataframe$lng <- coord[,1]
  dataframe$lat <- coord[,2]
  #返回经过坐标转换后的数据框
  return(dataframe)
}
#挑选出2.5v的坐标进行转换，合并转换后的与正常百度坐标
dispute_report_25V <- result_dispute_report[result_dispute_report$lng > 180,]
dispute_report_25 <- coordTranfunc(dispute_report_25V)
dispute_report_2V <- result_dispute_report[(result_dispute_report$lng < 136) & (result_dispute_report$lng > 73),]
result_dispute_report <- rbind(dispute_report_25,dispute_report_2V)

result_dispute_report$gpsid <- paste(result_dispute_report$lng,result_dispute_report$lat,sep=",")
result_dispute_report <- rbind(result_dispute_report,result_dispute_report_NA)
result_dispute_report$gpsid1 <- NULL
result_dispute_report$lng <- NULL
result_dispute_report$lat <- NULL
# *********************************展开路径************************************************

result_dispute_report$provinceid <- NA
result_dispute_report$cityid <- NA
result_dispute_report$districtid <- NA
result_dispute_report$streetid <- NA
result_dispute_report$communityid <- NA
result_dispute_report$gridid <- NA

# dplyr::bind_rows 

# strsplit(result_dispute_report$path,"\\.")

pathlevel <- sapply(gregexpr("[.]",result_dispute_report$path),length)
#grid level
gridlevel <- which(pathlevel == 6)
grid_result_dispute_report <- result_dispute_report[gridlevel,]
grid_result_path <- do.call("rbind",strsplit(grid_result_dispute_report$path,"\\."))
grid_result_dispute_report$provinceid <- grid_result_path[,2]
grid_result_dispute_report$cityid <- grid_result_path[,3]
grid_result_dispute_report$districtid <- grid_result_path[,4]
grid_result_dispute_report$streetid <- grid_result_path[,5]
grid_result_dispute_report$communityid <- grid_result_path[,6]
grid_result_dispute_report$gridid <- grid_result_path[,7]

#communityid level
communitylevel <- which(pathlevel == 5)
community_result_dispute_report <- result_dispute_report[communitylevel,]
community_result_path <- do.call("rbind",strsplit(community_result_dispute_report$path,"\\."))
community_result_dispute_report$provinceid <- community_result_path[,2]
community_result_dispute_report$cityid <- community_result_path[,3]
community_result_dispute_report$districtid <- community_result_path[,4]
community_result_dispute_report$streetid <- community_result_path[,5]
community_result_dispute_report$communityid <- community_result_path[,6]

# #streetid level
# streetlevel <- which(pathlevel == 4)
# street_result_dispute_report <- result_dispute_report[streetlevel,]
# street_result_path <- do.call("rbind",strsplit(street_result_dispute_report$path,"\\."))
# street_result_dispute_report$provinceid <- street_result_path[,2]
# street_result_dispute_report$cityid <- street_result_path[,3]
# street_result_dispute_report$districtid <- street_result_path[,4]
# street_result_dispute_report$streetid <- street_result_path[,5]

final_result_dispute_report <- rbind(community_result_dispute_report,grid_result_dispute_report)

# province
tmp_base_org <- plyr::rename(base_org,c("baseorgid"="provinceid","orgname"="provincename"))
tmp_base_org <- tmp_base_org[c("provinceid","provincename")]
tmp_base_org$provinceid <- as.character(tmp_base_org$provinceid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="provinceid")

tmp_base_org <- plyr::rename(base_org,c("baseorgid"="cityid","orgname"="cityname"))
tmp_base_org <- tmp_base_org[c("cityid","cityname")]
tmp_base_org$cityid <- as.character(tmp_base_org$cityid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="cityid")

tmp_base_org <- plyr::rename(base_org,c("baseorgid"="districtid","orgname"="districtname"))
tmp_base_org <- tmp_base_org[c("districtid","districtname")]
tmp_base_org$districtid <- as.character(tmp_base_org$districtid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="districtid")

tmp_base_org <- plyr::rename(base_org,c("baseorgid"="streetid","orgname"="streetname"))
tmp_base_org <- tmp_base_org[c("streetid","streetname")]
tmp_base_org$streetid <- as.character(tmp_base_org$streetid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="streetid")

tmp_base_org <- plyr::rename(base_org,c("baseorgid"="communityid","orgname"="communityname"))
tmp_base_org <- tmp_base_org[c("communityid","communityname")]
tmp_base_org$communityid <- as.character(tmp_base_org$communityid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="communityid")

tmp_base_org <- plyr::rename(base_org,c("baseorgid"="gridid","orgname"="gridname"))
tmp_base_org <- tmp_base_org[c("gridid","gridname")]
tmp_base_org$gridid <- as.character(tmp_base_org$gridid)
final_result_dispute_report <- join(final_result_dispute_report,tmp_base_org,type="left",by="gridid")

# ************************format**********************
final_result_dispute_report$createtime <- as.POSIXct(final_result_dispute_report$createtime)
final_result_dispute_report$baseorgid <- as.character(final_result_dispute_report$baseorgid)
final_result_dispute_report$bigtypeid <- as.character(final_result_dispute_report$bigtypeid)
final_result_dispute_report$smalltypeid <- as.character(final_result_dispute_report$smalltypeid)
final_result_dispute_report$subtypeid <- as.character(final_result_dispute_report$subtypeid)
final_result_dispute_report$reportid <- as.character(final_result_dispute_report$reportid)
final_result_dispute_report$orgname <- NULL

# **************************保存数据***************************
cp <- c(list.files(hive_driver_path, pattern = "[.]jar", full.names = T, recursive = T), recursive = T)
drv <- RJDBC::JDBC(driverClass = "org.apache.hive.jdbc.HiveDriver", classPath = cp)
hiveconnection <- RJDBC::dbConnect(drv, hive_url_out, user = hive_name, password = hive_password)
inserHiveFunctionV2(hiveconnection, hivedatabase, impalaurl, step = 10000, 
                    final_result_dispute_report, outtableCityDisputeReport)
RJDBC::dbDisconnect(hiveconnection)

# ***************BUG***************

# coordTrans <- function(gpsid){
#   if(is.na(gpsid)){
#     return(0)
#   }else{
#     gpsid1 <- gsub((quote("[\"{}:xy]")),"",as.character(gpsid))
#     lng <- gsub(",.*","",gpsid1)
#     lat <- gsub(".*,","",gpsid1)
#     lng <- as.numeric(lng)
#     lat <- as.numeric(lat)
#     # 经纬度转会
#     if(lng < lat){tmp <- lng;lng <- lat;lat <- tmp}
#     # 2.5V转2V
#     if(lng > 2000){
#       R <- 6378137
#       R_MINOR <- 6356752.314245179
#       d <- 180/pi
#       r <- R
#       tmp <- R_MINOR /r
#       e <- sqrt(1-tmp*tmp)
#       ts <- exp((-as.numeric(lat))/r)
#       phi <- pi/2-2*atan(ts)
#       
#       i <- 0
#       dphi <- 0.1
#       while((i < 15) & abs(dphi)>10^(-7)){
#         con <- e*sin(phi)
#         con = ((1-con)/(1+con))^(e/2)
#         dphi <- pi/2-2*atan(ts*con) - phi
#         phi = phi + dphi
#         i <- i+1
#       }
#       paste(as.numeric(lng)*d/r,phi*d,sep = ",")
#       # return(paste(as.numeric(lng)*d/r,phi*d,sep = ","))
#     }else{
#       # return(paste(lng,lat,sep=","))
#       paste(lng,lat,sep=",")
#     }
#   }
#   
# }
# result_dispute_report$gpsid <- coordTrans(result_dispute_report$gpsid)


# tt <- apply(result_dispute_report, 1, function(dataframe,path){
#   dispute <- data.frame()
#   dispute$provinceid <- NULL
#   dispute$cityid <- NULL
#   dispute$districtid <- NULL
#   dispute$streetid <- NULL
#   dispute$communityid <- NULL
#   dispute$gridid <- NULL
#   datalist <- strsplit(dataframe[path],"\\.")
#   
#   dispute$provinceid <- pathlist[[1]]
#   dispute$cityid <- pathlist[[2]]
#   dispute$districtid <- pathlist[[3]]
#   dispute$streetid <- pathlist[[4]]
#   dispute$communityid <- pathlist[[5]]
#   dispute$gridid <- pathlist[[6]]
#   
# },path="path")
# 

