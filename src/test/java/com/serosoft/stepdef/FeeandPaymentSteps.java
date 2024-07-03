package com.serosoft.stepdef;

import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.FeeandPaymentPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FeeandPaymentSteps {

	@And("I select {string} and {string} in fee plan")
	public void iSelectFeepalnType(String feeplantype, String currency) throws Exception {
		new FeeandPaymentPages().iCreateFeePlan(feeplantype, currency);
	}

	@And("I select the created fee plan")
	public void ISelectFeePlan() throws Exception {
		new FeeandPaymentPages().iSelectCreatedFeePlan();

	}

	@And("I add new fee plan rule manually")
	public void iAddFeeplanRuleManually() throws Exception {
		new CommonLocatorPage().iClickButtonOfChoice("Manually");
	}

	@And("I choose fee {string} radio btn")
	public void iChooseRuleApplicableBtn(String rule) throws Exception {
		new FeeandPaymentPages().iChooseRuleApplicable(rule);
	}

	@And("I select fee plan rule {string} and {string} and {string} and {string}")
	public void iSelectStatusStageDueDays(String status, String stage, String duedays, String descrption)
			throws Exception {
		new FeeandPaymentPages().iSelectStatusStageDueDays(status, stage, duedays, descrption);
	}

	@Given("I select the created feeplan rule {string}")
	public void iSelectCreatedFeeplan(String stage) throws Exception {
		new FeeandPaymentPages().iSelectCreatedFeePlanRule(stage);
	}

	@And("I configure fee heads feeplan rule")
	public void iConfigureFeeHeads() throws Exception {
		new FeeandPaymentPages().iClickCOnfigureFeeHead();
	}

	@And("I add {string} {string} {string} and {string}")
	public void iAddFeeHeadsDetails(String feehead, String amountperc, String amount, String periodicty)
			throws Exception {
		new FeeandPaymentPages().iAddFeeplanRule(feehead, amountperc, amount, periodicty);
	}

	@Then("I close the fee head and cofigure fee heads tabs")
	public void iCloseFeeHeadandConfigureHEadsTabs() throws Exception {

		new FeeandPaymentPages().iCloseFeeAndConfigureFeeHeadTab();
	}

	@And("I click approve the fee plan")
	public void iApprovetheFeeplan() throws Exception {
		new FeeandPaymentPages().iApproveFeePlan();
	}

	@And("I click apply to the fee plan")
	public void iApplyToFeeplan() throws Exception {
      new FeeandPaymentPages().iApplyFeePlan();
	}

	
	@And("I choose manage feeplan tab")
	public void iChooseManageFeeplanTab() throws Exception {
      new FeeandPaymentPages().iClickManageFeePlanTab();
	}

	@And("I refrsh the data")
	public void iRefreshDataFeePlanPage() throws Exception {

		new FeeandPaymentPages().iRefreshFeePlnPage();

	}

	@And("I add {string}, Program, Program Batch, and, {string}")
	public void iMapFeePlanAdmission(String academyLocation, String seat) throws Exception {
		new FeeandPaymentPages().iMapFeePlan(academyLocation, seat);
	}
	@And("I select the created fee plan for approve")
	public void iSelectFeePlanforApprove() throws Exception {
		new FeeandPaymentPages().iSelectCreatedFeePlanforApprove();

	}

	@And("I select the created fee plan for apply")
	public void iSelectFeePlanforApply() throws Exception {
		new FeeandPaymentPages().iSelectCreatedFeePlanApply();

	}
	
	@And("I select {string} and {string} in program fee plan")
	public void iSelectProgramFeepalnType(String feeplantype, String currency) throws Exception {
		new FeeandPaymentPages().iCreateProgramFeePlan(feeplantype, currency);
	}
	
	
	@And("I select the created program fee plan")
	public void ISelectProgramFeePlan() throws Exception {
		new FeeandPaymentPages().iSelectCreatedProgramFeePlan();

	}
	
	@And("I select program fee plan rule {string} and {string} and {string} and {string}")
	public void iSelectStatusStageDueDaysForProgramFeePlan(String status, String stage, String duedays, String descrption)
			throws Exception {
		new FeeandPaymentPages().iSelectStatusStageDueDaysPrgFeePlan(status, stage, duedays, descrption);
	}
	
	@And("I select the created program fee plan for approve")
	public void iSelectProgramFeePlanforApprove() throws Exception {
		new FeeandPaymentPages().iSelectCreatedProgramFeePlanforApprove();

	}
	
	@And("I select the created program fee plan for apply")
	public void iSelectPrgFeePlanforApply() throws Exception {
		new FeeandPaymentPages().iSelectCreatedFeePlanApply();

	}
	@And("I select {string}")
	public void iChooseRulefromdropdown(String rule) throws Exception {
		new FeeandPaymentPages().iChooseRulefromdropdown(rule);
	}
	
	@And("I select program fee plan rule domicile {string} and {string} and {string} and {string}")
	public void iSelectStatusStageDueDaysForProgramFeePlandomicile(String status, String stage, String duedays, String descrption)
			throws Exception {
		new FeeandPaymentPages().iSelectStatusStageDueDaysPrgFeePlanDomicile(status, stage, duedays, descrption);
	}
	
	
	
	
	


}
