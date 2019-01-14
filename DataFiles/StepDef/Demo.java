package com.sapient.qa.cats.core.selenium.bdd.stepdef;
import com.sapient.qa.cats.core.framework.CATSCucumberConfig;
import com.sapient.qa.cats.core.utils.ThreadVariables;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
public class Demo extends CATSCucumberConfig{

 @Before()
  public void launch(Scenario scenario) {
    catsBeforeScenario(scenario); // this must be called all the time to invoke CATS framework
    disableAutoAssertion();
  }

  @BeforeStep
  public void beforeStep(Scenario scenario) {
    catsBeforeStep(); // this must be called all the time to invoke CATS framework
  }

  @AfterStep
  public void afterStep() {
    catsAfterStep(); // this must be called all the time to invoke CATS framework
  }
  /* All the steps executed in this step-definitions WILL BE asserted based on the status of CATS actions. CATS
   * PASS/DONE (I)/DONE (W) would be treated as PASSED Unless DONE (W) is configured to treat as FAIL Once the STEP
   * FAILs it will throws assertion Failure Exception. User has option to disable auto Assertions */

 public void Demo_NewTestCase(){
    
 
   	}


}