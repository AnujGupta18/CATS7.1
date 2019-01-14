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
public class  Payment_VISALoggedInUser extends DynamicInstTestcaseClassExtend {

  public Payment_VISALoggedInUser(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
    LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","Payment_VISALoggedInUser");
    this.scn_exe_tc_seq=scn_exe_tc_seq;
    this.testCaseId = "Payment_VISALoggedInUser";
    this.testCaseName="Payment_VISALoggedInUser";
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

	stepMap.put(1, new StepsMap(1, "481", "SWITCHIFRAMENAME",": Switch the frame whose name is  <dieCommFrame>","dieCommFrame","","","",null,"Custom","",""));
	stepMap.put(2, new StepsMap(2, "482", "CLICK",": Click on <CardHolderName>","","","","",null,"CheckOut.Payment.CardHolderName","",""));
	stepMap.put(3, new StepsMap(3, "483", "ENTER",": Enter <$Payment.Lname.FIELD1> into <CardHolderName>","$Payment.Lname.FIELD1","","","",null,"CheckOut.Payment.CardHolderName","",""));
	stepMap.put(4, new StepsMap(4, "484", "WAIT",": Wait","2","","","",null,"Custom","",""));
	stepMap.put(5, new StepsMap(5, "485", "CLICK",": Click on <CardNumberInput>","","","","",null,"CheckOut.Payment.CardNumberInput","",""));
	stepMap.put(6, new StepsMap(6, "486", "ENTER",": Enter <$Payment.CardNumber.FIELD1> into <CardNumberInput>","$Payment.CardNumber.FIELD1","","","",null,"CheckOut.Payment.CardNumberInput","",""));
	stepMap.put(7, new StepsMap(7, "487", "WAIT",": Wait","2","","","",null,"Custom","",""));
	stepMap.put(8, new StepsMap(8, "488", "CLICK",": Click on <ExpiryMonth>","","","","",null,"CheckOut.Payment.ExpiryMonth","",""));
	stepMap.put(9, new StepsMap(9, "489", "CLICK",": Click on <ExpiryMonthValue>","","","","",null,"CheckOut.Payment.ExpiryMonthValue","",""));
	stepMap.put(10, new StepsMap(10, "490", "CLICK",": Click on <ExpiryYear>","","","","",null,"CheckOut.Payment.ExpiryYear","",""));
	stepMap.put(11, new StepsMap(11, "491", "CLICK",": Click on <ExpiryYearValue>","","","","",null,"CheckOut.Payment.ExpiryYearValue","",""));
	stepMap.put(12, new StepsMap(12, "492", "ENTER",": Enter <$Payment.Code.FIELD1> into <SecurityCode>","$Payment.Code.FIELD1","","","",null,"CheckOut.Payment.SecurityCode","",""));
	stepMap.put(13, new StepsMap(13, "493", "SWITCHTODEFAULT",": Switch To Default window","","","","",null,"Custom","",""));
	stepMap.put(14, new StepsMap(14, "494", "CLICK",": Click on <ContinueBttn>","","","","",null,"CheckOut.Payment.ContinueBttn","",""));
	stepMap.put(15, new StepsMap(15, "495", "WAIT",": Wait","4","","","",null,"Custom","",""));

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
    //Test step 11.
    executeTestStep(stepMap.get(11));
    //Test step 12.
    executeTestStep(stepMap.get(12));
    //Test step 13.
    executeTestStep(stepMap.get(13));
    //Test step 14.
    executeTestStep(stepMap.get(14));
    //Test step 15.
    executeTestStep(stepMap.get(15));
      this.updateCNM();
  }

}
