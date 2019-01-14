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
public class  BIRTHDAYGIFTVERIFYBIRTHPOPUP extends DynamicInstTestcaseClassExtend {
	    
    public BIRTHDAYGIFTVERIFYBIRTHPOPUP(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
	     	LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","BIRTHDAYGIFTVERIFYBIRTHPOPUP");
	     	this.scn_exe_tc_seq=scn_exe_tc_seq;
	     	this.testCaseId = "BIRTHDAYGIFT_VERIFYBIRTHPOPUP";		
	}
		
	    
		
	public  synchronized void  executeTestcase() {
		catsLogger.console("Test case is running : BIRTHDAYGIFTVERIFYBIRTHPOPUP");
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
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","SectioinBirthday","","");			
		executeTestStep("203",  "VerifyElementPresent",": Verify the <SectioinBirthday> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='row birthday-compaign']$del$",orRefName,"","");
				
		//Test step 2.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","TextBirthday","","");			
		executeTestStep("204",  "VerifyElementPresent",": Verify the <TextBirthday> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='row birthday-compaign']/span[contains(.,'Birthday')]$del$",orRefName,"","");
				
		//Test step 3.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","InputBirthMonth","","");			
		executeTestStep("205",  "VerifyElementPresent",": Verify the <InputBirthMonth> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@name='birth_month']$del$",orRefName,"","");
				
		//Test step 4.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","InputBirthDate","","");			
		executeTestStep("206",  "VerifyElementPresent",": Verify the <InputBirthDate> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@name='birth_date']$del$",orRefName,"","");
				
		//Test step 5.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","ButtonSubmitBirthDOB","","");			
		executeTestStep("207",  "VerifyElementPresent",": Verify the <ButtonSubmitBirthDOB> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[contains(@class,'birth-submit')]$del$",orRefName,"","");
				
		//Test step 6.
		setComputedActuals("","","MyAccountAutoDelivery", "BIRTHDAYSECTION ","LinkNoThanksForBirthdayGift","","");			
		executeTestStep("208",  "VerifyElementPresent",": Verify the <LinkNoThanksForBirthdayGift> is Present",	suiteName, "BIRTHDAYGIFTVERIFYBIRTHPOPUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='row birthday-compaign']/*[text()='No Thanks']$del$",orRefName,"","");
		arg.updateSkippedTestStepsForTestcase("BIRTHDAYGIFT_VERIFYBIRTHPOPUP",executedStepIds,this.exnInstId);	
	}
	
}
