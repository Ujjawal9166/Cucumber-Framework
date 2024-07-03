package com.serosoft.stepdef;

import java.util.List;
import java.util.Map;

import com.serosoft.pages.LeadDashboardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LeadDashboardSteps {

	@And("I click on {string} in lead dashboardpage")
	public void iSelectReportType(String type) throws InterruptedException {
		new LeadDashboardPage().iSelectReportTypeAndClick(type);
	}

	@Then("I validate followup report of {string} type")
	public void iValidateFollowupReport(String typename) throws Exception {
		new LeadDashboardPage().iValidateFollowupReport(typename);
	}

	@Then("I validate followup report")
	public void iValidateFollowupReportOfDifferentType(List<Map<String, String>> data) throws Exception {
		new LeadDashboardPage().iValidateFollowupReportDifferentType(data);
	}

	@Then("I click on total number of pending leads")
	public void clickOnTotalLeads() throws Exception {
		new LeadDashboardPage().iClickOnTotalNumberOfLeads();
	}

	@Then("I validate the pending leads page header")
	public void validateLeadsPageHeader() throws Exception {
		new LeadDashboardPage().iValidateTotalLeadPageHeader();
	}

	@Then("I validate count of leads header")
	public void validateCountsOfLeadHeader() throws Exception {
		new LeadDashboardPage().iValidateCountOfLeadsPageHeader();
	}
	
	@Then("I validate count of closure rate header")
	public void validateClosureRateHeader() throws Exception {
		new LeadDashboardPage().iValidateClosureRatePageHeader();
	}
	
	@Then("I validate count of Lead summary header")
	public void validateLeadSummayHeader() throws Exception {
		new LeadDashboardPage().iValidateLeadSummaryHeader();
	}

	 
}
