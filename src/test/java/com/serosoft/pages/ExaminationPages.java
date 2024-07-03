package com.serosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class ExaminationPages extends GlobalVariable {

	By addforexambtn = By.xpath(
			"//div[contains(@id , 'toolbar')]//a[contains(@class,'x-btn') and contains(@role,'button')and contains(@data-xpath,'searchResult') and contains(@data-qtip,'Add')]");
	By assemnametxt = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='sequenceName']");
	By assignprogramtxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='program']");
	By assignprobatchtxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='batch']/../../td[2]");
	By assessmenttypearrow = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='evaluationType']/../../td[2]");
	By assignassessmenttxtboxarrow = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[@name='seqName']/../../td[3]");
	By assignassessmenttxtbox = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//div[@name='seqName']//input");
	By acadterminschemesrc = By.cssSelector("input[name = 'assessmentSchemeAcademicTerm']");

	By schemetype = By.xpath("//input[@name='evaluationPlanType']/../../td[2]");
	By coursesrch = By.xpath("//input[@name='courseId' and contains(@class,'required-field')]/../../td[2]");
	By assessmentnametxt = By.xpath("//input[@name='evaluationPlanNumber']");
	By roundingmodedrpdwn = By.xpath("//input[@name='roundingMode']/../../td[2]");
	By acadtermdd = By.xpath("//input[@name='academicTerm']/../../td[2]");
	By assessschtxt = By.xpath("//input[@name='evaluationplanno']/../../td[2]");
	
	By mainexpandacdbtn = By.xpath("//span[text() = 'ACADEMICS']/../img[contains(@class , 'expander')]");	
	By subtypearrow = By.xpath("//input[@name = 'courseComponentAcademic']/../../td[2]");
	By methodarrow = By.xpath("//input[@name = 'sequenceHeaderId']/../../td[2]");
	By criticalradiobtnyes = By.xpath("//label[text() = 'Whether Passing Critical:']/../../div[contains(@class , 'box')]//label[text() = 'Yes']/preceding-sibling::input");
	By failmarkstxt = By.xpath("//input[@name = 'failMarksToBeAwarded']");
	By reretitionradiobtn = By.xpath("//input[@name = 'repetitionType']/../../td[2]");
	By eventlevelvalue = By.xpath("//div[contains(text() , 'Course Level' )]");
	By minmarkstxt = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'minMarksOrGradeNumber']");
	By maxmarkstxt =By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'maxMarksOrGradeNumber']");
	By weighttxt = By.xpath("//input[@name='weightage']");
	
	
	
	public void iClickAddAssessment() throws Exception {

//		CommonActions.iClickElementByLocator(addforexambtn, "I Click Add buttonn for Assessment Master");
//		Thread.sleep(3000);
		AssessmenMethodtName = CommonActions.randomAssessmentNameGeneration();
		CommonActions.clickOnElementAndType(assemnametxt, GlobalVariable.AssessmenMethodtName,
				"I Enter the assessment Name in the Text Box");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void iClickAssignAssessmenttype(String type) throws Exception {
		CommonActions.iClickElementByLocator(addforexambtn, "I Click Add buttonn for Assessment Master");
		CommonActions.clickOnElementAndType(assignprogramtxtbox, GlobalVariable.GradeOrProgramName,
				"I Select Program name");
		Thread.sleep(2000);
		CommonActions.iClickEnter(assignprogramtxtbox);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(assignprobatchtxtbox, "I Select  Program Batch Name");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.GradeorProgramBatchName + " ']/.."),
				"I Select Program Bacth Name");
		CommonActions.iClickElementByLocator(assessmenttypearrow, "I Select Assessment type");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + type + " ' and not(contains(@class,'selected'))]"),
				"I Select Program Bacth Name");
		Thread.sleep(2000);
