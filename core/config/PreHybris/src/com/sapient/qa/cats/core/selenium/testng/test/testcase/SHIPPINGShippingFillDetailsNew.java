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
public class  SHIPPINGShippingFillDetailsNew extends DynamicInstTestcaseClassExtend {
	    
    public SHIPPINGShippingFillDetailsNew(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
	     	LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","SHIPPINGShippingFillDetailsNew");
	     	this.scn_exe_tc_seq=scn_exe_tc_seq;
	     	this.testCaseId = "SHIPPING_ShippingFillDetailsNew";		
	}
		
	    
		
	public  synchronized void  executeTestcase() {
		catsLogger.console("Test case is running : SHIPPINGShippingFillDetailsNew");
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
		//Control Flow IF block	
		if(setComputedActuals("","","Shipping", "DefaultShipping", "CreateShippingAddress","","") &&				
		executeTestStep("153",  "VERIFYELEMENTPRESENT",": Verify the <CreateShippingAddress> is Present", suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"","", "XPATH#del#//*[contains(text(),'Create New Address')]$del$",orRefName,"IF","")){
				
		//Test step 2.
		setComputedActuals("","","Shipping", "DefaultShipping","CreateShippingAddress","","");			
		executeTestStep("154",  "CLICK",": Click on <CreateShippingAddress>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[contains(text(),'Create New Address')]$del$",orRefName,"","");
				
		//Test step 3.
		setComputedActuals("5","","Shipping", "Shipping","FirstNameInput","","");			
		executeTestStep("155",  "WAIT",": Wait",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='address.firstName']$del$",orRefName,"","");
				
		//Test step 4.
		setComputedActuals("","","Shipping", "Shipping","FirstNameInput","$Shipping.FirstName.FIELD3","");			
		executeTestStep("156",  "ENTER",": Enter <$Shipping.FirstName.FIELD3> into <FirstNameInput>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='address.firstName']$del$",orRefName,"","");
				
		//Test step 5.
		setComputedActuals("","","Shipping", "Shipping","LastNameInput","$Shipping.LastName.FIELD3","");			
		executeTestStep("157",  "ENTER",": Enter <$Shipping.LastName.FIELD3> into <LastNameInput>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='address.surname']$del$",orRefName,"","");
				
		//Test step 6.
		setComputedActuals("","","Shipping", "Shipping","AddressLine1Input","$Shipping.AddressLine1.FIELD1","");			
		executeTestStep("158",  "ENTER",": Enter <$Shipping.AddressLine1.FIELD1> into <AddressLine1Input>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='address.line1']$del$",orRefName,"","");
				
		//Test step 7.
		setComputedActuals("7","","Shipping", "Shipping","","","");			
		executeTestStep("159",  "WAIT",": Wait",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 8.
		setComputedActuals("","","Shipping", "Shipping","AddressLineDropDown","","");			
		executeTestStep("160",  "CLICK",": Click on <AddressLineDropDown>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//div[contains(@class,'address-suggestion checkout-scrollbar')]//li[4]$del$",orRefName,"","");
				
		//Test step 9.
		setComputedActuals("5","","Custom", "Shipping","","","");			
		executeTestStep("161",  "WAIT",": Wait",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 10.
		setComputedActuals("","","Shipping", "Shipping","PhoneInput","$Shipping.Phone.FIELD1","");			
		executeTestStep("162",  "ENTER",": Enter <$Shipping.Phone.FIELD1> into <PhoneInput>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='address.phoneNumber']$del$",orRefName,"","");
				
		//Test step 11.
		setComputedActuals("","","Shipping", "Shipping","ContinueBillingButton","","");			
		executeTestStep("163",  "SCROLLINTOVIEW",": Scolls the <ContinueBillingButton> into view",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='checkout_tobilling']$del$",orRefName,"","");
				
		//Test step 12.
		setComputedActuals("","","Shipping", "Shipping","ContinueBillingButton","","");			
		executeTestStep("164",  "CLICK",": Click on <ContinueBillingButton>",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='checkout_tobilling']$del$",orRefName,"","");
				
		//Test step 13.
		setComputedActuals("4","","Custom", "Shipping","","","");			
		executeTestStep("165",  "WAIT",": Wait",	suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 14.
		setComputedActuals("5","","Custom", "Shipping","","","");			
		executeTestStep("166",  "WAIT",": Wait", suiteName, "SHIPPINGShippingFillDetailsNew", 
			actualData,expectedResult, actualDataRef,expectedResultRef,"",	"", "",orRefName,"END IF","");
		//Control Flow IF block ENDS
		}
		arg.updateSkippedTestStepsForTestcase("SHIPPING_ShippingFillDetailsNew",executedStepIds,this.exnInstId);	
	}
	
}
