package com.serosoft.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.Constants;
import com.harsh.globalvariable.GlobalVariable;

public class ManageLeadPage extends GlobalVariable {

	By Listsoflead = By.xpath("//span[text() = 'List of Leads']/.. | //span[text() = 'List of Enquiries']/..");
	By salutationDropdown = By.cssSelector("input[name = 'raiseEnquirySalutation']");
	By EnquiryFirstName = By.cssSelector("input[name = 'enquirerFirstName']");
	By EmailID = By.cssSelector("input[name = 'regdEmail']");
	By cellNumber = By.cssSelector("input[name = 'cellNumber']");
	By EnquiryDropdown = By.xpath("//div[@name = 'enquiryMode']/../../td[3]");
	By selectAllOption = By.xpath("//u[contains(text() , 'Select All')]/../..");
	By sourceOfEnquiry = By.xpath("(//input[@name= 'enquirySource'])[2]");
	By StudentSalutationDropdown = By.cssSelector("input[name = 'salutation']");
	By studentName = By.cssSelector("input[name = 'studentFname']");
	By ProgramDropdown = By.xpath("(//input[@name = 'programId'])[2]");
	By studentDOB = By.xpath("//input[@name = 'studentDateOfBirth']");
	By studentMob = By.xpath("(//input[@name = 'mobileNumber'])");
	By countryDropdown = By.xpath("//input[@name = 'country']");
	By region = By.xpath("//input[@name = 'parentCountryRegion']");
	By city = By.xpath("//input[@name = 'city']");
	By remark = By.xpath("//textarea[@name = 'remark']");
	By studentLastName = By.xpath("//input[@name = 'studentLastName']");
	By BrandCampusDropdown = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'academyLocation']");
	By datarowslist = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//tr[contains(@role,'row')]");
	By followupActivityDropdown = By.xpath("//input[@name = 'followUpActivityType']");
	By reasonForFollowUp = By.xpath("//input[@name = 'reasonForFollowUp']");
	By followUpStatus = By.xpath("//input[@name = 'followUpActivityStatus']");
	By stageDropdown = By.xpath("//input[@name = 'enqIntermediateStage']");
	By followupCheckBox = By.xpath("//label[text() = 'Schedule Next Follow-up']/../input");
	By nextFollowupDate = By.xpath("//input[@name = 'nextFollowUpDate']");
	By remarksAppointment = By.cssSelector("textarea[name = 'reasonToVisit']");
	By closureremarks = By.cssSelector("textarea[name = 'closureRemarks']");
	By openRemarks = By.cssSelector("textarea[name = 'reopenRemarks']");
	By closureReason = By.xpath("//input[@name='closureReason']");
	By reopenReasons = By.xpath("//input[@name= 'reopenReason']");
	By sendMessageButton = By.xpath("//span[text() = 'Send Message']/..");
	By messageTypeDropdown = By.xpath("//input[@name= 'msgTempletId']/../../td[2]");
	By messageDescription = By.xpath("//textarea[@name= 'smsDiscription']");
	By parentCheckmark = By.xpath("//label[text() = 'Parents']/.. | //label[text() = 'Parent']/..");
	By myselfCheckmark = By.xpath("//label[contains (text() , 'Include Myself')]/..");
	By smsOption = By.xpath("//div[text() = ' SMS ']");
	By manageLeadTab = By.xpath(
			"//span[text() = 'Manage Leads']/parent::span[contains(@class , 'x-tab-button')]/ancestor::a | //span[text() = 'Manage Enquiries']/parent::span[contains(@class , 'x-tab-button')]/ancestor::a");

	By follwupDetailsButton = By.xpath("//a[@data-qtip = 'Follow-up Details']");
	By followUpDetailsheader = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'List of Follow-up Details']/..");
	By sendReminder = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Send Reminder']/ancestor::a");

	By leadDeatilsPageHeader = By.xpath(
			"//span[text() = 'Lead Details' and contains(@id , 'enquiry')]/.. | //span[text() = 'Enquiry Details' and contains(@class , 'header')]/..");
	By columnButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Columns']/ancestor::a");
	By statusOption = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//tr/td/div[text() = 'Status' or text() = 'Visit Status']/ancestor::tr/td[1]");
	By applyButton = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//a[contains(@class,'x-btn')]//span[text()='Apply']/../..");
	By updateAlert = By.xpath("//div[contains(text() , 'updated')]");

	By appointmentTab = By.xpath("//span[text() = 'Appointment' and contains(@class, 'tab')]/..");
	By resetButton = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//a[contains(@class,'x-btn')]//span[text()='Reset']/../..");

	By gradeDropdownStudent = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'programId']");
	By studentLastNameNew = By.xpath("//input[@name = 'studentLname']");
	By studentIntakeYear = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'batchId']");
	By lastNameLead = By.xpath("//input[@name = 'lastName']");
	By enquiredByDropdown = By.xpath("//input[@name = 'registeredBy']");
	By optionEnquireBy = By.xpath("//div[text() = ' On Behalf of Existing Student ']");
	By lastName = By.cssSelector("input[name ='enquirerLastName']");
	By countryCode = By.xpath("//input[@name = 'phoneCountryCode']");
	By studentCategory = By.xpath("//input[@name='reservationCategory']");
	By additionalReasonsFollowup = By.xpath("//input[@name = 'additionalReason']");
	By campaignNameDropdown = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name = 'campaign']");
	By studentSalutationEdit = By.cssSelector("input[name = 'salutation']");
	By enquiryIDAlert = By.xpath("//div[contains(text() , 'successfully') or contains(text() , 'Success')  ]");
	By leadName = By.xpath("//input[@name = 'enquiryCode']");

	public void validateLeads() throws Exception {

		CommonActions.isDisplayed(Listsoflead, "List of lead");

	}

	public void iCreateLead() throws Exception {
		CommonActions.iClickElementByLocator(enquiredByDropdown, "Enquiry dropdown");
		CommonActions.iClickElementByLocator(optionEnquireBy, "Enquiry option");
//		CommonActions.iClickElementByLocator(salutationDropdown, "Salutation dropdown");
		CommonActions.selectOptionFromDropdown(salutationDropdown, 2);
		GlobalVariable.enquiryName = CommonActions.randomNameGenerator();
		CommonActions.clickOnElementAndType(EnquiryFirstName, enquiryName, "Enuiry first name");
		CommonActions.clickOnElementAndType(lastName, "Automation", "Lead last name");
		CommonActions.clickOnElementAndType(EmailID, CommonActions.randomEmailGenerator(), "Email id");
		CommonActions.selectionOptionFromDropdownAfterEntering(countryCode, "+91");
		CommonActions.clickOnElementAndType(cellNumber, "8989898989", "Cell number");
		CommonActions.iClickElementByLocator(EnquiryDropdown, "Arrow");
		CommonActions.iClickElementByLocator(selectAllOption, "Select all option");
		CommonActions.iClickElementByLocator(sourceOfEnquiry, "Source of enquiry dropdown");
		Thread.sleep(2000);
		WebElement ele = CommonActions.getElement(By.xpath("//div[text() = ' Website ']"));
		ele.click();
//		CommonActions.selectOptionFromDropdown(sourceOfEnquiry, 2);
		CommonActions.selectionOptionFromDropdownAfterEntering(campaignNameDropdown, "Automation Campaign Demo");

	}

	public void iAddStudentDetails() throws Exception {
		Thread.sleep(4000);
		new CommonLocatorPage().iClickActionButton("Add");
		try {
			if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
//			CommonActions.iClickElementByLocator(StudentSalutationDropdown, "Student salutation dropdown");
				CommonActions.selectOptionFromDropdown(StudentSalutationDropdown, 2);
			} else {
				CommonActions.iLogMessage("Salutation dropdown is missing");

			}
		} catch (Exception e) {

			CommonActions.iLogMessage("Salutation dropdown is missing");

		}
		GlobalVariable.studentEnquiryName = CommonActions.randomNameGenerator();
		CommonActions.clickOnElementAndType(studentName, GlobalVariable.studentEnquiryName, "Student name");
		CommonActions.clickOnElementAndType(studentLastNameNew, "test ", "Last name");
		CommonActions.iClickElementByLocator(ProgramDropdown, "Program dropdown");
		CommonActions.selectionOptionFromDropdownAfterEntering(ProgramDropdown,
				GlobalVariable.programNameStudentLeadDetails);
		if (Constants.getUrl().contains("https://regression2.academiaerp.com/")) {
			CommonActions.selectionOptionFromDropdownAfterEntering(gradeDropdownStudent, "Test Program 06122023");
			CommonActions.clickOnElementAndType(By.xpath(
					" //body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'batchId']"),
					"Test_debartment", "Department");
			CommonActions.iClickEnter(By.xpath(
					" //body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'batchId']"));
		} else if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {

//			CommonActions.selectionOptionFromDropdownAfterEntering(gradeDropdownStudent, "Test New Program 13");
		}
		CommonActions.clickOnElementAndType(studentDOB, "05/01/2023", "DOB of student");
