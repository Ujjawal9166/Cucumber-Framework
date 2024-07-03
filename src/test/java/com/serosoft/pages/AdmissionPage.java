package com.serosoft.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class AdmissionPage extends GlobalVariable {

	By selectionprocesname = By.xpath("//input[@name='name']");
	By selectionprocestype = By.xpath("//input[@name= 'selectionProcessType']/../../td[2]");
	By stagenamearrow = By.xpath("//input[@name= 'stageId']/../../td[2]");
	By complitionday = By.xpath("//input[@name= 'expNumberOfDays']");
	By selectconfigurestage = By.xpath("//span[contains(text(),'Configure Stage')]");
	By evaluationparameteraddbutton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[contains(@id,'evaluationparametersgrid')]//a[@data-qtip='Add']");
	By EPname = By.xpath("//input[@name='evaluationParameter']");
	By EPweightage = By.xpath("//input[@name='weightage']");
	By EPmaxmarks = By.xpath("//input[@name='maxMarks']");
	By closestgconf = By.xpath(
			"//span[text() = 'Stage Configuration' and contains(@class , 'tab')]/ancestor::a/span[contains(@id, 'close')]");
	By findtotalrecords = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[contains(text(),'Records')]");

	By academylocationarrow = By.xpath("//input[@name= 'academyLocationCombo']/../../td[2]");
	By selectnotconfig = By.xpath("//label[text()='Not Configured Combinations']/..");
	By configcombination = By.xpath("//span[text()='Configure Combination']/..");
	By selectprogramgroup = By
			.xpath("//input[@name= ' programGroup' and contains(@class,'trigger-noedit')] /../../td[2]");

	By selproctype = By.xpath("//input[@name= 'selectionProcess']/../../td[2]");

	By stageselectionarrow = By.xpath("//input[@name = 'programSelectionProcessStage']/../../td[2]");
	By selectminseats = By.xpath("//input[@name='minSeat']");
	By selectmaxseats = By.xpath("//input[@name='maxSeat']");
	By stagesavebutton = By.xpath("//div[contains(@id, 'stagesetting')]//span[text() = 'Save']/..");

	By salestartdate = By.xpath("//input[@name= 'formSaleStartDate']/parent::td/following-sibling::td");
	By saleenddate = By.xpath("//input[@name= 'formSaleEndDate']/parent::td/following-sibling::td");
	By submissionstartdate = By.xpath("//input[@name= 'formSubmissionStartDate']/parent::td/following-sibling::td");
	By submissionenddate = By.xpath("//input[@name= 'formSubmissionEndDate']/parent::td/following-sibling::td");
	By applicationsavebutton = By.xpath("//div[contains(@id, 'applicationsettings')]//span[text() = 'Save']/..");
	By closeadmissiontab = By.xpath("//span[text()='Admission Setup']/ancestor::a/span[contains(@id,'close')]");
	By admissonsaveButton = By.xpath("//div[contains(@id, 'admissionsetting')]//span[text() = 'Save']/..");
	By offerlettercheckbox = By
			.xpath("//label[contains(text(),'Offer Letter Applicable')]/parent::td/following-sibling::td/input");
	By admofferstartdate = By.xpath("//input[@name= 'admissionOfferStartDate']/parent::td/following-sibling::td");
	By admofferenddate = By.xpath("//input[@name= 'admissionOfferEndDate']/parent::td/following-sibling::td");
	By offissueprocees = By.xpath("//input[@name= 'offerLetterIssueProcess']/../../td[2]");
	By admissionstartday = By.xpath("//input[@name= 'admissionProcessStartDate']/parent::td/following-sibling::td");
	By admissionlastday = By.xpath("//input[@name= 'lastDateForAdmission']/parent::td/following-sibling::td");
	By allowbackdateadmission = By
			.xpath("//label[contains(text(),'Allow Back Date Admission')]/parent::td/following-sibling::td/input");
	By allowtrailadmission = By
			.xpath("//label[contains(text(),'Allow Trial Admissions')]/parent::td/following-sibling::td/input");
	By allowprovisionaladmission = By.xpath(
			"//label[contains(text(),'Allow Conditional Admissions')]/parent::td/following-sibling::td/input | //label[contains(text(),'Allow Provisional Admissions')]/parent::td/following-sibling::td/input");

	By applicantgender = By.xpath("//input[@name= 'genderCSM']/../../td[2]");
	By sourcrofentry = By.xpath("//div[@name= 'applicantModeOfEnquiry']/../../td[3]");

	By applicanttype = By.xpath("//input[@name= 'applicationType']/../../td[2]");
	By aplfirstname = By.xpath("//input[@name='firstName']");
	By applicantdob = By.xpath("//input[@name= 'birthDate']/parent::td/following-sibling::td");
	By contactdetailsarrow = By.xpath("//input[@name= 'mobileCountryCode']/../../td[2]");
	By contactnumber = By.xpath("//input[@name='mobileNumber']");
	By contactmailid = By.xpath("//input[@name='emailId']");
	By studentnamesearch = By.xpath("//input[@name='relationshipStudent']");
	By employeenamesearch = By.xpath("//input[@name='relationshipUser']");
	By locationarrow = By.xpath("//input[@name= 'academyLocations']/../../td[2]");
	By academylocationArrow = By.xpath("//input[@name= 'ACADEMY_LOCATION_ID']/../../td[2]");
	By programgrouparrow = By.xpath("//input[@name= 'pgmGroup']/../../td[2]");
	By prgGrpArrow = By.xpath("//input[@name= 'PROGRAM_GROUP']/../../td[2]");
	By floatingwinsearchbtn = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()='Search']/..");
	By addprogrambtn = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()='Add Grade']/.. | //body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()='Add Program']/..");
	By addprogramrowcheckbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//tr[contains(@role,'row')][1]/td[1]");
	By submitbtn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[contains(text(),'Submit')]/../..");
	By jobnamedropdown = By.xpath("//input[@name='jobName']");
	By jobstatedropdown = By.xpath("//input[@name='jobState']/../../td[2]");
	By jobsearchbtn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text()='Search' and not(contains(@class , 'tab'))]/..");
	By frocerunbtn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text()= 'Force Run']/ancestor::a");
	By okbtn = By.xpath("//span[text()='OK']/ancestor::a");

	By assignaplidbtn = By.xpath("//span[text()='Assign Application ID']/ancestor::a");
	By submitformbtn = By.xpath("//span[text()='Submit Form']/ancestor::a");
	By aplidsearch = By.xpath("//input[@name= 'APPICANT_PRINT_NAME']");
	By aplicationApproveButton = By.xpath("//span[text() = 'Approve Application']/ancestor::a");
	By approvalReasonArrow = By.xpath("//input[@name= 'reasonId']/../../td[2]");
	By seatTypeArrow = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name= 'SEAT_TYPE']/../../td[2]");
	By stageDropdownArrow = By.xpath(
			"//input[@name = 'PROGRAM_SELECTION_PROCESS_STAGE_ID'  and not(contains(@class , 'hidden'))]/../../td[2]");
	By evealuateApplicantButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Evaluate Applicant']/..");
	By moreFilters = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text() = 'More Filters']/..");
	By statusStage = By.xpath("//input[@name = 'STAGE_STATUS']/../../td[2]");
	By promoToNextStgBtn = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Promote To Next Stage']/..");
	By addprogrambutton = By.xpath(
			"//span[contains(text(), 'Add Grade')]/ancestor::a | //span[contains(text(), 'Add Program')]/ancestor::a");
	By periodnamearrow = By.xpath("//input[@name= 'period']/../../td[2]");
	By admissiontypearrow = By.xpath("//input[@name= 'admissionType']/../../td[2]");
	By floatingwindowaddprogrambtn = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[contains(text(), 'Add Program')]/ancestor::a | //body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[contains(text(), 'Add Grade')]/ancestor::a");
	By approveadmissionbtn = By.xpath("//span[text()='Approve Admission']/ancestor::a");
	By approvebtn = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//span[text()='Approve']/ancestor::a");
	By stuaplidsearch = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name= 'STUDENT_ID']");
	By searchApplcID = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//label[text() = 'Application ID:']/../following-sibling::td/input");
	By searchButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Search']/ancestor::a");
	By collectPayment = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Collect Payment']/ancestor::a");
	By cashradiobtn = By.xpath("//label[text()='Cash']/parent::td");
	By feeplanapplicablecheckbox = By.xpath("//label[contains(text(),'If Fee Plan is applicable')]/..");
	By feeplanarrrow = By.xpath("//input[@name='feePlan']/../../td[2]");
	By feeplanrulearrow = By.xpath("//input[@name='feePlanRule']/../../td[2]");
	By feeplanrulestagearrow = By.xpath("//input[@name='feePlanRuleStage']/../../td[2]");

	By countrydropdown = By.xpath("//input[@name='country']/../../td[2]");
	By nationalitydropdown = By.xpath("//input[@name='nationality']/../../td[2]");
	By disabilitydropdown = By.xpath("//div[@name='haveDisabilities']/../../td[3]");
	By ruledropdown = By.xpath("//input[@name='domicile']/../../td[2]");
	By homelangdropdown = By.xpath("//input[@name='homeLanguage']/../../td[2]");
	By secondlangdropdown = By.xpath("//input[@name='secondLanguage']/../../td[2]");

	By addbtnforrecipt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div//ancestor::table/parent::div/../..//a[contains(@class,'btn-default-toolbar-small-icon addbutton')]");
	By reciptforstudentid = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='student']");
	By autosettlearadiobtn = By.xpath("//label[text()='Yes']/../input");
	By saveandsettlebtn = By
			.xpath("//span[text()='Save & Print']/ancestor::a/ancestor::tr//div[contains(@class,'x-box-target')]/a[1]");
	By reciptDatePicker = By.xpath("//input[@name= 'transactionDate']/parent::td/following-sibling::td");
	By reciptforarrow = By.xpath("//input[@name='receiptForm']");
	By recipttypearrow = By.xpath("//input[@name='raiseBillType']");
	By reciptCurrency = By.xpath("//input[@name='receivingCurrency']");

	By billforarrow = By.xpath("//input[@name='billView']/../../td[2]");
	By stuidsearch = By.xpath("//input[@name='student']");

	By cashpaymentradiobtn = By.xpath("//label[text()='Cash Payment']/parent::td");
	By paymentforarrow = By.xpath("//input[@name='paymentFor']");
	By paymenttypearrow = By.xpath("//input[@name='paymentTo']");
	By paymentCurrency = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='paymentCurrency']");
	By paymentcurrencydropdown = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='paymentCurrency']/../../td[2]");
	By paymentAmount = By.xpath("//input[@name='amount1']");
	By savebtn = By.xpath("//span[text()='Save']/ancestor::a/ancestor::tr//div[contains(@class,'x-box-target')]/a[1]");
	By receiptlisttypearrow = By.xpath("//input[@name='billFor']");

	By vouchertypearrow = By.xpath("//input[@name='voucherType']");
	By voucherlinktypearrow = By.xpath("//input[@name='voucherLinkType']");
	By receipttxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='receiptNo']");
	By addbtnforpayment = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div//ancestor::table/parent::div/../..//a[contains(@class,'btn-default-toolbar-small-icon addbutton')]");
	By programaddbtn = By.xpath(
			"//div[contains(@data-xpath,'applicantcommonform_addprogramgrid')]//div[contains(@data-xpath,'addprogramgrid_toolbar') and contains(@class,'top')]//a[@data-xpath='toolbar_btnAdd_button']");
	By applidtxt = By.xpath("//label[text()='Application ID:']/parent::td/..//input");
	By feeheadrefund = By.xpath("//span[contains(text()  ,'Fee Heads for Refunds')]");
	By refundapplsearchbtn = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Search']/..");
	By finalapplidtxt = By.cssSelector("input[name='ADMISSION_NUMBER']");
	
	
	
	public void iAddtheSelectionProcess(String type) throws Exception {
		selectionProcess = CommonActions.randromSelectionProcessName();
		CommonActions.clickOnElementAndType(selectionprocesname, selectionProcess, "Selection Process Name");
		CommonActions.iClickElementByLocator(selectionprocestype, "Selection Process Type");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"), "Selection Type Dropdown");
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iClickSelectionProcess() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + GlobalVariable.selectionProcess + "']/../.."),
				"Selected Selection Process Name");
	}

	public void iSelectStage(List<Map<String, String>> data) throws Exception {
		for (Map<String, String> type : data) {
			Thread.sleep(2000);
			new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
			String stagename = type.get("Stages");
			if (GlobalVariable.stagename1 == null) {
				stagename1 = stagename.trim();
			} else {
				GlobalVariable.stagename2 = stagename.trim();
			}
			System.out.println("**************" + stagename);
			String Day = type.get("Days");
			System.out.println("**************" + Day);
			CommonActions.iClickElementByLocator(stagenamearrow, "Satge Name");
			CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + stagename + " ']"),
					"Stage Name Selection");
			CommonActions.clickOnElementAndType(complitionday, Day, "Compelition Days");

			// new CommonLocatorPage().iClickButtonOfChoice("Submit window");
			new CommonLocatorPage().iClickSaveButton("window");

			new CommonLocatorPage().iValidateAlert();
		}
		CommonActions.iLogMessage("************" + stagename1);
		CommonActions.iLogMessage("************" + stagename2);

	}

	public void iAddEvaluationParameter(List<Map<String, String>> datatable) throws Exception {
		for (Map<String, String> data : datatable) {
			Thread.sleep(2000);
			String stgagename = data.get("stage name");
			String evpname = data.get("EPName");
			String weightage = data.get("Weightage");
			String marks = data.get("MaxMarks");

//			CommonActions.iClickElementByLocator(findtotalrecords, "Find Total Records");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + stgagename + "']/../.."), "Stage Name");
			new CommonLocatorPage().iClickButtonOfChoice("More Action");
			CommonActions.iClickElementByLocator(selectconfigurestage, "Select Confugire Stage");
			CommonActions.iClickElementByLocator(evaluationparameteraddbutton, "Evaluation Parameter Add Button");
			CommonActions.clickOnElementAndType(EPname, evpname, "Add Evaluation Parameter Name");
			CommonActions.clickOnElementAndType(EPweightage, weightage, "Add Evaluation Parameter Weightage");
			CommonActions.clickOnElementAndType(EPmaxmarks, marks, "Add Evaluation Parameter Max Marks");
			new CommonLocatorPage().iClickSaveButton("window");
			new CommonLocatorPage().iValidateAlert();
			CommonActions.iClickElementByLocator(closestgconf, "Close Stage Configure");

		}

	}

	public void iSelectNotConfigured() throws Exception {
		CommonActions.iClickElementByLocator(academylocationarrow, "Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + academyLocation + "')]"),
				"Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(selectprogramgroup, "Select Program Group Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.programgrp + "')]"),
				"SelectProgram Group Name");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'PROGRAM']"), GlobalVariable.GradeOrProgramName,
				"Prg name");
		CommonActions.iClickEnter(By.xpath("//input[@name = 'PROGRAM']"));
		CommonActions.iClickElementByLocator(selectnotconfig, " Select Not Configured Combinatiobns.");
		new CommonLocatorPage().iClickButtonOfChoice("Search");
