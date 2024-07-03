package com.serosoft.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.Constants;
import com.harsh.globalvariable.GlobalVariable;

public class CampaignSchoolMaster extends GlobalVariable {

	static By SchoolTestField = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div//input[@name = 'code']");
	static By schoolnamefield = By.cssSelector("input[name = 'value']");
	static By number = By.xpath("//input[@name = 'number']");
	By priorityTab = By.xpath("//span[contains(text() , 'School Priority') and contains(@class , 'x-tab-inner') ]/..");
	By campusDropdown = By.xpath("//input[@name = 'brandCampus']");
	By intakeYear = By.xpath("//input[@name = 'intakeYear']");
	By priority = By.xpath(
			" (//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][2])[2]/td[4]//input");
	By internationalPriority = By.xpath(
			" (//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][2])[2]/td[7]//input");
	By schoolsecondrow = By.xpath(
			"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][3]/td[1]/div)[2]|(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][2])[2]//td[1]");
	By setdefualtprioritybutton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Set Default Priority']/ancestor::a");
	By setdefaultprioritydropdown = By.xpath("//input[@name = 'schoolPriority']/../../td[2]");
	By forwardarrow = By.xpath("//a[contains(@class , 'first-forward')]");

	public void createSchoolMaster() throws Exception {
		CommonActions.clickOnElementAndType(SchoolTestField, CommonActions.schoolCodeGenrator(), "School code");
		GlobalVariable.schoolMasterName = CommonActions.randomSchoolName();
		CommonActions.clickOnElementAndType(schoolnamefield, schoolMasterName, "School name field");
		new CommonLocatorPage().iClickSaveButton("normal");

	}

	public void editSchoolMaster() throws Exception {
		new CommonLocatorPage().iClickSaveButton("normal");
	}

	public void iSelectPriorityTab() throws InterruptedException {
		CommonActions.iClickElementByLocator(priorityTab, "Map School priority tab");

	}

	public void selectIntakeAndCampus(String Campus, String Year) throws InterruptedException {
		CommonActions.selectionOptionFromDropdownAfterEntering(campusDropdown, Campus);
		CommonActions.iClickElementByLocator(intakeYear, "Year");
		WebElement year = CommonActions.getElement(By.xpath("//div[text() = ' " + Year + " ']"));
		CommonActions.iClick(year, Year + " is clicked");
	}

	public void iSelectPriority() throws InterruptedException {
		// CommonActions.iClickElementByLocator(priority, "P2 priority");
		WebElement p2 = CommonActions.getElement(priority);
		CommonActions.iClickJSE(p2, "p2 priority");
		new CommonLocatorPage().iClickSaveButton("normal");
		new CommonLocatorPage().iClickYes();

	}

	public void iSelectInternationalPriority() throws InterruptedException {
		// CommonActions.iClickElementByLocator(internationalPriority, "international
		// priority");
		WebElement I2 = CommonActions.getElement(internationalPriority);
		CommonActions.iClickJSE(I2, "I2 priority");
		new CommonLocatorPage().iClickSaveButton("normal");
		new CommonLocatorPage().iClickYes();
	}

	public void iSelectSchool() throws Exception {
		CommonActions.iClickElementByLocator(schoolsecondrow, "Second School Row");
		
	}

	public void iClickSetDefualtPriorityButton() throws Exception {
		CommonActions.iClickElementByLocator(setdefualtprioritybutton, "Set Defualt Priority Button");
	}

	public void iSelectDefualtPriorityOption(String optionname) throws Exception {
		try {
			CommonActions.iClickElementByLocator(setdefaultprioritydropdown, "Set Defualt Priority Option");
		} catch (Exception e) {
			WebElement defaultpriority = CommonActions.getElement(setdefaultprioritydropdown);
			CommonActions.iClickJSE(defaultpriority, "Default priority dropdown");
		}

		WebElement option = CommonActions.getElement(By.xpath("//div[contains(text(),'" + optionname + "')]"));
		CommonActions.iClick(option, optionname + " is Clicked.");
		new CommonLocatorPage().iClickSaveButton("window");
		new CommonLocatorPage().iClickYes();

	}

	public void selectSchoolMaster() throws Exception {
		System.out.println("**********************" + GlobalVariable.schoolMasterName);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name= 'pageSizeCombo']/../../td[2]"), "arrow");
		CommonActions.iClickElementByLocator(By.xpath("//li[text() = '500']"), "500");
		Thread.sleep(5000);
		List<WebElement> rows = CommonActions.getElementList(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')]"));
		int size = rows.size();
		System.out.println("************************************* " + size);
		Boolean flag = false;
		while (flag != true) {
			for (int i = 1; i <= size; i++) {
				String value = new CommonLocatorPage().iSelectColumnAndGetText("" + i + "", "3", "normal");
				System.out.println("*******************" + value + "*******************");
				System.out.println("*********" + flag);
				if (value.contains(GlobalVariable.schoolMasterName)) {
					System.out.println("********************* Found the selected school*******************");
					rows.get(i).click();
					System.out.println("******" + "clicked on " + schoolMasterName + "");
					System.out.println("**********breaking for loop");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				CommonActions.iClickElementByLocator(forwardarrow, "forward arrow");
				Thread.sleep(5000);
			}

		}

		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.schoolMasterName + "')]/ancestor::tr"),
				"selecting school");
	}

	public void selectSchoolMasterNew() throws Exception {
		System.out.println("**********************" + GlobalVariable.schoolMasterName);
		Thread.sleep(2000);
		List<WebElement> rows = CommonActions.getElementList(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')]"));
		int size = rows.size();
		System.out.println("************************************* " + size);
		Boolean flag = false;
		while (flag != true) {
			for (int i = 1; i <= size; i++) {
				String value = new CommonLocatorPage().iSelectColumnAndGetText("" + i + "", "3", "normal");
				System.out.println("*******************" + value + "*******************");
				System.out.println("*********" + flag);
				if (value.contains(GlobalVariable.schoolMasterName)) {
					System.out.println("********************* Found the selected school*******************");
					rows.get(i).click();
					System.out.println("******" + "clicked on " + schoolMasterName + "");
					System.out.println("**********breaking for loop");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				CommonActions.iClickElementByLocator(forwardarrow, "forward arrow");
				Thread.sleep(5000);
			}

		}

		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.schoolMasterName + "')]/ancestor::tr"),
				"selecting school");
	}
}
