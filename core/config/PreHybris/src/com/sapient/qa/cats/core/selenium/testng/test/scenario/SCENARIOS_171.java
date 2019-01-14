/**
* This source code is proprietary code of Sapient Consulting Services Pvt Ltd.
* Usage of this code without written approval from Sapient would be violation of
* Copyrights.
*
*/
package  com.sapient.qa.cats.core.selenium.testng.test.scenario;

/**
* All neccessary packages needed to execute
*
**/
import com.sapient.qa.cats.core.framework.CATSReportGenerationWrapper2;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.SessionNotCreatedException;
import com.sapient.qa.cats.core.utils.*;
import com.sapient.qa.cats.core.browserdrivers.BrowserDriverFactory;
import com.sapient.qa.cats.core.vo2.Config;
import com.sapient.qa.cats.core.hibernate.service.ConfigService;
import com.sapient.qa.cats.core.logger.CATSLogger;
import org.testng.SkipException;
import com.sapient.qa.cats.core.framework.TestConfig;
import com.sapient.qa.cats.core.langimpl.LangDataSingleton;
import com.sapient.qa.cats.core.config.CATSGlobal;
import com.sapient.qa.cats.core.selenium.testng.test.testcase.*;
import com.sapient.qa.cats.core.vo.GlobalData;
import java.util.Map;
import com.sapient.qa.cats.core.e2j.ExcelJSONParser;
import com.sapient.qa.cats.core.langimpl.DataHandler;

/**
* TestNG Test source code generated via CATS framework generator.
* Generates TestSuite and Test XMLs based on the User Test Case and Test Data.
*
**/
public class  SCENARIOS_171  extends TestConfig{
	SoftAssert softAssert;
	String testDataKey;
	String sheetName;
	
	private static CATSLogger catsLogger = CATSLogger.getInstance(SCENARIOS_171.class);
	boolean exitScenarioFlag=false, exitSuiteFlag=false;
	public CATSReportGenerationWrapper2 suiteInstanceObject;
	
	Config config=null;
	SCENARIOS_171() {	
		softAssert=new SoftAssert();
	}
	
	@AfterClass
    public synchronized void endScenario(ITestContext context) {
		synchronized (this) {
		    try {
				this.suiteName = context.getAttribute("suiteName").toString();
				DeserializeGlobalData deserializeGlobalData = new DeserializeGlobalData();
				GlobalData obj = deserializeGlobalData.deserialize();
		
				String scenarioID = "SCENARIOS_171";
				Map<String, String> scenarioMap = obj.getScenarioVariablesMap();
		
				String[] keyValuesStrings;
		
				if (scenarioMap.containsKey(scenarioID)) {
				    keyValuesStrings = scenarioMap.get(scenarioID).split("\\s*;\\s*");
				    for (String keyValueString : keyValuesStrings) {
						String[] keyValue = keyValueString.split("=");
						if (keyValue.length == 2) {
							DataHandler.removeFromDictionary("<<" + keyValue[0] + ">>", "_ENV_"
							    + this.suiteName);
						}
				    }
				}
		    } catch (Exception e) {
				catsLogger.console(e);
		    }
		}
    } 

