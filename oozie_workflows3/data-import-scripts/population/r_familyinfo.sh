#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3

#server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
#db_username="dongliang"
#db_password="123456"

db_table_name="r_familyinfo"
hbase_namespace="sadan3"
hbase_table_name="r_familyinfo"
column_family="basic"

# echo "create_namespace 'sadan3';quit;" | hbase shell

# query_str="SELECT '兰州市' as REGION,ID, PEOPLEID, PEOPLENAME, FAMILYID, RELATIONS, NATURE, RELWITHAPP, RACODE, STATE, REMARK, CREATEUSER, CREATETIME, UPDATEUSER, UPDATETIME, VERSION, DF1, DF2, DF3, DF4, DF5, DF6, DF7, DF8, DF9, DF10, LIVEHOUSEID, LIVEADDRESS, ORGID, ORGNAME, ORGPATH, COORDINATEID, BUILDINGID, ISFAMILYANDLIVE, TYPE, REASONS FROM ${db_table_name} where \$CONDITIONS"
# query_str="SELECT '兰州市' as REGION,a.* FROM ${db_table_name} a where \$CONDITIONS"
sqoop import \
-D sqoop.hbase.add.row.key=true \
--connect ${server_addr} \
--username ${db_username} \
--password ${db_password} \
--query "SELECT '兰州市' as REGION,a.* FROM ${db_table_name} a where \$CONDITIONS" \
-m 1 \
--hbase-table ${hbase_namespace}:${hbase_table_name} \
--column-family ${column_family} \
--hbase-create-table \
--hbase-row-key REGION,ID

#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace};
 DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name};
  CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}
  (HBASE_ROWKEY STRING,ID BIGINT,PEOPLEID BIGINT,PEOPLENAME STRING,FAMILYID BIGINT,RELATIONS STRING,NATURE STRING,RELWITHAPP STRING,RACODE STRING,STATE STRING,
  REMARK STRING,CREATEUSER STRING,CREATETIME TIMESTAMP,UPDATEUSER STRING,UPDATETIME TIMESTAMP,VERSION BIGINT,DF1 STRING,DF2 STRING,DF3 STRING,DF4 STRING,DF5 STRING,
  DF6 STRING,DF7 STRING,DF8 STRING,DF9 STRING,DF10 STRING,LIVEHOUSEID BIGINT,LIVEADDRESS STRING,ORGID BIGINT,ORGNAME STRING,ORGPATH STRING,COORDINATEID BIGINT,
  BUILDINGID BIGINT,ISFAMILYANDLIVE STRING,TYPE STRING,REASONS STRING) 
  STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' 
  WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key, ${column_family}:ID,${column_family}:PEOPLEID, ${column_family}:PEOPLENAME, ${column_family}:FAMILYID, 
  ${column_family}:RELATIONS, ${column_family}:NATURE, ${column_family}:RELWITHAPP, ${column_family}:RACODE, ${column_family}:STATE, ${column_family}:REMARK, 
  ${column_family}:CREATEUSER, ${column_family}:CREATETIME, ${column_family}:UPDATEUSER, ${column_family}:UPDATETIME, ${column_family}:VERSION, ${column_family}:DF1,
   ${column_family}:DF2, ${column_family}:DF3, ${column_family}:DF4, ${column_family}:DF5, ${column_family}:DF6, ${column_family}:DF7, ${column_family}:DF8, 
   ${column_family}:DF9, ${column_family}:DF10, ${column_family}:LIVEHOUSEID, ${column_family}:LIVEADDRESS, ${column_family}:ORGID, ${column_family}:ORGNAME, 
   ${column_family}:ORGPATH, ${column_family}:COORDINATEID, ${column_family}:BUILDINGID, ${column_family}:ISFAMILYANDLIVE, ${column_family}:TYPE, ${column_family}:REASONS\") 
   TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"

