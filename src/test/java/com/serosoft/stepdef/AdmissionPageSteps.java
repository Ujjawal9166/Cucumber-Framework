package com.serosoft.stepdef;

import java.util.List;
import java.util.Map;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.AdmissionPage;
import com.serosoft.pages.CommonLocatorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdmissionPageSteps {

	@And("I add the selection process of {string}")
	public void iAddtheSelectionProcess(String type) throws Exception {
		new AdmissionPage().iAddtheSelectionProcess(type);
	}

	@Given("I click on the created selection process")
	public void iClickSelectionProcess() throws Exception {
		new AdmissionPage().iClickSelectionProcess();
	}

	@Then("I add selection stages")
	public void iSelectStage(List<Map<String, String>> data) throws Exception {

		new AdmissionPage().iSelectStage(data);
	}

	@And("I add the evaluation parameters")
	public void iAddEvaluation(List<Map<String, String>> data) throws Exception {
		new AdmissionPage().iAddEvaluationParameter(data);
	}

	@And("I select Academylocation and ProgramGroup which is not configured")

	public void iSlectProgramName() throws Exception {
		new AdmissionPage().iSelectNotConfigured();
	}

	@And("I select the program which need to be configured")
	public void iSelecttheProgram() throws Exception {
		new AdmissionPage().iSelectConfigureCombination();
	}

	@And("I select the selection process for {string}")
	public void iSelecttheSelectionProcessType(String type) throws Exception {
		new AdmissionPage().iSelectSelectionProcessType(type);

	}

	@And("I select the selection process with fee")
	public void iSelectStageSettingTab(List<Map<String, String>> seat) throws Exception {
		new AdmissionPage().iSelectStageSettingTab(seat);
	}

	@And("I select the application settings process")
	public void iSelectApplicationSettings() throws Exception {
		new AdmissionPage().iSelectApplicationSettingTab();
	}

	@And("I select the admission settings process {string}")
	public void iSelectAdmissionSettings(String issuetype) throws Exception {
		new AdmissionPage().iSelectAdmissionSettingTab(issuetype);

	}

	@Then("I close the admission setup")
	public void iCloseAdmissionSetup() throws Exception {
		new AdmissionPage().iCloseAdmissionSetup();
	}

	@And("I select academy and ProgramGroup which is configured")
	public void iSearchCombinationConfigure() throws Exception {
		new AdmissionPage().iSearchCombinationConfigure();

	}

	@And("I add new application details {string} {string}")
	public void iCreateNewApplications(String apltype, String gender) throws Exception {
		new AdmissionPage().iCreateNewApplication(apltype, gender);
	}

	@And("I select source of entry")
	public void iSelectSourceofEntry(List<Map<String, String>> sourceofentry) throws Exception {
		new AdmissionPage().iSelectSourceofEntry(sourceofentry);
	}

	@And("I add {string} {string} contact and relationship details")
	public void iSelectSourceofEntry(String studentname, String employeename) throws Exception {
		new AdmissionPage().iAddContactandRelationshipDetails(studentname, employeename);
	}

	@And("I select academyLocation ProgramGroup and programname")
	public void iSelectLocationandProgram() throws Exception {
		new AdmissionPage().iSelectLocationandProgram();
	}

	@And("I add program")
	public void iAddProgram() throws Exception {
		new AdmissionPage().iAddProgram();
	}

	@And("I select {string} and {string}")
	public void iRuntheJobforStartAdmission(String jobname, String jobstate) throws Exception {
		new AdmissionPage().iRuntheJobforAdmission(jobname, jobstate);
	}

	@Given("I select new student application")
	public void iSelectNewApplication() throws Exception {
		new AdmissionPage().iSelectNewApplication();
	}

	@And("I assign application id and submit the form")
	public void iSubmitandGenerateFormNumber() throws Exception {
		new AdmissionPage().iAssignApllicationId();
	}

	@And("I search application id")
	public void iSearchForApplicationId() throws Exception {
		new AdmissionPage().iSearchForApplicationId();
	}

	@And("I select edit the applicant")
	public void iEdittheApplication() throws Exception {
		Thread.sleep(4000);
		new AdmissionPage().iEdittheApplication();
	}

	@And("I click on  approve application")
	public void iClickApproveApplicationButton() throws Exception {
		new AdmissionPage().iClickApplicationApproveButton();
	}

	@And("I add the application program with {string}")
	public void iAddApplicationProgram(String reason) throws Exception {
		new AdmissionPage().iSelectApplicationProgram(reason);

	}

	@And("I approve the applicant for first stage")
	public void iApproveStage1() throws Exception {
		new AdmissionPage().approveApplicantWritten();

	}

	@And("I approve the applicant for seconf stage")
	public void iApproveStage2() throws Exception {
		new AdmissionPage().approveApplicantInterview();

	}

	@And("I select the applicant application")
	public void iSelectApplicantApplication() throws Exception {
		new AdmissionPage().SelectApplicantApplication();
	}

	@And("I select Admission details tab and click on add program")
	public void iSelectAdmissionDetailsAndAddProgram() throws Exception {
		new AdmissionPage().SelectAdmissionDetailsAndAddProgram();
	}

	@And("I select the program and period")
	public void iSelectProgramandPeriod() throws Exception {
		new AdmissionPage().SelectProgramandPeriod();
	}

	@And("I choose {string} and click on add program button")
	public void iChooseAdmissionTypeandAddProgramBtn(String admtype) throws Exception {
		new AdmissionPage().ChooseAdmissionTypeandAddProgramBtn(admtype);
	}

	@And("I select the program and approve the admission")
	public void iSelectApproveAdmission() throws Exception {
		new AdmissionPage().SelectApproveAdmission();
	}

	@And("I select the program to be approve")
	public void iSelectProgramandApprove() throws Exception {
		new AdmissionPage().SelectProgramandApprove();
	}

	@And("I search student application id")
	public void iSearchForStudentApplicationId() throws Exception {
		new AdmissionPage().SearchForStudentApplicationId();
	}

	@Then("I validate the student in studentlist")
	public void iValidateSApplicantInStudentist() throws Exception {
		new AdmissionPage().iValidateStudentList();
	}
	
	@And("I enter application ID and search the application")
	public void iEnterApplicIDAndSearch() throws Exception {		
		new AdmissionPage().searchApplicationStageFee();		
	}
	
	@And("I select the application")
	public void iSelectApplc() throws Exception {
		new AdmissionPage().selectApplicationForStageFee();
	}
	
	@And("I collect the payment for stage")
	public void iCollectStageFee() throws Exception {		
		new AdmissionPage().iCOllectThePayemnt();		
	}
	
	@And("I add on  {string},{string},{string},{string},{string} and {string} application")
	public void iAddCountryNationalityOtherDetails(String country, String nayionality, String disabilites, String rule, String homelanguage, String secondlanguage) throws Exception {
		new AdmissionPage().iAddCountryNationalityOtherDetails(country, nayionality, disabilites, rule, homelanguage, secondlanguage);
	}
	
	@And("I select recipts for {string},{string} and {string}")
	public void iSelectReiptsforStudent(String recipttype, String reciptfor, String currency) throws Exception {		
		new AdmissionPage().iSelectreciptsforStudent(recipttype, reciptfor, currency);		
	}
	
	@And("I select bills for {string}")
	public void iSelectBillsforStudent(String type) throws Exception {		
		new AdmissionPage().iSelectBillsforStudent(type);		
	}
	
	@And("I wait for results")
	public void iWaitforResults() throws Exception {		
		new AdmissionPage().iWaitforResults();		
	}
	
	@And("I select payment for {string},{string},{string} and {string}")
	public void iSelectpaymentforStudent(String paymenttype, String paymentfor, String amount, String currency) throws Exception {		
		new AdmissionPage().iSelectpaymentforStudent(paymenttype, paymentfor, amount, currency);		
	}
	
	@And("I select recipts list for {string}")
	public void iSelectReiptsListforStudent(String recipttype) throws Exception {		
		new AdmissionPage().iSelectreciptsListforStudent(recipttype);		
	}
	
	@And("I select Voucher for {string},{string}")
	public void iSelectvoucherforStudent(String vouchertype, String voucherlinktype) throws Exception {		
		new AdmissionPage().iSelectvoucherforStudent(vouchertype, voucherlinktype);		
	}
	
	@Then("I validate the list of applicants and fee head refunds")
	public void iValidateApplicantsandRefundHeader() throws Exception {		
		new AdmissionPage().iValidateApplicantsandRefundHeader();		
	}
	
	@Then("I validate the final admissions list in refunds")
	public void iValidateFinalAdmissionLists() throws Exception {		
		new AdmissionPage().iValidateFinalAdmissionLists();		
	}
	
	@And("I click {string} and {string}")
	public void iValidateJobstateHistory(String jobstate, String jobstatus) throws Exception {		
		new AdmissionPage().iValidateJobstateHistory(jobstate, jobstatus);		
	}
	
	
}
