/**
* This source code is proprietary code of Sapient Consulting Services Pvt Ltd.
* Usage of this code without written approval from Sapient would be violation of
* Copyrights.
*
*/
package  com.sapient.qa.cats.core.selenium.testng.test.testcase;

/**
* All neccessary packages needed to execute
*
**/
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
import java.io.File;
import com.sapient.qa.cats.core.config.CATSGlobal;


/**
* TestNG Test source code generated via CATS framework generator.
* Generates TestSuite and Test XMLs based on the User Test Case and Test Data.
*
**/
public class  BIRTHDAYGIFTCLICKONNOTHANKSLINK extends DynamicInstTestcaseClassExtend {
	    
    public BIRTHDAYGIFTCLICKONNOTHANKSLINK(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
		    Properties prop;
			try {
			
		    	prop = PropertiesCache.loadProperties(CATSGlobal.configFolderLocation+File.separator+"CATSConfig.properties");
		   		propOnExitScenarioCloseBrowser=prop.getProperty("ON_EXIT_SCENARIO_CLOSE_BROWSER");
		   		propOnExitTestcaseCloseBrowser=prop.getProperty("ON_EXIT_TESTCASE_CLOSE_BROWSER");
		   		catsLogger.debug("propOnExitScenarioCloseBrowser set in Config is "+propOnExitScenarioCloseBrowser);
		    }
		    catch(IOException e) {
		    	catsLogger.info(" Exception caught in reading property file "+e);
		    }
	     	this.driver = driver;
	     	this.scenarioId=scenarioId;
	   		this.scnSeqId=scn_data_key_seq;
	     	this.suiteName=context.getAttribute("suiteName").toString();
	     	LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","BIRTHDAYGIFTCLICKONNOTHANKSLINK");
	     	this.scn_exe_tc_seq=scn_exe_tc_seq;
	     	this.testCaseId = "BIRTHDAYGIFT_CLICKONNOTHANKSLINK";		
	}
		
	    
		
	public  synchronized void  executeTestcase() {
		catsLogger.console("Test case is running : BIRTHDAYGIFTCLICKONNOTHANKSLINK");
		String locString="";
		try{
			PropertyConfigurator.configure(PropertiesCache.loadProperties(CATSGlobal.configFolderLocation+File.separator+"log4j.properties"));	
		}catch(FileNotFoundException e){
    		catsLogger.error("Caught FileNotFoundException log4j.properties");
    	}catch(IOException e){
    		catsLogger.error("Caught IOException: log4j.properties");
    	}
        arg = CATSReportGenerationWrapper2.GetInstance(this.suiteName);
        this.exnInstId=arg.findExecutionInstanceId(scenarioId,this.suiteName,scnSeqId,scn_exe_tc_seq); 
        actualData=expectedResult="";
		actualDataRef=expectedResultRef="";  
				
		//Test step 1.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","LinkNoThanksForBirthdayGift","","");			
		executeTestStep("209",  "CLICK",": Click on <LinkNoThanksForBirthdayGift>",	suiteName, "BIRTHDAYGIFTCLICKONNOTHANKSLINK", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='row birthday-compaign']/*[text()='No Thanks']$del$",orRefName,"","");
				
		//Test step 2.
		setComputedActuals("3","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","","","");			
		executeTestStep("210",  "Wait",": Wait",	suiteName, "BIRTHDAYGIFTCLICKONNOTHANKSLINK", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
		arg.updateSkippedTestStepsForTestcase("BIRTHDAYGIFT_CLICKONNOTHANKSLINK",executedStepIds,this.exnInstId);	
	}
	
}
