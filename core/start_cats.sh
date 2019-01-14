#!bin/bash
export configpath=config/default
export flag=true
export path1=testng/test/testcase
export path2=testng/test/scenario

for i in "$@"; do
  if [ "$flag" == "false" ]; then 
    export configpath=$i
	break
  fi
  if [ "$i" == "-configpath" ]; then
    export flag=false
  fi
  if [ "$i" == "-mode" ]; then
    export path1=bdd/runner
    export path2=bdd/stepdef
  fi
done

export JVM_ARGS="-Xmx1024m -XX:MaxPermSize=256m"

cp -f ../customactions/lib/*.jar lib
java -jar "automatonplus-core-all.jar" -mode 0 $@

if [ -e $configpath/src ] 
then
  javac -cp ./lib/*:automatonplus-core-all.jar $configpath/src/com/sapient/qa/cats/core/selenium/$path1/*.java $configpath/src/com/sapient/qa/cats/core/selenium/$path2/*.java > jarOutput.txt
  file=${PWD}/../customactions/*.java
  arr=($file)

  if [ -e $arr ]
  then
    echo "compiling customaction classes"
    javac -cp ./lib/*:automatonplus-core-all.jar -d runtime ../customactions/*.java
    jar -cvf customactions-runtime.jar -C runtime . >> runtime.log
  fi

  jar -cvf $configpath/generatedtests.jar -C $configpath/src/ . > jarOutput.txt
  export CLASSPATH=$CLASSPATH:$configpath/generatedtests.jar
  FILES=$configpath/src/com/sapient/qa/cats/core/selenium/xml/CATSTestNGSuite*.xml

  for f in $FILES
  do
    java -cp ./lib/*:automatonplus-core-all.jar:$configpath/generatedtests.jar org.testng.TestNG -suitethreadpoolsize 1 $f
  done
fi