//		CommonActions.clickOnElementAndType(assignassessmenttxtbox, GlobalVariable.AssessmenMethodtName, "I Select Assign AssessmentMethod Name");
		CommonActions.iClickElementByLocator(assignassessmenttxtboxarrow, "I Select  Assign Assessment Method Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()='" + GlobalVariable.AssessmenMethodtName
						+ "' and not(contains(@class,'item-over'))]/ancestor::li/div[1]"),
				"I Select Assign AssessmentMethod Name");

		new CommonLocatorPage().iClickSaveButton("window");
		;
	}

	public void iVerifyAssessmentMethod(String type) throws Exception {
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='program']"), GlobalVariable.GradeOrProgramName,
				"I Select Program name");
		CommonActions.iClickEnter(By.xpath("//input[@name='program']"));
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='batch']/../../td[2]"),
				"I Select  Program Batch Name");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.GradeorProgramBatchName + " ']/.."),
				"I Select Program Bacth Name");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationType']/../../td[2]"),
				"I Select Assessment type");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + type + " ' and not(contains(@class,'selected'))]"),
				"I Select Program Bacth Name");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath(
				"//table[@data-xpath='assignsequencesdropdown_fieldcontainer']//span[text()='Search']/ancestor::a"),
				"Selecting the Search button");

	}

	public void iFilltheAssessmentSchemeDetails(String type, String mode, String acadterm) throws Exception {

		GlobalVariable.AssessmenntSchemeName = CommonActions.randomAssessmentSchemeNameGeneration();
		System.out.println("************Assessment scheme Name is : "+AssessmenntSchemeName);

		CommonActions.iClickElementByLocator(schemetype, "Selecting scheme type dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"),
				"Selecting the Assessment Scheme");
		CommonActions.iClickElementByLocator(coursesrch,"Clicking the Course Name for Search");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.CoursesubjectName+"')]"),"Clicking the Course Name for Search");
		
//		CommonActions.clickOnElementAndType(coursesrch, GlobalVariable.CoursesubjectName.replace("SubName ", "").trim(),"Enter the Course Name for Search");
//		CommonActions.iClickEnter(coursesrch);
		CommonActions.clickOnElementAndType(assessmentnametxt, GlobalVariable.AssessmenntSchemeName,
				"Enter the Assessment Name");
		CommonActions.iClickElementByLocator(roundingmodedrpdwn, "Selecting Mode dropdown");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + mode + " ']"),
				"Selecting Rounding Mode type");
		CommonActions.iClickElementByLocator(acadtermdd, "Clicking Academic term dropdown arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' " + acadterm + " ']"),
				"Selecting Academic Term");

		new CommonLocatorPage().iClickSaveButton("normal");
	}

	public void iSearchAssessmentSchemeName(String type, String acadterm) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationplantype']/../../td[2]"),
				"clicking Assessment Scheme type dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' " + type + " ']"),
				"Selecting Assessment scheme type");
		Thread.sleep(2000);
