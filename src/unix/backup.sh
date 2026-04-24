#!/bin/bash
source_dir="/home/user/data"
destination_dir="/backup"
timestamp=$(date +%Y%m%d_%H%M%S)

cp $source_dir/* $destination_dir
tar -czf $destination_dir/backup_$timestamp.tar.gz /ect/home
echo "Backup Complete"
#Backs up a directory /home/user/data
#Stores it in /backup
#Uses a timestamp in the filename
#Compresses the backup
