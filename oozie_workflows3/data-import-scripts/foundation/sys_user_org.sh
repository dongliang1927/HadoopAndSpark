#!/bin/bash
# server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
# db_username="dongliang"
# db_password="123456"

server_addr=$1
db_username=$2
db_password=$3

db_table_name="sys_user_org"

hbase_namespace="sadan3"
hbase_table_name="sys_user_org"
column_family="basic"

#创建名空间
sqoop import \
-D sqoop.hbase.add.row.key=true \
--connect ${server_addr} \
--username ${db_username} \
--password ${db_password} \
--query "SELECT  '兰州市' as REGION, t.* FROM ${db_table_name} t where \$CONDITIONS" \
-m 1 \
--hbase-table ${hbase_namespace}:${hbase_table_name} \
--column-family ${column_family} \
--hbase-create-table \
--hbase-row-key REGION,USERID

#创建hive外部表
 hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace};
DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name};
CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}(
HBASE_ROWKEY STRING, USERORGID STRING,ORGID STRING,USERID STRING,ISPRIMARY STRING,ISCHARGE STRING,ISGRADEMANAGE STRING,ISDIRECTOR STRING)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key, 
${column_family}:USERORGID, ${column_family}:ORGID, ${column_family}:USERID, ${column_family}:ISPRIMARY,
${column_family}:ISCHARGE, ${column_family}:ISGRADEMANAGE, ${column_family}:ISDIRECTOR\")
TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
