#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3

db_table_name="sys_org"

hbase_namespace="sadan3"
hbase_table_name="sys_org"
column_family="basic"

#创建名空间
echo "create_namespace 'sadan';quit;" | hbase shell

sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT  '兰州市' as REGION, ORGID, DEMID, ORGNAME, ORGDESC , ORGSUPID, PATH, DEPTH, ORGTYPE, CREATORID, CREATETIME, UPDATEID, UPDATETIME, SN, FROMTYPE, ISLEAF, ORGPATHNAME , BASEORGID, BASEORGNAME, DATASID, DATASNAME, OPERATECODE FROM ${db_table_name} where \$CONDITIONS" -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,ORGID



#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace}; DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name}; CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}(HBASE_ROWKEY STRING, ORGID BIGINT, DEMID BIGINT, ORGNAME STRING, ORGDESC  STRING, ORGSUPID BIGINT, PATH STRING, DEPTH BIGINT, ORGTYPE BIGINT, CREATORID BIGINT, CREATETIME TIMESTAMP, UPDATEID BIGINT, UPDATETIME TIMESTAMP, SN BIGINT, FROMTYPE DOUBLE, ISLEAF DOUBLE, ORGPATHNAME  STRING, BASEORGID BIGINT, BASEORGNAME STRING, DATASID DOUBLE, DATASNAME STRING, OPERATECODE BIGINT) STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key, ${column_family}:ORGID, ${column_family}:DEMID, ${column_family}:ORGNAME, ${column_family}:ORGDESC , ${column_family}:ORGSUPID, ${column_family}:PATH, ${column_family}:DEPTH, ${column_family}:ORGTYPE, ${column_family}:CREATORID, ${column_family}:CREATETIME, ${column_family}:UPDATEID, ${column_family}:UPDATETIME, ${column_family}:SN, ${column_family}:FROMTYPE, ${column_family}:ISLEAF, ${column_family}:ORGPATHNAME , ${column_family}:BASEORGID, ${column_family}:BASEORGNAME, ${column_family}:DATASID, ${column_family}:DATASNAME, ${column_family}:OPERATECODE\") TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
