package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class CampaignDashboardPage extends GlobalVariable {

	By pastCampaignOption = By.xpath("//span[contains(text() , 'Active Campaigns')]/..");
	By pastCampaignHeader = By.xpath("//span[text() = 'Active Campaigns' and contains(@id , 'header')]/..");
	By intakeYear = By.xpath("//input[@name = 'INTAKE_YEAR']");
	By campaignDetailsHeader = By.xpath("//span[text() = 'Campaigns Details']/..");
	By CampaignCode = By.xpath(
			" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row') and not(contains(@class , 'leaf'))][1]/td[2]/div/a");
	By row = By.xpath(
			" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row') and not(contains(@class , 'leaf'))][1]");

	By campaignDashboardTab = By.xpath("(//span[text() = 'Campaigns Dashboard' and contains(@class , 'tab')])/..");
	By campaignSummaryTab = By.xpath("//span[text() = 'Campaign Summary' and contains(@class , 'tab')]/..");

	public void clickPastCampaign() throws InterruptedException {

		CommonActions.iClickElementByLocator(pastCampaignOption, "Past Campaign");

	}

	public void iValidatePastCampaign() throws Exception {
		WebElement header = CommonActions.getElement(pastCampaignHeader);
		if (header.isDisplayed()) {
			// CommonActions.iScrollToTheElement(header, "Header");
			CommonActions.highlightElementGreen(header, "Past campaign header");
			CommonActions.iLogMessage("Past campaign header is visible!!");
		} else {
			CommonActions.iLogErrorMessage("Past campaign header is not displayed");
			throw new Exception("Header is not displayed");
		}

	}

	public void iSelectIntakeYear() throws InterruptedException {
		WebElement year = CommonActions.getElementIfPresent(intakeYear);
//		CommonActions.iClickElementByLocator(intakeYear, "Intake year fpr the past campaign");
		CommonActions.iClickJSE(year, "Year");
		Thread.sleep(2000);
		WebElement ele = CommonActions.getElement(By.xpath("//div[text() = ' 2023 ']"));
		CommonActions.iClick(ele, "Year selected is" + "2023");
	}

	public void iClickCampaignCode() throws InterruptedException {
		Thread.sleep(2000);
		CommonActions.iImplicitlywait(30, "Campaign code");
//		WebElement row1 = driver.findElement(row);
//		//row1.click();
//		CommonActions.iClickJSE(row1, "Campaign code");
		Thread.sleep(2000);
//		WebElement campaigncode = driver.findElement(CampaignCode);
////		campaigncode.click();
//		
		//CommonActions.iScrollToTheElementByLocator(CampaignCode, "CampaignCode");
		CommonActions.iClickElementByLocator(CampaignCode, "Campaign code");
		Thread.sleep(2000);
		WebElement campaigncode = driver.findElement(CampaignCode);
		CommonActions.iClickJSE(campaigncode, "campaign code");	
	}

	public void iValidateCampaignDetailsHeader(String header) throws Exception {
		CommonActions.iVerifyExactText(header, campaignDetailsHeader, "Campaign header");
	}

	public void iClickOnCOlumnCampaignDashboardData(String name) throws InterruptedException {
		if (name.equals("Total Enquiry")) {
			CommonActions.iLogMessage("I am inside total enquiry condition");
			CommonActions.iClickElementByLocator(campaignDashboardTab, "Campaign dashboard tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "Campaign code");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement totalenquiry = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[5]//a"));
			if (totalenquiry.getText().trim().equals("0")) {
				CommonActions.iLogMessage("Generated applications is zero");
			} else {
				//generateApplications.click();
				CommonActions.iClickJSE(totalenquiry, "Generated applications");
				Thread.sleep(2000);
			}	
		}

		else if (name.equals("Generated Applications")) {
			CommonActions.iClickElementByLocator(campaignSummaryTab, "Camapign summary tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "generateApplications");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement generateApplications = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[6]//a |  //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[6]/div"));

			if (generateApplications.getText().trim().equals("0")) {
				CommonActions.iLogMessage("Generated applications is zero");
			} else {
				//generateApplications.click();
				CommonActions.iClickJSE(generateApplications, "Generated applications");
				Thread.sleep(2000);
			}
		}

		else if (name.equals("Student Enroled")) {
			CommonActions.iClickElementByLocator(campaignSummaryTab, "Camapign summary tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "generateApplications");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement stdEnrolled = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[7]//a |  //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[7]/div"));

			if (stdEnrolled.getText().trim().equals("0")) {

				CommonActions.iLogMessage("Student enrolled is zero");

			} else {
				WebElement stdEnrolled1 = driver.findElement(By.xpath(
						" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[7]//a |  //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[7]/div/a"));

//				stdEnrolled1.click();
				CommonActions.iClickJSE(stdEnrolled1, "Student enrolled");
				Thread.sleep(2000);
			}
		}

		else if (name.equals("Grades Covered")) {
			CommonActions.iClickElementByLocator(campaignSummaryTab, "Camapign summary tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "generateApplications");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement gradesCovered = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[8]//a"));
			//gradesCovered.click();
			CommonActions.iClickJSE(gradesCovered, "Grades covered");
			Thread.sleep(2000);
		}

		else if (name.equals("Brands Covered")) {
			CommonActions.iClickElementByLocator(campaignSummaryTab, "Camapign summary tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "generateApplications");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement generateApplications = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[12]//a"));
//			generateApplications.click();
			CommonActions.iClickJSE(generateApplications, "Generated applications");
			Thread.sleep(2000);
		}

		else if (name.equals("Campuses Covered")) {
			CommonActions.iClickElementByLocator(campaignSummaryTab, "Camapign summary tab");
			Thread.sleep(2000);
			CommonActions.iImplicitlywait(30, "generateApplications");
			WebElement row1 = driver.findElement(row);
			row1.click();
			Thread.sleep(2000);
			WebElement campusesCovered = driver.findElement(By.xpath(
					" //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[13]//a"));
			//campusesCovered.click();
			CommonActions.iClickJSE(campusesCovered, "Campuses covered");
			Thread.sleep(2000);
		}

	}

}