//		new CommonLocatorPage().iSelectRow("1", "nested");
	}

	public void iSelectConfigureCombination() throws Exception {
		GlobalVariable.seatType = new CommonLocatorPage().iSelectColumnAndGetText("1", "5", "nested");
		CommonActions.iLogMessage("I select seaty type for the configuration is " + seatType);
		new CommonLocatorPage().iSelectRow("1", "nested");

		CommonActions.iClickElementByLocator(configcombination, "Select Configure Combinatios");
	}

	public void iSelectSelectionProcessType(String type) throws Exception {
		CommonActions.iClickElementByLocator(selproctype, "Select Selection Process Type");
		Thread.sleep(1000);
		System.out
				.println("#########################################################" + GlobalVariable.selectionProcess);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),' " + GlobalVariable.selectionProcess + " ')]"),
				"Selected Selection Process Name");
		CommonActions.iClickElementByLocator(By.xpath("//label[text()='" + type + "']"), "Select Selection Mechanism");
		new CommonLocatorPage().iClickSaveButton("normal");
		new CommonLocatorPage().iValidateAlert();
	}

	public void iSelectStageSettingTab(List<Map<String, String>> seattype) throws Exception {
		for (Map<String, String> seat : seattype) {
			Thread.sleep(2000);
			String stgagename = seat.get("Stages");
			String minseats = seat.get("MinSeats");
			String maxseats = seat.get("MaxSeats");
			String feeplanstage = seat.get("FeeplanStage");
			CommonActions.iClickElementByLocator(stageselectionarrow, "Select Stage Selection Arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' " + stgagename + " ']"),
					"Select Stage Name");
			CommonActions.clickOnElementAndType(selectminseats, minseats, "Enter Min Seats");
			CommonActions.clickOnElementAndType(selectmaxseats, maxseats, "Enter Max Seats");
			CommonActions.iClickElementByLocator(feeplanapplicablecheckbox, "Clicking Feeplan Applicable Check Box");

			CommonActions.iClickElementByLocator(feeplanarrrow, "Select Feeplan textbox Arrow");
			CommonActions.iClickElementByLocator(
					By.xpath("//div[text()= ' " + GlobalVariable.ProgramFeePlanName + " ']"), "Selecting the Feeplan");
			CommonActions.iClickElementByLocator(feeplanrulearrow, "Select Feeplan Rule textbox Arrow");
			if (stgagename.contains(stagename1)) {
				CommonActions.iClickElementByLocator(
						By.xpath("//div[text()= ' " + GlobalVariable.PrgFeeplanDescp1 + " ']"),
						"Selecting the Feeplanrule");
			} else if (stgagename.contains(stagename2)) {
				CommonActions.iClickElementByLocator(
						By.xpath("//div[text()= ' " + GlobalVariable.PrgFeeplanDescp2 + " ']"),
						"Selecting the Feeplanrule");

			}
			CommonActions.iClickElementByLocator(feeplanrulestagearrow, "Select Feeplan Rule Stage textbox Arrow");
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' " + feeplanstage + " ']"),
					"Selecting the Feeplanrule Stage");
			CommonActions.iClickElementByLocator(stagesavebutton, "Stage Save Button");
			new CommonLocatorPage().iValidateAlert();
		}

	}

	public void iSelectApplicationSettingTab() throws Exception {
		CommonActions.iClickElementByLocator(salestartdate, "Sale Start date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(saleenddate, "Sale End date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");

		CommonActions.iClickElementByLocator(submissionstartdate, "Submission Start date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(submissionenddate, "Submission End date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");

		CommonActions.iClickElementByLocator(applicationsavebutton, "Stage Save Button");

	}

	public void iSelectAdmissionSettingTab(String issuetype) throws Exception {

//		CommonActions.iClickElementByLocator(offerlettercheckbox, "Select Offer letter Check Box");
//
//		CommonActions.iClickElementByLocator(admofferstartdate, "Admission Offer Start date picker");
//		new CommonLocatorPage().iClickButtonOfChoice("Today");
//		CommonActions.iClickElementByLocator(admofferenddate, "Admission End date picker");
//		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
//		new CommonLocatorPage().iClickButtonOfChoice("Day");

//		CommonActions.iClickElementByLocator(offissueprocees, "Offer Letter Issue Process");
//		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + issuetype + "')]"),
//				"Select the offer letter process");

		CommonActions.iClickElementByLocator(admissionstartday, "Admission Start date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(admissionlastday, "Submission End date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");
		CommonActions.iClickElementByLocator(allowbackdateadmission, "Allow Back Date Admissions");
		CommonActions.iClickElementByLocator(allowtrailadmission, "Allow Trail Admissions");
		CommonActions.iClickElementByLocator(allowprovisionaladmission, "Allow Provisional Admissions");
		CommonActions.iClickElementByLocator(admissonsaveButton, "admission Save Button");
		Thread.sleep(2000);
	}

	public void iCloseAdmissionSetup() throws Exception {
		CommonActions.iClickElementByLocator(closeadmissiontab, "Close The Admission Tab");
	}

	public void iSearchCombinationConfigure() throws Exception {
		CommonActions.iClickElementByLocator(academylocationarrow, "Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.academyLocation + "')]"),
				"Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(selectprogramgroup, "Select Program Group Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.programgrp + "')]"),
				"SelectProgram Group Name");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'PROGRAM']"), GlobalVariable.GradeOrProgramName,
				"Prg name");
		CommonActions.iClickEnter(By.xpath("//input[@name = 'PROGRAM']"));
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		Thread.sleep(10000);
		CommonActions.refresh();
	}

	public void iCreateNewApplication(String apltype, String gender) throws Exception {
//		ApplicantFirstName = CommonActions.randromSelectApplicantLasttName();
		String ApplicantLastName = CommonActions.randromSelectApplicantLasttName();
		CommonActions.iClickElementByLocator(applicanttype, "Chouse New Application Type Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' " + apltype + " ']"),
				"Chouse New Application Type");

		CommonActions.iClickElementByLocator(By.xpath("//input[@name='salutation']/../../td[2]"),
				"I Select yhe Salutation dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'Mr')]"), "I Selecting the Salutation");

		CommonActions.clickOnElementAndType(aplfirstname, "Applicant", "Select Applicant FirstName");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='lastName']"), ApplicantLastName,
				"I enter the student last name");

		CommonActions.iClickElementByLocator(applicantdob, "Applicant DOB");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(applicantgender, "Select Applicant Gender Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + gender + " ']"), "Select Gender");

		WebElement applicant = CommonActions.getElement(By.xpath("//input[@name='printName']"));
		ApplicantFirstName = applicant.getAttribute("value");
		System.out.println(" **************************** ApplicantFirstName is " + ApplicantFirstName);

	}

	public void iSelectSourceofEntry(List<Map<String, String>> entrysource) throws Exception {
		CommonActions.iClickElementByLocator(sourcrofentry, "Select Source Of Entry Arrow");

		for (Map<String, String> seat : entrysource) {
			Thread.sleep(2000);
			String sourceentry = seat.get("SourceofEntry");

			CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + sourceentry + "']"), "Select Stage Name");
		}
	}

	public void iAddContactandRelationshipDetails(String studentname, String employeename) throws Exception {
		CommonActions.iClickElementByLocator(contactdetailsarrow, "Click Contact Details Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' +91 ']"), "Select Country Code");
		CommonActions.clickOnElementAndType(contactnumber, "8989898989", "Enter Contact Number");
		CommonActions.clickOnElementAndType(contactmailid, "test@demo.com", "Enter Contact Number");

		CommonActions.iClickElementByLocator(programaddbtn, "I Click Add Button");

