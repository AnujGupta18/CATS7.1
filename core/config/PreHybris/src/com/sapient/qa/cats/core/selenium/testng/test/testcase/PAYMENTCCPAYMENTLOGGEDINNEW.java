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
public class  PAYMENTCCPAYMENTLOGGEDINNEW extends DynamicInstTestcaseClassExtend {
	    
    public PAYMENTCCPAYMENTLOGGEDINNEW(ITestContext context,long scn_exe_tc_seq,String scenarioId,long scn_data_key_seq,RemoteWebDriver driver){
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
	     	LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_TCNAME","PAYMENTCCPAYMENTLOGGEDINNEW");
	     	this.scn_exe_tc_seq=scn_exe_tc_seq;
	     	this.testCaseId = "PAYMENT_CCPAYMENTLOGGEDINNEW";		
	}
		
	    
		
	public  synchronized void  executeTestcase() {
		catsLogger.console("Test case is running : PAYMENTCCPAYMENTLOGGEDINNEW");
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
		if(setComputedActuals("","","Payment", "CreditCard", "CreditTab","","") &&				
		executeTestStep("167",  "VERIFYELEMENTPRESENT",": Verify the <CreditTab> is Present", suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"","", "XPATH#del#//a[contains(@data-tab,'creditCard')]$del$",orRefName,"IF","")){
				
		//Test step 2.
		setComputedActuals("","","Payment", "CreditCard","CreditTab","","");			
		executeTestStep("168",  "CLICK",": Click on <CreditTab>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//a[contains(@data-tab,'creditCard')]$del$",orRefName,"","");
				
		//Test step 3.
		setComputedActuals("5","","Custom", "CreditCard","","","");			
		executeTestStep("169",  "WAIT",": Wait",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 4.
		//Control Flow IF block	
		if(setComputedActuals("7","","Payment", "CreditCard", "PaymetricError","","") &&				
		executeTestStep("170",  "WAITTILLELEMENTDISPLAY","", suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"","", "XPATH#del#//*[@class='alert negative paymetrics-error']$del$",orRefName,"IF","")){
				
		//Test step 5.
		setComputedActuals("","","Payment", "CreditCard","","","");			
		executeTestStep("171",  "REFRESH",": Refresh",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 6.
		setComputedActuals("2","","Custom", "CreditCard","","","");			
		executeTestStep("172",  "WAIT",": Wait", suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult, actualDataRef,expectedResultRef,"",	"", "",orRefName,"END IF","");
		//Control Flow IF block ENDS
		}
				
		//Test step 7.
		setComputedActuals("5","","Custom", "CreditCard","","","");			
		executeTestStep("173",  "WAIT",": Wait",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 8.
		setComputedActuals("","","Payment", "CreditCard","SelectPaymentsection","","");			
		executeTestStep("174",  "CLICK",": Click on <SelectPaymentsection>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//div[@class='co-card-section-col-1']$del$",orRefName,"","");
				
		//Test step 9.
		setComputedActuals("5","","Custom", "CreditCard","","","");			
		executeTestStep("175",  "WAIT",": Wait",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 10.
		setComputedActuals("","","Custom", "CreditCard","","$Payment.PaymentiFrame.FIELD1","");			
		executeTestStep("176",  "SWITCHIFRAMENAME",": Switch the frame whose name is  <$Payment.PaymentiFrame.FIELD1>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 11.
		setComputedActuals("","","Payment", "CreditCard","CardNumberInput","","");			
		executeTestStep("177",  "CLICK",": Click on <CardNumberInput>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-cardnumber']$del$",orRefName,"","");
				
		//Test step 12.
		setComputedActuals("","","Payment", "CreditCard","CardNumberInput","$Checkout.CardNumber.FIELD1","");			
		executeTestStep("178",  "ENTER",": Enter <$Checkout.CardNumber.FIELD1> into <CardNumberInput>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-cardnumber']$del$",orRefName,"","");
				
		//Test step 13.
		setComputedActuals("2","","Custom", "CreditCard","","","");			
		executeTestStep("179",  "WAIT",": Wait",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 14.
		setComputedActuals("","","Payment", "CreditCard","CardHolderName","$Payment.CardHoldername.FIELD1","");			
		executeTestStep("180",  "ENTER",": Enter <$Payment.CardHoldername.FIELD1> into <CardHolderName>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-cardname']$del$",orRefName,"","");
				
		//Test step 15.
		setComputedActuals("2","","Custom", "CreditCard","","","");			
		executeTestStep("181",  "WAIT",": Wait",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 16.
		setComputedActuals("","","Payment", "CreditCard","ExpiryMonth","","");			
		executeTestStep("182",  "CLICK",": Click on <ExpiryMonth>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='month']$del$",orRefName,"","");
				
		//Test step 17.
		setComputedActuals("","","Payment", "CreditCard","ExpiryMonthValue","","");			
		executeTestStep("183",  "CLICK",": Click on <ExpiryMonthValue>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-exmth']/option[5]$del$",orRefName,"","");
				
		//Test step 18.
		setComputedActuals("","","Payment", "CreditCard","ExpiryYear","","");			
		executeTestStep("184",  "CLICK",": Click on <ExpiryYear>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@class='year']$del$",orRefName,"","");
				
		//Test step 19.
		setComputedActuals("","","Payment", "CreditCard","ExpiryYearValue","","");			
		executeTestStep("185",  "CLICK",": Click on <ExpiryYearValue>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-exyr']/option[5]$del$",orRefName,"","");
				
		//Test step 20.
		setComputedActuals("","","Payment", "CreditCard","SecurityCode","$Payment.CVV.FIELD1","");			
		executeTestStep("186",  "ENTER",": Enter <$Payment.CVV.FIELD1> into <SecurityCode>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='c-cvv']$del$",orRefName,"","");
				
		//Test step 21.
		setComputedActuals("","","Custom", "CreditCard","","","");			
		executeTestStep("187",  "SWITCHTODEFAULT",": Switch To Default window",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "",orRefName,"","");
				
		//Test step 22.
		setComputedActuals("","","Payment", "CreditCard","ContinueReviewButton","","");			
		executeTestStep("188",  "SCROLLINTOVIEW",": Scolls the <ContinueReviewButton> into view",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='submit_silentOrderPostForm_Checkout']$del$",orRefName,"","");
				
		//Test step 23.
		setComputedActuals("","","Payment", "CreditCard","ContinueReviewButton","","");			
		executeTestStep("189",  "CLICK",": Click on <ContinueReviewButton>",	suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult,actualDataRef,expectedResultRef,"",	"", "XPATH#del#//*[@id='submit_silentOrderPostForm_Checkout']$del$",orRefName,"","");
				
		//Test step 24.
		setComputedActuals("5","","Custom", "CreditCard","","","");			
		executeTestStep("190",  "WAIT",": Wait", suiteName, "PAYMENTCCPAYMENTLOGGEDINNEW", 
			actualData,expectedResult, actualDataRef,expectedResultRef,"",	"", "",orRefName,"END IF","");
		//Control Flow IF block ENDS
		}
		arg.updateSkippedTestStepsForTestcase("PAYMENT_CCPAYMENTLOGGEDINNEW",executedStepIds,this.exnInstId);	
	}
	
}