   	@BeforeClass
	public synchronized void beginScenario(ITestContext context) {
		super.beginScenario(context);
		synchronized (this) {
		try {
		DeserializeGlobalData deserializeGlobalData =new DeserializeGlobalData();
		GlobalData obj=deserializeGlobalData.deserialize();
		this.suiteName=context.getAttribute("suiteName").toString();
		String scenarioID = "SCENARIOS_171";
		
		try{
		Map<String,String> suiteMap= obj.getSuiteVariablesMap();
		Map<String,String> scenarioMap= obj.getScenarioVariablesMap();
	   String[] keyValuesStrings;	    
		      
    if(suiteMap.containsKey(this.suiteName)){		      
	keyValuesStrings=suiteMap.get(this.suiteName).split("\\s*;\\s*");
	for (String keyValueString : keyValuesStrings) {
		String[] keyValue=keyValueString.split("=");
		if(keyValue.length==2){
			DataHandler.addToDictionary("<<"+keyValue[0]+">>", keyValue[1], this.suiteName);
			}
	}
	}
	
	  if(scenarioMap.containsKey(scenarioID)){	
	  keyValuesStrings=scenarioMap.get(scenarioID).split("\\s*;\\s*");
	 for (String keyValueString : keyValuesStrings) {
		String[] keyValue=keyValueString.split("=");
		if(keyValue.length==2){
			DataHandler.addToDictionary("<<"+keyValue[0]+">>", keyValue[1], this.suiteName);
			}
	}
	}
	} catch (Exception e){
	     System.out.println("Error due to suite Variables or scenario Variables column: ");
	      e.printStackTrace();
	      
	}
	
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_SUITE",this.suiteName);
			String env=obj.getGlobalEnv();
			if(!env.equals("DEFAULT")){//if global env is set, set local env to global env  
			
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_ENV",env);
			}
			
			scenarioID=scenarioID.substring(scenarioID.indexOf("_")+1);
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_SCENARIO",scenarioID);
			this.configId=context.getAttribute("configId").toString();		
			if (configId != null || configId != "") {
				ConfigService configService = new ConfigService();
				config = configService.findById(configId);
			}
			suiteInstanceObject = CATSReportGenerationWrapper2.GetInstance(this.suiteName);
			//catsLogger.info("DEBUG arg = "+suiteInstanceObject);	
			if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}	
			if(!exitSuiteFlag) {			
			//suiteInstanceObject.driver=(RemoteWebDriver) context.getAttribute("driver");
			this.channel=context.getAttribute("channel").toString();
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_CHANNEL",this.channel);
			this.browser=context.getAttribute("browser").toString();
			BrowserDriverFactory.setSuiteName(this.suiteName);
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_BROWSER",this.browser);
			if(suiteInstanceObject.driver==null||suiteInstanceObject.driver.toString().contains("null") ) {
			} else {
				catsLogger.info("Using the same driver of suite "+suiteInstanceObject.driver.toString()); 
			}
				this.driver=suiteInstanceObject.driver;	
		}
		}
		catch(SessionNotCreatedException se) {
			 catsLogger.info("Exception caught due to browser incompatability "+se +" - "+ se.getMessage());
		}
		catch(WebDriverException e) {
			 catsLogger.info("WebDriver Exception -caught due to browser incompatiblility "+e +" - "+ e.getMessage());
		}
		catch(Exception e) {
			catsLogger.info("Exception caught while Iniialising Driver "+e +" - "+ e.getMessage());
			e.printStackTrace();
			
		}
	}
}
	@Test (priority=1,groups={"SCENARIOS_171"})	
	public void COMMONLaunchSite1(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				COMMONLaunchSite tcObj=new COMMONLaunchSite(context,1,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=2,groups={"SCENARIOS_171"})	
	public void HOMEPAGECloseLightBox22(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				HOMEPAGECloseLightBox2 tcObj=new HOMEPAGECloseLightBox2(context,2,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=3,groups={"SCENARIOS_171"})	
	public void HEADERCLICKSIGNIN3(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				HEADERCLICKSIGNIN tcObj=new HEADERCLICKSIGNIN(context,3,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=4,groups={"SCENARIOS_171"})	
	public void LOGINSIGNUP4(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				LOGINSIGNUP tcObj=new LOGINSIGNUP(context,4,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=5,groups={"SCENARIOS_171"})	
	public void HEADERSearchProduct15(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				HEADERSearchProduct1 tcObj=new HEADERSearchProduct1(context,5,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=6,groups={"SCENARIOS_171"})	
	public void PLPCLICKSEARCHRESULT6(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				PLPCLICKSEARCHRESULT tcObj=new PLPCLICKSEARCHRESULT(context,6,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=7,groups={"SCENARIOS_171"})	
	public void PDPADDTOAUTODELIVERY7(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				PDPADDTOAUTODELIVERY tcObj=new PDPADDTOAUTODELIVERY(context,7,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=8,groups={"SCENARIOS_171"})	
	public void CARTSECURECHECKOUT8(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				CARTSECURECHECKOUT tcObj=new CARTSECURECHECKOUT(context,8,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=9,groups={"SCENARIOS_171"})	
	public void SHIPPINGShippingFillDetailsNew9(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				SHIPPINGShippingFillDetailsNew tcObj=new SHIPPINGShippingFillDetailsNew(context,9,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=10,groups={"SCENARIOS_171"})	
	public void PAYMENTCCPAYMENTLOGGEDINNEW10(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				PAYMENTCCPAYMENTLOGGEDINNEW tcObj=new PAYMENTCCPAYMENTLOGGEDINNEW(context,10,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=11,groups={"SCENARIOS_171"})	
	public void ORDERSUMMARYPlaceOrder11(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				ORDERSUMMARYPlaceOrder tcObj=new ORDERSUMMARYPlaceOrder(context,11,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=12,groups={"SCENARIOS_171"})	
	public void ORDERCONFIRMATIONVerifyADText12(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				ORDERCONFIRMATIONVerifyADText tcObj=new ORDERCONFIRMATIONVerifyADText(context,12,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=13,groups={"SCENARIOS_171"})	
	public void HEADERCLICKMYACCOUNT13(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				HEADERCLICKMYACCOUNT tcObj=new HEADERCLICKMYACCOUNT(context,13,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=14,groups={"SCENARIOS_171"})	
	public void MYACCOUNTCLICKVIEWAUTODELIVERY14(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				MYACCOUNTCLICKVIEWAUTODELIVERY tcObj=new MYACCOUNTCLICKVIEWAUTODELIVERY(context,14,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=15,groups={"SCENARIOS_171"})	
	public void BIRTHDAYGIFTVERIFYBIRTHPOPUP15(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				BIRTHDAYGIFTVERIFYBIRTHPOPUP tcObj=new BIRTHDAYGIFTVERIFYBIRTHPOPUP(context,15,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=16,groups={"SCENARIOS_171"})	
	public void BIRTHDAYGIFTCLICKONNOTHANKSLINK16(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				BIRTHDAYGIFTCLICKONNOTHANKSLINK tcObj=new BIRTHDAYGIFTCLICKONNOTHANKSLINK(context,16,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=17,groups={"SCENARIOS_171"})	
	public void BIRTHDAYGIFTVERIFYDECLININGBIRTHDAYGIFTPOPUP17(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				BIRTHDAYGIFTVERIFYDECLININGBIRTHDAYGIFTPOPUP tcObj=new BIRTHDAYGIFTVERIFYDECLININGBIRTHDAYGIFTPOPUP(context,17,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=18,groups={"SCENARIOS_171"})	
	public void BIRTHDAYGIFTSUBMITBIRTHDAYDECLININGREQUEST18(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				BIRTHDAYGIFTSUBMITBIRTHDAYDECLININGREQUEST tcObj=new BIRTHDAYGIFTSUBMITBIRTHDAYDECLININGREQUEST(context,18,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=19,groups={"SCENARIOS_171"})	
	public void BIRTHDAYGIFTVERIFYINGBIRTHDAYSECTIONDISAPPEAR19(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				BIRTHDAYGIFTVERIFYINGBIRTHDAYSECTIONDISAPPEAR tcObj=new BIRTHDAYGIFTVERIFYINGBIRTHDAYSECTIONDISAPPEAR(context,19,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
	@Test (priority=20,groups={"SCENARIOS_171"})	
	public void COMMONCloseWindow20(ITestContext context) {
		Config config=null;
			try {
			if(!suiteInstanceObject.getExeControlFlowMap().containsKey("SCENARIOS_171_0_exit")) {
				suiteInstanceObject.getExeControlFlowMap().put("SCENARIOS_171_0_exit",false);		
			}
			exitScenarioFlag=suiteInstanceObject.getExeControlFlowMap().get("SCENARIOS_171_0_exit");	 		
	 		if(suiteInstanceObject.getExeControlFlowMap().containsKey("EXITSUITE")) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get("EXITSUITE");
	 		}
	  		if (!(exitSuiteFlag || exitScenarioFlag)) {	
				COMMONCloseWindow tcObj=new COMMONCloseWindow(context,20,"SCENARIOS_171",0, this.driver==null || this.driver.toString().contains("null")  ?suiteInstanceObject.driver:this.driver);
				String s="";
				if(s!="" ||  s!=null) {
					testDataKey=s;
				}				
				tcObj.setTestDataKey(testDataKey);				
				tcObj.executeTestcase();			
					
		  }
		  else {		  	
			if (exitSuiteFlag){				
				throw new SkipException("SKIPPED due to EXIT SUITE");}
			else{				
				throw new SkipException("SKIPPED due to EXIT SCENARIO");}
		  }
	  }	catch(SkipException sk) {
	  		catsLogger.debug("SkipException ", sk);		  	
		  	throw new SkipException("SKIPPED due to EXIT TESTCASE");
	  
	  }	catch(Exception e) {	  	
		  	catsLogger.info("exception caught in scenario ftl " ,e);
		  	e.printStackTrace();
	  }
	  softAssert.assertAll();
	  
	  
	  
	}
		
}