//		CommonActions.clickOnElementAndType(studentnamesearch, "Student", "Search for Student");
//		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + studentname + "')]"),
//				"Select Student Name");
//		CommonActions.clickOnElementAndType(employeenamesearch, "Employee", "Search for Employee");
//		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + employeename + "')]"),"Select Student Name");

	}

	public void iSelectLocationandProgram() throws Exception {
		System.out.println("########################################" + GlobalVariable.GradeOrProgramName);
		CommonActions.iClickElementByLocator(locationarrow, "Click Academy Location Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.academyLocation + "')]"),
				"Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(programgrouparrow, "Click Program group Arrow");
		
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.programgrp + "')]"),
				"Select Program Group Name");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name= 'programs']/../../td[2]"),"Select Program Name Arrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.GradeOrProgramName + "')]"),	"Select Program Name");
		
//		CommonActions.clickOnElementAndType(By.xpath("//input[@name= 'programs']"), GlobalVariable.GradeOrProgramName,"Select Program Name");
		CommonActions.iClickEnter(By.xpath("//input[@name= 'programs']"));
		CommonActions.iClickElementByLocator(floatingwinsearchbtn, "Select Floating window Search Button");

	}

	public void iAddProgram() throws Exception {
		CommonActions.iClickElementByLocator(addprogramrowcheckbox, "Select Program");
		CommonActions.iClickElementByLocator(addprogrambtn, "Select Add Program button");
		CommonActions.iClickElementByLocator(submitbtn, "Click on Submit and generate Form Number Button");
	}

	public void iRuntheJobforAdmission(String jobname, String jobstate) throws Exception {
		CommonActions.clickOnElementAndType(jobnamedropdown, jobname, "Select Job Name");
		CommonActions.iClickEnter(jobnamedropdown);
		CommonActions.iClickElementByLocator(jobstatedropdown, "Job state dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + jobstate + " ']"),
				"Job state is + " + jobstate + "");
		CommonActions.iClickElementByLocator(jobsearchbtn, "Search button for Run Job");
		new CommonLocatorPage().iSelectRow("1", "normal");
		CommonActions.iClickElementByLocator(frocerunbtn, "Run the job Forcefully");
		CommonActions.iClickElementByLocator(okbtn, "For Ok Button in job");

	}

	public void iSelectNewApplication() throws Exception {
		new CommonLocatorPage().iSelectRow("1", "normal");
	}

	public void iAssignApllicationId() throws Exception {
		CommonActions.iClickElementByLocator(assignaplidbtn, "Clicking Assign Application Id Button");
		GlobalVariable.ApplicationId = new CommonLocatorPage().iSelectColumnAndGetText("1", "3", "normal").trim();
		System.out.println("##################################### Application Id is : " + GlobalVariable.ApplicationId);
		new CommonLocatorPage().iSelectRow("1", "normal");
		CommonActions.iClickElementByLocator(submitformbtn, "Clicking Submit Form Button");

	}

	public void iSearchForApplicationId() throws Exception {
		CommonActions.clickOnElementAndType(aplidsearch, GlobalVariable.ApplicationId, "Select Application Id");
		CommonActions.iClickEnter(aplidsearch);
//		CommonActions.iClickElementByLocator(By.xpath("//label[contains(text(),'Application Payment Pending')]/parent::td/input"), "I select the Application pending  checkbox");

	}

	public void iEdittheApplication() throws Exception {
		new CommonLocatorPage().iSelectRow("1", "normal");
	}

	public void iClickApplicationApproveButton() throws Exception {
		CommonActions.iClickElementByLocator(aplicationApproveButton, "Approve application button");
	}

	public void iSelectApplicationProgram(String aprrovalreason) throws InterruptedException {
		CommonActions.iClickElementByLocator(
				By.xpath("//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[text() = '"
						+ GlobalVariable.GradeOrProgramName + "']/.."),
				"" + GlobalVariable.GradeOrProgramName + "Program we created is selected");
		CommonActions.iClickElementByLocator(approvalReasonArrow, "Approval reason dripdown arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' " + aprrovalreason + " ']"),
				aprrovalreason + " is clicked");
		// new CommonLocatorPage().iClickSaveButton("submit");
		new CommonLocatorPage().iClickSaveButton("window");

	}

	public void approveApplicantWritten() throws Exception {
		CommonActions.iClickElementByLocator(academylocationArrow, "Click Academy Location Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.academyLocation + "')]"),
				"Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(prgGrpArrow, "Click Program group Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.programgrp + "')]"),
				"Select Program Group Name");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name= 'PROGRAM_ID']"), GlobalVariable.GradeOrProgramName,
				"Select Program Name");
		CommonActions.iClickEnter(By.xpath("//input[@name= 'PROGRAM_ID']"));
		CommonActions.iClickElementByLocator(By.xpath("//input[@name= 'BATCH_ID']/../../td[2]"),
				"Arrow Batch dropdown");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + GlobalVariable.prgOrGradeNameIntakeDetails+ " ' and contains(@class, 'list')]"),
				"Value for batch is " + prgOrGradeNameIntakeDetails + "");
		CommonActions.iClickElementByLocator(seatTypeArrow, "seat type arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + seatType + " ' and contains(@class, 'list')]"),
				"Selected seat type " + seatType);
		CommonActions.iClickElementByLocator(stageDropdownArrow, "Selection stage arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + GlobalVariable.stagename1.trim() + " ' and contains(@class, 'list')]"),
				stagename1);
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + GlobalVariable.ApplicantFirstName + "']/../../td[1]"),
				ApplicantFirstName);
		CommonActions.iClickElementByLocator(evealuateApplicantButton, "Evaluate applicant button");
		new CommonLocatorPage().iClickYes();
		CommonActions.iClickElementByLocator(moreFilters, "More filters");
		CommonActions.iClickElementByLocator(statusStage, "stage status stage");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' Ready to Promote ']"), "Ready to promote");
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + GlobalVariable.ApplicantFirstName + "']/../../td[1]"),
				ApplicantFirstName);
		CommonActions.iClickElementByLocator(promoToNextStgBtn, "Promote to next stage");
		new CommonLocatorPage().iClickYes();
	}

	public void approveApplicantInterview() throws Exception {
		CommonActions.iClickElementByLocator(academylocationArrow, "Click Academy Location Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.academyLocation + "')]"),
				"Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(prgGrpArrow, "Click Program group Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + GlobalVariable.programgrp + "')]"),
				"Select Program Group Name");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name= 'PROGRAM_ID']"), GlobalVariable.GradeOrProgramName,
				"Select Program Name");
		CommonActions.iClickEnter(By.xpath("//input[@name= 'PROGRAM_ID']"));
		CommonActions.iClickElementByLocator(By.xpath("//input[@name= 'BATCH_ID']/../../td[2]"),
				"Arrow Batch dropdown");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + GlobalVariable.prgOrGradeNameIntakeDetails.trim()
						+ " ' and contains(@class, 'list')]"),
				"Value for batch is " + prgOrGradeNameIntakeDetails + "");
		CommonActions.iClickElementByLocator(seatTypeArrow, "seat type arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + seatType + " ' and contains(@class, 'list')]"),
				"Selected seat type " + seatType);
		CommonActions.iClickElementByLocator(stageDropdownArrow, "Selection stage arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = ' " + GlobalVariable.stagename2.trim() + " ' and contains(@class, 'list')]"),
				stagename2);
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + GlobalVariable.ApplicantFirstName + "']/../../td[1]"),
				ApplicantFirstName);
		CommonActions.iClickElementByLocator(evealuateApplicantButton, "Evaluate applicant button");
		new CommonLocatorPage().iClickYes();
		try {
			CommonActions.iClickElementByLocator(statusStage, "stage status stage");
		} catch (Exception e) {
			CommonActions.iClickElementByLocator(moreFilters, "More filters");
			CommonActions.iClickElementByLocator(statusStage, "stage status stage");
		}
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' Ready to Promote ']"), "Ready to promote");
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text() = '" + GlobalVariable.ApplicantFirstName + "']/../../td[1]"),
				ApplicantFirstName);
		CommonActions.iClickElementByLocator(promoToNextStgBtn, "Promote to next stage");
		new CommonLocatorPage().iClickYes();
	}

	public void SelectApplicantApplication() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='" + GlobalVariable.ApplicationId + "']/.."),
				"Select Applicant Application.");
	}

	public void SelectAdmissionDetailsAndAddProgram() throws Exception {
		CommonActions.iClickElementByLocator(addprogrambutton, "Click Add Program Button");
		CommonActions.iClickElementByLocator(
				By.xpath("//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[text()='"
						+ GlobalVariable.GradeOrProgramName + "']/../.."),
				"Select Program for admission approve");
	}

	public void SelectProgramandPeriod() throws Exception {
		CommonActions.iClickElementByLocator(periodnamearrow, "Select Period Name Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + GlobalVariable.prgOrGradePeriodName + " ']"),
				"Select Period Name for Admission");
	}

	public void ChooseAdmissionTypeandAddProgramBtn(String admtype) throws Exception {
		CommonActions.iClickElementByLocator(admissiontypearrow, "Select Admission Type Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + admtype + " ']"),
				"Select Admission Type Confirmed");
		CommonActions.iClickElementByLocator(floatingwindowaddprogrambtn, "Select Program for Admission Details");
	}

	public void SelectApproveAdmission() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text()='"
						+ GlobalVariable.GradeOrProgramName + "']/../.."),
				"Selecting Program for Admission Confirmed");
		CommonActions.iClickElementByLocator(approveadmissionbtn, "Select Approve Admission Button");
	}

	public void SelectProgramandApprove() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[text()='"
						+ GlobalVariable.GradeOrProgramName + "']/../.."),
				"Selecting Program for Admission Confirmed");
		CommonActions.iClickElementByLocator(approvebtn, "Select Approve Button");
	}

	public void SearchForStudentApplicationId() throws Exception {
		CommonActions.clickOnElementAndType(stuaplidsearch, GlobalVariable.ApplicantFirstName,
				"Select Student Application Id");
		CommonActions.iClickEnter(stuaplidsearch);
	}

	public void iValidateStudentList() throws Exception {
		Thread.sleep(2000);
		GlobalVariable.studentName = new CommonLocatorPage().iSelectColumnAndGetText("1", "4", "nested").trim();
		Thread.sleep(2000);
		GlobalVariable.StudentId = new CommonLocatorPage().iSelectColumnAndGetText("1", "3", "nested").trim();
		Thread.sleep(2000);
		if (GlobalVariable.ApplicantFirstName.contains(GlobalVariable.studentName)) {
			CommonActions.iLogMessage("Applicant " + studentName + " is become student successfully !!!");
			System.out.println("#################### Student Id = " + GlobalVariable.StudentId);
		} else {
			throw new Exception(
					"Applicant id is not matched hence applicant is not become student or not visible in the student list!!");
		}
	}

	public void searchApplicationStageFee() throws Exception {
		CommonActions.clickOnElementAndType(searchApplcID, GlobalVariable.ApplicationId, "Application ID is entered");
		CommonActions.iClickElementByLocator(searchApplcID, "Search Application id");
		CommonActions.iClickElementByLocator(searchButton, "Clicking Search Button");
		Thread.sleep(3000);

	}

	public void selectApplicationForStageFee() throws InterruptedException {
		System.out.println("*************************" + GlobalVariable.ApplicationId);
		try {
			CommonActions.iClickElementByLocator(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text() = '"
							+ GlobalVariable.ApplicationId + "']/../.."),
					"Application is selected for the stage fee");
		} catch (Exception e) {
			System.out.println("Inside catch....");
			WebElement row = CommonActions.getElement(By.xpath(
					"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text() = '"
							+ GlobalVariable.ApplicationId + "']/../.."));
			CommonActions.iClickJSE(row, "First row is selected");
		}
	}

	public void iCOllectThePayemnt() throws InterruptedException {
		CommonActions.iClickElementByLocator(collectPayment, "Clicking Collect Payment Button");
		CommonActions.iClickElementByLocator(cashradiobtn, "Clicking Cash Radio Button");
		new CommonLocatorPage().iClickSaveButton("window");
		new CommonLocatorPage().iValidateAlert();
	}

	public void iAddCountryNationalityOtherDetails(String country, String nationality, String disabilites, String rule,
			String homelanguage, String secondlanguage) throws Exception {
		CommonActions.iClickElementByLocator(countrydropdown, "Clicking Country Dropdown Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@data-xpath,'nestedJsonCombo_boundlist')]//div[text() = ' " + country + " ']"),
				"Clicking Country Value");

		CommonActions.iClickElementByLocator(nationalitydropdown, "Clicking Nationality Dropdown Arrow");
		CommonActions.iClickElementByLocator(By.xpath(
				"//div[contains(@data-xpath,'nestedJsonCombo_boundlist')]//div[text() = ' " + nationality + " ']"),
				"Clicking Nationality Value");

		CommonActions.iClickElementByLocator(ruledropdown, "Clicking FeeStage Rule Dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + rule + " ']"),
				"Select Applicant FeeStage Rule");

		CommonActions.iClickElementByLocator(disabilitydropdown, "Clicking Disability Dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = '" + disabilites + "']/.."),
				"Select Applicant Disabilities");
		CommonActions.iClickElementByLocator(disabilitydropdown, "Closing Disability Dropdown");
		
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='leadOwner']"), "System", "Enter the Lead Owener Name");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='pleaseChooseAfterReadingInfo']"), "System", "Enter the after reading info:");

		CommonActions.iClickElementByLocator(homelangdropdown, "Clicking Home Language Dropdown");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@data-xpath,'nestedJsonCombo')]//div[text()=' " + homelanguage + " ']"),
				"Select Applicant Home Language Value");
		Thread.sleep(3000);

