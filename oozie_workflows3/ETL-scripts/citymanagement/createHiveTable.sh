
 
hive -e "CREATE DATABASE IF NOT EXISTS $1; DROP TABLE IF EXISTS $1.$3;
CREATE  TABLE $1.$3(rownames int,createtime timestamp,gpsid string,reportid string,bigtypeid string,baseorgid string,bigtypename string
,smalltypeid string,smalltypename string,subtypeid string,subtypename string,content string,title string,
path string,provinceid string,cityid string,districtid string,streetid string,communityid string,gridid string,provincename string,
cityname string,districtname string,streetname string,communityname string,gridname string)
STORED BY \"org.apache.hadoop.hive.hbase.HBaseStorageHandler\" 
WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,cf:createtime,cf:gpsid,cf:reportid,cf:bigtypeid,cf:baseorgid,cf:bigtypename,cf:smalltypeid,
cf:smalltypename,cf:subtypeid,cf:subtypename,cf:content,cf:title,cf:path,cf:provinceid,cf:cityid,cf:districtid,cf:streetid,cf:communityid,cf:gridid
,cf:provincename,cf:cityname,cf:districtname,cf:streetname,cf:communityname,cf:gridname\") 
TBLPROPERTIES(\"hbase.table.name\" = \"$1:$3\");
"

impala-shell -i $2 -q "INVALIDATE METADATA" 

