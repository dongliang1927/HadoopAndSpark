#!/bin/bash

hadoop fs -mkdir -p /user/${USER}/sadan/oozie/ETL/ETL-scripts
hadoop fs -rm -r /user/${USER}/sadan/oozie/ETL/ETL-scripts/*
hadoop fs -put * /user/${USER}/sadan/oozie/ETL/ETL-scripts
hadoop fs -ls /user/${USER}/sadan/oozie/ETL/ETL-scripts

export OOZIE_URL=http://nn0.dm.bionta.com:11000/oozie
oozie job -config ./job.properties -run 
