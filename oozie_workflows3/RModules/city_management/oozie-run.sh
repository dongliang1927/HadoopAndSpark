#!/bin/bash

hadoop fs -mkdir -p /user/${USER}/sadan/oozie/RModules/city_management/
hadoop fs -rm -r /user/${USER}/sadan/oozie/RModules/city_management/*
hadoop fs -put ./* /user/${USER}/sadan/oozie/RModules/city_management/

hadoop fs -chmod -R 755 /user/${USER}/sadan/oozie/RModules/city_management/

hadoop fs -ls /user/${USER}/sadan/oozie/RModules/city_management/

export OOZIE_URL=http://nn0.dm.bionta.com:11000/oozie
oozie job -config ./job.properties -run
