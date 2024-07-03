package com.serosoft.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class GradeProgramPage extends GlobalVariable {
	By GradeOrProgramCode = By.cssSelector("input[name = 'programCode']");
	By GradeOrProgramSquence = By.xpath("//input[@name='programSequence']");
	By GradeOrProgramName = By.xpath("//input[@name='programName']");
	By ProgramOrGradeNameToBePrinted = By.xpath("//input[@name='programNameToBePrint']");
	By BrandCampusOrAcademyLocation = By.xpath("//input[@name='academyLocation']");
	By ProgramCoordinator = By.xpath("//input[@name='coordinator']");
	By schoolPhaseOrPrgGrp = By.xpath("//input[@name='programGroup']");
	By progOrGradeCategory = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name = 'programCategory']/../../td[2]");
	By prgOrGradeDepartment = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='programDepartment']/../../td[2]");
	By PrgOrGradeMarks = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='programMarks']/../../td[2]");
	By noRadio = By.xpath(
			"//label[contains(text() , 'Is there Succeeding')]/../parent::td/div[contains(@class , 'box')]//label[text() = 'No']/../input");
	By singlecoursenoRadio = By.xpath(
			"//label[contains(text() , 'Is Single Course Program:')]/../parent::td/div[contains(@class , 'box')]//label[text() = 'No']/../input");
	By activeproradiobtn = By.xpath(
			"//label[contains(text() , 'Program Status:')]/../parent::td/div[contains(@class , 'box')]//label[text() = 'Active']/../input");
	
	
	By schooldPhaseDropdownArrow = By.xpath("//input[@name= 'programGroup']/../../td[2]");
	By save = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Save']/parent::span");
	By searchGradeProgram = By.xpath("//input[@name='programNameOrCode']");
	By closeCreateGrade = By.xpath(
			"//span[text() = 'Create Grade' and contains(@class, 'tab')]/ancestor::a/span[contains(@class , 'close')]");
	By graderow = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]");
	By gradeintake = By.xpath(
			"//div[contains(@class,'box-inner ')]//span[text()='Grade Intake' or text()='Program Batch'  or text() = 'Program Intake']/../..");
	By gradeprintname = By.xpath("//input[@name='printName']");
	By gradeintakeyear = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='intakeYear']/../../td[2]");
	By gradeseatcapacity = By.xpath("//input[@name='seatCapacity']");
	By gradeperiodtype = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='programPeriodType']/../../td[2]");
	By StartDatePicker = By.xpath("//input[@name= 'startDate']/parent::td/following-sibling::td");
	By EndDatePicker = By.xpath("//input[@name= 'tillDate']/parent::td/following-sibling::td");
	By additionaldetailstextarea = By.xpath("//textarea[@name= 'additionalRequirementDetails']");
	By assigncalendername = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='calendar']/../../td[2]");
	By SgpaorCgpa = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name='sgpaCgpaCalculationRule']/../../td[2]");
	By selectcalendernextarrow = By.xpath(
			"//div[contains(@class,'datepicker-above')]//div[contains(@class,'datepicker-header')]//a[contains(@class,'next x-datepicker-arrow')]");
	By selectenddate = By
			.xpath("//div[contains(@class,'datepicker-above')]//table[contains(@class,'inner')]//a[text()='15']");
	By TillDate = By.xpath("//input[@name='tillDate']");

	By intakedetails = By.xpath("//a[contains(@class,'default-top-active')]//span[text()='Intake Details']");

	By noRadioacconf = By.xpath(
			"//label[contains(text() , 'Advance configuration required:')]/../parent::td/div[contains(@class , 'box')]//label[text() = 'No']/../input");

	By intakeDeatilsTab = By.xpath(
			"//span[text() = 'Intake Details' and contains(@class, 'tab')]/..| //span[text() = 'Batch Details' and contains(@class, 'tab')]/..");

	By seatType = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name= 'seatType']");
	By seatCapacity = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name= 'seatCapacity']");
	By moredetails = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'More Details']/../../div[contains(@class , 'top')]");
	By addperiod = By.xpath(
			"//div[contains(@id , 'programPeriods')]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-qtip,'Add')]");
	By gradeorprogramperiodname = By.xpath("//input[@name='programPeriodName']");

	By academicterm = By.xpath("//input[@name = 'academicTerm']/../../td[2]");
	By periodStartdate = By.xpath("//input[@name = 'programPeriodStart']/../../td[contains(@class , 'unselectable')]");
	By periodEndtdate = By.xpath("//input[@name = 'programPeriodEnd']/../../td[contains(@class , 'unselectable')]");
	By periodenddate = By.xpath("//input[@name = 'programPeriodEnd']");
	By rankbasis = By.xpath("//input[@name = 'programPeriodRankBasis']");
	By enrolmentlastdate = By
			.xpath("//input[@name = 'enrollmentLastDate']/../../td[contains(@class , 'unselectable')]");
	By addSubjectPrg = By.xpath(
			"//div[contains(@id , 'programcourses')]//a[contains(@class,'x-btn') and contains(@role,'button') and contains(@data-qtip,'Add')]");
	By codeOrNameDropdown = By.xpath("//div[contains(@name, 'courseId')]/../../td/div[contains(@class , 'combo')]");
	By subjectRow = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[contains(@id, 'programcourses')]//tr[contains(@role,'row')][1]");
	By mapPeriodButton = By.xpath("//span[text() = 'Map Period']/ancestor::a");
	By subjectPeriodRow = By.xpath("//div[contains(@id, 'courseperiodmapping')]//tr[contains(@role,'row')][1]/td[1]");
	By periodMappingCheckbox = By
			.xpath("//div[contains(@id, 'courseperiodmapping')]//tr[contains(@role,'row')][1]/td[3]//img");
	By AcdemicYearArrow = By.xpath("//input[@name = 'programWiseAcademicTerm']/../../td[2]");
	By addClass = By.xpath("//span[text() = 'Add Section' or text() = 'Add Class']/ancestor::a");
	By assignCalendarArrow = By.xpath("//input[@name = 'calendar']/../../td[2]");
	By parameterisationAlert = By.xpath(
			"//div[contains(text() ,'The section creation for the selected Subjects is in progress and might take some time. Also, please note that the system will skip creating the sections for the Subjects which already exist.')]/..");
	By searchClass = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]//div[not(contains(@style,'display: none')) and contains(@class,'x-panel customSearchPanel x-box-item x-panel-default')]//span[text() = 'Search']/..");
	By marksArrow = By.xpath("//input[@name = 'programWiseCourseMarkGrade']/../../td[2]");
	By gradeIntakeArrow = By.xpath("//div[@name = 'programWiseProgram']//input");
	By className = By.xpath("//input[@name = 'usrDefinedSectionName']");
	By selectall = By.xpath("//u[text()='Select All']");
	By mapgradeperiod = By.xpath(
			"//span[text() = 'Map Grade Period']/ancestor::a | //span[text() = 'Map Program Period']/ancestor::a");
	By gradenamesearch = By.xpath("//input[contains(@name,'programsearch')]");
	By gradeselect = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//tr[contains(@role,'row')][1]//div[contains(@class,'row-checker')]");
	By addsubjectexpand = By.xpath(
			"//span[text() = 'Set Course Parameters']/ancestor::div[@data-xpath = 'courseparameterassigncoursegrid_header']//div[@data-xpath = 'header_tool']");
	By subjectname = By.xpath("//input[@name = 'courseId']/../../td[2]");
	By selectclass = By.xpath("//input[@name = 'sectionCodeId']/../../td[2]");
	By selectclassname = By.xpath("//div[contains(text(),' CSGPLH/Class A ')]");
	By selectaddteacherrow = By.xpath(
			"//table[contains(@class,'able-focused-first')]//tr[contains(@class,'row-focused')]//div[contains(text(),'PeriodName')]/../..");
	By teachernamesearch = By.xpath(
			"//body//div[contains(@class,'x-window') and contains(@style,'opacity: 1')]//input[@name='facultyId']");
	By selectteachername = By.xpath("//div[contains(text(),'Pallavi')]/..");

	By addsubjectparameter = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip='Add'][1]");
	By addclassteacher = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip='Add']//span[(contains(text(),'Add Faculty') or contains(text(),'Add Teacher'))]/ancestor::a");

	By courseCode = By.xpath("//input[@name = 'courseCode']");
	By coursenamePrinted = By.xpath("//input[@name = 'courseCodeToBePrinted']");
	By courseName = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[@name = 'courseName']");
	By weightage = By.xpath("//input[@name = 'weightage']");
	By subdepartment = By.xpath("//input[@name = 'departmentName']");
	By subdescription = By.xpath("//textarea[@name='courseShortDescription']");
	By subjecttypeArrow = By.xpath("//input[@name = 'courseMarkGrad']/../../td[2]");
	By minpassmarks = By.xpath("//input[@name = 'courseCutOff']");
	By maxpassmarks = By.xpath("//input[@name = 'courseMaxMark']");
	By saveButton = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//span[text() = 'Save' and contains(@class ,'btn')]/ancestor::a");
	By programSearchArrowRepor = By.xpath("//div[@name='programId']/../../td[3]");

	By proacmloctxt = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[contains(@name,'academyLocationId')]");
	By pronametxt = By.xpath("//input[contains(@name,'programId')]");
	By probatcharrow = By.xpath(
			"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//input[contains(@name,'batchId')]/../../td[2]");
	By coursetxtbox = By.xpath("//input[contains(@name,'courseId')]");
	By pronameforpbs = By.xpath("//input[@name='program']");
	By pbsaddbtn = By.xpath("//div[contains(@data-xpath,'form_programbatchsectiongrid_programbatchsectiongrid')]//div[contains(@data-xpath,'programbatchsectiongrid_toolbar') and contains(@class,'top')]//a[@data-xpath='toolbar_btnAdd_button']");
	By secnametxt = By.xpath("//input[@name='sectionCode']");
	By secprtnametxt = By.xpath("//input[@name='alternateName']");
	By homeroomarrow = By.xpath("//input[@name='homeRoom']/../../td[2]");
	By pbsteacher = By.xpath("//input[@name='classTeacher']");
	By pbssearchbbtn = By.xpath("//div[contains(@id,'programbatchsectionsearch')]/table[4]//span[text()='Search']/ancestor::a");
	By pbssecaddbtn = By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//a[@data-qtip='Add']//span[not(contains(text(),'Add Faculty'))]/ancestor::a[not(contains(@class,'left'))]");
	By pbssecarrow = By.xpath("//input[@name='sectionCodeId']/../../td[2]");
	By minperiod = By.xpath("//input[@name='minPeriod']");
	By maxperiod = By.xpath("//input[@name='maxPeriod']");
	By miniPrg = By.xpath("//input[@name='minProgramCourses']");
	By maxPrg = By.xpath("//input[@name='maxProgramCourses']");
	By minCredit = By.xpath("//input[@name='minProgramCredits']");
	By maxCredit = By.xpath("//input[@name='maxProgramCredits']");
	By minMandCourses = By.xpath("//input[@name='minCompulsoryCourses']");
	By maxMandCourses = By.xpath("//input[@name='maxCompulsoryCourses']");
	By minOptCourse = By.xpath("//input[@name='minOptionalCourses']");
	By maxOptCOurses = By.xpath("//input[@name='minOptionalCourses']");
	By minCGPA = By.xpath("//input[@name='cgpaRequired']");
	By sectionName = By.xpath("//input[@name = 'usrDefinedSectionName']");
	

	public void iFillBasicGradePrgDetails(String phasegroup, String category, String Evaluation, String Department,
			String location, String coordinator) throws Exception {
	
		GradeorProgramBatchName = CommonActions.randromPrgOrGradeNameIntakeGenerator();
		GlobalVariable.programgrp = phasegroup;
		try {
		CommonActions.clickOnElementAndType(GradeOrProgramCode, GradeorProgramBatchName, "Grade/Program code");
		}
		catch (Exception e) {
		CommonActions.iLogMessage("******Gade or program code is autogenerated**********");
		}
		
		CommonActions.clickOnElementAndType(GradeOrProgramSquence, CommonActions.randomNumberGenerator(5),
				"Grade sequence");
		GlobalVariable.GradeOrProgramName = CommonActions.randromPrgOrGradeNameGenerator();
		System.out.println("**************" + GlobalVariable.GradeOrProgramName);
		CommonActions.clickOnElementAndType(GradeOrProgramName, GlobalVariable.GradeOrProgramName, "PrgOrGradeName");
		CommonActions.clickOnElementAndType(ProgramOrGradeNameToBePrinted, GlobalVariable.GradeOrProgramName,
				"GrdOrPrg Name");
		GlobalVariable.academyLocation = location;
		CommonActions.clickOnElementAndType(BrandCampusOrAcademyLocation, location, "Loaction");
		CommonActions.iClickEnter(BrandCampusOrAcademyLocation);
		CommonActions.clickOnElementAndType(ProgramCoordinator, coordinator, "Coordinator value field");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + coordinator + "')]/.."), "");
		CommonActions.iClickElementByLocator(schooldPhaseDropdownArrow, "dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + GlobalVariable.programgrp + " ']"),
				"Phase grp");
		CommonActions.iClickElementByLocator(progOrGradeCategory, "Prg Category");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + category + " ']"), "Category");
		CommonActions.iClickElementByLocator(prgOrGradeDepartment, "PrgGrdDept");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + Department + " ']"), "Department");
		CommonActions.iClickElementByLocator(PrgOrGradeMarks, "PrgOfGradeMarks");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + Evaluation + " ']"), "Marks/Grade");
		CommonActions.iClickElementByLocator(noRadio, "No Succeeding radio button");
		
		CommonActions.iClickElementByLocator(singlecoursenoRadio, "single Course Program No radio button");
		CommonActions.iClickElementByLocator(activeproradiobtn , "Active program radio button");
		
		
