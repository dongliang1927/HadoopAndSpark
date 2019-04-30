#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3


db_table_name="bpm_task_opinion"

hbase_namespace="sadan3"
hbase_table_name="bpm_task_opinion"
column_family="basic"

#创建名空间
# echo "create_namespace 'sadan';quit;" | hbase shell

sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT '兰州市' as REGION,OPINIONID ,ACTDEFID ,TASKNAME ,TASKKEY ,TASKID ,TASKTOKEN ,STARTTIME ,ENDTIME ,DURTIME ,EXEUSERID ,EXEFULLNAME ,OPINION ,CHECKSTATUS ,FORMDEFID ,FIELDNAME ,ACTINSTID ,SUPEREXECUTION ,FILEID ,SATISFACTION ,BACK ,ORGNAME ,ORGID ,BACKCHANNELNAME ,DEF1 ,DEF2 ,DEF3 ,BACKCHANNELID ,DEADLINE ,STATECODE ,BUSINESSKEY ,ISEXCEED ,NACTINSTID ,TURNORGNAME ,TURNORGID ,RECORDVOICE ,OLDEXEFULLNAME ,OLDORG ,oldorgname ,HOST ,STATENAME ,ISRESOLVE ,ISCOMPANYTORESOLVE ,ASSISTDEPART ,PHOTOURL  FROM ${db_table_name} where \$CONDITIONS" -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,OPINIONID


#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace}; DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name}; CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}(HBASE_ROWKEY STRING,OPINIONID BIGINT,ACTDEFID STRING,TASKNAME STRING,TASKKEY STRING,TASKID BIGINT,TASKTOKEN STRING,STARTTIME TIMESTAMP,ENDTIME TIMESTAMP,DURTIME BIGINT,EXEUSERID BIGINT,EXEFULLNAME STRING,OPINION STRING,CHECKSTATUS BIGINT,FORMDEFI BIGINT,FIELDNAME STRING,ACTINSTID BIGINT,SUPEREXECUTION BIGINT,FILEID STRING,SATISFACTION BIGINT,BACK STRING,ORGNAME STRING,ORGID BIGINT,BACKCHANNELNAME STRING,DEF1 STRING,DEF2 STRING,DEF3 STRING,BACKCHANNELID BIGINT,DEADLINE TIMESTAMP,STATECODE BIGINT,BUSINESSKEY BIGINT,ISEXCEED BIGINT,NACTINSTID DOUBLE,TURNORGNAME STRING,TURNORGID DOUBLE,RECORDVOICE STRING,OLDEXEFULLNAME STRING,OLDORG STRING,oldorgname STRING,HOST BIGINT,STATENAME STRING,ISRESOLVE STRING,ISCOMPANYTORESOLVE STRING,ASSISTDEPART STRING,PHOTOURL STRING) STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key, ${column_family}:OPINIONID,
${column_family}:ACTDEFID ,${column_family}:TASKNAME ,${column_family}:TASKKEY ,${column_family}:TASKID ,${column_family}:TASKTOKEN ,${column_family}:STARTTIME ,${column_family}:ENDTIME ,${column_family}:DURTIME ,${column_family}:EXEUSERID ,${column_family}:EXEFULLNAME ,${column_family}:OPINION ,${column_family}:CHECKSTATUS ,${column_family}:FORMDEFID ,${column_family}:FIELDNAME ,${column_family}:ACTINSTID ,${column_family}:SUPEREXECUTION ,${column_family}:FILEID ,${column_family}:SATISFACTION ,${column_family}:BACK ,${column_family}:ORGNAME ,${column_family}:ORGID ,${column_family}:BACKCHANNELNAME ,${column_family}:DEF1 ,${column_family}:DEF2 ,${column_family}:DEF3 ,${column_family}:BACKCHANNELID ,${column_family}:DEADLINE ,${column_family}:STATECODE ,${column_family}:BUSINESSKEY ,${column_family}:ISEXCEED ,${column_family}:NACTINSTID ,${column_family}:TURNORGNAME ,${column_family}:TURNORGID ,${column_family}:RECORDVOICE ,${column_family}:OLDEXEFULLNAME ,${column_family}:OLDORG ,${column_family}:oldorgname ,${column_family}:HOST ,${column_family}:STATENAME ,${column_family}:ISRESOLVE ,${column_family}:ISCOMPANYTORESOLVE ,${column_family}:ASSISTDEPART ,${column_family}:PHOTOURL\") TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
