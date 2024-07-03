package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CampaignSchoolMaster;
import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.ManageCampaignPage;

import io.cucumber.java.en.*;

public class PreAdmissionSteps {

	@SuppressWarnings("static-access")
	@And("I enter the mandatory fields and submit")
	public void iCreateCampaign() throws Exception {
		new ManageCampaignPage().createCampaign();

	}

	@Then("campaign is created")
	public void iValidateCampaignCreated() throws InterruptedException {
		new CommonLocatorPage().iValidateAlert();
	}

	@And("I edited the Campaign")
	public void editCampaign() throws Exception {

		new ManageCampaignPage().editCampaign();

	}

	@Then("Data should get Edited")
	public void iValidateEditCampaign() {

		new CommonLocatorPage().iValidateAlert();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.print("Issue");
		}
		CommonActions.refresh();
	}

	@And("I fill mandatory fields for school master")
	public void createSchoolMaster() throws Exception {
		new CampaignSchoolMaster().createSchoolMaster();
	}

	@And("I edited the Campaign school master")
	public void editCampaignSchoolMaster() throws Exception {

		new CampaignSchoolMaster().editSchoolMaster();

	}

	@Given("I choose map school priority")
	public void clickPriorityTab() throws Exception {

		new CampaignSchoolMaster().iSelectPriorityTab();

	}

	@And("Select {string} and {string}")
	public void seelctCampusAndYear(String campus, String year) throws Exception {

		new CampaignSchoolMaster().selectIntakeAndCampus(campus, year);

	}

	@And("change school priority")
	public void selectSchoolPriority() throws Exception {

		new CampaignSchoolMaster().iSelectPriority();

	}

	@Given("change school priority international")
	public void changeInternarionalPriority() throws Exception {
		new CampaignSchoolMaster().iSelectInternationalPriority();

	}

	@Given("I choose school to set priority")
	public void iChooseSchool() throws Exception {
		new CampaignSchoolMaster().iSelectSchool();

	}

	@And("click on set defualt priority button")
	public void iClickSetDefualtPriority() throws Exception {
		new CampaignSchoolMaster().iClickSetDefualtPriorityButton();

	}

	@And("i select {string}")
	public void iSelectPriority(String priorityname) throws Exception {
		new CampaignSchoolMaster().iSelectDefualtPriorityOption(priorityname);
	}

	@Given("I select created school master")
	public void selectCreatedSchoolMaster() throws Exception {

		new CampaignSchoolMaster().selectSchoolMaster();

	}
	
	@Given("I select created school master campaign")
	public void selectCreatedSchoolMasterCampaign() throws Exception {

		new CampaignSchoolMaster().selectSchoolMasterNew();

	}

}
