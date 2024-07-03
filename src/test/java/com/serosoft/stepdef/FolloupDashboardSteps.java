package com.serosoft.stepdef;

import com.serosoft.pages.FollowupDashboardPage;
import com.serosoft.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FolloupDashboardSteps {

	@And("I select from and to dates")
	public void iSelectDates() throws Exception {
		new FollowupDashboardPage().iSelectDate();

	}

	@Then("I validate the followup dahsboard header")
	public void iValidateDahsboardHeader() throws Exception {

		new FollowupDashboardPage().iValidateFollowupHeadr();
	}
}
