package com.serosoft.stepdef;

import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.ManageTargetByStaffPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ManageTargetByStaffSteps {

	@And("I select target by dropdown {string}")
	public void iSelectTargetByOption(String option) throws InterruptedException {

		new ManageTargetByStaffPage().iSelectTheTargetDropdownOption(option);

	}

	@Then("I see the {string} targets in header")
	public void iValidateHeader(String value) throws Exception {

		new ManageTargetByStaffPage().iValidateHeader(value);
	}

	@And("I select intake {string}")
	public void inTakeyear(String year) throws InterruptedException {
		new ManageTargetByStaffPage().iSelectIntakeYear(year);
		Thread.sleep(5000);
	}

	@Then("I add staff details {string}")
	public void addStaffDetails(String name) throws Exception {

		new ManageTargetByStaffPage().iAddStaffDetails(name);

	}

	@Given("I click on staff detail number")
	public void clickOnStaffDetails() throws InterruptedException {

		new ManageTargetByStaffPage().iClickOnStaffDetailNumber();

	}

	@And("I can delete the staff details")
	public void deleteStaffDetails() throws InterruptedException {
		new ManageTargetByStaffPage().iDeleteStaffDetails();

	}

	@And("I select intake year")
	public void inTakeyearNew() throws InterruptedException {
		new ManageTargetByStaffPage().iSelectIntakeYearNew();
		Thread.sleep(5000);
	}

}
