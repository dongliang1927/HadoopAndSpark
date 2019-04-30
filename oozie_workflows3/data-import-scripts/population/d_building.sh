#!/bin/bash

server_addr=$1
db_username=$2
db_password=$3

#server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
#db_username="dongliang"
#db_password="123456"

db_table_name="d_building"

hbase_namespace="sadan3"
hbase_table_name="d_building"
column_family="basic"

#echo "create_namespace 'sadan3';quit;" | hbase shell

# -------------method 1-------------
#query_str="'SELECT '\'兰州市\'' as REGION,a.*  FROM ${db_table_name} a where \$CONDITIONS'"
#cmd="sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query ${query_str} -m 1 --map-column-java GEOM=String --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,ID"

#eval $cmd

# -------------method 2-------------

sqoop import \
-D sqoop.hbase.add.row.key=true \
--connect ${server_addr} \
--username ${db_username} \
--password ${db_password} \
--query "SELECT '兰州市' as REGION,a.* FROM ${db_table_name} a where \$CONDITIONS" \
-m 1 \
--map-column-java GEOM=String \
--hbase-table ${hbase_namespace}:${hbase_table_name} \
--column-family ${column_family} \
--hbase-create-table \
--hbase-row-key REGION,ID

#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace};
 DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name};
 CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}
(HBASE_ROWKEY STRING,ID BIGINT,ORGID BIGINT,ORGNAME STRING,GRIDID BIGINT,GRIDNAME STRING,BUILDINGGROUPID BIGINT,BUILDINGNAME STRING,CODENUMBER STRING,NAME STRING,
BASEBUILDINGTYPEID BIGINT,BASEBUILDINGTYPENAME STRING,BASEBUILDTYPEID BIGINT,BASEBUILDTYPENAME STRING,BASESTRUCTUREID BIGINT,BASESTRUCTURENAME STRING,NATUREID BIGINT,
NATURENAME STRING,HEIGHT BIGINT,ADDRESS STRING,USE STRING,BUILTYEAR BIGINT,STOREYABOVE BIGINT,STOREYUNDER BIGINT,ROOMNUMBYUNITFLOOR BIGINT,ROOMS BIGINT,UNITNUM BIGINT,
ISTOILET STRING,ISWATERMETER STRING,ISELECTRICMETER STRING,ISIMPORTANTPLACE STRING,AREA BIGINT,COORDINATEID BIGINT,PHOTO STRING,REMARK STRING,ATTRIBUTESTR STRING,
CREATEUSER STRING,CREATETIME TIMESTAMP,UPDATEUSER STRING,UPDATETIME TIMESTAMP,VERSION BIGINT,DF1 STRING,DF2 STRING,DF3 STRING,DF4 STRING,DF5 STRING,DF6 STRING,DF7 STRING,DF8 STRING,
DF9 STRING,DF10 STRING,BUILDINGADMIN STRING,BUILDINGCONTACT STRING,BUILDINGPOLICE STRING,BUILDINGPOLICETEL STRING,COMMANAGER STRING,COMMTEL STRING,ORGPATH STRING) 
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' 
WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,${column_family}:ID,${column_family}:ORGID,${column_family}:ORGNAME,${column_family}:GRIDID,${column_family}:GRIDNAME,
${column_family}:BUILDINGGROUPID,${column_family}:BUILDINGNAME,${column_family}:CODENUMBER,${column_family}:NAME,${column_family}:BASEBUILDINGTYPEID,${column_family}:BASEBUILDINGTYPENAME,
${column_family}:BASEBUILDTYPEID,${column_family}:BASEBUILDTYPENAME,${column_family}:BASESTRUCTUREID,${column_family}:BASESTRUCTURENAME,${column_family}:NATUREID,${column_family}:NATURENAME,
${column_family}:HEIGHT,${column_family}:ADDRESS,${column_family}:USE,${column_family}:BUILTYEAR,${column_family}:STOREYABOVE,${column_family}:STOREYUNDER,${column_family}:ROOMNUMBYUNITFLOOR,
${column_family}:ROOMS,${column_family}:UNITNUM,${column_family}:ISTOILET,${column_family}:ISWATERMETER,${column_family}:ISELECTRICMETER,${column_family}:ISIMPORTANTPLACE,${column_family}:AREA,
${column_family}:COORDINATEID,${column_family}:PHOTO,${column_family}:REMARK,${column_family}:ATTRIBUTESTR,${column_family}:CREATEUSER,${column_family}:CREATETIME,${column_family}:UPDATEUSER,
${column_family}:UPDATETIME,${column_family}:VERSION,${column_family}:DF1,${column_family}:DF2,${column_family}:DF3,${column_family}:DF4,${column_family}:DF5,${column_family}:DF6,${column_family}:DF7,
${column_family}:DF8,${column_family}:DF9,${column_family}:DF10,${column_family}:BUILDINGADMIN,${column_family}:BUILDINGCONTACT,${column_family}:BUILDINGPOLICE,${column_family}:BUILDINGPOLICETEL,
${column_family}:COMMANAGER,${column_family}:COMMTEL,${column_family}:ORGPATH\") 
TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"

