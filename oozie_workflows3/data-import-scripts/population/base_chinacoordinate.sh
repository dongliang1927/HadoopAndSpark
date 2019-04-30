#!/bin/bash
#server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
#db_username="dongliang"
#db_password="123456"

server_addr=$1
db_username=$2
db_password=$3

# oracle ==> replace(t1,chr(63),'')chr(9)   --制表符 chr(10) --换行符 chr(13) --回车符 chr(32) --空格符 chr(34) --双引号“"”

db_table_name="base_chinacoordinate_new"

hbase_namespace="sadan3"
hbase_table_name="base_chinacoordinate"
column_family="basic"
# echo "create_namespace 'sadan3';quit;" | hbase shell
sqoop import \
-D sqoop.hbase.add.row.key=true \
--connect ${server_addr} \
--username ${db_username} \
--password ${db_password} \
--query "SELECT distinct coding_cnt,'兰州市' as region, prince,coding_prn,city,coding_city,county,iscapital,lng,lat FROM ${db_table_name} where \$CONDITIONS" \
-m 1  \
--hbase-table ${hbase_namespace}:${hbase_table_name} \
--column-family ${column_family} \
--hbase-create-table \
--hbase-row-key REGION,CODING_CNT

#创建hive外部表

hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace}; 
DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name}; 
CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}
(HBASE_ROWKEY STRING,prince STRING,coding_prn BIGINT,city STRING,coding_city BIGINT,county STRING,coding_cnt BIGINT,iscapital BIGINT,lng STRING,lat STRING) 
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' 
WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,${column_family}:prince,${column_family}:coding_prn,${column_family}:city,${column_family}:coding_city,${column_family}:county,${column_family}:coding_cnt,${column_family}:iscapital,${column_family}:lng,${column_family}:lat\") 
TBLPROPERTIES(\"hbase.table.name\" = \"sadan:${hbase_table_name}\")"

