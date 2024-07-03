package com.serosoft.stepdef;

import com.serosoft.pages.ExaminationPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class ExaminationSteps {
	
	@And("I add assessment method")
	public void iClickAddButton() throws Exception {
		new ExaminationPages().iClickAddAssessment();
	}

	@And("I fill the mandatory details for assign assessment method {string}")
	public void iClickAssignAssessmentTab(String type) throws Exception {
		new ExaminationPages().iClickAssignAssessmenttype(type);
	}
	
	@Then("I Verify the created assessment method {string}")
	public void iVerifyAssessmentMethod(String type) throws Exception {
		new ExaminationPages().iVerifyAssessmentMethod(type);
	}
	
	@And("I fill assessment scheme {string} and {string} and {string} details")
	public void iFilltheAssessmentSchemeDetails(String type, String mode, String acadterm)throws Exception {
		new ExaminationPages().iFilltheAssessmentSchemeDetails(type, mode, acadterm);
	}
	
	@Given("I searching assessment scheme {string} and {string} name")
	public void iSearchAssessmentSchemeName(String type, String acadterm)throws Exception {
		new ExaminationPages().iSearchAssessmentSchemeName(type, acadterm);
	}
	
	@And("I validate the assessment scheme")
	public void iSelectAssessmentScheme()throws Exception {
		new ExaminationPages().iSelectAssessmentScheme();
	}
	
	@And("I add academic {string}")
	public void iSelectAcademicTerm(String term)throws Exception {
		new ExaminationPages().iSelectAcademicTerm(term);
	}
	
	@And("I link academy location")
	public void iMappingLocation()throws Exception {
		new ExaminationPages().iMappingLocation();
	}
	
	@And("I mapping course")
	public void iMappingCourse()throws Exception {
		new ExaminationPages().iMappingCourse();
	}
	
	@And("I mapping elegible course variants")
	public void iMappingVariantCourse()throws Exception {
		new ExaminationPages().iMappingVariantCourse();
	}

	@And("I add the assessment scheme hierarchy")
	public void iAddAssessmentschemeHierarchy()throws Exception {
		new ExaminationPages().iAddAssessmentschemeHierarchy();
	}
}
