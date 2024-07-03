package com.serosoft.pages;

import org.openqa.selenium.By;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class FeeandPaymentPages extends GlobalVariable {
	
	By Feeplan = By.xpath("//input[@name='feePlanName']");
	By feeplantype = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'feePlanType']");
	By currencyDropdown = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name = 'currency']");
	By lastPage = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[contains(@class,'page-last ')]/ancestor::a");
	By lastpagedropdown = By.xpath("//input[contains(@name,'pageSizeCombo') and contains(@class,'form-text')]/../../td[2]");
	By description = By.xpath("//textarea[@name='feeRuleDesc']");
	By statusArrow = By.xpath("//input[@name='status']/../../td[2]");
	By feePlanStageArrow = By.xpath("//input[@name='feePlanStage']/../../td[2]");
	By dueDays = By.xpath("//input[@name='dueDays']");
	By confFeeHeads = By.xpath("//span[text() = 'Configure Fee Heads']/..");
	By feeHeadType = By.xpath("//input[@name='feeHead']");
	By costCentre = By.xpath("//input[@name='costCentre']");
	By amountPercDropdown = By.xpath("//input[@name='amountType']");
	By feeAmount = By.xpath("//input[@name='feeAmount']");
	By paymentPeriod = By.xpath("//input[@name='paymentPeriod']");
	By closeFeeHeadTab = By
			.xpath("//span[text()='Fee Head' and contains(@class,'tab')]/ancestor::a/span[contains(@class,'close')]");
	By closeConfigureFeeHead = By.xpath(
			"//span[text()='Configure Fee Head' and contains(@class,'tab')]/ancestor::a/span[contains(@class,'close')]");
	By manageFeePlanTab = By.xpath("//span[text()='Manage Fee Plan' and contains(@class,'tab')]/..");
	By refreshButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip=\"Refresh\"]");
	By approve = By.xpath("//span[text() = 'Approve']/..");
	By applyTo = By.xpath("//div[contains(@data-xpath,'menu_doMappingLink_menuitem')]//span[text() = 'Apply To']/..");
	By searchPrg = By.cssSelector("input[name = 'programsearchcombo']");
	By searchacdloc = By.cssSelector("input[name = 'academylocationsearchcombo']");
	By nextreplacearrowclick = By.xpath("//div[contains(@id,'alprogramgrid') and contains(@class,'x-box-inner ')]//a[contains(@class,'first-forward-btn')]");
	By ruledropdownarrow = By.xpath("//input[@name='drools']/../../td[2]");
	
	
	
	
	public void iCreateFeePlan(String feepalntype, String currency) throws Exception {

		ApplcFeePlanName = CommonActions.randromFeeplanNameGenerator();
		CommonActions.clickOnElementAndType(Feeplan, ApplcFeePlanName, "Grade/Program code");
		CommonActions.iLogMessage("******" + ApplcFeePlanName);
		CommonActions.selectionOptionFromDropdownAfterEntering(feeplantype, feepalntype);
		CommonActions.selectionOptionFromDropdownAfterEntering(currencyDropdown, currency);
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iSelectCreatedFeePlan() throws InterruptedException {
		Thread.sleep(4000);
//		CommonActions.iClickElementByLocator(lastPage, "Last Page");
		CommonActions.iClickElementByLocator(lastpagedropdown, "Last Page");
		CommonActions.iClickElementByLocator(By.xpath("//li[text()='500']"), "Selecting the Last Feeplan");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + ApplcFeePlanName + "']"), "Selecting the Feeplan Name is "+ApplcFeePlanName);
	}

	public void iChooseRuleApplicable(String rules) throws InterruptedException {

		CommonActions.iClickElementByLocator(By.xpath("//label[text()='" + rules + "']/.."),
				"Rule selected is " + rules + "");

	}

	public void iSelectStatusStageDueDays(String Status, String stage, String duedays, String descrptions)
			throws Exception {
		CommonActions.iClickElementByLocator(statusArrow, "Satus dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + Status + " ']"), "Status is " + Status + "");
		CommonActions.iClickElementByLocator(feePlanStageArrow, "FeePlan stage dropdown");
		if (GlobalVariable.ApplFeeplanDescp1 == null) {
			ApplFeeplanDescp1 = descrptions;
		} else {
			ApplFeeplanDescp2 = descrptions;
		}

		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + stage + " ']"), "stage is " + stage + "");
		CommonActions.clickOnElementAndType(dueDays, duedays, "Due days value is " + duedays + "");
		CommonActions.clickOnElementAndType(description, descrptions,
				"Description fields value is " + descrptions + "");
		new CommonLocatorPage().iClickSaveButton("normal");

		System.out.println("****" + ApplFeeplanDescp1);
		System.out.println("****" + ApplFeeplanDescp2);
	}

	public void iSelectCreatedFeePlanRule(String stage) throws InterruptedException {

		CommonActions.iClickElementByLocator(By.xpath("//div[text() = '" + stage + "']/../.."), stage);

	}

	public void iClickCOnfigureFeeHead() throws InterruptedException {

		new CommonLocatorPage().iClickButtonOfChoice("More Action");
		CommonActions.iClickElementByLocator(confFeeHeads, "Configure fee head");
	}

	public void iAddFeeplanRule(String feehead, String amountperc, String amount, String periodicty) throws Exception {
		CommonActions.selectionOptionFromDropdownAfterEntering(feeHeadType, feehead);
		CommonActions.selectionOptionFromDropdownAfterEntering(costCentre, "Test");
		CommonActions.selectionOptionFromDropdownAfterEntering(amountPercDropdown, amountperc);
		CommonActions.clickOnElementAndType(feeAmount, amount, "Amount is " + amount + "");
		CommonActions.selectionOptionFromDropdownAfterEntering(paymentPeriod, periodicty);
		new CommonLocatorPage().iClickSaveButton("nested");

	}

	public void iCloseFeeAndConfigureFeeHeadTab() throws InterruptedException {
		CommonActions.iClickElementByLocator(closeFeeHeadTab, "Close fee head");
		CommonActions.iClickElementByLocator(closeConfigureFeeHead, "Close configure fee head");
	}

	public void iClickManageFeePlanTab() throws InterruptedException {
		CommonActions.iClickElementByLocator(manageFeePlanTab, "Manage fee plan tab");
	}

	public void iApproveFeePlan() throws InterruptedException {
		new CommonLocatorPage().iClickButtonOfChoice("More Action");
		CommonActions.iClickElementByLocator(approve, "Approve button");

	}

	public void iRefreshFeePlnPage() throws InterruptedException {
		CommonActions.iClickElementByLocator(refreshButton, "Refresh");
	}

	public void iApplyFeePlan() throws InterruptedException {
		new CommonLocatorPage().iClickButtonOfChoice("More Action");
		CommonActions.iClickElementByLocator(applyTo, "Apply to button");
	}

	public void iMapFeePlan(String location, String seat) throws Exception {
		GlobalVariable.academyLocation = location;
		GlobalVariable.seatType = seat;
		CommonActions.clickOnElementAndType(searchacdloc, GlobalVariable.academyLocation, "Academy loaction");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text() ,'"+academyLocation+"')]"), academyLocation);

		String acadloc = GlobalVariable.academyLocation;
		String replaceString = acadloc.replace('-', ' ');

		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + replaceString + "')]/ancestor::tr/td[1]"), academyLocation);
		new CommonLocatorPage().iClickButtonOfChoice("Next");
		Thread.sleep(3000);
		CommonActions.clickOnElementAndType(searchPrg, GlobalVariable.GradeOrProgramName, "Grade or prg name");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + GradeOrProgramName + " ']"),
				GradeOrProgramName);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + GradeOrProgramName + "']/ancestor::tr/td[1]"), GradeOrProgramName);
		
