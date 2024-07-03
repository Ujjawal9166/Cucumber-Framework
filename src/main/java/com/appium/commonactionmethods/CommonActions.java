package com.appium.commonactionmethods;

import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.base.*;

import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Keyboard;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.core.logging.LoggerFactory;
import junit.framework.AssertionFailedError;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Ujjawal Singh Do not Modify this action methods . If any change
 *         required, 
 *
 */

public class CommonActions extends GlobalVariable {

	public static WebDriver driver;

	public CommonActions(WebDriver driver) {

		this.driver = driver;
	}

	public static WebElement getElement(By elementloactor) {
		iLogMessage("Waiting for element to be visible");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(elementloactor));
		return ele;
	}

	public static void clickOnElementAndType(By elementlocator, String value, String nameofelement) throws Exception {
		if (driver != null) {
			WebElement ele = getElement(elementlocator);
			ele.clear();
			iClick(ele, nameofelement);
			highlightElementRed(ele, nameofelement);
			ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			ele.sendKeys(Keys.chord(Keys.DELETE));
			ele.sendKeys(value);
			iLogMessage("Clicked on" + nameofelement);
		} else {
			throw new Exception("Element not present");
		}
	}

	public static void isDisplayed(By elementlocator, String elementName) throws Exception {
		WebElement element = getElementIfPresent(elementlocator);
		if (element.isDisplayed()) {	
			iScrollToTheElement(element, elementName);
			iLogMessage(elementName + " is displayed....");
			highlightElementGreen(element, elementName);
		} else {
			throw new Exception("Element not displayed");

		}
	}

	public void iVerifySelected(By elementlocator, String elementName) throws Exception {
		iImplicitlywait(30, elementName);
		WebElement ele = getElement(elementlocator);
		if (ele.isSelected()) {
			System.out.println("The element is selected " + elementName);
		} else {
			throw new Exception("Element not selected");
		}
	}

	public static void iVerifyPartialText(String actualText, String expectedText) throws Exception {
		if (actualText.contains(expectedText)) {
			System.out.println("The expected text contains the actual: " + expectedText);
		} else {
			throw new Exception("Text is not matching");
		}

	}

	public static String iGetText(WebElement ele, String elementname) {
		iLogMessage("Getting the text from" + elementname);
		return ele.getText();
	}

	public static void iVerifyPartialElementText(By elementlocator, String expectedText, String elementName) {
		try {
			WebElement ele = getElement(elementlocator);
			if (iGetText(ele, elementName).contains(expectedText)) {
				System.out.println("The actual text contain the partial element text: " + expectedText);
			} else {
				iLogMessage("The actual text does not contain the partial element text: " + expectedText);
			}
		} catch (Exception e) {
			iLogErrorMessage("The actual text does not contain the partial element text: " + expectedText);
		}
	}

	public static void iVerifyExactElementText(By elementlocator, String expectedText, String elementName) {
		WebElement ele = getElement(elementlocator);
		assertEquals(expectedText, ele.getText());
	}

	public static void iImplicitlywait(long sec, String elementName) {
		try {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
			System.out.println("Wait for " + sec + " sec to visible " + elementName);
		} catch (Exception e) {
			System.out.println(elementName + " is not displayed ");
		}
	}

	public static void iClickJSE(WebElement ele, String elementName) {
		iImplicitlywait(30, elementName);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);
		iLogMessage("i Click on the element " + elementName);

	}

	public static void iClick(WebElement ele, String elementName) throws InterruptedException {
		Thread.sleep(2000);
		iImplicitlywait(30, elementName);
		highlightElementRed(ele, elementName);
		ele.click();
		iLogMessage("i Click on the element " + elementName);
	}

	public static void allowPermissionss(String alertnamebutton) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			iLogMessage("Alert not present");
		}
	}

	public static void iLogMessage(String message) {
		Logger logger = LoggerHelper.getLogger(CommonActions.class);
		logger.info(message);
	}

	public static void iLogErrorMessage(String message) {
		Logger logger = LoggerHelper.getLogger(CommonActions.class);
		logger.error(message);
	}

	public static void iClickBack(int times) throws InterruptedException {
		Thread.sleep(3000);
		for (int i = 1; i <= times; i++) {
			driver.navigate().back();
		}
		iLogMessage("Navigated back");
	}

	public static void highlightElementRed(WebElement element, String name) {
		try {

			if (element.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
				iLogMessage("Highlighted the " + name);
				Thread.sleep(2000);
			} else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
				iLogMessage("Highlighted the " + name);
			}

		} catch (Exception e) {
			iLogErrorMessage("element caanot be located");

		}
	}

	public static void highlightElementGreen(WebElement element, String name) {
		try {
			if (element.isDisplayed()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green;');", element);
				iLogMessage("Highlighted the " + name);
				Thread.sleep(2000);
			} else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(2000);
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid green;');", element);
				iLogMessage("Highlighted the " + name);
			}

		} catch (Exception e) {
			iLogErrorMessage("element caanot be located");
		}
	}

	public static void iScrollToTheElementByLocator(By loc, String nameofelement) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = getElement(loc);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		highlightElementRed(element, nameofelement);
		iLogMessage("scrolled till the " + nameofelement);

	}

	public static void iScrollToTheElement(WebElement ele, String nameofelement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		highlightElementRed(ele, nameofelement);
		iLogMessage("scrolled till the " + nameofelement);
	}

	public static void clickForcefully(WebElement ele, String name) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public void handleAlert(String decision) {
		if (decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}

	public static void hoverOverElement(WebElement element, String name) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		iLogMessage("Hover to the " + name);
	}

	public static void scrollPage(String to) throws Exception {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if (to.equals("end"))
			executor.executeScript(
					"window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		else if (to.equals("top"))
			executor.executeScript(
					"window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		else
			throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
	}

	public void switchToNewWindow() {
		String old_win = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles())
			old_win = winHandle;
		driver.switchTo().window(old_win);
	}

	/**
	 * Method to switch to old window
	 */
	public void switchToOldWindow(String windowhandle) {
		driver.switchTo().window(windowhandle);
	}

	/**
	 * Method to switch to window by title
	 *
	 * @param windowTitle : String : Name of window title to switch
	 */
	public void switchToWindowByTitle(String windowTitle) throws Exception {
		// System.out.println("++"+windowTitle+"++");
		String old_win = driver.getWindowHandle();
		boolean winFound = false;
		for (String winHandle : driver.getWindowHandles()) {
			String str = driver.switchTo().window(winHandle).getTitle();
			// System.out.println("**"+str+"**");
			if (str.equals(windowTitle)) {
				winFound = true;
				break;
			}
		}
		if (!winFound)
			throw new Exception("Window having title " + windowTitle + " not found");
	}

	/**
	 * Method to close new window
	 */
	public void closeNewWindow() {
		driver.close();
	}

	/**
	 * Method to switch frame using web element frame
	 *
	 * @param accessType : String : Locator type (index, id, name, class, xpath,
	 *                   css)
	 * @param accessName : String : Locator value
	 */

	/**
	 * method to switch to default content
	 */
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static String schoolCodeGenrator() {
		String chars = "abcdefghijklmnopqrstuvwzyz0123456789";
		String school = "SCH";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return school + sb.toString();
	}

	public static String randomNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation name" + sb.toString();

	}

	public static String randomEmailGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automationtest@" + sb.toString() + ".com";

	}

	public static String randomSchoolName() {
		String chars = "0123456789ABCDEFGHijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation public school Indore" + sb.toString();

	}

	public static void iClickElementByLocator(By loc, String elementName) throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = getElement(loc);
		iImplicitlywait(30, elementName);
		highlightElementRed(ele, elementName);
		ele.click();
		iLogMessage("i Click on the element " + elementName);
	}

	public static void selectOptionFromDropdown(By loc, int optionnumber) throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = getElement(loc);
		iClick(ele, "Dropdown");
		Thread.sleep(2000);
		for (int i = 1; i < optionnumber; i++) {
			ele.sendKeys(Keys.chord(Keys.DOWN));
		}
		
		Thread.sleep(1000);
		ele.sendKeys(Keys.chord(Keys.TAB));
	}

	public static void selectionOptionFromDropdownAfterEntering(By loc, String optionname) throws InterruptedException {
		WebElement ele = getElement(loc);
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.chord(Keys.DELETE));
		ele.sendKeys(optionname);
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.TAB));
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void selectLastRow(By Locator) throws InterruptedException {
		iImplicitlywait(30, "List");
		Thread.sleep(4000);
		List<WebElement> pending = driver.findElements(Locator);
		int size = pending.size();
		Thread.sleep(2000);
		pending.get(size - 1).click();
	}
	
	
	public static List<WebElement> getElementList(By elementloactor) {
		iLogMessage("Waiting for elements to be visible");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> ListOfElement = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementloactor));
		return ListOfElement;
	}
	
	public static void iClickEnter(By locator) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = getElement(locator);
		ele.sendKeys(Keys.chord(Keys.ENTER));
	}
	
	

	public static WebElement getElementIfPresent(By elementloactor) {
		iLogMessage("Waiting for element to be Present");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(elementloactor));
		return ele;
	}
	
	public static void iFocusOnElementAndClcik(By loc , String nameofelement) throws InterruptedException {
		WebElement ele = getElement(loc);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("ele.focus();");	
		iClickJSE(ele, "clicked on "+nameofelement);
	}
	
	
	public static void iVerifyExactText(String expectedText , By loc , String nameofelement) throws Exception {
		WebElement ele = getElement(loc);
		String actualtext = ele.getText();
		if (actualtext.equalsIgnoreCase(expectedText)) {
			System.out.println("The expected text contains the actual: " + expectedText);
			highlightElementGreen(ele, nameofelement +" is highlighted");
		} else {
			throw new Exception("Text is not matching");
		}

	}
	
	public static void iVerifyPartialText(String expectedText , WebElement ele, String nameofelement) throws Exception {
		String actualtext = ele.getText();
		if (actualtext.contains(expectedText)) {
			System.out.println("The expected text contains the actual: " + expectedText);
			highlightElementGreen(ele, nameofelement +" is highlighted");
		} else {
			throw new Exception("Text is not matching");
		}

	}
	
	
	public static String iGetTextByLoctor(By locator, String elementname) {
		iLogMessage("Getting the text from" + elementname);
		WebElement ele = getElement(locator);
		return ele.getText();
	}
	
	
	public static void iScrollDownCoordinates(int x , int y) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(" + x + ", " + y + ");");
	}	
	
	
	public static WebElement getElementIfClickable(By elementloactor) {
		iLogMessage("Waiting for element to be Clickable");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(elementloactor));
		return ele;
	}
	
	
	public static String GradeProgramCodeGenerator() {
		String chars = "abcdefghijklmnopqrstuvwzyz0123456789";
		String school = "GradePrgCode";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return school + sb.toString();
	}

	public static String randromPrgOrGradeNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "PrgGrade" + sb.toString();

	}
	
	
	public static String randomNumberGenerator(int size) {
		String chars = "123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();

	}
	
	public static String randromPrgOrGradeNameIntakeGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "GradeorProCode" + sb.toString();

	}
	
	public static String randromFeeplanNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "FeePlanName" + sb.toString();

	}
	
	public static String randromPrgFeeplanNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "ProgramFeePlanName" + sb.toString();

	}
	
	public static String randromProorGradePeriodNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "PeriodName" + sb.toString();

	}
	
	public static String getTodayDate(String year) {
		DateTimeFormatter td =DateTimeFormatter.ofPattern("dd");
		System.out.println("************************************************"+td);
		DateTimeFormatter tdm =DateTimeFormatter.ofPattern("dd/MM");
	    LocalDate now = LocalDate.now();
	    String date =(td.format(now)+"/"+year+"");
		return date;		
	}
	
    
	public static void iValidateElementPresent(By loc) {
		try {
			WebElement alertmessage = CommonActions.getElement(loc);
			CommonActions.highlightElementGreen(alertmessage, "Successful alert is present");
		} catch (Exception e) {
			CommonActions.iLogMessage("No such alert found!!");
		}

	}
	
	public static String randromClassesNameGeneretor() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Class " + sb.toString();

	}
	
	public static String randromSelectionProcessName() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 12; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation " + sb.toString();

	}
	
	public static String randromSelectApplicantFirstName() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Applicant " + sb.toString();

	}
	
	public static String randromSelectApplicantLasttName() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();

	}
	
	public static void moveDownUntilElementFoundInList(By loclist,By inp , String value) throws InterruptedException {
		List<WebElement> elemList = getElementList(loclist);
		for(WebElement ele:elemList) {
			System.out.println("******" + ele.getText());
			if(ele.getText().contains(value)) {
				iScrollToTheElement(ele, "ele");
				iClick(ele, "ele");
			}
			else {
				WebElement in = getElement(inp);
				in.sendKeys(Keys.chord(Keys.ARROW_DOWN));
			}
		}
		
	}
	
	
	public static String randomSubjectCourseGeneration() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "SubCode " + sb.toString();

	}
	
	public static String randomSubjectCourseCodeGeneration() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "SubName " + sb.toString();

	}
	
	public static String randomAssessmentNameGeneration() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation Assessment " + sb.toString();

	}
	
	public static String randomSectionNameGeneration() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Section " + sb.toString();

	}
	
	public static String randomAssessmentSchemeNameGeneration() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Assessment Scheme " + sb.toString();

	}
	
	
	public static void VerifyBrokenLinksandPrint() {        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<WebElement> allURLs = driver.findElements(By.tagName("a"));
        System.out.println("The number of URLs on page is " + allURLs.size());
        System.out.println("***********************************************");
        System.out.println();
        System.out.println("The all URLs on the page is:");
        for(int i = 0 ; i<allURLs.size() ; i++) {
            
            WebElement url = allURLs.get(i);
            String urlname = url.getAttribute("href");
            //System.out.println(urlname);        
            verifyLinks(urlname);
        
        }
    }
    
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
   }

}
