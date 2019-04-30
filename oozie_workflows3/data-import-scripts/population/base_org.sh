#!/bin/bash

server_addr=$1
db_username=$2
db_password=$3


#server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
#db_username="dongliang"
#db_password="123456"

db_table_name="base_org"

hbase_namespace="sadan3"
hbase_table_name="base_org"
column_family="basic"

#创建名空间
#echo "create_namespace 'sadan3';quit;" | hbase shell

#sqoop import \
#-D sqoop.hbase.add.row.key=true \
#--connect ${server_addr} \
#--username ${db_username} \
#--password ${db_password} \
#--query "SELECT 'lanzhou' as REGION,ID,LEVELID,LEVELNAME,PARENTID,PATH,ORGNAME,CODENO,COORDINATEID,REMARK,STATUS,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,VERSION,DF1,DF2,DF3,DF4,DF5,DF6,DF7,DF8,DF9,DF10,BUILDINGID FROM ${db_table_name} where \$CONDITIONS" \
#-m 1 \
#--hbase-table ${hbase_namespace}:${hbase_table_name} \
#--column-family ${column_family} \
#--hbase-create-table \
#--hbase-row-key REGION,ID
sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT 'lanzhou' as REGION,ID,LEVELID,LEVELNAME,PARENTID,PATH,ORGNAME,CODENO,COORDINATEID,REPLACE(REPLACE(REPLACE(REMARK, CHR(10), ''), CHR(13), ''), CHR(01), '') AS REMARK,STATUS,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,VERSION,DF1,DF2,DF3,DF4,DF5,DF6,DF7,DF8,DF9,DF10,BUILDINGID FROM ${db_table_name} where \$CONDITIONS" -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,ID

# REPLACE(REPLACE(REPLACE(EVENTNAME, CHR(10), ''), CHR(13), ''), CHR(01), '') AS EVENTNAME

#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace};
 DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name};
 CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}
 (HBASE_ROWKEY STRING,ID BIGINT,LEVELID BIGINT,LEVELNAME STRING,PARENTID BIGINT,PATH STRING,ORGNAME STRING,CODENO STRING,COORDINATEID BIGINT,
 REMARK STRING,STATUS STRING,CREATEUSER STRING,CREATETIME TIMESTAMP,UPDATEUSER STRING,UPDATETIME TIMESTAMP,VERSION BIGINT,DF1 STRING,DF2 STRING,
 DF3 STRING,DF4 STRING,DF5 STRING,DF6 STRING,DF7 STRING,DF8 STRING,DF9 STRING,DF10 STRING,BUILDINGID BIGINT) 
 STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' 
 WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,${column_family}:ID,${column_family}:LEVELID,${column_family}:LEVELNAME,
 ${column_family}:PARENTID,${column_family}:PATH,${column_family}:ORGNAME,${column_family}:CODENO,${column_family}:COORDINATEID,
 ${column_family}:REMARK,${column_family}:STATUS,${column_family}:CREATEUSER,${column_family}:CREATETIME,${column_family}:UPDATEUSER,
 ${column_family}:UPDATETIME,${column_family}:VERSION,${column_family}:DF1,${column_family}:DF2,${column_family}:DF3,${column_family}:DF4,
 ${column_family}:DF5,${column_family}:DF6,${column_family}:DF7,${column_family}:DF8,${column_family}:DF9,${column_family}:DF10,
 ${column_family}:BUILDINGID\") TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
