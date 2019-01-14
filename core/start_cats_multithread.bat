@echo off
cls
setlocal enabledelayedexpansion

set argCount=0
set count=1
set configpath=config/default
set number=0

set path1=testng/test/testcase
set path2=testng/test/scenario

FOR %%x in (%*) do (
  set /A argCount+=1
  Set /A count+=1
  set "argVec[!argCount!]=%%~x"
  IF /I -configPath==%%x (
    set number=!count!
  )
  IF /I -mode==%%x (
    set path1=bdd/runner
    set path2=bdd/stepdef
  )
)

IF NOT %number%==0 (
  set configpath=!argVec[%number%]!
)

set JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
java -jar "automatonplus-core-all.jar" -mode 0 %*

IF EXIST %configpath%\src\com\sapient\qa\cats\core\selenium\%path1%\*.java (
  javac -cp ./lib/*;automatonplus-core-all.jar %configpath%\src\com\sapient\qa\cats\core\selenium\%path1%\*.java %configpath%\src\com\sapient\qa\cats\core\selenium\%path2%\*.java > jarOutput.txt
  jar -cvf %configpath%/generatedtests.jar -C %configpath%/src/ .> jarOutput.txt

  IF EXIST %cd%\..\customactions\*.java (
    javac -cp ./lib/*;automatonplus-core-all.jar -d runtime ../customactions/*.java
    jar -cvf customactions-runtime.jar -C ./runtime . >> runtime.log
  )

  IF EXIST %configpath%\src\com\sapient\qa\cats\core\selenium\xml\CATSTestNGSuite.xml (
	java -cp ./lib/*;automatonplus-core-all.jar;%configpath%/generatedtests.jar; org.testng.TestNG -suitethreadpoolsize 10 %configpath%\src\com\sapient\qa\cats\core\SELENIUM\xml\CATSTestNGSuite.xml
  )

  @Echo off
  FOR %%1 in (%configpath%\src\com\sapient\qa\cats\core\SELENIUM\xml\CATSTestNGSuite_*.xml) do (
    echo %%1 | findstr /I /C:"_SEQ" 1>nul
    IF errorlevel 1 (
      java -cp ./lib/*;automatonplus-core-all.jar;%configpath%/generatedtests.jar; org.testng.TestNG -suitethreadpoolsize 10 %%1
    ) ELSE (
      java -cp ./lib/*;automatonplus-core-all.jar;%configpath%/generatedtests.jar; org.testng.TestNG -suitethreadpoolsize 1 %%1
    )
  )

  java -cp automatonplus-core-all.jar com.sapient.qa.cats.core.report2.JenkinsExecutionThresholdCheck %configpath%
)