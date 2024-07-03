package com.serosoft.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.GlobalVariable;

public class AdmissionwithFeeplanPage {
	
	By assignaplidbtn = By.xpath("//span[text()='Assign Application ID']/ancestor::a");
	By submitformbtn = By.xpath("//span[text()='Submit Form']/ancestor::a");
	By collectpaymentbtn = By.xpath("//span[text()='Collect Payment']/ancestor::a");
	By cashradiobtn = By.xpath("//label[text()='Cash']/parent::td");
	
	By academylocationarrow = By.xpath("//input[@name= 'academyLocationCombo']/../../td[2]");
	By selectprogramgroup = By.xpath("//input[@name= ' programGroup']/../../td[2]");
	By configcombination = By.xpath("//span[text()='Configure Combination']/..");
	
	By stageselectionarrow = By.xpath("//input[@name = 'programSelectionProcessStage']/../../td[2]");
	By stagesavebutton = By.xpath("//div[contains(@id, 'stagesetting')]//span[text() = 'Save']/..");
	By feeplanapplicablecheckbox = By.xpath("//label[contains(text(),'If Fee Plan is applicable')]/..");
	By feeplanarrrow = By.xpath("//input[@name='feePlan']/../../td[2]");
	By feeplanrulearrow = By.xpath("//input[@name='feePlanRule']/../../td[2]");
	By feeplanrulestagearrow = By.xpath("//input[@name='feePlanRuleStage']/../../td[2]");
	
	
	public void iAssignApllicationId()throws Exception {
		CommonActions.iClickElementByLocator(assignaplidbtn, "Clicking Assign Application Id Button");		
		new CommonLocatorPage().iSelectRow("1", "normal");
		CommonActions.iClickElementByLocator(collectpaymentbtn, "Clicking Collect Payment Button");
		CommonActions.iClickElementByLocator(cashradiobtn, "Clicking Cash Radio Button");
		new CommonLocatorPage().iClickSaveButton("window");
		new CommonLocatorPage().iValidateAlert();
		
		new CommonLocatorPage().iSelectRow("1", "normal");
		CommonActions.iClickElementByLocator(collectpaymentbtn, "Clicking Collect Payment Button");
		CommonActions.iClickElementByLocator(cashradiobtn, "Clicking Cash Radio Button");
		new CommonLocatorPage().iClickSaveButton("window");
		new CommonLocatorPage().iValidateAlert();
		
		new CommonLocatorPage().iSelectRow("1", "normal");

		Thread.sleep(3000);
		GlobalVariable.ApplicationId  = new CommonLocatorPage().iSelectColumnAndGetText("1", "3", "normal").trim();
		System.out.println("##################################### Application Id is : "+GlobalVariable.ApplicationId );
		
		CommonActions.iClickElementByLocator(submitformbtn, "Clicking Submit Form Button");
		
	}
	public void iSearchCombinationConfigure() throws Exception {
		CommonActions.iClickElementByLocator(academylocationarrow, "Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.academyLocation+"')]"), "Select Assgin Calender Arrow");
		CommonActions.iClickElementByLocator(selectprogramgroup, "Select Program Group Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[contains(text(),'"+GlobalVariable.programgrp+"')]"), "SelectProgram Group Name");
		CommonActions.clickOnElementAndType(By.xpath("//input[@name = 'PROGRAM']"), GlobalVariable.GradeOrProgramName , "Prg name");
		CommonActions.iClickEnter(By.xpath("//input[@name = 'PROGRAM']"));
		new CommonLocatorPage().iClickButtonOfChoice("Search");
		Thread.sleep(4000);
		
		CommonActions.iClickElementByLocator(By.xpath("//div[text()='"+GlobalVariable.GradeOrProgramName+"']/ancestor::tr/td[1]"), "Select Period Name for Admission");
		CommonActions.iClickElementByLocator(configcombination, "Select Configure Combinatios");		
	}
	
	public void iSelectEditLeadTab(String option) throws InterruptedException {
		WebElement tab = CommonActions
				.getElement(By.xpath("//span[contains(text(), '" + option + "') and contains(@class , 'tab')]/.."));
		CommonActions.iClick(tab, option + " Tab is clicked");
	}

	public void iSelectStageSettingTab(String stage, String feeplanstage) throws Exception {		
			CommonActions.iClickElementByLocator(stageselectionarrow, "Select Stage Selection Arrow");
			Thread.sleep(2000);
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+stage+" ']"),	"Select Stage Name");
			
			CommonActions.iClickElementByLocator(feeplanapplicablecheckbox, "Clicking Feeplan Applicable Check Box");
			
			CommonActions.iClickElementByLocator(feeplanarrrow, "Select Feeplan textbox Arrow");
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+GlobalVariable.ProgramFeePlanName+" ']"), "Selecting the Feeplan");
			
			CommonActions.iClickElementByLocator(feeplanrulearrow, "Select Feeplan Rule textbox Arrow");
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+GlobalVariable.PrgFeeplanDescp1+" ']"), "Selecting the Feeplanrule");
			
			CommonActions.iClickElementByLocator(feeplanrulestagearrow, "Select Feeplan Rule Stage textbox Arrow");
			CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+feeplanstage+" ']"), "Selecting the Feeplanrule Stage");
			
			
			CommonActions.iClickElementByLocator(stagesavebutton, "Stage Save Button");
			new CommonLocatorPage().iValidateAlert();
		}
	
	public void iSelectFeeplanStageSettingTab(String stage, String feeplanstage) throws Exception {
		
		CommonActions.iClickElementByLocator(stageselectionarrow, "Select Stage Selection Arrow");
		Thread.sleep(2000);
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+stage+" ']"),	"Select Stage Name");
		
		CommonActions.iClickElementByLocator(feeplanapplicablecheckbox, "Clicking Feeplan Applicable Check Box");
		
		CommonActions.iClickElementByLocator(feeplanarrrow, "Select Feeplan textbox Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+GlobalVariable.ProgramFeePlanName+" ']"), "Selecting the Feeplan");
		
		CommonActions.iClickElementByLocator(feeplanrulearrow, "Select Feeplan Rule textbox Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+GlobalVariable.PrgFeeplanDescp2+" ']"), "Selecting the Feeplanrule");
		
		CommonActions.iClickElementByLocator(feeplanrulestagearrow, "Select Feeplan Rule Stage textbox Arrow");
		CommonActions.iClickElementByLocator(By.xpath("//div[text()= ' "+feeplanstage+" ']"), "Selecting the Feeplanrule Stage");
		
		
		CommonActions.iClickElementByLocator(stagesavebutton, "Stage Save Button");
		new CommonLocatorPage().iValidateAlert();
		CommonActions.refresh();
	}

	}
	

