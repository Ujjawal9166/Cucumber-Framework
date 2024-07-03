package com.serosoft.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.Constants;
import com.harsh.globalvariable.GlobalVariable;

//import okio.Timeout;
//import io.appium.java_client.MobileElement;

public class LoginPage extends GlobalVariable {
	By AdminTab = By.xpath("//span[text() = 'Administrator']/..");
	By Username = By.xpath("//input[@name = 'email']");
	By Password = By.xpath("//input[@name = 'password']");
	By SigninButton = By.xpath("//input[@name = 'signin']");
	

	public void enterUsername(String username) throws InterruptedException {
		try {
            driver.get(Constants.getUrl());
            driver.manage().window().maximize();
            WebElement admintab = CommonActions.getElement(AdminTab);
            CommonActions.iClick(admintab, "Admin Tab");
 			CommonActions.clickOnElementAndType(Username, username, "Username field");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void enterPassword(String password) throws InterruptedException {
		try {
			CommonActions.clickOnElementAndType(Password, password, "Password field");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void clickOnLoginButton() throws InterruptedException {
		try {
			WebElement signin = CommonActions.getElement(SigninButton);
			CommonActions.iClick(signin, "Login button");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
}

