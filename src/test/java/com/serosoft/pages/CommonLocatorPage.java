package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class CommonLocatorPage extends GlobalVariable {

	By SaveButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Save']/..");
	By SaveButtonNested = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Save']/..");
	By SaveButtonFloated = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()= 'Save']/..");
	By SubmitButtonFloated = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()= 'Submit']/..");

	By MoreActionsButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text()= 'More Actions']/..");

	By TodayButton = By.xpath(
			"//div[not(contains(@style,'display: none'))]/div[contains(@role,'grid')]//span[text() = 'Today' and contains(@class , 'btn')]/..");

	By YesButton = By.xpath("//span[text() = 'Yes']/..");

	By SuccessMessage = By.xpath("//div[contains(text() , 'successfully') or contains(text() , 'Success')  ]/..");

	By searchButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Search']/ancestor::a[contains(@class, 'Submit')]");

	By searchButtonNested = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Search']/ancestor::a[contains(@class, 'Submit')]");

	By submitButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text()= 'Submit']/../..");

	By continueManuallyButton = By.xpath("//span[text()='Continue Manually']/..");
	By profilePic = By.xpath("//a[contains(@class , 'headerUserinfo')]");
	By singOutBtn = By.xpath("//span[contains(text() ,'Sign Out')]/..");

	By nextmontharrow = By.xpath(
			"//div[not(contains(@style,'display: none'))]/div[contains(@role,'grid')]//a[contains(@title , 'Next Month')]");
	By day = By.xpath("//div[not(contains(@style,'display: none'))]/div[contains(@role,'grid')]//a[contains(text(), '"
			+ GlobalVariable.Dayfordatepicker + "')]/..");

	public static void iClickOnoption(String option) throws InterruptedException {
		CommonActions.iImplicitlywait(30, option);
		WebElement ele = driver.findElement(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@class, 'x-panel x-grid-with-row-lines x-panel-default x-grid')]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-qtip,'"
						+ option + "')]"));
		Thread.sleep(2000);
		CommonActions.iClick(ele, option);
	}

	public void iClickModule(String option) throws InterruptedException {
		CommonActions.iImplicitlywait(30, option);
		WebElement ele = driver.findElement(By.xpath("//span[text() = '" + option + "']/ancestor::a"));
		Thread.sleep(2000);
		CommonActions.highlightElementRed(ele, option);
		CommonActions.iClick(ele, option);
	}

	public void iClickActionButton(String option) throws InterruptedException {
		try {
			System.out.println("Inside BTN conditon");
//			WebElement button = CommonActions.getElement(By.xpath(
//					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@class, 'x-panel x-grid-with-row-lines x-panel-default x-grid')]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-qtip,'"
//							+ option + "')]|//a[contains(@data-xpath,'Btn" + option + "')]"));
			WebElement button = CommonActions.getElement(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-xpath ,'Btn"+option+"')  or  contains(@data-xpath ,'btn"+option+"') or contains(@data-qtip ,'"+option+"') ]"));		
			CommonActions.iClick(button, "Click on " + option + " button");

		} catch (Exception e) {
			WebElement button = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@class, 'x-panel x-grid-with-row-lines x-panel-default x-grid')]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-qtip,'"
							+ option + "')]"));
			CommonActions.iClick(button, "Click on " + option + " button");
		}
	}

	public void iClickActionButtonInsideNestedTabs(String option) throws InterruptedException {
		WebElement button = CommonActions.getElement(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip='"
						+ option + "']"));
		CommonActions.iClick(button, option);
	}

	public void iClickSaveButton(String type) throws InterruptedException {
		WebElement button;
		;
		switch (type) {
		case "window":
			button = CommonActions.getElement(SaveButtonFloated);
			CommonActions.iClick(button, type);

			break;
		case "submit":
			button = CommonActions.getElement(SubmitButtonFloated);
			CommonActions.iClick(button, type);

			break;
		case "nested":
			button = CommonActions.getElement(SaveButtonNested);
			try {
				CommonActions.iClick(button, type);
			} catch (Exception e) {
				CommonActions.iClickJSE(button, type);
			}

			break;
		default:
			button = CommonActions.getElement(SaveButton);
			CommonActions.iClick(button, type);
			break;
		}
	}

	public void iClickButtonOfChoice(String ButtonName) throws InterruptedException {
		WebElement button;

		switch (ButtonName) {
		case "Today":
			button = CommonActions.getElement(TodayButton);
			CommonActions.iClick(button, ButtonName);

			break;
		case "More Action":
			button = CommonActions.getElement(MoreActionsButton);
			CommonActions.iClick(button, ButtonName);

			break;

		case "Submit nested":
			button = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Submit']/../.."));
			CommonActions.iClick(button, ButtonName);
			break;
		case "Next":
			button = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Next']/../.."));
			CommonActions.iClick(button, ButtonName);
			break;

		case "Search":

			button = CommonActions.getElement(searchButton);
			CommonActions.iClick(button, ButtonName);
			break;

		case "SearchNested":

			button = CommonActions.getElement(searchButtonNested);
			CommonActions.iClick(button, ButtonName);
			break;

		case "Submit":

			button = CommonActions.getElement(submitButton);
			CommonActions.iClick(button, ButtonName);
			break;

		case "Manually":

			button = CommonActions.getElement(continueManuallyButton);
			CommonActions.iClick(button, ButtonName);
			break;

		case "Next Month":

			button = CommonActions.getElement(nextmontharrow);
			CommonActions.iClick(button, ButtonName);
			break;

		case "Day":

			button = CommonActions.getElement(day);
			CommonActions.iClick(button, ButtonName);
			break;

		case "Submit window":
			button = CommonActions.getElement(By.xpath(
					"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text() = 'Submit']/../.."));
			CommonActions.iClick(button, ButtonName);
			break;

		case "Save window":
			button = CommonActions.getElement(By.xpath(
					"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text() = 'Save']/../.."));
			CommonActions.iClick(button, ButtonName);
			break;

		default:
			System.out.print("Wrong choice , please try again!!!");

		}

	}

	public void iSelectRow(String number, String option) throws InterruptedException {
		WebElement row;

		switch (option) {
		case "nested":
			Thread.sleep(6000);
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//tr[contains(@role,'row')]["
							+ number + "]"));
			CommonActions.iClick(row, number);
			break;
		default:
			Thread.sleep(6000);
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')]["
							+ number + "]"));
			CommonActions.iClick(row, "row");
			break;

		}

	}

	public void iClickYes() throws InterruptedException {

		WebElement yesbutton = CommonActions.getElement(YesButton);
		CommonActions.iClick(yesbutton, "Yes button clicked");
	}

	public void iValidateAlert() {
		try {
			WebElement alertmessage = CommonActions.getElement(SuccessMessage);
			CommonActions.highlightElementGreen(alertmessage, "Successful alert is present");
		} catch (Exception e) {
			CommonActions.iLogMessage("No such alert found!!");
		}

	}

	public void iSelectColumn(String rownumber, String column, String option) throws InterruptedException {
		WebElement row;
		switch (option) {
		case "nested":
			Thread.sleep(6000);
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//tr[contains(@role,'row')]["
							+ rownumber + "]/td[" + column + "]/div"));
			CommonActions.iClick(row, rownumber);
			break;
		default:
			Thread.sleep(6000);
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')]["
							+ rownumber + "]/td[" + column + "]/div"));
			CommonActions.iClick(row, rownumber);
			break;

		}

	}

	public String iSelectColumnAndGetText(String rownumber, String column, String option) throws InterruptedException {
		WebElement row;
		String text;
		switch (option) {
		case "nested":
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//tr[contains(@role,'row')]["
							+ rownumber + "]/td[" + column + "]/div"));
			text = row.getText();
			break;
		default:
			row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')]["
							+ rownumber + "]/td[" + column + "]/div"));
			text = row.getText();
			break;
		}
		return text;
	}

	public void iClickLogOutButton() throws InterruptedException {
		CommonActions.iClickElementByLocator(profilePic, "Profile picture");
		CommonActions.iClickElementByLocator(singOutBtn, "Sign out button");
	}

}
