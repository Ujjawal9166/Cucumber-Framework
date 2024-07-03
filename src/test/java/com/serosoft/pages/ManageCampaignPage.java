package com.serosoft.pages;

import org.openqa.selenium.By;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class ManageCampaignPage extends GlobalVariable {

	static By CamapignName = By.cssSelector("input[name = 'campaignName']");
	static By FromDatePicker = By.xpath("//input[@name= 'fromDate']/parent::td/following-sibling::td");
	static By ToDatePicker = By.xpath("//input[@name= 'toDate']/parent::td/following-sibling::td");
	static By TodayDate = By.xpath("(//span[text() = 'Today'])[1]/parent::a/..");
	static By BudgetAmout = By.xpath("//input[@name = 'budgetAmount']");
	static By ContatcPersonField = By.xpath("//input[@name = 'contactPerson']");
	static By Remarksfield = By.xpath("//textarea[@name = 'remarks']");
	static By MediaTypeDropdown = By.xpath("//div[@name = 'campaignMedias']/parent::td/../td[3]");
	static By SelectAll = By.xpath("//u[text() = 'Select All']");
	static By DismissDropdown = By.xpath("//*[contains(text(), 'List of Campaign Coverage')]");
	static By clicktoEnterField = By.xpath("(//div[text()= 'Click to enter'])[1]");
	static By inputContactPerson = By.xpath("(//input[@placeholder = 'Enter 3 char to auto search'])[5]");
	static By NextButton = By.xpath("//span[text() = 'Next']/parent::span");
	static By BrandOptionFirstCheckmark = By.xpath("(//table[@role = 'presentation'])[4]//tbody/tr[1]/td[1]");
	static By brandCampusTab = By.xpath(
			"//span[text() = 'Brand Campus' and contains(@class , 'tab')] | //span[text() = 'Academy Location' and contains(@class , 'tab')]");

	public static void createCampaign() throws Exception {
		campaignName = CommonActions.randomNameGenerator();
		CommonActions.clickOnElementAndType(CamapignName, campaignName, "Campaign name field");
		CommonActions.iClickElementByLocator(FromDatePicker, "From date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(ToDatePicker, "to date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.clickOnElementAndType(BudgetAmout, "25000", "Budget amonut");
		CommonActions.clickOnElementAndType(ContatcPersonField, "10001091", "Contact person field");
		CommonActions.selectOptionFromDropdown(ContatcPersonField, 1);
		CommonActions.clickOnElementAndType(Remarksfield, "Test Remarks via automation", "Remarks field");
		CommonActions.iClickElementByLocator(MediaTypeDropdown, "Media type dropdown campaign");
		CommonActions.iClickElementByLocator(SelectAll, "SelectAll option");
		CommonActions.iClickElementByLocator(DismissDropdown, "Dismiss the Media type dropdown");
		new CommonLocatorPage().iClickActionButton("Add");
		CommonActions.iClickElementByLocator(clicktoEnterField, "Click to enter field");
		CommonActions.clickOnElementAndType(inputContactPerson, GlobalVariable.ManageCampaignContactPerson,
				"Contact perosn name");
		CommonActions.selectOptionFromDropdown(inputContactPerson, 1);
		CommonActions.iClickElementByLocator(brandCampusTab, "Dismiss the dropdown");
		new CommonLocatorPage().iClickButtonOfChoice("Next");
		CommonActions.iLogMessage("************I clicked next button and moved up**************");
		Thread.sleep(5000);
		new CommonLocatorPage().iSelectRow("1", "nested");
		new CommonLocatorPage().iClickButtonOfChoice("Submit");
		new CommonLocatorPage().iClickSaveButton("normal");
		Thread.sleep(4000);
		CommonActions.iClickElementByLocator(
				By.xpath("//span[text() = 'Manage Campaign' and contains(@class , 'tab')]/ancestor::a"),
				"Manage capaign tab");
	}

	public void editCampaign() throws Exception {
		CommonActions.clickOnElementAndType(Remarksfield, "Test Remarks via automation is edited", "Remarks field");
		new CommonLocatorPage().iClickSaveButton("normal");
	}

}