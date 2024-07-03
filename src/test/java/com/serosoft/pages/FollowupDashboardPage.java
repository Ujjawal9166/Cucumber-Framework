package com.serosoft.pages;

import org.openqa.selenium.By;

import com.appium.commonactionmethods.CommonActions;

public class FollowupDashboardPage {
	
	By fromDate = By.xpath("//input[@name='fromdate']");
	By toDate = By.xpath("//input[@name='todate']");
	By followupHeader = By.xpath("//span[contains(text(),'Follow-Up Dashboard')and contains(@class,'header')]/..");
	By appointmentDashboard = By.xpath("//span[contains(text(),'Appointment Dashboard')and contains(@class,'header')]/..");
	
	
	public void iSelectDate() throws Exception {
		CommonActions.clickOnElementAndType(fromDate, "07/07/2024", "From Date");
		CommonActions.clickOnElementAndType(toDate, "07/07/2024", "To Date");
		new CommonLocatorPage().iClickButtonOfChoice("Search");
	}
	
	public void iValidateFollowupHeadr() throws Exception {
		CommonActions.isDisplayed(followupHeader, "FolloeupHeader");
		Thread.sleep(4000);
		CommonActions.refresh();
	}
  
	
	public void iValidateAppointmentDashboard() throws Exception {
		CommonActions.isDisplayed(appointmentDashboard, "Appointment dashboard");
		Thread.sleep(4000);
		CommonActions.refresh();
	}

	

}
