#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3

db_table_name="bpm_task_opinion_his"

hbase_namespace="sadan3"
hbase_table_name="bpm_task_opinion"
column_family="basic"

#创建名空间
# echo "create_namespace 'sadan';quit;" | hbase shell

sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT '兰州市' as REGION,OPINIONID ,ACTDEFID ,TASKNAME ,TASKKEY ,TASKID ,TASKTOKEN ,STARTTIME ,ENDTIME ,DURTIME ,EXEUSERID ,EXEFULLNAME ,OPINION ,CHECKSTATUS ,FORMDEFID ,FIELDNAME ,ACTINSTID ,SUPEREXECUTION ,FILEID ,SATISFACTION ,BACK ,ORGNAME ,ORGID ,BACKCHANNELNAME ,DEF1 ,DEF2 ,DEF3 ,BACKCHANNELID ,DEADLINE ,STATECODE ,BUSINESSKEY ,ISEXCEED ,NACTINSTID ,TURNORGNAME ,TURNORGID ,RECORDVOICE ,OLDEXEFULLNAME ,OLDORG ,oldorgname ,HOST ,STATENAME ,ISRESOLVE ,ISCOMPANYTORESOLVE ,ASSISTDEPART ,PHOTOURL  FROM ${db_table_name} where \$CONDITIONS" -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,OPINIONID

exit 0;