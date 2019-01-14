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
public class  LOGINSIGNUP extends DynamicInstTestcaseClassExtend {
	    
    public LOGINSIGNUP(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
	     	LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","LOGINSIGNUP");
	     	this.scn_exe_tc_seq=scn_exe_tc_seq;
	     	this.testCaseId = "LOGIN_SIGNUP";		
	}
		
	    
		
	public  synchronized void  executeTestcase() {
		catsLogger.console("Test case is running : LOGINSIGNUP");
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
		setComputedActuals("","","SignIn", "SignUp","FNameInput","$SignIn.Fname.FIELD1","");			
		executeTestStep("119",  "ENTER",": Enter <$SignIn.Fname.FIELD1> into <FNameInput>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='register.firstName']$del$",orRefName,"","");
				
		//Test step 2.
		setComputedActuals("","","SignIn", "SignUp","LNameInput","$SignIn.Lname.FIELD1","");			
		executeTestStep("120",  "ENTER",": Enter <$SignIn.Lname.FIELD1> into <LNameInput>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='register.lastName']$del$",orRefName,"","");
				
		//Test step 3.
		setComputedActuals("{{EmailID}}","10;@gmail.com","Custom", "SignUp","","","");			
		executeTestStep("121",  "GETRANDOMMAILID",": Get the random mail id",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 4.
		setComputedActuals("{{EmailID}}","","SignIn", "SignUp","EmailInput","","");			
		executeTestStep("122",  "ENTER",": Enter <{{EmailID}}> into <EmailInput>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='register.email']$del$",orRefName,"","");
				
		//Test step 5.
		setComputedActuals("","","SignIn", "SignUp","PasswordInput","$signIn.Password.FIELD4","");			
		executeTestStep("123",  "ENTER",": Enter <$signIn.Password.FIELD4> into <PasswordInput>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='password']$del$",orRefName,"","");
				
		//Test step 6.
		setComputedActuals("","","SignIn", "SignUp","CreateAccountButton","","");			
		executeTestStep("124",  "SCROLLINTOVIEW",": Scolls the <CreateAccountButton> into view",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='usb2cRegisterForm']//button$del$",orRefName,"","");
				
		//Test step 7.
		//Control Flow IF block	
		if(setComputedActuals("10","","IFRAMES", "Home", "CloseXone","","") &&				
		executeTestStep("125",  "WAITTILLELEMENTDISPLAY","", suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"","", "XPATH#del#//*[@class='ch-close']$del$",orRefName,"IF","")){
				
		//Test step 8.
		setComputedActuals("","","IFRAMES", "Home","CloseXone","","");			
		executeTestStep("126",  "CLICK",": Click on <CloseXone>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='ch-close']$del$",orRefName,"","");
				
		//Test step 9.
		setComputedActuals("5","","Custom", "Home","","","");			
		executeTestStep("127",  "WAIT",": Wait", suiteName, "LOGINSIGNUP", 
			actualData,expectedResult, actualDataRef,expectedResultRef,"",	"", "",orRefName,"END IF","");
		//Control Flow IF block ENDS
		}
				
		//Test step 10.
		setComputedActuals("","","SignIn", "SignUp","CreateAccountButton","","");			
		executeTestStep("128",  "CLICK",": Click on <CreateAccountButton>",	suiteName, "LOGINSIGNUP", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#.//*[@id='usb2cRegisterForm']//button$del$",orRefName,"","");
		arg.updateSkippedTestStepsForTestcase("LOGIN_SIGNUP",executedStepIds,this.exnInstId);	
	}
	
}
