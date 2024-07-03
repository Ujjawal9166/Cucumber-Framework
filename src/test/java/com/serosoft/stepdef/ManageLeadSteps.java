package com.serosoft.stepdef;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.ManageLeadPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ManageLeadSteps {

	@Then("I can see total records")
	public void validateTotalRecords() throws Exception {

		new ManageLeadPage().validateLeads();

	}

	@And("I fill the lead details")
	public void iFillMandatoryDetails() throws Exception {
		new ManageLeadPage().iCreateLead();

	}

	@And("I add student details")
	public void iAddStudentDetails() throws Exception {
		new ManageLeadPage().iAddStudentDetails();
	}

	@Then("lead is created successfully")
	public void iValidateSuccessMessage() throws InterruptedException {
		new CommonLocatorPage().iValidateAlert();		
	}

	@And("I edited the lead details")
	public void editLead() throws Exception {
		new ManageLeadPage().iEditLead();
		Thread.sleep(4000);
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	@Then("lead is successfully edited")
	public void validateAlert() {

		new CommonLocatorPage().iValidateAlert();
	}

	@And("I click on {string} tab")
	public void iClickOnLeadSubTabs(String option) throws InterruptedException {
		new ManageLeadPage().iSelectEditLeadTab(option);
	}

	@And("I edit the student details")
	public void editStudentDetails() throws Exception {

		new ManageLeadPage().iEditedStudentDetails();
		new CommonLocatorPage().iClickSaveButton("nested");

	}

	@And("I edit the Admission details")
	public void iEditAdmissionDetails() throws InterruptedException {

	}

	@And("I Add the Admission details")
	public void iAddAdmissionDetails() throws InterruptedException {

		new ManageLeadPage().iAddAdmissionDetails();
	}

	@And("I add the followup details")
	public void iAddFollowupDetails() throws Exception {
		new ManageLeadPage().iAddFollowUp();
	}

	@And("I close the followup details")
	public void closeFollowup() throws InterruptedException {
		new ManageLeadPage().iCloseFollowUp();
	}

	@And("I add followup date")
	public void addFollowupDate() throws Exception {
		new ManageLeadPage().iAddFollowupDate();
	}

	@And("I Book Appointment")
	public void bookAppointment() throws Exception {
		new ManageLeadPage().addAppointment();
	}

	@And("I Edit Appointment")
	public void editAppointment() throws Exception {
		new CommonLocatorPage().iSelectRow("1", "nested");
		new ManageLeadPage().EditAppointment();
	}

	@And("I Delete Appointment")
	public void deleteAppointment() throws Exception {
		new CommonLocatorPage().iSelectRow("1", "nested");
		new ManageLeadPage().DeleteAppointment();
	}

	@And("I verify communication history by {string}")
	public void iVerifyCOmmunicationHistory(String name) throws InterruptedException {
		new ManageLeadPage().verifyCommunicationHistory(name);

	}

	@And("I close the admission {string}")
	public void closeTheAdmission(String reason) throws Exception {
		new ManageLeadPage().closeAdmission(reason);
	}

	@And("I open the admission {string}")
	public void openTheAdmission(String reason) throws Exception {

		new ManageLeadPage().openAdmission(reason);

	}

	@And("I select the lead and send the SMS to {string}")
	public void sendSMSToLead(String option) throws Exception {

		new ManageLeadPage().sendSMSToLead(option);

	}

	@And("I select the lead data")
	public void selectLeadRow() throws Exception {
		new ManageLeadPage().seelctLead();
	}

	@And("I click on more actions")
	public void clickMoreActions() throws Exception {

		new CommonLocatorPage().iClickButtonOfChoice("More Action");
	}

	@And("I select the {string} actions")
	public void selectMoreActionsOption(String optionname) throws Exception {
		new ManageLeadPage().iSelectMoreActions(optionname);

	}

	@Then("I can see {string} in header page")
	public void validatePageHeaderMoreActions(String optionname) throws Exception {
		new ManageLeadPage().validateMoreOptionHeader(optionname);

	}

	@Given("I click on followup details")
	public void clickFollowupDetails() throws Exception {
		new ManageLeadPage().clickFollwupButton();
	}

	@Then("I can see followup lead details")
	public void validatePageHeaderFollowupPage() throws Exception {

		new ManageLeadPage().iValidateFollowupLeadPage();

	}

	@Given("I click on Send reminder")
	public void clickSendReminder() throws Exception {
		new ManageLeadPage().sendReminder();
	}

	@Then("I can see View lead details header")
	public void validatePageHeaderLeadDeatils() throws Exception {
		new ManageLeadPage().validateLeadDeatilsPageHeader();
	}

	@Then("I can see View lead details header edit leads")
	public void validatePageHeaderLeadDeatilsEditLeads() throws Exception {
		new ManageLeadPage().validateLeadDeatilsPageHeader();
		CommonActions.refresh();
	}

	@Given("I click on column button and select status from {string}")
	public void selectStatus(String screenname) throws Exception {
		new ManageLeadPage().selectStatusFromColumn(screenname);
	}

	@Then("status got updated")
	public void statusgotUpdated() throws Exception {
		new ManageLeadPage().validateStatusUpdated();
	}

	@And("click on reset button")
	public void clickOnReset() throws Exception {
       new ManageLeadPage().clickOnResetButton();
	}
	
	@Then("lead is deleted")
	public void deleteLead() throws Exception {
		new ManageLeadPage().deleteTheLeadDetails();
	}
	
	
	@Given("I click on column button and select status from the {string}")
	public void selectStatusForReset(String screenname) throws Exception {
		new ManageLeadPage().selectStatusFromColumnReset(screenname);
	}
	
	

	@Then("status got updated for reset")
	public void statusgotUpdatedForReset() throws Exception {
		new ManageLeadPage().validateStatusUpdatedForReset();
	}
	
	
	

	@Then("lead is created successfully and fetched enquiry id")
	public void fetchENqID() throws Exception {	
		new ManageLeadPage().fetchEnquiryID();	
	}
	
	
	@Given("I search enquiry")
	public void searchEnquiry() throws Exception {
		new ManageLeadPage().enterLeadName();
		Thread.sleep(4000);
	}
	
	
	
	
	


	
	
	

}
