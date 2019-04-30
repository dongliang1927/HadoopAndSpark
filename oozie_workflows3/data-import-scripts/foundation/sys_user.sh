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
HBASE_ROWKEY STRING, USERID STRING,FULLNAME STRING,ACCOUNT STRING,PASSWORD STRING,
ISEXPIRED STRING,ISLOCK STRING,CREATETIME STRING,STATUS STRING,EMAIL STRING,MOBILE STRING,
PHONE STRING,SEX STRING,PICTURE STRING,FROMTYPE STRING,CARD STRING,BIRTHDAY STRING,PICNAME STRING,
VERSION STRING,CREATEUSER STRING,CREATEBY STRING,UPDATETIME STRING,UPDATEBY STRING,UPDATEUSER STRING,
DEF4 STRING,DEF3 STRING,DEF2 STRING,DEF1 STRING,VALIDATION STRING,IP STRING,POSID STRING,POSNAME STRING,
PERSONID STRING,NEWPWD STRING,INITPWD STRING,OPERATECODE STRING,SPACEID STRING)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key, 
${column_family}:USERID, ${column_family}:FULLNAME, ${column_family}:ACCOUNT, ${column_family}:PASSWORD, 
${column_family}:ISEXPIRED, ${column_family}:ISLOCK, ${column_family}:CREATETIME, ${column_family}:STATUS, 
${column_family}:EMAIL, ${column_family}:MOBILE, ${column_family}:PHONE, ${column_family}:SEX, ${column_family}:PICTURE,
${column_family}:FROMTYPE, ${column_family}:CARD, ${column_family}:BIRTHDAY, ${column_family}:PICNAME, ${column_family}:VERSION,
${column_family}:CREATEUSER, ${column_family}:CREATEBY, ${column_family}:UPDATETIME, ${column_family}:UPDATEBY, ${column_family}:UPDATEUSER,
${column_family}:DEF4, ${column_family}:DEF3, ${column_family}:DEF2, ${column_family}:DEF1, ${column_family}:VALIDATION, 
${column_family}:IP, ${column_family}:POSID, ${column_family}:POSNAME, ${column_family}:PERSONID, ${column_family}:NEWPWD, 
${column_family}:INITPWD, ${column_family}:OPERATECODE, ${column_family}:SPACEID\")
TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
