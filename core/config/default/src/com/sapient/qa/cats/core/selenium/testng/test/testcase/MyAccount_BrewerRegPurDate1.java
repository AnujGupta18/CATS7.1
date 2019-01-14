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
public class  MyAccount_BrewerRegPurDate1 extends DynamicInstTestcaseClassExtend {

  public MyAccount_BrewerRegPurDate1(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
    LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","MyAccount_BrewerRegPurDate1");
    this.scn_exe_tc_seq=scn_exe_tc_seq;
    this.testCaseId = "MyAccount_BrewerRegPurDate1";
    this.testCaseName="MyAccount_BrewerRegPurDate1";
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

	stepMap.put(1, new StepsMap(1, "517", "CLICK",": Click on <CoffeMakers>","","","","",null,"MyAccount.MyCoffeeMakers.CoffeMakers","",""));
	stepMap.put(2, new StepsMap(2, "518", "SCROLLINTOVIEW",": Scolls the <CoffeMakers> into view","","","","",null,"MyAccount.MyCoffeeMakers.CoffeMakers","",""));
	stepMap.put(3, new StepsMap(3, "519", "CLICK",": Click on <RegisterMyCoffeeMaker>","","","","",null,"MyAccount.MyCoffeeMakers.RegisterMyCoffeeMaker","",""));
	stepMap.put(4, new StepsMap(4, "520", "ENTER",": Enter <$CoffeMaker.SerialNumber.FIELD1> into <SerialNumber>","$CoffeMaker.SerialNumber.FIELD1","","","",null,"MyAccount.MyCoffeeMakers.SerialNumber","",""));
	stepMap.put(5, new StepsMap(5, "521", "CLICK",": Click on <Calendar>","","","","",null,"MyAccount.MyCoffeeMakers.Calendar","",""));
	stepMap.put(6, new StepsMap(6, "522", "CLICK",": Click on <SelectDateFirst>","","","","",null,"MyAccount.MyCoffeeMakers.SelectDateFirst","",""));
	stepMap.put(7, new StepsMap(7, "523", "CLICK",": Click on <RegisterButton>","","","","",null,"MyAccount.MyCoffeeMakers.RegisterButton","",""));
	stepMap.put(8, new StepsMap(8, "524", "WAIT",": Wait","10","","","",null,"Custom","",""));
	stepMap.put(9, new StepsMap(9, "525", "SCROLLINTOVIEW",": Scolls the <BrewerRegistrationMsg> into view","","","","",null,"MyAccount.MyCoffeeMakers.BrewerRegistrationMsg","",""));
	stepMap.put(10, new StepsMap(10, "526", "VERIFYELEMENTPRESENT",": Verify the <BrewerRegistrationMsg> is Present","","","","",null,"MyAccount.MyCoffeeMakers.BrewerRegistrationMsg","",""));

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
    //Test step 10.
    executeTestStep(stepMap.get(10));
      this.updateCNM();
  }

}
