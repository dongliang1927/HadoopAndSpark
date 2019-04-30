#!/bin/bash
server_addr=$1
db_username=$2
db_password=$3

db_table_name="DISPUTE_REPORT"

hbase_namespace="sadan3"
hbase_table_name="dispute_report"
column_family="basic"

#创建名空间
# echo "create_namespace 'sadan';quit;" | hbase shell

sqoop import -D sqoop.hbase.add.row.key=true --connect ${server_addr} --username ${db_username} --password ${db_password} --query "SELECT '兰州市' as REGION,REPORTID, BIGTYPEID, BIGTYPENAME, SMALLTYPEID, SMALLTYPENAME, GPSID, ADDRESS, REPLACE(REPLACE(CONTENT, CHR(10), ''), CHR(13), '') AS CONTENT, STATE, REMARK, CREATEUSER, CREATETIME, UPDATEUSER, UPDATETIME, VERSION, DF1, DF2, DF3, DF4, DF5, DF6, DF7, SMID, TEMPATTACHMENT,  REPLACE(REPLACE(RESULT, CHR(10), ''), CHR(13), '') AS RESULT, CREATEUSERID, SUBTYPEID, SUBTYPENAME, TITLE, BASEORGID, BASEORGNAME, GRIDID, GRIDNAME, REPORTTIME, LEVELID, LEVELNAME, ISCANCEL, ISEXCEED, CODENO, REPORTFROM, CHECKSTATE, GEOM, GID, PARTYNAME, PARTYPHONE, ISEXCEPTION FROM ${db_table_name} where \$CONDITIONS " --map-column-java GEOM=String     -m 1 --hbase-table ${hbase_namespace}:${hbase_table_name} --column-family ${column_family} --hbase-create-table --hbase-row-key REGION,REPORTID

#创建hive外部表
hive -e "CREATE DATABASE IF NOT EXISTS ${hbase_namespace}; DROP TABLE IF EXISTS ${hbase_namespace}.${hbase_table_name}; CREATE EXTERNAL TABLE ${hbase_namespace}.${hbase_table_name}(HBASE_ROWKEY STRING,REPORTID	BIGINT, BIGTYPEID	BIGINT, BIGTYPENAME	STRING, SMALLTYPEID	BIGINT, SMALLTYPENAME	STRING, GPSID	STRING, ADDRESS	STRING, CONTENT	STRING, STATE	BIGINT, REMARK	STRING, CREATEUSER	STRING, CREATETIME	TIMESTAMP, UPDATEUSER	STRING, UPDATETIME	TIMESTAMP, VERSION	BIGINT, DF1	STRING, DF2	STRING, DF3	STRING, DF4	STRING, DF5	STRING, DF6	STRING, DF7	STRING, SMID	STRING, TEMPATTACHMENT	STRING, RESULT	STRING, CREATEUSERID	BIGINT, SUBTYPEID	BIGINT, SUBTYPENAME	STRING, TITLE	STRING, BASEORGID	BIGINT, BASEORGNAME	STRING, GRIDID	BIGINT, GRIDNAME	STRING, REPORTTIME	TIMESTAMP, LEVELID	BIGINT, LEVELNAME	STRING, ISCANCEL	BIGINT, ISEXCEED	BIGINT, CODENO	STRING, REPORTFROM	BIGINT, CHECKSTATE	BIGINT, GEOM	STRING, GID	STRING, PARTYNAME	STRING, PARTYPHONE	STRING, ISEXCEPTION	BIGINT) STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES(\"hbase.columns.mapping\"=\":key,${column_family}:REPORTID, ${column_family}:BIGTYPEID, ${column_family}:BIGTYPENAME, ${column_family}:SMALLTYPEID, ${column_family}:SMALLTYPENAME, ${column_family}:GPSID, ${column_family}:ADDRESS, ${column_family}:CONTENT, ${column_family}:STATE, ${column_family}:REMARK, ${column_family}:CREATEUSER, ${column_family}:CREATETIME, ${column_family}:UPDATEUSER, ${column_family}:UPDATETIME, ${column_family}:VERSION, ${column_family}:DF1, ${column_family}:DF2, ${column_family}:DF3, ${column_family}:DF4, ${column_family}:DF5, ${column_family}:DF6, ${column_family}:DF7, ${column_family}:SMID, ${column_family}:TEMPATTACHMENT, ${column_family}:RESULT, ${column_family}:CREATEUSERID, ${column_family}:SUBTYPEID, ${column_family}:SUBTYPENAME, ${column_family}:TITLE, ${column_family}:BASEORGID, ${column_family}:BASEORGNAME, ${column_family}:GRIDID, ${column_family}:GRIDNAME, ${column_family}:REPORTTIME, ${column_family}:LEVELID, ${column_family}:LEVELNAME, ${column_family}:ISCANCEL, ${column_family}:ISEXCEED, ${column_family}:CODENO, ${column_family}:REPORTFROM, ${column_family}:CHECKSTATE, ${column_family}:GEOM, ${column_family}:GID, ${column_family}:PARTYNAME, ${column_family}:PARTYPHONE, ${column_family}:ISEXCEPTION\") TBLPROPERTIES(\"hbase.table.name\" = \"${hbase_namespace}:${hbase_table_name}\")"
