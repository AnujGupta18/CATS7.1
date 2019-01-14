/**
* This source code is proprietary code of Sapient Consulting Services Pvt Ltd.
* Usage of this code without written approval from Sapient would be violation of
* Copyrights.
*
*/
package  com.sapient.qa.cats.core.selenium.testng.test.testcase;

/**
* All necessary packages needed to execute
*
**/
import com.sapient.qa.cats.core.constants.CATSConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import com.sapient.qa.cats.core.config.PropertiesCache;
import com.sapient.qa.cats.core.framework.CATSReportGenerationWrapper2;
import com.sapient.qa.cats.core.langimpl.LangDataSingleton;
import com.sapient.qa.cats.core.vo2.DynamicInstTestcaseClassExtend;
import com.sapient.qa.cats.core.vo2.StepsMap;
import java.io.File;
import com.sapient.qa.cats.core.config.CATSGlobal;
import com.sapient.qa.cats.core.browserdrivers.BrowserDriverMap;

/**
* TestNG Test source code generated via CATS framework generator.
* Generates TestSuite and Test XMLs based on the User Test Case and Test Data.
*
**/
public class  COMMON_RegisterAnAccount extends DynamicInstTestcaseClassExtend {

  public COMMON_RegisterAnAccount(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
    Properties prop;
    try {
      prop = PropertiesCache.loadProperties(CATSGlobal.configFolderLocation+File.separator+CATSConstants.CONFIG_FILE);
      propOnExitScenarioCloseBrowser=prop.getProperty("ON_EXIT_SCENARIO_CLOSE_BROWSER");
      propOnExitTestcaseCloseBrowser=prop.getProperty("ON_EXIT_TESTCASE_CLOSE_BROWSER");
    } catch(IOException e) {
      catsLogger.info(" Exception caught in reading property file "+e);
    }

    this.driver = driver;
    this.scenarioId=scenarioId;
    this.scnSeqId=scn_data_key_seq;
    this.suiteName=context.getAttribute("suiteName").toString();
    LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","COMMON_RegisterAnAccount");
    this.scn_exe_tc_seq=scn_exe_tc_seq;
    this.testCaseId = "COMMON_RegisterAnAccount";
    this.testCaseName="COMMON_RegisterAnAccount";
  }

  public  synchronized void  executeTestcase() {
    String locString="";
    try{
      PropertyConfigurator.configure(PropertiesCache.loadProperties(CATSGlobal.configFolderLocation+File.separator+CATSConstants.LOG4J_PROP_FILE));
    }catch(FileNotFoundException e){
      catsLogger.error("Caught FileNotFoundException log4j.properties");
    }catch(IOException e){
      catsLogger.error("Caught IOException: log4j.properties");
    }
    arg = CATSReportGenerationWrapper2.getInstance(this.suiteName);
    this.exnInstId=arg.findExecutionInstanceId(scenarioId,this.suiteName,scnSeqId,scn_exe_tc_seq);
    this.actualData=this.expectedResult="";

	stepMap.put(1, new StepsMap(1, "5", "ENTER",": Enter <$SignIn.Fname.FIELD1> into <Fname>","$SignIn.Fname.FIELD1","","","",null,"HomePage.LoginPage.Fname","",""));
	stepMap.put(2, new StepsMap(2, "6", "ENTER",": Enter <$SignIn.Lname.FIELD1> into <Lname>","$SignIn.Lname.FIELD1","","","",null,"HomePage.LoginPage.Lname","",""));
	stepMap.put(3, new StepsMap(3, "7", "GETRANDOMMAILID",": Get the random mail id","{{EmailID}}","8;@mailinator.com","","",null,"Custom","",""));
	stepMap.put(4, new StepsMap(4, "8", "ENTER",": Enter <{{EmailID}}> into <Email>","{{EmailID}}","","","",null,"HomePage.LoginPage.Email","",""));
	stepMap.put(5, new StepsMap(5, "9", "ENTER",": Enter <$SignIn.Password.FIELD1> into <Password>","$SignIn.Password.FIELD1","","","",null,"HomePage.LoginPage.Password","",""));
	stepMap.put(6, new StepsMap(6, "10", "ENTER",": Enter <$SignIn.ConfirmPassword.FIELD1> into <ConfirmPassword>","$SignIn.ConfirmPassword.FIELD1","","","",null,"HomePage.LoginPage.ConfirmPassword","",""));
	stepMap.put(7, new StepsMap(7, "11", "SCROLLINTOVIEW",": Scolls the <RegisterLink> into view","","","","",null,"HomePage.LoginPage.RegisterLink","",""));
	stepMap.put(8, new StepsMap(8, "12", "CLICK",": Click on <RegisterLink>","","","","",null,"HomePage.LoginPage.RegisterLink","",""));
	stepMap.put(9, new StepsMap(9, "13", "WAIT",": Wait","10","","","",null,"Custom","",""));

    //Test step 1.
    executeTestStep(stepMap.get(1));
    //Test step 2.
    executeTestStep(stepMap.get(2));
    //Test step 3.
    executeTestStep(stepMap.get(3));
    //Test step 4.
    executeTestStep(stepMap.get(4));
    //Test step 5.
    executeTestStep(stepMap.get(5));
    //Test step 6.
    executeTestStep(stepMap.get(6));
    //Test step 7.
    executeTestStep(stepMap.get(7));
    //Test step 8.
    executeTestStep(stepMap.get(8));
    //Test step 9.
    executeTestStep(stepMap.get(9));
      this.updateCNM();
  }

}
