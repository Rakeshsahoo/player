#!/bin/sh

echo Please enter project directory

##directory where jar file is located    
read dir

##mvn clean install

echo $PWD

##jar file name
jar_name=player-0.0.1-SNAPSHOT.jar
#java -jar $jar_name

## Permform some validation on input arguments, one example below
##if [ -z "$1" ] || [ -z "$2" ]; then
  ##      echo "Missing arguments, exiting.."
    ##    echo "Usage : $0 arg1 arg2"
      ##  exit 1
##fi
##C:/Users/srake/workspace/player
java -jar $dir/target/$jar_name
set /p delExit=Press the ENTER key to exit...: