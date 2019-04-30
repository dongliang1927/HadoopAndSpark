#!/bin/bash

## 3.1
## �������룬��������ʷ���ݼ�ʹudpate
## �����ӽ�������id���ڣ����������ݡ�����ʷ���ݲ���transfer����ʹԴ������update������
## �����иó���ʱ�����Զ���ӡ�����һ�м�¼��id������Ϊ�´����е����
sqoop import \
--connect jdbc:mysql://mysql.example.com/sqoop \
--username sqoop \
--password sqoop \
--table visits \
--incremental append \
--check-column id \
--last-value 1

## 3.2
## �������룬������ʷ���ݣ����udpate
sqoop import \
--connect jdbc:mysql://mysql.example.com/sqoop \
--username sqoop \
--password sqoop \
--table visits \
--incremental lastmodified \
--check-column last_update_date \
--last-value "2013-05-22 01:01:01"

## 3.3
## �½�һ����������job���ڽ�� --last-value �����洢���⣬ÿ��ִ�ж����Զ���¼�ϴε� --last-value�������Զ�ִ�С�
sqoop job \
	--create visits \
-- \
import \
--connect jdbc:mysql://mysql.example.com/sqoop \
--username sqoop \
--password sqoop \
--table visits \
--incremental append \
--check-column id \
--last-value 0

sqoop job --exec visits
sqoop job --list # �г�����job
sqoop job --delete visits # ɾ��job
sqoop job --show visits # ��ʾ����

## 3.4
## security of password
# best way is use --password-file, 
# the other is set property 'sqoop.metastore.client.recordpassword' in the 'sqoop-site.xml' to 'ture'

## 3.5 overiding the arguments to a saved job
## use the following syntax to add parameter into a existed job:
sqoop job --exec visits -- --verbose # this add must be stay with the next execute, because it always store the value of the last imported row into the metastore

## 3.5 shareing the metastore between sqoop clients
## start a metastore service, and use this metastore's job and parameter to other client
sqoop metastore
## other clients can connect to this metastore by specifying the parameter --meta-connect with the URL of this mechine
sqoop job
	--create visits \ 
	--meta-connect jdbc:hsqldb:hsql://hsql:metastore.example.com:16000/sqoop \ ## you can set it in the config files "sqoop-site.xml", which set the 'sqoop.metastore.client.autoconnect.url' 
	-- \
	import \
	--table visits
	...