//	program sub merchant name adding newly	
//		CommonActions.iClickElementByLocator(By.xpath("//fieldset[@data-xpath='createeditbasicprogramdetails_programOtherDetailsItemId_fieldset']//div[@data-xpath='container_tool']"), "Selecting other details options");
//		CommonActions.clickOnElementAndType(By.xpath("//input[@name='programSubMerchant']"), GlobalVariable.GradeOrProgramName, "Enter the Program sub merchant name");
		Thread.sleep(3000);
		
		CommonActions.iClickElementByLocator(save, "save button");
	}

	public void iEnterGradeInSearch() throws Exception {
		CommonActions.clickOnElementAndType(searchGradeProgram, GlobalVariable.GradeOrProgramName,
				"Search Grade or program");
		Thread.sleep(4000);
		CommonActions.iClickEnter(searchGradeProgram);
	}

	public void iValidateTheCreatedGradeOrProgram() throws Exception {
		String grade = new CommonLocatorPage().iSelectColumnAndGetText("1", "2", "normal");
		System.out.println("******************" + grade);
		if (grade.trim().equalsIgnoreCase(GlobalVariable.GradeOrProgramName)) {
			CommonActions.iLogMessage("Grade is matched in search and created successfully!!");
			Thread.sleep(4000);
		} else {
			throw new Exception("Grade is not displayed in search results");
		}
	}

	public void iClickGradeIntakeButton() throws Exception {

		CommonActions.iClickElementByLocator(gradeintake, "Click Grade Intake");
	}

	public void iAddGradeIntakeDetails(String gradeperoidtype, String intakeyear, String assigncalender,
			String calculation) throws Exception {
		CommonActions.clickOnElementAndType(gradeprintname, GlobalVariable.GradeOrProgramName, "Add Grade Print Name");
		CommonActions.iClickElementByLocator(gradeintakeyear, "Grade Intakeyear");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + intakeyear + " ']"), "GradeIntakeYear");
		CommonActions.clickOnElementAndType(gradeseatcapacity, "500", "Seat Capacity");
		CommonActions.iClickElementByLocator(gradeperiodtype, "Grade PeriodType");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + gradeperoidtype + " ']"),
				"GradePeriodType");
		
