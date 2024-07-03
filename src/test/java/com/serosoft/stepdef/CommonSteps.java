package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CommonLocatorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CommonSteps {

	@And("I click on {string} option")
	public void iClickOnButton(String option) throws InterruptedException {
		CommonLocatorPage.iClickOnoption(option);
		Thread.sleep(10000);
	}

	@And("I click on {string} Module")
	public void iClickOnModule(String option) throws InterruptedException {

		new CommonLocatorPage().iClickModule(option);

		Thread.sleep(10000);
	}

	@And("I click on {string} button")
	public void iClickOnActionButton(String name) throws InterruptedException {
		new CommonLocatorPage().iClickActionButton(name);
	}

	@And("I click on {string} button inside nested tabs")
	public void iClickOnActionButtonInsideNestedTabs(String option) throws InterruptedException {

		new CommonLocatorPage().iClickActionButtonInsideNestedTabs(option);
	}

	@And("I click on Save button of {string}")
	public void iClickSaveButton(String type) throws InterruptedException {
		new CommonLocatorPage().iClickSaveButton(type);
	}

	@And("I click {string} button")
	public void iClickButton(String buttonname) throws InterruptedException {
		new CommonLocatorPage().iClickButtonOfChoice(buttonname);
	}

	@And("I select the {string} row of the table")
	public void iSelectRowNumberFromTable(String rownumber) throws InterruptedException {
		new CommonLocatorPage().iSelectRow(rownumber, "normal");
	}

	@Then("Data should get deleted")
	public void iDeletedData() throws InterruptedException {
		new CommonLocatorPage().iClickYes();
		CommonActions.refresh();
//		new CommonLocatorPage().iValidateAlert();
	}

	@And("I can see the successfull alert")
	public void iSeeSuccessfulAlert() {
		new CommonLocatorPage().iValidateAlert();

	}

	@And("I select the {string} nested row of the table")
	public void iSelectRowNumberFromTableNested(String rownumber) throws InterruptedException {
		new CommonLocatorPage().iSelectRow(rownumber, "nested");
	}
	

	@And("I can see the successfull alert and refresh the page")
	public void iSeeSuccessfulAlertAndRefresh() throws InterruptedException {
		try {
		new CommonLocatorPage().iValidateAlert();	
		}
		catch (Exception e) {
			CommonActions.iLogMessage("No alert is present");
		}
		CommonActions.refresh();

	}
	
	
	@And("I refresh page")
	public void iRefresh() throws InterruptedException {
		Thread.sleep(4000);
		CommonActions.refresh();
	}
	
	@And("I logged out")
	public void iLogOut() throws InterruptedException {
		new CommonLocatorPage().iClickLogOutButton();
	}
	
	
	
	
	
	
	
}
