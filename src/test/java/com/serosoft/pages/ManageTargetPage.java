package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.Constants;

public class ManageTargetPage {

	By inTakeYearDropdown = By.xpath("//input[@name = 'intakeYearId']");
	By viewTargetBy = By.xpath("//input[@name = ' viewTargetBy']");
	By LeadTargetValue = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'enquiryTarget'] | //input[@name = 'enquiryTarget']");

	By header = By.xpath("//span[text() = 'List of Grades']/.. | //span[text() = 'List of Programs']/..");
	By applicationTarget = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'applicationTarget'] | //input[@name = 'applicationTarget']");
	By enrollmentPreviousYears = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'enrolmentPreviousYear'] | //input[@name = 'enrolmentPreviousYear']");
	By orignalBudget = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'enrolmentBudget'] | //input[@name = 'enrolmentBudget']");
	By revisedBudget = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'revisedBudget']| //input[@name = 'revisedBudget']");
	By enrollmentTarget = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'enrolmentTarget'] |//input[@name = 'enrolmentTarget']");
	By buildingCapacity = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'buildingCapacity'] | //input[@name = 'buildingCapacity']");
	By buildingCapacitySpecialist = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//input[@name = 'buildingCapacitySpecialist'] |//input[@name = 'buildingCapacitySpecialist']");

	By saveButton = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text()= 'Save']/..)[1]");

	public void iSearchManageTargetViewBy(String Option) throws InterruptedException {
		if (Constants.getUrl().contains("https://regression1.academiaerp.com")) {

			if (Option.contains("Program")) {
				CommonActions.selectOptionFromDropdown(inTakeYearDropdown, 6);
				new CommonLocatorPage().iClickButtonOfChoice("Search");

			} else if (Option.contains("Brand")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");

			}

			else if (Option.contains("Campus")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");

			}

			else if (Option.contains("School")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");

			}
		}

		else if (Constants.getUrl().contains("https://regression2.academiaerp.com")) {

			if (Option.contains("Grade Wise")) {
				CommonActions.selectOptionFromDropdown(inTakeYearDropdown, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");
			}

			else if (Option.contains("Academy Wise")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");
			}
			
			else if (Option.contains("Academy Location Wise")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Academy Location Wise");
			}
			
			
			else if (Option.contains("Program Group Wise")) {
				CommonActions.selectOptionFromDropdown(viewTargetBy, 2);
				new CommonLocatorPage().iClickButtonOfChoice("Search");
			}

		}

	}

	public void iValidateListHeader(String name) throws Exception {
		if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
			if (!name.contains("Brand")) {
				Thread.sleep(4000);
				WebElement header = CommonActions.getElement(
						By.xpath("//span[contains(@id , 'managetarget') and contains(text() , '" + name + "')]/.."));
				System.out.println("******" + header.getText());
				if (header.getText().contains(name)) {
					CommonActions.iLogMessage(name + " List header is present");
					CommonActions.highlightElementGreen(header, name);
				} else {
					throw new Exception();
				}

			} else if (name.contains("Brand")) {
				Thread.sleep(4000);
				WebElement header = CommonActions.getElement(By.xpath(
						"//span[contains(@id , 'managetargetacademywise') and contains(text() , '" + name + "')]/.."));
				System.out.println("******" + header.getText());
				if (header.getText().contains(name)) {
					CommonActions.iLogMessage(name + " List header is present");
					CommonActions.highlightElementGreen(header, name);
				} else {
					throw new Exception();
				}

			}
		}

		else if (Constants.getUrl().contains("https://regression2.academiaerp.com/")) {

			if (!name.contains("Academy Wise") && !name.contains("Grade Wise")) {
				Thread.sleep(4000);
				String namenew = name.replace("Wise", "").trim();
				WebElement header = CommonActions.getElement(
						By.xpath("//span[contains(@id , 'managetarget') and contains(text() , '" + namenew + "')]/.."));
				System.out.println("******" + header.getText());
				if (header.getText().contains(namenew)) {
					CommonActions.iLogMessage(name + " List header is present");
					CommonActions.highlightElementGreen(header, name);
				} else {
					throw new Exception();
				}

			}
			
			else if (name.contains("Academy Wise")) {
				Thread.sleep(4000);
				WebElement header = CommonActions.getElement(By.xpath(
						"//span[contains(@id , 'managetargetacademywise') and contains(text() , 'Academy')]"));
				System.out.println("******" + header.getText());
				if (header.getText().contains("Academy")) {
					CommonActions.iLogMessage(name + " List header is present");
					CommonActions.highlightElementGreen(header, name);
				} else {
					throw new Exception();
				}

			}
			
			else if (name.contains("Grade Wise")) {
				Thread.sleep(4000);
				WebElement header = CommonActions.getElement(By.xpath(
						"//span[contains(@id , 'managetarget') and contains(text() , 'Programs')]"));
				System.out.println("******" + header.getText());
				if (header.getText().contains("Programs")) {
					CommonActions.iLogMessage(name + " List header is present");
					CommonActions.highlightElementGreen(header, name);
				} else {
					throw new Exception();
				}

			}
		}
	}

	public void iEnterTheTargetLeadValue(String Value) throws Exception {
		CommonActions.clickOnElementAndType(LeadTargetValue, Value, "Lead target value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterApllicationTargetValue(String Value) throws Exception {
		CommonActions.clickOnElementAndType(applicationTarget, Value, "Application target value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterPreviousYearEnrollmentValue(String Value) throws Exception {
		CommonActions.clickOnElementAndType(enrollmentPreviousYears, Value, "Previous year enrollment value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterOrignalBudget(String value) throws Exception {
		CommonActions.clickOnElementAndType(orignalBudget, value, "Budget value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterRevisedBudget(String value) throws Exception {
		CommonActions.clickOnElementAndType(revisedBudget, value, "revised Budget value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterEnrollmentTarget(String value) throws Exception {
		CommonActions.clickOnElementAndType(enrollmentTarget, value, "Enrollment target value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterBuildingCapacity(String value) throws Exception {
		CommonActions.clickOnElementAndType(buildingCapacity, value, "Building Capacity value");
		CommonActions.iClickElementByLocator(header, "Header");

	}

	public void iEnterBuildingCapacitySpeicalist(String value) throws Exception {
		CommonActions.clickOnElementAndType(buildingCapacitySpecialist, value, "Building Capacity speicalist value");
		CommonActions.iClickElementByLocator(header, "Header");
		CommonActions.iClickElementByLocator(saveButton, "Save button");
		CommonActions.refresh();

	}
	
	
	public void iValidateTtalRecordsinList() throws Exception {
        WebElement header = CommonActions.getElement(By.xpath("//div[contains(text(),'Total Records')]"));
        System.out.println("***********************************" + header.getText());
        if(header.getText().contains("Total Records")) {
            CommonActions.iLogMessage(" List header is present");
            CommonActions.highlightElementGreen(header, "Find the Value");
        }
        else {
            throw new Exception("Header is not present!!");
        }
        
    }

}
