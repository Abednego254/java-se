#!/bin/bash
echo "Enter the file name: "
read filename;
# shellcheck disable=SC1073
if [ -f "$filename" ]; then
do
  cat $filename
else
  echo "$filename created" >> $filename
done
#Prompts the user to enter a filename
#ii. Checks whether the file exists
#iii. If it exists, display its contents
#iv. If it does not exist, create the file and write “File created” into it


