@echo off

cls

set JENKINS_WORKSPACE=E:\CATSWorkspace\automatonplus
set BUILD_PATH=%ROOT_PATH%\CATS\core

set CLASSPATH=%BUILD_PATH%\automatonplus-core-all.jar;
set input_path=%1

IF "%input_path%" == "" (
java -jar "automatonplus-core-all.jar" 0
javac -cp ./lib/*;automatonplus-core-all.jar src\com\sapient\qa\cats\core\selenium\testng\test\testcase\*.java src\com\sapient\qa\cats\core\selenium\testng\test\scenario\*.java > jarOutput.txt
jar -cvf generatedtests.jar -C src/ .
set CLASSPATH=%CLASSPATH%%BUILD_PATH%\generatedtests.jar;
java -cp ./lib/*;automatonplus-core-all.jar;generatedtests.jar; org.testng.TestNG src\com\sapient\qa\cats\core\SELENIUM\xml\CATSTestNGSuite.xml
) ELSE (
setlocal EnableDelayedExpansion
echo Test is a multi TDM
for /f %%X in ('dir /B /D %input_path%\Batch*') do (
set FILENAME=%input_path%\%%X
echo =========================== Current batch is !FILENAME! ===========================
java -jar "automatonplus-core-all.jar" !FILENAME!
javac -cp ./lib/*;automatonplus-core-all.jar src\com\sapient\qa\cats\core\selenium\testng\test\testcase\*.java src\com\sapient\qa\cats\core\selenium\testng\test\scenario\*.java > jarOutput.txt
jar -cvf generatedtests.jar -C src/ .
set CLASSPATH=%CLASSPATH%%BUILD_PATH%\generatedtests.jar;
java -cp ./lib/*;automatonplus-core-all.jar;generatedtests.jar; org.testng.TestNG src\com\sapient\qa\cats\core\SELENIUM\xml\CATSTestNGSuite.xml
)
)

java -cp automatonplus-core-all.jar com.sapient.qa.cats.core.report2.JenkinsExecutionThresholdCheck