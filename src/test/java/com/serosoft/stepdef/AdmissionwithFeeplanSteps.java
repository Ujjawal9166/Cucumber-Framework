package com.serosoft.stepdef;

import java.util.List;
import java.util.Map;

import com.serosoft.pages.AdmissionPage;
import com.serosoft.pages.AdmissionwithFeeplanPage;
import com.serosoft.pages.ManageLeadPage;

import io.cucumber.java.en.And;

public class AdmissionwithFeeplanSteps {
	
	@And("I collect payment assign application id and submit the form")
	public void iSubmitandGenerateFormNumber() throws Exception {
		new AdmissionwithFeeplanPage().iAssignApllicationId();
	}
	
	@And("I select academyloc and ProgramGroup which is configured")
	public void iSearchCombinationConfigure() throws Exception {
		new AdmissionwithFeeplanPage().iSearchCombinationConfigure();

	}
	
	@And("I click on {string} tab again")
	public void iClickOnLeadSubTabs(String option) throws InterruptedException {
		new AdmissionwithFeeplanPage().iSelectEditLeadTab(option);
	}

	@And("I select the {string} and {string} selection process feeplan applicable")
	public void iSelectStageSettingTab(String stage,String feeplanstage) throws Exception {
		new AdmissionwithFeeplanPage().iSelectStageSettingTab(stage, feeplanstage);
	}

	@And("I select the {string} and {string} selectionprocess feeplan applicable")
	public void iSelectFeeplanStageSettingTab(String stage,String feeplanstage) throws Exception {
		new AdmissionwithFeeplanPage().iSelectFeeplanStageSettingTab(stage, feeplanstage);
	}

}