//		CommonActions.iClickElementByLocator(nextreplacearrowclick, "I click next Replace arrow ");
		new CommonLocatorPage().iClickButtonOfChoice("Next");
		
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text() = '"
						+ GradeOrProgramName + "']/ancestor::tr/td[1]"),
				GradeOrProgramName);
		new CommonLocatorPage().iClickButtonOfChoice("Next");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains (text() , '" + seatType + "')]/ancestor::tr/td[1]"), seatType);
		new CommonLocatorPage().iClickButtonOfChoice("Submit nested");

	}

	public void iSelectCreatedFeePlanforApprove() throws InterruptedException {
		Thread.sleep(4000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + ApplcFeePlanName + "']"), ApplicantFirstName);
	}

	public void iSelectCreatedFeePlanApply() throws InterruptedException {
		Thread.sleep(4000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + ApplcFeePlanName + "']"), ApplicantFirstName);
	}

	public void iCreateProgramFeePlan(String feepalntype, String currency) throws Exception {
		GlobalVariable.ProgramFeePlanName = CommonActions.randromPrgFeeplanNameGenerator();
		CommonActions.clickOnElementAndType(Feeplan, ProgramFeePlanName, "Grade/Program code");
		CommonActions.iLogMessage("******" + ProgramFeePlanName);
		CommonActions.selectionOptionFromDropdownAfterEntering(feeplantype, feepalntype);
		CommonActions.selectionOptionFromDropdownAfterEntering(currencyDropdown, currency);
		new CommonLocatorPage().iClickSaveButton("window");
		System.out.println("************* inside iCreateProgramFeePlan" + ProgramFeePlanName);
		
	}

	public void iSelectCreatedProgramFeePlan() throws InterruptedException {
		Thread.sleep(4000);
//		CommonActions.iClickElementByLocator(lastPage, "Last Page");
		
		CommonActions.iClickElementByLocator(lastpagedropdown, "Last Page");
		CommonActions.iClickElementByLocator(By.xpath("//li[text()='500']"), "Selecting the Last Feeplan");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + ProgramFeePlanName + "']"),
				ProgramFeePlanName);
		System.out.println("************* inside iSelectCreatedProgramFeePlan" + ProgramFeePlanName);
	}
	
	
	public void iSelectStatusStageDueDaysPrgFeePlan(String Status, String stage, String duedays, String descrptions)
			throws Exception {
		
		CommonActions.iClickElementByLocator(statusArrow, "Satus dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + Status + " ']"), "Status is " + Status + "");
		CommonActions.iClickElementByLocator(feePlanStageArrow, "FeePlan stage dropdown");
		if (GlobalVariable.PrgFeeplanDescp1 == null) {
			PrgFeeplanDescp1 = descrptions;
		} else {
			PrgFeeplanDescp2 = descrptions;
		}

		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + stage + " ']"), "stage is " + stage + "");
		CommonActions.clickOnElementAndType(dueDays, duedays, "Due days value is " + duedays + "");
		CommonActions.clickOnElementAndType(description, descrptions,
				"Description fields value is " + descrptions + "");
		new CommonLocatorPage().iClickSaveButton("normal");

		System.out.println("****" + PrgFeeplanDescp1);
		System.out.println("****" + PrgFeeplanDescp2);
	}
	
	public void iSelectCreatedProgramFeePlanforApprove() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("************* inside iSelectCreatedProgramFeePlanforApprove" + ProgramFeePlanName);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + GlobalVariable.ProgramFeePlanName + "']"), GlobalVariable.ProgramFeePlanName);
	}
	
	public void iChooseRulefromdropdown(String rules) throws InterruptedException {
		CommonActions.iClickElementByLocator(ruledropdownarrow, "Clicking Rule dropdown Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+rules+" ']"),
				"Rule selected is " + rules + "");

	}
	
	public void iSelectStatusStageDueDaysPrgFeePlanDomicile(String Status, String stage, String duedays, String descrptions)
			throws Exception {
		
		CommonActions.iClickElementByLocator(statusArrow, "Satus dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + Status + " ']"), "Status is " + Status + "");
		CommonActions.iClickElementByLocator(feePlanStageArrow, "FeePlan stage dropdown");
		if (GlobalVariable.PrgFeeplanDescp3 == null) {
			PrgFeeplanDescp3 = descrptions;
		} else {
			PrgFeeplanDescp4 = descrptions;
		}

		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + stage + " ']"), "stage is " + stage + "");
		CommonActions.clickOnElementAndType(dueDays, duedays, "Due days value is " + duedays + "");
		CommonActions.clickOnElementAndType(description, descrptions,
				"Description fields value is " + descrptions + "");
		new CommonLocatorPage().iClickSaveButton("normal");

		System.out.println("****" + PrgFeeplanDescp3);
		System.out.println("****" + PrgFeeplanDescp4);
	}
	


}
