#!/bin/sh

echo Please enter project directory

##directory where jar file is located    
read dir

mvn clean install


##jar file name
jar_name=player-0.0.1-SNAPSHOT.jar
#java -jar $jar_name

##C:/Users/srake/workspace/player
java -jar $dir/target/$jar_name