//
//		if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
//			CommonActions.selectionOptionFromDropdownAfterEntering(studentIntakeYear, "2023");
//		}

		// CommonActions.clickOnElementAndType(studentMob, "8989898989", "Student phone
		// number");

//		CommonActions.clickOnElementAndType(By.xpath("//input[@name= 'seatTypeId']"),"General seat" , "Seat type");
//		Thread.sleep(2000);
//		CommonActions.iClickEnter(By.xpath("//input[@name= 'seatTypeId']"));
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(5000);
		new CommonLocatorPage().iClickSaveButton("normal");
	}

	public void iEditLead() throws Exception {
		try {
			CommonActions.clickOnElementAndType(lastNameLead, "Test", "Lead last name");
			CommonActions.iClickElementByLocator(countryDropdown, "Country");
			CommonActions.selectOptionFromDropdown(countryDropdown, 2);
			CommonActions.iClickElementByLocator(region, "Region dropdown");
			CommonActions.selectOptionFromDropdown(region, 2);
			CommonActions.iClickElementByLocator(city, "City dropdown");
			CommonActions.selectOptionFromDropdown(city, 2);
			CommonActions.clickOnElementAndType(remark, "Test remark", "Remark field");
		} catch (Exception e) {
			new CommonLocatorPage().iSelectRow("1", "normal");
			new CommonLocatorPage().iSelectRow("2", "normal");
			new CommonLocatorPage().iClickActionButton("Edit");
			CommonActions.clickOnElementAndType(lastNameLead, "Test", "Lead last name");
			CommonActions.iClickElementByLocator(countryDropdown, "Country");
			CommonActions.selectOptionFromDropdown(countryDropdown, 2);
			CommonActions.iClickElementByLocator(region, "Region dropdown");
			CommonActions.selectOptionFromDropdown(region, 2);
			CommonActions.iClickElementByLocator(city, "City dropdown");
			CommonActions.selectOptionFromDropdown(city, 2);
			CommonActions.clickOnElementAndType(remark, "Test remark", "Remark field");

		}
	}

	public void iEditedStudentDetails() throws Exception {
		CommonActions.clickOnElementAndType(studentLastName, "Jain", "Student last name");
		if (Constants.getUrl().contains("https://regression2.academiaerp.com/")) {
			CommonActions.selectOptionFromDropdown(studentCategory, 1);
			CommonActions.selectOptionFromDropdown(studentSalutationEdit, 1);
		}
	}

	public void iSelectEditLeadTab(String option) throws InterruptedException {
		WebElement tab = CommonActions
				.getElement(By.xpath("//span[contains(text(), '" + option + "') and contains(@class , 'tab')]/.."));
		CommonActions.iClick(tab, option + " Tab is clicked");
	}

	public void iAddAdmissionDetails() throws InterruptedException {
		new CommonLocatorPage().iClickActionButton("Add");
		CommonActions.iClickElementByLocator(BrandCampusDropdown, "Brand campus dropdown");
		if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
			CommonActions.selectionOptionFromDropdownAfterEntering(BrandCampusDropdown, GlobalVariable.brandcampuslead);
		} else {
			CommonActions.selectionOptionFromDropdownAfterEntering(BrandCampusDropdown,
					GlobalVariable.brandcampusleadregression2);
		}
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iEditAdmissionDetails() throws InterruptedException {
		CommonActions.selectLastRow(datarowslist);
		new CommonLocatorPage().iClickActionButton("Edit");
		CommonActions.iClickElementByLocator(BrandCampusDropdown, "Brand campus dropdown");
		CommonActions.selectionOptionFromDropdownAfterEntering(BrandCampusDropdown, "Lonehill");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iAddFollowUp() throws Exception {
		CommonActions.iClickElementByLocator(followupActivityDropdown, "Follow up Activity");
		CommonActions.selectionOptionFromDropdownAfterEntering(followupActivityDropdown, "Email");
		CommonActions.iClickElementByLocator(reasonForFollowUp, "Reason for followup dropdown");
		CommonActions.selectionOptionFromDropdownAfterEntering(reasonForFollowUp, "Other");
		CommonActions.clickOnElementAndType(additionalReasonsFollowup, "Test reasons", "Additonal reasons");
		CommonActions.iClickElementByLocator(followUpStatus, "Follow up status");
		CommonActions.selectionOptionFromDropdownAfterEntering(followUpStatus, "Open");
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iCloseFollowUp() throws InterruptedException {
		CommonActions.iClickElementByLocator(followUpStatus, "Follow up status");
		CommonActions.selectionOptionFromDropdownAfterEntering(followUpStatus, "Close");
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iAddFollowupDate() throws Exception {
		CommonActions.iClickElementByLocator(followupCheckBox, "Followup checkbox");
		CommonActions.clickOnElementAndType(nextFollowupDate, "31/12/2024", "Followup date");
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void addAppointment() throws InterruptedException {
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		new CommonLocatorPage().iClickSaveButton("normal");

	}

	public void EditAppointment() throws Exception {
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Edit");
		CommonActions.clickOnElementAndType(remarksAppointment, "Test Appointment", "Remarks apoointment field");
		new CommonLocatorPage().iClickSaveButton("normal");

	}

	public void DeleteAppointment() throws Exception {
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Delete");
		new CommonLocatorPage().iClickYes();

	}

	public void verifyCommunicationHistory(String option) throws InterruptedException {
		WebElement radiobutton;
		if (option.equalsIgnoreCase("email")) {
			radiobutton = CommonActions
					.getElement(By.xpath("//label[text()= 'Email Address']/.. | //label[text()= 'Email ID']/.."));
			CommonActions.iClick(radiobutton, option);
			new CommonLocatorPage().iClickButtonOfChoice("Search");
		}

		else {
			radiobutton = CommonActions.getElement(By.xpath("//label[text()= 'SMS']/.."));
			CommonActions.iClick(radiobutton, option);
			new CommonLocatorPage().iClickButtonOfChoice("Search");

		}
	}

	public void closeAdmission(String option) throws Exception {
		new CommonLocatorPage().iSelectRow("1", "nested");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Edit");
		CommonActions.selectionOptionFromDropdownAfterEntering(closureReason, option);
		CommonActions.clickOnElementAndType(closureremarks, "Test Remarks", "Remraks for closure");
		new CommonLocatorPage().iClickSaveButton("window");

	}

	public void openAdmission(String option) throws Exception {
		new CommonLocatorPage().iSelectRow("1", "nested");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Edit");
		CommonActions.selectionOptionFromDropdownAfterEntering(reopenReasons, option);
		CommonActions.clickOnElementAndType(openRemarks, "Test Remarks", "Remraks for opening");
		new CommonLocatorPage().iClickSaveButton("window");
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

	public void sendSMSToLead(String option) throws Exception {

		if (option.contains("Myself")) {
			new CommonLocatorPage().iSelectRow("1", "nested");
			CommonActions.iClickElementByLocator(sendMessageButton, "Send Message button");
			CommonActions.iClickElementByLocator(messageTypeDropdown, "Message type");
			CommonActions.iClickElementByLocator(smsOption, "SMS option");
			if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
				CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'templateId']"), "Test Automation",
						option);
			}
			CommonActions.clickOnElementAndType(messageDescription, "Test automation", "SMS description");
			new CommonLocatorPage().iClickButtonOfChoice("Submit");
		}

		else if (option.contains("Parent")) {
			new CommonLocatorPage().iSelectRow("1", "nested");
			CommonActions.iClickElementByLocator(sendMessageButton, "Send Message button");
			CommonActions.iClickElementByLocator(myselfCheckmark, "MyselfCheckmark");
			CommonActions.iClickElementByLocator(parentCheckmark, "Parent checkmark");
			CommonActions.iClickElementByLocator(messageTypeDropdown, "Message type");
			CommonActions.iClickElementByLocator(smsOption, "SMS option");
			if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
				CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'templateId']"), "Test Automation",
						option);
			}
			CommonActions.clickOnElementAndType(messageDescription, "Test automation", "SMS description");
			new CommonLocatorPage().iClickButtonOfChoice("Submit");

		}

		else if (option.contains("Both")) {
			new CommonLocatorPage().iSelectRow("1", "nested");
			CommonActions.iClickElementByLocator(sendMessageButton, "Send Message button");
			CommonActions.iClickElementByLocator(parentCheckmark, "Parent checkmark");
			CommonActions.iClickElementByLocator(messageTypeDropdown, "Message type");
			CommonActions.iClickElementByLocator(smsOption, "SMS option");
			CommonActions.clickOnElementAndType(messageDescription, "Test automation", "SMS description");
			if (Constants.getUrl().contains("https://regression1.academiaerp.com/")) {
				CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'templateId']"), "Test Automation",
						option);
			}
			new CommonLocatorPage().iClickButtonOfChoice("Submit");
		}
	}

	public void seelctLead() throws InterruptedException {
		new CommonLocatorPage().iSelectRow("1", "nested");
	}

	public void iSelectMoreActions(String optionfromlist) throws InterruptedException {
		WebElement option = CommonActions.getElement(By.xpath("//span[text() = '" + optionfromlist + "']/.."));
		CommonActions.iClick(option, "Option is" + optionfromlist);
	}

	public void validateMoreOptionHeader(String optionname) throws Exception {
		try {
			By header = By.xpath("//span[contains(text() , '" + optionname.replace("Check", "").strip()
					+ "') and contains(@class, 'header')]/.. | ");
			CommonActions.isDisplayed(header, "Header" + optionname);
			CommonActions.iClickElementByLocator(manageLeadTab, "Manage lead tab");
		} catch (Exception e) {
			CommonActions.iLogMessage("No duplicate records found!!!!!!!");
			CommonActions.iClickElementByLocator(manageLeadTab, "Manage lead tab");
		}
	}

	public void clickFollwupButton() throws InterruptedException {
		try {
			System.out.println("Inside try Followup details reminder");
		CommonActions.iClickElementByLocator(follwupDetailsButton, "Followup details button");
		}
		catch (Exception e) {
			System.out.println("Inside catch Followup details reminder");
			WebElement followupbtn = CommonActions.getElement(follwupDetailsButton);
			CommonActions.iClickJSE(followupbtn, "Send Remind btn bttn");
			Thread.sleep(2000);
		}
	}

	public void iValidateFollowupLeadPage() throws Exception {
		Thread.sleep(5000);
		CommonActions.isDisplayed(followUpDetailsheader, "Followup details");
		CommonActions.iClickElementByLocator(manageLeadTab, "Manage lead tab");

	}

	public void sendReminder() throws InterruptedException {
		try{
			System.out.println("Inside try send reminder");
		CommonActions.iClickElementByLocator(sendReminder, "Send reminder button");
		}
		catch (Exception e) {
			System.out.println("Inside catch send reminder");
			WebElement sendremindbtn = CommonActions.getElement(sendReminder);
			CommonActions.iClickJSE(sendremindbtn, "Send Remind btn bttn");
			Thread.sleep(4000);
		}
	}

	public void validateLeadDeatilsPageHeader() throws Exception {
		CommonActions.isDisplayed(leadDeatilsPageHeader, "Lead page details page header");
		CommonActions.iClickElementByLocator(manageLeadTab, "Manage lead tab");
	}

	public void selectStatusFromColumn(String name) throws InterruptedException {

		if (name.contains("Admission")) {
			new CommonLocatorPage().iSelectRow("1", "nested");
			Thread.sleep(4000);
//			CommonActions.iClickElementByLocator(columnButton, "Column button");
			WebElement columnButtn = CommonActions.getElement(columnButton);
			CommonActions.iClickJSE(columnButtn, "Column bttn");
			Thread.sleep(4000);
			CommonActions.iClickElementByLocator(statusOption, "Status option");
			CommonActions.iClickElementByLocator(applyButton, "Apply button");
		}

		else if (name.contains("Appointment")) {
			new CommonLocatorPage().iClickButtonOfChoice("Search");
			Thread.sleep(4000);
			new CommonLocatorPage().iSelectRow("1", "nested");
			new CommonLocatorPage().iClickActionButton("Edit");
			Thread.sleep(4000);
			CommonActions.iClickElementByLocator(appointmentTab, "Appointment tab");
			// CommonActions.iClickElementByLocator(columnButton, "Column button");
			Thread.sleep(4000);
			WebElement columnButtn = CommonActions.getElement(columnButton);
			CommonActions.iClickJSE(columnButtn, "Column bttn");
			Thread.sleep(4000);
			CommonActions.iClickElementByLocator(statusOption, "Status option");
			CommonActions.iClickElementByLocator(applyButton, "Apply button");
		}

		else if (name.contains("Followup")) {
			new CommonLocatorPage().iSelectRow("1", "nested");
			CommonActions.iClickElementByLocator(follwupDetailsButton, "Followup details button");
			// CommonActions.iClickElementByLocator(columnButton, "Column button");
			Thread.sleep(4000);
			WebElement columnButtn = CommonActions.getElement(columnButton);
			CommonActions.iClickJSE(columnButtn, "Column bttn");
			CommonActions.iClickElementByLocator(statusOption, "Status option");
			CommonActions.iClickElementByLocator(applyButton, "Apply button");
		}

	}

	public void validateStatusUpdated() throws Exception {
		CommonActions.isDisplayed(updateAlert, "Update alert");
		CommonActions.refresh();

	}

	public void clickOnResetButton() throws InterruptedException {
		CommonActions.iClickElementByLocator(resetButton, "Reset button");

	}

	public void deleteTheLeadDetails() throws InterruptedException {

		new CommonLocatorPage().iClickYes();
		new CommonLocatorPage().iValidateAlert();
	}

	public void selectStatusFromColumnReset(String name) throws InterruptedException {
		new CommonLocatorPage().iSelectRow("1", "nested");
		CommonActions.iClickElementByLocator(follwupDetailsButton, "Followup details button");
		Thread.sleep(4000);
		// CommonActions.iClickElementByLocator(columnButton, "Column button");
		WebElement columnButtn = CommonActions.getElement(columnButton);
		CommonActions.iClickJSE(columnButtn, "Column bttn");
		CommonActions.iClickElementByLocator(statusOption, "Status option");
	}

	public void validateStatusUpdatedForReset() throws Exception {
		CommonActions.isDisplayed(updateAlert, "Update alert");
	}

	public void fetchEnquiryID() {
		WebElement alert = CommonActions.getElement(enquiryIDAlert);
		GlobalVariable.enquiryID = alert.getText().replace("Transaction completed successfully Enquiry ID is", "")
				.trim();
		System.out.println("******" + enquiryID);
	}

	public void enterLeadName() throws Exception {
		CommonActions.clickOnElementAndType(leadName, GlobalVariable.studentEnquiryName, "Lead name");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.studentEnquiryName + " ')]"), "Lead name option");

	}

}