//		CommonActions.clickOnElementAndType(TillDate, "31/12/2024", "End date");	
		CommonActions.iClickElementByLocator(EndDatePicker, "End date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Next Month");
		new CommonLocatorPage().iClickButtonOfChoice("Day");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(StartDatePicker, "Start date picker");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		
		CommonActions.clickOnElementAndType(minperiod, "1", "I Enter Min Period Value");
		CommonActions.clickOnElementAndType(maxperiod, "10", "I Enter Max Period Value");
		
		
//		
//		CommonActions.clickOnElementAndType(minCredit, "1", "min credit");
//		CommonActions.clickOnElementAndType(maxCredit, "5", "max credit");
//		
//
//		CommonActions.clickOnElementAndType(miniPrg, "1", "min course");
//		CommonActions.clickOnElementAndType(maxPrg, "2", "max course");
//		
//
//		CommonActions.clickOnElementAndType(minMandCourses, "1", "min mand courses");
//		CommonActions.clickOnElementAndType(maxMandCourses, "1", "max mand courses");
//		
//
//		CommonActions.clickOnElementAndType(minOptCourse, "0", "min opt courses");
//		CommonActions.clickOnElementAndType(maxOptCOurses, "1", "max opt courses");
//		
//		CommonActions.clickOnElementAndType(minCGPA, "2", "min CGPA");
		
		
		
		CommonActions.clickOnElementAndType(additionaldetailstextarea, GlobalVariable.GradeOrProgramName,
				"Additional Details Textarea");
		CommonActions.iClickElementByLocator(noRadioacconf, "No radio");
		CommonActions.iClickElementByLocator(assigncalendername, "Assign Calender");
		GlobalVariable.assignCalendar = assigncalender;
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + assigncalender + " ']"),
				"Assign Calendername");
		Thread.sleep(4000);
		CommonActions.iClickElementByLocator(save, "save button");
	}

	public void iClickGradeIntakeDetails() throws Exception {
		CommonActions.iClickElementByLocator(intakedetails, "I Click Intake Details");
	}

	public void iFetchGradeOrProgramNameAndClickGradeIntakeTab() throws InterruptedException {
		prgOrGradeNameIntakeDetails = new CommonLocatorPage().iSelectColumnAndGetText("1", "1", "nested");
		CommonActions.iClickElementByLocator(intakeDeatilsTab, "Grade intake details tab");
		Thread.sleep(3000);
//		CommonActions.iClickElementByLocator(moredetails, "I Click More Details");
	}

	public void iSelectPrgOrGradeDetails(String option) throws InterruptedException {
		WebElement gradeOrPrgDetails = CommonActions
				.getElement(By.xpath("//div[contains(@class,'treecolumn')]//span[text() = '" + option + "']/.."));
		CommonActions.iClick(gradeOrPrgDetails, option + " is clicked");

	}

	public void iCreateSeats(List<Map<String, String>> data) throws Exception {
		for (Map<String, String> type : data) {
			Thread.sleep(2000);
			new CommonLocatorPage().iClickActionButtonInsideNestedTabs("Add");
			String seat = type.get("seattype");
			System.out.println("**************" + seat);
			String capacity = type.get("capacity");
			System.out.println("**************" + capacity);
			CommonActions.clickOnElementAndType(seatType, seat, "Seat type");
			CommonActions.iClickEnter(seatType);
			CommonActions.clickOnElementAndType(seatCapacity, capacity, "capacity");
			new CommonLocatorPage().iClickSaveButton("window");
			new CommonLocatorPage().iValidateAlert();
		}

	}

	public void iClickmoredetails() throws Exception {
		CommonActions.iClickElementByLocator(moredetails, "I Click More Details");
	}

	public void iClickonAddPeriods(String rank, String year) throws Exception {
		CommonActions.iClickElementByLocator(addperiod, "I Click On Add Period");
		Thread.sleep(3000);
		prgOrGradePeriodName = CommonActions.randromProorGradePeriodNameGenerator();
		CommonActions.clickOnElementAndType(gradeorprogramperiodname, prgOrGradePeriodName,
				"Grade/Program Period Name");
		CommonActions.iClickElementByLocator(academicterm, "Academic intake year");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + year + " ']"),
				"Selected intake year " + year + "");
		CommonActions.iClickElementByLocator(periodStartdate, "Start Date");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
