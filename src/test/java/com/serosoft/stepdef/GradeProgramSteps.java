package com.serosoft.stepdef;

import java.util.List;
import java.util.Map;

import com.appium.commonactionmethods.CommonActions;
import com.serosoft.pages.CommonLocatorPage;
import com.serosoft.pages.GradeProgramPage;
import com.serosoft.pages.LeadDashboardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GradeProgramSteps {

	@And("I fill the basic details for creating the grade or program using {string},{string},{string},{string},{string},{string}")
	public void iCreateGradeOrProgram(String phasegroup, String category, String Evaluation, String department,
			String location, String coordinator) throws Exception {
		new GradeProgramPage().iFillBasicGradePrgDetails(phasegroup, category, Evaluation, department, location,
				coordinator);
	}

	@Given("I entered the created grade or program name")
	public void iEnteredGradeProgram() throws Exception {
		new GradeProgramPage().iEnterGradeInSearch();
	}

	@Then("I can see the Grade or program in search results")
	public void iValidatedCreatedGradeProgram() throws Exception {
		new GradeProgramPage().iValidateTheCreatedGradeOrProgram();
	}

	@Given("I click on grade or program intake button")
	public void iClickGradeProgramIntakeButton() throws Exception {
		new GradeProgramPage().iClickGradeIntakeButton();
	}

	@And("I add program or grade details with {string},{string},{string},{string}")
	public void iAddGradeDetails(String gradeperoidtype, String intakeyear, String assigncalender, String calculation)
			throws Exception {
		new GradeProgramPage().iAddGradeIntakeDetails(gradeperoidtype, intakeyear, assigncalender, calculation);
	}

	@Given("I click on grade or program intake details")
	public void iClickGradeProgramIntakeDetails() throws Exception {
		new GradeProgramPage().ClickGradeProgramIntakeDetails();
	}

	@And("I click on grade or program intake details option")
	public void iClickGradeIntakeDetails() throws Exception {
		new GradeProgramPage().iClickGradeIntakeDetails();
	}

	@And("I click on {string} in grade intake details")
	public void iSelectReportType(String type) throws InterruptedException {

		new GradeProgramPage().iSelectPrgOrGradeDetails(type);
	}

	@Given("I click on grade or program intake details tab")
	public void iClickGradeProgramIntakeDetailsTab() throws Exception {
		new GradeProgramPage().iFetchGradeOrProgramNameAndClickGradeIntakeTab();
	}

	@And("I create seats for grade or program")
	public void iCreateSeats(List<Map<String, String>> data) throws Exception {

		new GradeProgramPage().iCreateSeats(data);
	}

	@Given("I click on grade or program periods more details")
	public void iClickGradeorProgramperiods() throws Exception {
		new GradeProgramPage().iClickmoredetails();
	}

	@And("I Fill the periods details {string},{string}")
	public void iClickonCreatePeriods(String rank, String year) throws Exception {
		new GradeProgramPage().iClickonAddPeriods(rank, year);
	}

	@And("I Fill the subjects details with {string}")
	public void iClickonCreateSubjects(String subjectname) throws Exception {
		new GradeProgramPage().iAddSubjects(subjectname);
	}

	@And("I Click on {string} and {string}in manage subject class")
	public void iClickonAcademicTermAndMarks(String academicterm, String type) throws Exception {
		new GradeProgramPage().iSearchedClass(academicterm, type);
	}

	@And("I Click on add class and AssignCalender fill details")
	public void iClickonAssignCalenderandSearch() throws Exception {
		new GradeProgramPage().iAddClassDeatils();
	}

	@And("I can see the course parameterization alert")
	public void iSeeCourseParameter() throws Exception {
		new GradeProgramPage().iValidateParameterizationAlert();

	}

	@Given("I select the subject")
	public void selectSubject() throws Exception {
		new GradeProgramPage().selectSUbject();
	}

	@Then("I map the subject with period")
	public void iClickedOnMapPeriod() throws Exception {
		new GradeProgramPage().iClickMapPeriodButtonAndMapped();

	}

	@And("I Click on map grade period")
	public void iClickMapGradePeriod() throws Exception {
		new GradeProgramPage().iClickonMapGradePeriod();
	}

	@And("I click on add and select subject")
	public void iAddsubjectParameter() throws Exception {
		new GradeProgramPage().iAddsubjectParameter();
	}

	@Given("I Click on add class teacher button")
	public void iClickAddTeacher() throws Exception {
		new GradeProgramPage().iAddClassTeacher();
	}

	@And("I select {string} name")
	public void iAddTeacherName(String teachername) throws Exception {
		new GradeProgramPage().iAddTeacherName(teachername);
	}

	@And("I fill the mandatory details for course or subject of {string},{string},{string},{string},{string}")
	public void iAddCourseOrSubject(String type, String department, String minmarks, String maxmarks , String coursetype) throws Exception {
		new GradeProgramPage().AddCourseOrSubject(type, department, minmarks, maxmarks, coursetype);
	}

	@Then("I validate the program is appearing in search result.")
	public void iValidateProgramInReportDashboard() throws Exception {
		new GradeProgramPage().validateProgramInReportPage();
	}
	
	@And("I select {string} from dashboard section")
	public void iSelectTheReportDashboardSection(String name) throws InterruptedException {
		new GradeProgramPage().iSlectSectionName(name);
	}
	
	@And("I academy location and program for program report")
	public void iAddLocandProgramname() throws Exception {
		new GradeProgramPage().iAddLocandProgramname();
	}
	
	@Then("I validate the batches appear")
	public void iValidateProgramReport() throws Exception {
		new GradeProgramPage().ivalidateReportPage();
	}
	
	@And("I academy location and coursename for Course report")
	public void iAddLocandCoursename() throws Exception {
		new GradeProgramPage().iAddLocandCoursename();
	}
	

	@And("I select {string} from dashboard section from menu")
	public void iSelectTheReportDashboardSectionOpenMenu(String name) throws InterruptedException {
		new GradeProgramPage().iSlectSectionNameFromMenu(name);
	}
	
	@Then("I validate the {string} is appearing in the search result.")
	public void iValidateReport(String prosectionname) throws Exception {
		new GradeProgramPage().iValidatereportHeader(prosectionname);
	}
	

	@And("I select {string} from dashboard section from the menu")
	public void iSelectTheReportDashboardSectionFromTheMenu(String name) throws InterruptedException {
		new GradeProgramPage().iSlectPrgReportSectionNameFromMenu(name);
	}
	
	@Then("I validate the periods appear")
	public void iValidatePeriodsAppear() throws Exception {
		new GradeProgramPage().ivalidatePeriodsAppear();
	}
	
	@Then("I validate the section appear")
	public void iValidateSectionAppear() throws Exception {
		new GradeProgramPage().ivalidateSectionsAppear();
	}	

	@Then("I Validate the {string} from course report")
	public void iValidateCourseReport(String courcereportname) throws Exception {
		new GradeProgramPage().iValidateCourseReport(courcereportname);
	}
	
	@Then("I Validate the {string} from course component report")
	public void iValidateCoursecomponentReport(String courcecomponentreportname) throws Exception {
		new GradeProgramPage().iValidateCoursecomponentReport(courcecomponentreportname);
	}
	
	@And("I select arrow from course report dashboard section")
	public void iSelectcourseReportDashboardSection() throws Exception {
		new GradeProgramPage().iSlectcoursereportSectionName();
	}
	
	@And("I add pbs and {string},{string} fill the details")
	public void iAddPbsDetails(String homeroom, String teachername) throws Exception {
		new GradeProgramPage().iAddPbsDetails(homeroom, teachername);
	}
	
	@Given("I Click on add Section button")
	public void iClickAddSectionbtn() throws Exception {
		new GradeProgramPage().iClickAddSectionbtn();
	}
	
}
