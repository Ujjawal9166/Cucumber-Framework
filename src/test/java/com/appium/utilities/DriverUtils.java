package com.appium.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import com.appium.commonactionmethods.CommonActions;
import com.harsh.globalvariable.Constants;
import com.harsh.globalvariable.GlobalVariable;
import com.serosoft.base.BaseClass;

/**
 * 
 * @author Ujjawal Singh Do not Modify any functions . 
 *
 */
public class DriverUtils extends GlobalVariable {
	public static String choice;
	public static String username = Constants.getUsername();
	public static String Accesskey = Constants.getPassword();
	public static final String urlbrowserstack = "https://" + username + ":" + Accesskey
			+ "@hub-cloud.browserstack.com/wd/hub";

	@SuppressWarnings("rawtypes")
	public static WebDriver getDriver() throws IOException {

		choice = BaseClass.getCloudDeviceChoice();
		switch (choice.toLowerCase()) {
		case "browserstack":
			try {
				DesiredCapabilities capabilities = null;
				final Properties prop = new Properties();
				URL remoteDriverURL = null;
				try {
					remoteDriverURL = new URL(urlbrowserstack);
				} catch (Exception e) {

					e.printStackTrace();
				}
				return new RemoteWebDriver(remoteDriverURL, capabilities);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Driver initialization error");
			}
			break;
		case "localdevice":
			try {
//				String headless = BaseClass.getHeadlessChoice();
				
				String preferredDriver = System.getProperty("browser", "chrome");
				boolean headless = System.getProperty("headless", "false").equals("true");

				final ChromeOptions chromeOptions = new ChromeOptions();

				if (headless)
				{
					chromeOptions.addArguments("--headless");
				}
				chromeOptions.addArguments("window-size=1920,1080");
				chromeOptions.addArguments("-incognito");
				chromeOptions.addArguments("start-maximized");
				chromeOptions.addArguments("disable-infobars");
				chromeOptions.addArguments("--disable-extensions");
				chromeOptions.addArguments("--disable-gpu");
				chromeOptions.addArguments("--disable-dev-shm-usage");
				chromeOptions.addArguments("--no-sandbox");
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver(chromeOptions);
				CommonActions action = new CommonActions(driver);
				return driver;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Driver initialization error");

			}

			break;
			
		case "testingchromebeta":
			try {
//				String headless = BaseClass.getHeadlessChoice();
				
				String preferredDriver = System.getProperty("browser", "chrome");
				boolean headless = System.getProperty("headless", "false").equals("true");

				final ChromeOptions chromeOptions = new ChromeOptions();

				if (headless)
				{
					chromeOptions.addArguments("--headless");
				}
				chromeOptions.setBinary(System.getProperty("user.dir") +"\\src\\main\\resources\\driverbeta\\chrome.exe");
				chromeOptions.addArguments("window-size=1920,1080");
				chromeOptions.addArguments("-incognito");
				chromeOptions.addArguments("start-maximized");
				chromeOptions.addArguments("disable-infobars");
				chromeOptions.addArguments("--disable-extensions");
				chromeOptions.addArguments("--disable-gpu");
				chromeOptions.addArguments("--disable-dev-shm-usage");
				chromeOptions.addArguments("--no-sandbox");
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\driverbeta\\chromedriver.exe");
				driver = new ChromeDriver(chromeOptions);
				CommonActions action = new CommonActions(driver);
				return driver;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Driver initialization error");

			}

			break;
		default:
			try {
				
				String headless = BaseClass.getHeadlessChoice();
				String preferredDriver = System.getProperty("browser", "chrome");
//				boolean headless = System.getProperty("headless", "false").equals("true");

				final ChromeOptions chromeOptions = new ChromeOptions();

				if (headless.equals("true"))
				{
					chromeOptions.addArguments("--headless");
				}
				chromeOptions.addArguments("window-size=1920,1080");
				chromeOptions.addArguments("-incognito");
				chromeOptions.addArguments("start-maximized");
				chromeOptions.addArguments("disable-infobars");
				chromeOptions.addArguments("--disable-extensions");
				chromeOptions.addArguments("--disable-gpu");
				chromeOptions.addArguments("--disable-dev-shm-usage");
				chromeOptions.addArguments("--no-sandbox");
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver(chromeOptions);
				CommonActions action = new CommonActions(driver);
				return driver;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Driver initialization error");

			}

			break;

		}

		return driver;
	}

}
