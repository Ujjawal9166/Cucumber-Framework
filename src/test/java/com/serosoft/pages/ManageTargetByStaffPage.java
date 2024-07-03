package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class ManageTargetByStaffPage extends GlobalVariable {

	By viewTargetByStaffDropdown = By.cssSelector("input[name = ' viewTargetByStaff']");
	By yearDropdown = By.xpath("//input[@name = 'intakeYearStaffId']");
	By addButton = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[10]//a[text() = 'Add'])");
	By addStaffDeatils = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//a[@data-qtip = 'Add']");
	By salesStaffCOlumn = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1])[2]/td[1]");
	By inputSalesStaff = By.xpath("//input[@name = 'salesStaff']");
	By salesStaffPresentationColumn = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1])[2]/td[4]");
	By inputTargetNumber = By.xpath("//input[@name = 'salesStaffPresentiontarget']");
	By staffDetailsFilter = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Staff Details']/..)[1]");

	By staffNumber = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]/td[10]//a[text() = '1'])");

	By DeleteButton = By.xpath(
			" (//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1])[2]/td[9]//div[contains(@class , 'delete')]");

	By manageTargetTab = By.xpath("(//span[text() = 'Manage Targets by Staff' and contains(@class , 'tab')]/..)[2]");
	By saveStaffButton = By.xpath("//table[contains(@data-xpath , 'staffdetailsmanagetarget')]//a[contains(@data-xpath , 'Save')]");
	
	
	
	public void iSelectTheTargetDropdownOption(String option) throws InterruptedException {

		CommonActions.iClickElementByLocator(viewTargetByStaffDropdown, "View target dropdown");

		WebElement dropdownoption = CommonActions.getElement(By.xpath("//div[text() = ' " + option + " ']"));

		CommonActions.iClick(dropdownoption, "Dropdown option clicked is  " + option);

	}

	public void iSelectIntakeYear(String year) throws InterruptedException {

		CommonActions.iClickElementByLocator(yearDropdown, "year dropdown");

		WebElement intakeyear = CommonActions.getElement(By.xpath("//div[text()= ' " + year + " ']"));

		CommonActions.iClick(intakeyear, "i Click on year" + year);

		new CommonLocatorPage().iClickButtonOfChoice("Search");
	}

	public void iValidateHeader(String option) throws Exception {

		WebElement header = CommonActions
				.getElement(By.xpath("//span[contains(text() , '" + option + " Targets')]/.."));

		if (header.isDisplayed()) {
			CommonActions.highlightElementGreen(header, option);
			CommonActions.iLogMessage("Header is correct and " + option + " is visible");
		}

		else {
			throw new Exception("Header is not correct and " + option + " is  not visible");
		}

	}

	public void iAddStaffDetails(String name) throws Exception {
		try {

			WebElement add = CommonActions.getElement(addButton);
			CommonActions.iClickJSE(add, "add");
		} catch (Exception e) {

			CommonActions.iClickElementByLocator(staffDetailsFilter, "Staff details filter");
			WebElement add = CommonActions.getElement(addButton);
			CommonActions.iClickJSE(add, "add");
		}

		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(addStaffDeatils, "Add staff details");
		Thread.sleep(4000);
		WebElement row = CommonActions.getElementIfPresent(By.xpath(
				" (//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1])[2]"));
		System.out.println("row is found !!!");
		Thread.sleep(4000);
		if (row.isEnabled()) {
			System.out.println("Row is enabled");
			Actions action = new Actions(driver);
			action.moveToElement(row).click(row).perform();
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(salesStaffCOlumn, "Sales staff column");
			CommonActions.clickOnElementAndType(inputSalesStaff, name, "Sales staff value");
			CommonActions.iClickEnter(inputSalesStaff);
			Thread.sleep(4000);
			CommonActions.iClickElementByLocator(salesStaffPresentationColumn, "Sales presentation staff column");
			CommonActions.clickOnElementAndType(inputTargetNumber, "100", "Sales staff target");
			CommonActions.iClickEnter(inputTargetNumber);
			Thread.sleep(10000);
			//new CommonLocatorPage().iClickSaveButton("normal");
			CommonActions.iClickElementByLocator(saveStaffButton, "Save staff butoon");

		}
	}

	public void iClickOnStaffDetailNumber() throws InterruptedException {
		try {
			// CommonActions.iClickElementByLocator(staffNumber, "Staff number");
			WebElement add = CommonActions.getElement(staffNumber);
			CommonActions.iClickJSE(add, "add");
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(staffDetailsFilter, "Staff details filter");
			WebElement add = CommonActions.getElement(staffNumber);
			CommonActions.iClickJSE(add, "add");
//			CommonActions.iClickElementByLocator(staffNumber, "Staff number");
		}

	}

	public void iDeleteStaffDetails() throws InterruptedException {
		Thread.sleep(4000);
		WebElement row = CommonActions.getElementIfPresent(By.xpath(
				" (//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1])[2]"));
		System.out.println("row is found !!!");
		Thread.sleep(4000);
		if (row.isEnabled()) {
			System.out.println("Row is enabled");
			Actions action = new Actions(driver);
			action.moveToElement(row).click(row).perform();
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(DeleteButton, "Delete button staff details");
			new CommonLocatorPage().iClickYes();
		}
		new CommonLocatorPage().iValidateAlert();
		CommonActions.iClickElementByLocator(manageTargetTab, "Manage target tab");

	}
	
	
	public void iSelectIntakeYearNew() throws InterruptedException {

		CommonActions.iClickElementByLocator(yearDropdown, "year dropdown");

		WebElement intakeyear = CommonActions.getElement(By.xpath("//div[text()= ' 2023 ']"));
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(intakeyear).click(intakeyear).build().perform();
//		CommonActions.iClick(intakeyear, "i Click on year" + "2023");
		new CommonLocatorPage().iClickButtonOfChoice("Search");
	}
	
	
	

}
