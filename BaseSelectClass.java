package com.obsqura.TestNGAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelectClass {
	WebDriver driver;
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\TestNGAssignment\\src\\main\\java\\Resourse\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	    driver.manage().window().maximize();
	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	

}