//		CommonActions.clickOnElementAndType(periodenddate, CommonActions.getTodayDate("2024"), "Last date");
		CommonActions.iClickElementByLocator(periodEndtdate, "End Date");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		Thread.sleep(3000);
		CommonActions.iClickEnter(periodenddate);	
		CommonActions.iClickElementByLocator(enrolmentlastdate, "Enrolement End Date");
		new CommonLocatorPage().iClickButtonOfChoice("Today");
		CommonActions.iClickElementByLocator(By.xpath("//table[@data-xpath = 'radiogroup_whetherPlacementPeriod_radiofield']//label[text() = 'No']/../input"), "No Placement");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(rankbasis, rank, "Mark Basis");
		CommonActions.iClickEnter(rankbasis);
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iAddSubjects(String subject) throws InterruptedException {
//		GlobalVariable.Subname = subject;
		CommonActions.iClickElementByLocator(addSubjectPrg, "I Click On Add Subjects");
		CommonActions.iClickElementByLocator(codeOrNameDropdown, "Course/SUbject name dropdown");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text() , '" + GlobalVariable.CoursesubjectName + "')]"), "Clicked subject");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(codeOrNameDropdown, "Course/SUbject name dropdown");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void selectSUbject() throws InterruptedException {
		CommonActions.iClickElementByLocator(subjectRow, "subject to be mapped is selected");
	}

	public void iClickMapPeriodButtonAndMapped() throws InterruptedException {
		CommonActions.iClickElementByLocator(mapPeriodButton, "Map period");
		CommonActions.iClickElementByLocator(subjectPeriodRow, "Subject period row for mapping");
		CommonActions.iClickElementByLocator(periodMappingCheckbox, "Checkbox");
		new CommonLocatorPage().iClickSaveButton("nested");
	}

	public void iSearchedClass(String year, String marktype) throws Exception {

		CommonActions.iClickElementByLocator(AcdemicYearArrow, "Academic year dropdown");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + year + " ']"),
				"year is selected " + year + "");

		CommonActions.iClickElementByLocator(marksArrow, "marks arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' " + marktype + " ']"),
				"Type is selected " + marktype + "");

		CommonActions.clickOnElementAndType(gradeIntakeArrow, GlobalVariable.GradeOrProgramName, "Grade prg name");
		
