#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3

# server_addr="jdbc:oracle:thin:@//db.dm.bionta.com:1521/social"
# db_username="dongliang"
# db_password="123456"

db_table_name="CALL_EVENT_HIS"

hbase_namespace="sadan3"
hbase_table_name="call_event"
column_family="basic"

sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT '兰州市' as REGION, EVENTCODE, REPLACE(REPLACE(REPLACE(EVENTNAME, CHR(10), ''), CHR(13), ''), CHR(01), '') AS EVENTNAME, CNAME, CTEL, REPLACE(REPLACE(REPLACE(EVENTADDR, CHR(10), ''), CHR(13), ''), CHR(01), '') AS EVENTADDR, EVENTTIME, OCODE, ONAME, CHANNELCODE, CHANNELNAME, TYPEEVENTCODE, TYPEEVENTNAME, CATEGORYCODE, CATEGORYNAME, LEVELNAME, REGIONCODE, REGIONNAME, DELTIME, DELPERSONCODE, DELPERSONNAME, ISTURN, UNCODE, NOTE, STATENAME, STATECODE, REPLACE(REPLACE(REPLACE(CONTENT, CHR(10), ''), CHR(13), ''), CHR(01), '') AS CONTENT, CATEGORYSMALLCODE, CATEGORYSMALLNAME, ANNEXPATH, ANNEXNAME, MOBILE, INVALIDSTATE, EVENT_POINT, RECORD, ISPUBLIC, RANDOMCODE, ISEXCEED, VCODE, VNAME, SMID, ANNEXFILEIDS, CHECKSTATE, REGIONPATH, TURNORGNAME, GID, ISURGENTRMD, ISEXCEPTION, MINISATISFACTION, EVALUATE, COMMENTLABEL, ISANONYMOUS, REMIND, ESCAPEEVALUATE, OPINIONTASKID, OPINIONENDTIME, OPINIONDEADLINE FROM ${db_table_name} where \$CONDITIONS " --split-by EVENTCODE --map-column-java CONTENT=String  -m 8 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,EVENTCODE  
exit 0