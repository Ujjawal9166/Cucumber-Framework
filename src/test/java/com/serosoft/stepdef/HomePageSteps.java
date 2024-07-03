package com.serosoft.stepdef;
import com.serosoft.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomePageSteps {
	
	@Then("I click on {string}")
	public void iClickOn(String string) throws Exception {
	  
	   new HomePage().iClickOnOption(string);
	   Thread.sleep(10000);
	}

}
