#!/bin/bash
# server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
# db_username="dongliang"
# db_password="123456"

server_addr=$1
db_username=$2
db_password=$3

db_table_name="bpm_delay"

hbase_namespace="sadan3"
hbase_table_name="bpm_delay"
column_family="basic"

#创建名空间
# echo "create_namespace 'sadan';quit;" | hbase shell

sqoop import -D sqoop.hbase.add.row.key=true --driver oracle.jdbc.OracleDriver --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT '兰州市' as region, DELAYCODE, APPLICANT, APPLICANTCODE, APPLICANTORGNAME, APPLICANTORGCODE, APPLICATIONTIME, APPLICATIONCASE, OPERATORCODE, OPERATORORGNAME, OPERATORORGCODE, OPERATOR, DELAYTIME, DELAYEVENTCODE, REPLAY, REPLAYTIME, REPLAYCONTENT, EVENTLIMIT, TASKID, APPROVALID, APPROVALNAME, TITLE, MEMO FROM ${db_table_name} where \$CONDITIONS " --map-column-java APPLICATIONCASE=String,REPLAYCONTENT=String -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,DELAYCODE

#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace}; DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name}; CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}(HBASE_ROWKEY STRING,DELAYCODE STRING,APPLICANT STRING,APPLICANTCODE STRING,APPLICANTORGNAME STRING,APPLICANTORGCODE STRING,APPLICATIONTIME TIMESTAMP,APPLICATIONCASE STRING,OPERATORCODE STRING,OPERATORORGNAME STRING,OPERATORORGCODE STRING,OPERATOR STRING,DELAYTIME TIMESTAMP,DELAYEVENTCODE STRING,REPLAY STRING,REPLAYTIME TIMESTAMP,REPLAYCONTENT STRING,EVENTLIMIT TIMESTAMP,TASKID BIGINT,APPROVALID STRING,APPROVALNAME STRING,TITLE STRING,MEMO STRING) STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,${column_family}:DELAYCODE, ${column_family}:APPLICANT, ${column_family}:APPLICANTCODE, ${column_family}:APPLICANTORGNAME, ${column_family}:APPLICANTORGCODE, ${column_family}:APPLICATIONTIME, ${column_family}:APPLICATIONCASE, ${column_family}:OPERATORCODE, ${column_family}:OPERATORORGNAME, ${column_family}:OPERATORORGCODE, ${column_family}:OPERATOR, ${column_family}:DELAYTIME, ${column_family}:DELAYEVENTCODE, ${column_family}:REPLAY, ${column_family}:REPLAYTIME, ${column_family}:REPLAYCONTENT, ${column_family}:EVENTLIMIT, ${column_family}:TASKID, ${column_family}:APPROVALID, ${column_family}:APPROVALNAME, ${column_family}:TITLE, ${column_family}:MEMO\") TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