//		CommonActions.iClickElementByLocator(By.xpath("//div[@name = 'programWiseProgram']/parent::td/../td[3]"), "Grade prg name Arrow");
//		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.GradeOrProgramName+"')]"), "Grade prg name");
		
		CommonActions.iClickElementByLocator(selectall, "Select All Check Mark");
		// CommonActions.iClickElementByLocator(By.xpath("//span[contains(text() ,
		// 'Section List')]"), "List");
//		CommonActions.clickOnElementAndType(gradeIntakeArrow, GlobalVariable.GradeOrProgramName, "Grade prg name");
		CommonActions.iClickElementByLocator(searchClass, "Search button");
	}

	public void iAddClassDeatils() throws Exception {
		classNames = CommonActions.randromClassesNameGeneretor();
		Thread.sleep(6000);
		// CommonActions.iScrollToTheElementByLocator(By.xpath("//body/div[contains(@class,
		// 'contentPanel')]/div[contains(@class,
		// 'x-panel-body')]/div[not(contains(@style,'display: none')) and
		// contains(@class,x-panel)]//span[contains(text(),'Total Records')]"), "Total
		// Records");
		Thread.sleep(2000);
		new CommonLocatorPage().iSelectRow("1", "nested");
		CommonActions.iClickElementByLocator(addClass, "Add class button");
		CommonActions.iClickElementByLocator(assignCalendarArrow, "Assigned calender");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(), '" + GlobalVariable.assignCalendar + "')]"), "calender name");
		
		CommonActions.iClickElementByLocator(By.xpath("//table[@data-xpath='radiogroup_definedSection_radiofield']//label[contains(text(),'User-defined')]/../input"),
                "User-defined radio button");
		Thread.sleep(3000);
