package com.serosoft.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;

public class LeadDashboardPage {

	By reportArrow = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//img[contains (@class , ' x-tool-expand-right')]/parent::div[contains(@class , 'before-title')]");
	By typeDropdown = By.cssSelector("input[name ='ENQUIRY_TYPE']");
	By folloupscheduleHeader = By
			.xpath("//span[text() = 'Follow-up Scheduled']/parent::div[contains(@id , 'searchresultgrid')]");

	By totalNumberOfLeads = By.xpath(
			"( //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//tr[contains(@role,'row')][1])[1]/td[2]//a");
	By pendingLeadsHeader = By.xpath("//span[text() = 'Total Pending Leads']/.. |//span[text() = 'Total Pending Enquiries']/..");
	By leadsDashboardTab = By.xpath("//span[text() = 'Leads Dashboard' and contains(@class , 'tab')] |  //span[text() = 'Enquiries Dashboard' and contains(@class , 'tab')]");   
	By countOfLeadsHeader = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//label[text() = 'Count of Leads'] | //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//label[text() = 'Count of Enquiries']");
	By closureRateHeader = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//label[text() = 'Lead Closure Rate'] |  //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//label[text() = 'Enquiry Closure Rate']");
    By leadSummaryHeader = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text()= 'Lead Summary']/.. | //body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text()= 'Enquiry Summary']/..");
    By intakeYear = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name= 'intakeYear']");
	
    
    
    
	public void iSelectReportTypeAndClick(String typename) throws InterruptedException {
		if (typename.equals("Follow-up Scheduled")) {
			WebElement reportypename = CommonActions.getElement(By.xpath("//span[text() = '" + typename + "']/.."));
			CommonActions.iClick(reportypename, "clicked on " + typename);
		} else if (typename.equals("Count of Leads") || typename.equals("Count of Enquiries") || typename.equals("Enquiry Closure Rate") || typename.equals("Enquiry Summary")) {
			CommonActions.iClickElementByLocator(leadsDashboardTab, "Leads Dasboard tab");
			CommonActions.iClickElementByLocator(reportArrow, "Report arrow");
			WebElement reportypename = CommonActions.getElement(By.xpath("//span[text() = '" + typename + "']/.."));
			CommonActions.iClick(reportypename, "clicked on " + typename);

		} else {
			CommonActions.iClickElementByLocator(reportArrow, "Report arrow");
			WebElement reportypename = CommonActions.getElement(By.xpath("//span[text() = '" + typename + "']/.."));
			CommonActions.iClick(reportypename, "clicked on " + typename);

		}
	}

	public void iValidateFollowupReport(String reporttypename) throws Exception {
		CommonActions.clickOnElementAndType(typeDropdown, reporttypename, "Report type dropdown");
		CommonActions.iClickEnter(typeDropdown);
		CommonActions.isDisplayed(folloupscheduleHeader, "Folloup scheule header");
	}

	public void iValidateFollowupReportDifferentType(List<Map<String, String>> data) throws Exception {
		for (Map<String, String> type : data) {
			String reportOfType = type.get("typename");
			CommonActions.clickOnElementAndType(typeDropdown, reportOfType, "Report type dropdown");
			CommonActions.iClickEnter(typeDropdown);
			new CommonLocatorPage().iClickButtonOfChoice("Search");
			Thread.sleep(10000);
			WebElement element = CommonActions.getElementIfPresent(folloupscheduleHeader);
			CommonActions.highlightElementGreen(element, reportOfType);
			CommonActions.iLogMessage("Header is present");
		}
	}

	public void iClickOnTotalNumberOfLeads() throws InterruptedException {
		CommonActions.iClickElementByLocator(totalNumberOfLeads, "Total Number of leads");
	}

	public void iValidateTotalLeadPageHeader() throws Exception {
		CommonActions.isDisplayed(pendingLeadsHeader, "Pending leads header");

	}

	public void iValidateCountOfLeadsPageHeader() throws Exception {
		CommonActions.isDisplayed(countOfLeadsHeader, "count of leads header");

	}

	public void iValidateClosureRatePageHeader() throws Exception {
		new CommonLocatorPage().iClickButtonOfChoice("SearchNested");
		Thread.sleep(2000);
		CommonActions.isDisplayed(closureRateHeader, "closure rate header");
	}
	
	public void iValidateLeadSummaryHeader() throws Exception {
		CommonActions.iClickElementByLocator(intakeYear, "Intake year");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' 2023 ']"), "2023");
		new CommonLocatorPage().iClickButtonOfChoice("SearchNested");
		Thread.sleep(2000);
		CommonActions.isDisplayed(leadSummaryHeader, "closure rate header");
		Thread.sleep(5000);
		CommonActions.refresh();
	}
}
