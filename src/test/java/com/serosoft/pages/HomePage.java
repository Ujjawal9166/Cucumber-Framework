package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class HomePage extends GlobalVariable {

	static By AdminNamePortal = By.xpath("//label[text() = 'Administrator']/..");
	static By HR = By.xpath("//span[text() = 'HR & Inventory']/..");

	public void iValidatePortal() throws Exception {
		CommonActions.isDisplayed(AdminNamePortal, "Admin portal header");
		Thread.sleep(2000);
	}

	public void iClickOnOption(String name) throws Exception {
		CommonActions.iImplicitlywait(30, name);
		WebElement ele = driver.findElement(By.xpath("//span[text() = '" + name + "']/.."));
		if (!ele.isDisplayed()) {
			CommonActions.iScrollToTheElement(ele, name);
		}
		CommonActions.hoverOverElement(ele, name);
		Thread.sleep(3000);
		CommonActions.iClick(ele, name);
		Thread.sleep(3000);

	}

}