//		CommonActions.clickOnElementAndType(className, classNames, "class name");
		CommonActions.clickOnElementAndType(sectionName, classNames, "class name");
		
		new CommonLocatorPage().iClickSaveButton("normal");
	}

	public void iValidateParameterizationAlert() throws Exception {
		CommonActions.iValidateElementPresent(parameterisationAlert);
	}

	public void iClickonMapGradePeriod() throws Exception {
		new CommonLocatorPage().iSelectRow("1", "nested");
		CommonActions.iClickElementByLocator(mapgradeperiod, "Map Grade Period button");
		CommonActions.clickOnElementAndType(gradenamesearch, GlobalVariable.GradeOrProgramName, "class name");
		CommonActions.iClickEnter(gradenamesearch);
		new CommonLocatorPage().iSelectColumn("1", "1", "nested");
		new CommonLocatorPage().iClickButtonOfChoice("Next");
		new CommonLocatorPage().iSelectColumn("1", "1", "nested");
		new CommonLocatorPage().iClickButtonOfChoice("Submit nested");
	}

	public void iAddsubjectParameter() throws Exception {
		CommonActions.iClickElementByLocator(addsubjectexpand, "Add Subject Parameter and Class teacher");
		WebElement sub = CommonActions.getElement(subjectname);
		Thread.sleep(4000);
		CommonActions.iScrollToTheElement(sub, "subject name dropdown");
		CommonActions.iClickElementByLocator(subjectname, "I Select subject Name Arrow");
		CommonActions.iClickElementByLocator(By.xpath(
				"//div[contains(text() , '" + GlobalVariable.CoursesubjectName + "') and contains(@class , 'item')]"),
				"I Select Subject");
		Thread.sleep(2000);
	
	}

	public void iAddClassTeacher() throws Exception {
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(@id , 'courseparameterassigngrid')]//div[contains(text() , '"
						+ GlobalVariable.CoursesubjectName + "')]/../.."),
				"Select add teache rrow");
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(addclassteacher, "I Add Class Teacher");
	}

	public void iAddTeacherName(String teachername) throws Exception {
		CommonActions.clickOnElementAndType(teachernamesearch, teachername, "Search Class teacher name");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'" + teachername + "')]/.."),
				"I Add Class Teacher Name");
		new CommonLocatorPage().iClickSaveButton("window");
	}

	public void ClickGradeProgramIntakeDetails() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath(
				"//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[contains(text() , '"
						+ GlobalVariable.GradeOrProgramName + "')]/../.."),
				"Select Program in List");
		Thread.sleep(3000);
	}

	public void AddCourseOrSubject(String type, String department, String minmarks, String maxmarks, String coursetype) throws Exception {

		CoursesubjectCode = CommonActions.randomSubjectCourseGeneration();
		CoursesubjectName = CommonActions.randomSubjectCourseCodeGeneration();

		CommonActions.clickOnElementAndType(courseCode, GlobalVariable.CoursesubjectCode, "Enter Course code Name");
		CommonActions.clickOnElementAndType(courseName, GlobalVariable.CoursesubjectName, "Enter Course Subject Name");
		CommonActions.iLogMessage("Course name is " + CoursesubjectName );
		CommonActions.clickOnElementAndType(subdepartment, department, "Enter Department Name");		
		Thread.sleep(3000);
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text() ,'" + department + "')]/.."),
				"Enter Course department");
		CommonActions.clickOnElementAndType(weightage, "100", "Enter Weight Percentage");
		CommonActions.clickOnElementAndType(subdescription, GlobalVariable.CoursesubjectName,
				"Enter Subject Descriptiion data");
		CommonActions.iClickElementByLocator(subjecttypeArrow, "Select Sub Type Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text() ,'" + type + "')]"),
				"Select Subject Type Marks or Grade");
		Thread.sleep(2000);
		CommonActions.clickOnElementAndType(minpassmarks, minmarks, "Enter Subject Min pass Marks");
		CommonActions.clickOnElementAndType(maxpassmarks, maxmarks, "Enter Subject Max pass Marks");
		CommonActions.iClickEnter(maxpassmarks);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name = 'assignSectionType']"), "course type");
		CommonActions.iClickElementByLocator(By.xpath("//div[text() = ' "+coursetype+" ']"), "option is "+coursetype+"");
		CommonActions.iClickElementByLocator(saveButton, "Clicking on Save Button");

	}

	public void validateProgramInReportPage() throws Exception {
		CommonActions.iClickElementByLocator(programSearchArrowRepor, "arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[contains(text(),'" + GlobalVariable.GradeOrProgramName + "')]/.."), "option");
		Thread.sleep(4000);
		CommonActions.iClickElementByLocator(By.xpath("//input[@name = 'batchId']"), "batch id");
		new CommonLocatorPage().iClickButtonOfChoice("SearchNested");
		String prog = new CommonLocatorPage().iSelectColumnAndGetText("1", "3", "nested").trim();
		if (prog.contains(GlobalVariable.GradeOrProgramName)) {
			CommonActions.iLogMessage("Program name is present in search results");
		} else {
			throw new Exception("Program name is not present in the search results");
		}
	}

	public void iSlectSectionName(String name) throws InterruptedException {
		CommonActions.iClickElementByLocator(By.xpath("//span[contains(text(), '" + name + "')]/.."),
				"option is " + name + "");
	}
	
	public void iAddLocandProgramname() throws Exception {
		CommonActions.clickOnElementAndType(proacmloctxt, GlobalVariable.academyLocation, "I Select Academy Location");
		CommonActions.iClickEnter(proacmloctxt);
		CommonActions.clickOnElementAndType(pronametxt, GlobalVariable.GradeOrProgramName, "I Select Program Name");
		CommonActions.iClickEnter(pronametxt);
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(probatcharrow, "I Select Program Bacth Name Arrow");
		CommonActions.iClickElementByLocator(
				By.xpath("//div[text()=' " + GlobalVariable.prgOrGradeNameIntakeDetails + " ']"),
				"I Select Program Bacth Name");
		new CommonLocatorPage().iClickButtonOfChoice("Search");

	}

	public void ivalidateReportPage() throws Exception {
		CommonActions.isDisplayed(
				By.xpath("//div[text() = '" + GlobalVariable.prgOrGradeNameIntakeDetails + "']/ancestor::tr"),
				"Batch is visible");
		Thread.sleep(3000);
	}

	public void iAddLocandCoursename() throws Exception {
		CommonActions.clickOnElementAndType(proacmloctxt, GlobalVariable.academyLocation, "I Select Academy Location");
		CommonActions.iClickEnter(proacmloctxt);
		CommonActions.clickOnElementAndType(coursetxtbox, GlobalVariable.CoursesubjectName,
				"I Select Course Subject Name");
		CommonActions.iClickEnter(coursetxtbox);
		new CommonLocatorPage().iClickButtonOfChoice("Search");

	}

	public void iSlectSectionNameFromMenu(String name) throws InterruptedException {
//		CommonActions.iClickElementByLocator(By.xpath("//span[text() = 'Select Reports']/../../div[contains(@class , 'x-tool-before-title')]"),	"arrow");
		CommonActions.iClickElementByLocator(By.xpath("//span[contains(text(), '" + name + "')]/.."),	"option is " + name + "");
	}

	public void iValidatereportHeader(String header) throws Exception {
		CommonActions.isDisplayed(By.xpath(
				"//span[text() = '" + header + "']/parent::div[contains(@id , 'report') or contains(@id , 'grid')]"),
				header);
		Thread.sleep(3000);
	}

	public void iSlectPrgReportSectionNameFromMenu(String name) throws InterruptedException {
		CommonActions.iClickElementByLocator(
				By.xpath(
						"//span[text() = 'Select Program Report']/../../div[contains(@class , 'x-tool-before-title')]"),
				"arrow");
		CommonActions.iClickElementByLocator(By.xpath("//span[contains(text(), '" + name + "')]/.."),
				"option is " + name + "");
	}

	public void ivalidatePeriodsAppear() throws Exception {
		CommonActions.isDisplayed(By.xpath(
				"(//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[text() = '"
						+ GlobalVariable.GradeOrProgramName + "' ]/ancestor::tr)[1]"),
				"Batch is visible");
		Thread.sleep(1000);
	}
	
	public void ivalidateSectionsAppear() throws Exception {
		CommonActions.isDisplayed(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//span[text() = 'Sections Associated' or text() = 'Classes Associated']"), "Section is visible");
	}

	public void iValidateCourseReport(String courcereportname) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//span[contains(text(), '" + courcereportname + "')]/.."), "option is " + courcereportname + "");
	}

	public void iValidateCoursecomponentReport(String courcecomponentreportname) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//body/div[contains(@class, 'contentPanel')]/div[contains(@class, 'x-panel-body')]/div[not(contains(@style,'display: none')) and contains(@class,x-panel)]//div[contains(@contains,x-tabpanel-child)]//div[contains(id,tabpanel)]/div[not(contains(@style,'display: none')) and contains(@class, 'x-tabpanel-child')]//div[@data-xpath = 'searchresultgrid_header']"), "option is " + courcecomponentreportname + "");
	}

	public void iSlectcoursereportSectionName() throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//span[text() = 'Select Reports']/../../div[contains(@class , 'x-tool-before-title')] | //span[text() = 'Select Course Report']/../../div[contains(@class , 'x-tool-before-title')]"),	"I Clicking the Arrow");
		
	}

	public void iAddPbsDetails(String homeroom, String teachername) throws Exception {
		CommonActions.clickOnElementAndType(pronameforpbs, GlobalVariable.GradeOrProgramName, "I Add Program Name");
		CommonActions.iClickEnter(pronameforpbs);
		CommonActions.iClickElementByLocator(pbssearchbbtn, "I Select Search Button");
		new CommonLocatorPage().iSelectRow("1", "nested");
		Thread.sleep(3000);
		
		CommonActions.iClickElementByLocator(pbsaddbtn, "I Click Add Button");
		
		GlobalVariable.PBSSectionName = CommonActions.randomSectionNameGeneration();
		
		System.out.println("####################################"+GlobalVariable.PBSSectionName);
		CommonActions.clickOnElementAndType(secnametxt, GlobalVariable.PBSSectionName, "I Enter Section Nmae");
		CommonActions.clickOnElementAndType(secprtnametxt, GlobalVariable.PBSSectionName, "I Print Section Nmae");
		CommonActions.iClickElementByLocator(homeroomarrow, "I Select Home room Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()=' "+homeroom+" ']"), "I Select HoomRoom Value is "+homeroom);
		CommonActions.clickOnElementAndType(pbsteacher, teachername, "I Enter TEacher Nmae");
		CommonActions.iClickEnter(pbsteacher);
		new CommonLocatorPage().iClickSaveButton("window");
		
	}

	public void iClickAddSectionbtn() throws Exception {
		Thread.sleep(5000);
		CommonActions.iClickElementByLocator(pbssecaddbtn, "I Click on Add button");
		Thread.sleep(5000);
		CommonActions.iClickElementByLocator(pbssecarrow, "I Click on section arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),' "+GlobalVariable.PBSSectionName+" ')]"), "I Click on section arrow");
		new CommonLocatorPage().iClickSaveButton("window");
		
	}

	public void iSlectSectionNameFromFeeReportMenu(String name) throws Exception {
		CommonActions.iClickElementByLocator(By.xpath("//span[text()= '"+name+"' and contains(@class,'tree-node-text')]/.."),	"option is " + name + "");
		
	}
	
	

}
