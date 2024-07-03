package com.serosoft.stepdef;

import org.openqa.selenium.WebElement;

import com.serosoft.pages.FollowupDashboardPage;

import io.cucumber.java.en.Then;

public class AppointmentDashboardSteps {
	
	@Then("I validate the Appointment dahsboard header")
	public void iValidateDahsboardHeader() throws Exception {
       
		new FollowupDashboardPage().iValidateAppointmentDashboard();
		
	}

}