//		CommonActions.clickOnElementAndType(By.xpath("//input[@name='evaluationplanno']"), GlobalVariable.AssessmenntSchemeName, "Selecting Assessment Scheme Name");
//		Thread.sleep(4000);
//		CommonActions.iClickEnter(assessschtxt);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='assessmentSchemeAcademicTerm']/../../td[2]"),
				"Clicking Academic term dropdown");
		Thread.sleep(2000);
		try {
			System.out.println("Inside the try block");
			
			CommonActions.clickOnElementAndType(acadterminschemesrc, acadterm, "Academic term");
			CommonActions.iClickEnter(acadterminschemesrc);

		} catch (Exception e) {
			System.out.println("Inside the catch block");
			CommonActions.iClickElementByLocator(
					By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' 2023 ']"),
					"Selecting Academic Term");
		}

		Thread.sleep(2000);
		//CommonActions.iClickElementByLocator(assessschtxt, "Clicking scheme dropdown");

		try {
			System.out.println("Inside the try block");
			System.out.println(GlobalVariable.AssessmenntSchemeName.replace("Assessment Scheme", "").trim());
			CommonActions.clickOnElementAndType(By.cssSelector("input[name='evaluationplanno']"), GlobalVariable.AssessmenntSchemeName.replace("Assessment Scheme", "").trim(), "Selecting Assessment Scheme Name");
			Thread.sleep(2000);
			CommonActions.iClickEnter(By.cssSelector("input[name = 'evaluationplanno']"));
		} catch (Exception e) {
			System.out.println("Inside the Catch block");
			WebElement ele = CommonActions
					.getElement(By.xpath("//div[text()=' " + GlobalVariable.AssessmenntSchemeName + " ']"));
			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
		}

	}

	public void iSelectAssessmentScheme() throws Exception {
		try{CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'"+GlobalVariable.AssessmenntSchemeName.replace("Assessment Scheme", "").trim()+"')]/ancestor::tr"),
				"Selecting Assessment Scheme Name in the List");
		}catch (Exception e) {
			System.out.println("Inside the Catch block");
			WebElement ele = CommonActions
					.getElement(By.xpath("//div[contains(text(),'"+GlobalVariable.AssessmenntSchemeName.replace("Assessment Scheme", "").trim()+"')]/ancestor::tr"));
			CommonActions.iClickJSE(ele, "Selecting the value using webelement");
			CommonActions.highlightElementRed(ele, "Selecting ele");
		}

	}

	public void iSelectAcademicTerm(String term) throws Exception {
		CommonActions.iClickElementByLocator(acadtermdd, "Clicking Academic term dropdown arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@class,'x-boundlist-above')]//div[text()=' " + term + " ']"),
				"Selecting Academic Term");

	}

	public void iMappingLocation() throws Exception {
		CommonActions.clickOnElementAndType(By.xpath("//input[@name='academyLocation']"),
				GlobalVariable.academyLocation, "Enter the Academic Location");
		CommonActions.iClickElementByLocator(
				By.xpath("//span[text() = 'Save']/ancestor::a[@data-xpath='fieldcontainer_btnLinkAlItemId_button']"),
				"Clicking Save Button");
	}

	public void iMappingCourse() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//div[@data-xpath='coursemappingtabview_gridview']//div[text()='"
						+ GlobalVariable.CoursesubjectName + "']/ancestor::tr/td[1]/div/div"),
				"Selecting the Mapping course");

	}

	public void iMappingVariantCourse() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//div[@data-xpath='eligiblecoursevariantgrid_gridview']//div[text()='"+GlobalVariable.CoursesubjectName+"']/ancestor::tr/td[1]/div/div"),
				"Selecting the Mapping course variant in the list");
		CommonActions.iClickElementByLocator(
				By.xpath("//span[text() = 'Save']/ancestor::a[@data-xpath='toolbar_btnLinkCVItemId_button']"),
				"Clicking Save Button");
	}

	public void iAddAssessmentschemeHierarchy() throws Exception{
		
		// ########################Adding the Assessment Type###################
		CommonActions.iClickElementByLocator(By.xpath("//span[text()='ACADEMICS']"), "Selecting the Assessment hierarchey");
//		CommonActions.iClickElementByLocator(addbtn, "Clicking add button");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.iClickElementByLocator(By.xpath("//input[@name='evaluationTypeAcademic']/../../td[2]"), "Selecting the assessment type Name arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+GlobalVariable.AssessmenntType+" ']"), "Selecting the assessment Type Name");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		Thread.sleep(3000);
//		CommonActions.clickOnElementAndType(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//input[@name = 'printNameInMarksheet']"), GlobalVariable.AssessmenntSchemeName, "Enter the Assessment Name");
//		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
//		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
//		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
//		CommonActions.iClickElementByLocator(eventlevelvalue, "Clicking Repettion Event level ");
		
		new CommonLocatorPage().iClickSaveButton("nested");
		Thread.sleep(3000);
		
		// ######################## Adding the Assessment SubType ###################
		CommonActions.iClickElementByLocator(mainexpandacdbtn, "Selecting the Academics for Adding Assessment Type");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = '"+GlobalVariable.AssessmenntType+"']/.."), "Clicking Assessment Type");
		new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
		CommonActions.iClickElementByLocator(subtypearrow, "Select Assessment Sub type arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' "+GlobalVariable.AssessmenntSubType+" ']"), "Select Assessment Sub type");
		CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
		CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
		CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
		CommonActions.iClickElementByLocator(criticalradiobtnyes, "Selecting the Passing Critical marks Radio btn");
		CommonActions.clickOnElementAndType(failmarkstxt, "0", "Enter the Fail Marks");
		CommonActions.iClickElementByLocator(reretitionradiobtn, "Clicking Repettion dropdown arrow");
		CommonActions.iClickElementByLocator(eventlevelvalue, "Clicking Repettion Event level ");
		
		new CommonLocatorPage().iClickSaveButton("nested");
		
		// ######################## Adding the Method ###################
		
				CommonActions.iClickElementByLocator(By.xpath("//span[(text() = '"+GlobalVariable.AssessmenntType+"')]/../img[contains(@class , 'expander')]"), "Selecting the Assessment Type for Adding the Assessment SubType");
				Thread.sleep(2000);
				CommonActions.iClickElementByLocator(By.xpath("//span[text() = '"+GlobalVariable.AssessmenntSubType+"']/.."), "Clicking Assessment SubType");
				new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
				CommonActions.iClickElementByLocator(methodarrow, "Select Assessment Method type arrow");
				CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' "+GlobalVariable.AssessmenMethodtName+" ']"), "Select Assessment Sub type");
				CommonActions.clickOnElementAndType(weighttxt, "100", "Enter the Weight age Marks");
				
				
				CommonActions.clickOnElementAndType(minmarkstxt, "40", "Enter the Min Pass Marks");
				CommonActions.clickOnElementAndType(maxmarkstxt, "100", "Enter the Max Pass Marks");
				new CommonLocatorPage().iClickSaveButton("nested");
		
	}

}
