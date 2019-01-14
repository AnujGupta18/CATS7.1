/**
* This source code is proprietary code of Sapient Consulting Services Pvt Ltd.
* Usage of this code without written approval from Sapient would be violation of
* Copyrights.
*
*/
package com.sapient.qa.cats.core.selenium.testng.test.scenario;

// All neccessary external packages needed to execute
import java.util.Map;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// All neccessary internal packages needed to execute
import com.sapient.qa.cats.core.constants.CATSConstants;
import com.sapient.qa.cats.core.framework.CATSReportGenerationWrapper2;
import com.sapient.qa.cats.core.framework.TestConfig;
import com.sapient.qa.cats.core.hibernate.service.ConfigService;
import com.sapient.qa.cats.core.langimpl.DataHandler;
import com.sapient.qa.cats.core.langimpl.LangDataSingleton;
import com.sapient.qa.cats.core.logger.CATSLogger;
import com.sapient.qa.cats.core.utils.GlobalData;
import com.sapient.qa.cats.core.vo.GlobalDataVO;
import com.sapient.qa.cats.core.vo2.Config;
import com.sapient.qa.cats.core.config.CATSGlobal;
import com.sapient.qa.cats.core.browserdrivers.BrowserDriverFactory;
import com.sapient.qa.cats.core.selenium.testng.test.testcase.*;

/**
* TestNG Test source code generated via CATS framework generator.
* Generates TestSuite and Test XMLs based on the User Test Case and Test Data.
*
**/
public class  SCENARIOS_39  extends TestConfig{
	SoftAssert softAssert;
	String testDataKey;
	String sheetName;

	private static CATSLogger catsLogger = CATSLogger.getInstance(SCENARIOS_39.class);
	boolean exitScenarioFlag=false, exitSuiteFlag=false;
	private CATSReportGenerationWrapper2 suiteInstanceObject;

	Config config=null;
	SCENARIOS_39() {
		softAssert=new SoftAssert();
	}

	@AfterClass
    public synchronized void endScenario(ITestContext context) {
		synchronized (this) {
		    try {
				this.suiteName = context.getAttribute("suiteName").toString();
				GlobalDataVO obj = GlobalData.deserialize();

				String scenarioID = "SCENARIOS_39";
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
			GlobalDataVO obj = GlobalData.deserialize();
			this.suiteName=context.getAttribute("suiteName").toString();
			String scenarioID = "SCENARIOS_39";

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
			suiteInstanceObject = CATSReportGenerationWrapper2.getInstance(this.suiteName);
			//catsLogger.info("DEBUG arg = "+suiteInstanceObject);

			if(suiteInstanceObject.getExeControlFlowMap().containsKey(CATSConstants.EXITSUITE)) {
	 			exitSuiteFlag=suiteInstanceObject.getExeControlFlowMap().get(CATSConstants.EXITSUITE);
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
					this.setSuiteDriver(suiteInstanceObject.driver);
				}
			}
		} catch(SessionNotCreatedException se) {
			catsLogger.info("Exception caught due to browser incompatibility "+ se +" - "+ se.getMessage());

		} catch(WebDriverException e) {
			catsLogger.info("WebDriver Exception -caught due to browser incompatibility "+ e +" - "+ e.getMessage());

		} catch(Exception e) {
			catsLogger.info("Exception caught while Initializing Driver "+e +" - "+ e.getMessage());
			e.printStackTrace();
		}
		}
	}

	@Test (priority=1,groups={"SCENARIOS_39"})
	public void COMMON_LaunchSite1(ITestContext context) {
		COMMON_LaunchSite testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new COMMON_LaunchSite(context,1,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
	@Test (priority=2,groups={"SCENARIOS_39"})
	public void COMMON_CLOSEOVERLAY2(ITestContext context) {
		COMMON_CLOSEOVERLAY testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new COMMON_CLOSEOVERLAY(context,2,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
	@Test (priority=3,groups={"SCENARIOS_39"})
	public void HEADER_ClickCoffeeLink3(ITestContext context) {
		HEADER_ClickCoffeeLink testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new HEADER_ClickCoffeeLink(context,3,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
	@Test (priority=4,groups={"SCENARIOS_39"})
	public void PLP_ClickProduct4(ITestContext context) {
		PLP_ClickProduct testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new PLP_ClickProduct(context,4,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
	@Test (priority=5,groups={"SCENARIOS_39"})
	public void PDP_VerifyOOS5(ITestContext context) {
		PDP_VerifyOOS testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new PDP_VerifyOOS(context,5,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
	@Test (priority=6,groups={"SCENARIOS_39"})
	public void COMMON_CloseWindow6(ITestContext context) {
		COMMON_CloseWindow testCase=null;
		try {
			LangDataSingleton.getInstanceOf("_ENV_"+this.suiteName).put("CURR_DATAKEY","");
			testCase=new COMMON_CloseWindow(context,6,"SCENARIOS_39",0, this.getSuiteDriver());
			testCase.setTestDataKey("");
			testCase.executeTestcase();

		  }	catch(SkipException sk) {
		  		testCase.updateCNM();
		  		catsLogger.debug("SkipException ", sk);

		  }	catch(Exception e) {
			  	catsLogger.info("exception caught in scenario ftl " ,e);
			  	e.printStackTrace();
		  }

		  softAssert.assertAll();
	}
}
