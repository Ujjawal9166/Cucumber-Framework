package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.ManageTargetPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ManageTargetSteps {

	@And("I choose {string} option option for search manage target")
	public void iChooseViewByOption(String option) throws InterruptedException {
		new ManageTargetPage().iSearchManageTargetViewBy(option);

	}

	@Then("I can see the {string} list")
	public void iValidateListOfManageTarget(String optionname) throws Exception {
		new ManageTargetPage().iValidateListHeader(optionname);
//		if (optionname.contains("School")) {
//			Thread.sleep(4000);
//			CommonActions.refresh();
//		}
	}

	@Then("I can enter the {string} in {string}")
	public void iEnterLeadTargetValue(String value, String optioname) throws Exception {

		if (optioname.contains("Lead Target") || optioname.contains("Enquiry Target")) {
			new CommonLocatorPage().iSelectColumn("2", "5", "nested");
			new ManageTargetPage().iEnterTheTargetLeadValue(value);
		}

		else if (optioname.contains("Application Target")) {
			new CommonLocatorPage().iSelectColumn("2", "6", "nested");
			new ManageTargetPage().iEnterApllicationTargetValue(value);

		}

		else if (optioname.contains("Enrollment Year")) {
			new CommonLocatorPage().iSelectColumn("2", "7", "nested");
			new ManageTargetPage().iEnterPreviousYearEnrollmentValue(value);
		}

		else if (optioname.contains("Budget")) {
			new CommonLocatorPage().iSelectColumn("2", "9", "nested");
			new ManageTargetPage().iEnterOrignalBudget(value);
		}

		else if (optioname.contains("Revised Budget")) {
			new CommonLocatorPage().iSelectColumn("2", "10", "nested");
			new ManageTargetPage().iEnterOrignalBudget(value);
		}
		
		else if (optioname.contains("Enrollment Target")) {
			new CommonLocatorPage().iSelectColumn("2", "11", "nested");
			new ManageTargetPage().iEnterEnrollmentTarget(value);
		}
		
		else if (optioname.contains("BuidingCapacity")) {
			new CommonLocatorPage().iSelectColumn("2", "12", "nested");
			new ManageTargetPage().iEnterBuildingCapacity(value);
		}
		
		else if (optioname.contains("Building Capacity Specialist")) {
			new CommonLocatorPage().iSelectColumn("2", "13", "nested");
			new ManageTargetPage().iEnterBuildingCapacitySpeicalist(value);
		}

	}
	
	
	@Given("I can see the total records in the list")
    public void iValidateTtalRecordsinList() throws Exception {
        new ManageTargetPage().iValidateTtalRecordsinList();
    }

}