//		CommonActions.iClickElementByLocator(secondlangdropdown, "Clicking Second Language Dropdown");
//		CommonActions.iClickElementByLocator(By.xpath("//div[contains(@data-xpath,'nestedJsonCombo')][2]//div[text() = ' "+secondlanguage+" ']"), "Select Applicant Second Language Value");

		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iSelectreciptsforStudent(String recipttype, String reciptfor, String currency) throws Exception {
		CommonActions.iClickElementByLocator(addbtnforrecipt, "Clicking Add button for Recipts");
		CommonActions.iClickElementByLocator(cashradiobtn, "Clicking Cash radio Button");
		CommonActions.clickOnElementAndType(recipttypearrow, recipttype, "Recipt Type " + recipttype);
		CommonActions.iClickEnter(recipttypearrow);
		CommonActions.clickOnElementAndType(reciptforarrow, reciptfor, "Recipt For " + reciptfor);
		CommonActions.iClickEnter(reciptforarrow);
		CommonActions.iClickElementByLocator(reciptDatePicker, "Select Recipt date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.clickOnElementAndType(reciptforstudentid, GlobalVariable.StudentId,
				"Enter the Student id is " + GlobalVariable.StudentId);
		CommonActions.iClickEnter(reciptforstudentid);
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='receivingCurrency']/../../td[2]"), "Selecting the Currency dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+currency+" ']"), "Selecting the Currency");
//		CommonActions.clickOnElementAndType(reciptCurrency, currency, "Recipt Currency For " + currency);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(autosettlearadiobtn, "Clicking Auto Settle radio btn");
		CommonActions.iClickElementByLocator(saveandsettlebtn, "Clicking Save&Settle Button");
		Thread.sleep(5000);
		new CommonLocatorPage().iValidateAlert();
	}

	public void iSelectBillsforStudent(String type) throws Exception {
		CommonActions.iClickElementByLocator(billforarrow, "Clicking Bills for Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"), "Bill type for " + type);
		CommonActions.clickOnElementAndType(stuidsearch, GlobalVariable.StudentId,
				"Enter the Student id is " + GlobalVariable.StudentId);
		CommonActions.iClickEnter(stuidsearch);
	}

	public void iWaitforResults() throws Exception {
		Thread.sleep(10000);

	}

	public void iSelectpaymentforStudent(String paymenttype, String paymentfor, String amount, String currency)
			throws Exception {
		CommonActions.iClickElementByLocator(addbtnforpayment, "Clicking Add button for Payments");
		CommonActions.iClickElementByLocator(cashpaymentradiobtn, "Clicking Cash radio Button");
		CommonActions.clickOnElementAndType(paymenttypearrow, paymenttype, "Recipt Type " + paymenttype);
		CommonActions.iClickEnter(paymenttypearrow);
		CommonActions.clickOnElementAndType(paymentforarrow, paymentfor, "Payment For " + paymentfor);
		CommonActions.iClickEnter(paymentforarrow);
		CommonActions.iClickElementByLocator(reciptDatePicker, "Select Payment date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.clickOnElementAndType(reciptforstudentid, GlobalVariable.StudentId,
				"Enter the Student id is " + GlobalVariable.StudentId);
		CommonActions.iClickEnter(reciptforstudentid);
		
		CommonActions.iClickElementByLocator(paymentcurrencydropdown, "Selecting Payment currency dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+currency+" ']"), "Selecting Payment currency");
//		CommonActions.clickOnElementAndType(paymentCurrency, currency, "Payment Currency For " + currency);
//		CommonActions.iClickEnter(paymentCurrency);
		CommonActions.clickOnElementAndType(paymentAmount, amount, "Payment Currency Amount For " + amount);
		CommonActions.iClickElementByLocator(autosettlearadiobtn, "Clicking Auto Settle radio btn");
		CommonActions.iClickElementByLocator(savebtn, "Clicking Save Button");
		Thread.sleep(5000);
		new CommonLocatorPage().iValidateAlert();
	}

	public void iSelectreciptsListforStudent(String recipttype) throws Exception {
		CommonActions.clickOnElementAndType(receiptlisttypearrow, recipttype, "Recipt Type " + recipttype);
		CommonActions.iClickEnter(receiptlisttypearrow);
		CommonActions.clickOnElementAndType(reciptforstudentid, GlobalVariable.StudentId,
				"Enter the Student id is " + GlobalVariable.StudentId);
		CommonActions.iClickEnter(reciptforstudentid);
		new CommonLocatorPage().iClickButtonOfChoice("SearchNested");

		Thread.sleep(4000);

		WebElement row = CommonActions.getElement(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[text()='"
						+ GlobalVariable.StudentId + "']//ancestor::tr//td[10]/div"));
		String ReceiptNumber = row.getText();

		GlobalVariable.ReceiptId = ReceiptNumber;
		Thread.sleep(3000);
		System.out.println("############################ Receipt Id = " + GlobalVariable.ReceiptId);
	}

	public void iSelectvoucherforStudent(String vouchertype, String voucherlinktype) throws Exception {
		CommonActions.clickOnElementAndType(vouchertypearrow, vouchertype, "Voucher Type " + vouchertype);
		CommonActions.iClickEnter(vouchertypearrow);
		CommonActions.clickOnElementAndType(voucherlinktypearrow, voucherlinktype,
				"Voucher Link Type " + voucherlinktype);
		CommonActions.iClickEnter(voucherlinktypearrow);
		CommonActions.clickOnElementAndType(receipttxt, GlobalVariable.ReceiptId,
				"Enter the Student Receipt id is " + GlobalVariable.StudentId);
		CommonActions.iClickEnter(receipttxt);
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		Thread.sleep(4000);

	}

	public void iValidateApplicantsandRefundHeader() throws Exception {
		System.out.println("********************************* Applicant Id : " +GlobalVariable.ApplicationId);
		CommonActions.clickOnElementAndType(applidtxt, GlobalVariable.ApplicationId, "Enter the Application Id");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(refundapplsearchbtn , "I Clicking the Search Button");
		CommonActions.isDisplayed(By.xpath("//div[text() = '"+GlobalVariable.ApplicationId+"']/../.."), "Validateing the Applicant");
		CommonActions.iClickElementByLocator(feeheadrefund, "I Validate the Fee Heads Refunds");
	}

	public void iValidateFinalAdmissionLists() throws Exception {
		System.out.println("********************************* Applicant Id : " +GlobalVariable.StudentId);
		CommonActions.clickOnElementAndType(finalapplidtxt, GlobalVariable.ApplicationId, "Enter the Application Id");
		CommonActions.iClickEnter(finalapplidtxt);
		Thread.sleep(2000);
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//a[text()='"+GlobalVariable.StudentId+"']/.."), " Validating the Student ID");
		Thread.sleep(2000);
		
	}

	public void iValidateJobstateHistory(String jobname, String jobstatus) throws Exception {
		CommonActions.clickOnElementAndType(jobnamedropdown, jobname, "Select Job Name");
		CommonActions.iClickEnter(jobnamedropdown);
		CommonActions.iClickElementByLocator(jobstatedropdown, "Job state dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + jobstatus + " ']"),	"Job state is + " + jobstatus + "");
		CommonActions.iClickElementByLocator(jobsearchbtn, "Search button for Run Job");
		Thread.sleep(3000);
	}

}
