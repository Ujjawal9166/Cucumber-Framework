package com.serosoft.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CampaignDashboardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CamapignDasboardSteps {

	@And("I click on past campaign")
	public void iClickPastCampaign() throws InterruptedException {
		new CampaignDashboardPage().clickPastCampaign();
	}
	
	
	@Then("I validate past campaign header")
	public void iValidateCampaignHeader() throws Exception {
		new CampaignDashboardPage().iValidatePastCampaign();
		
	}
	
	@And("I select intake year for pastcampaign")
	public void iSelectIntakeYearForPastCampaign() throws InterruptedException {
		
		new CampaignDashboardPage().iSelectIntakeYear();
		
	}
	
	
	@Given("I click on campaign code")
	public void iClickCampaignCode() throws InterruptedException {
		
		new CampaignDashboardPage().iClickCampaignCode();
	}
	 
	
	@Then("I can view {string} page")
	public void iValidateCampaignDetailsPage(String headertitle) throws Exception {
		
		new CampaignDashboardPage().iValidateCampaignDetailsHeader(headertitle);
	}
	
	
	@And("I can validate header {string} past campaign")
	public void iValidateHeader(String name) throws Exception {
		
		try {
	
		WebElement header = CommonActions.getElement(By.xpath("//span[contains(text() , 'Active Campaigns - "+name+"')]/.."));
		CommonActions.iVerifyPartialText(name, header, name +" header page");	 
		}
		catch (Exception e) {
			CommonActions.iLogErrorMessage(name +" alloted value is zero ");
		}
	}
	

	@Given("I click on {string} in campaign dashboard page")
	public void iClickOnColumn(String name) throws InterruptedException {
		new CampaignDashboardPage().iClickOnCOlumnCampaignDashboardData(name);
		
	}

}
