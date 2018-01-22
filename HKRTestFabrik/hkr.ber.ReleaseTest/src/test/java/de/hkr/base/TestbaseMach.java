package de.hkr.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestbaseMach {
public static WebDriver driver;
public String baseUrl;

@BeforeSuite
public void setup() {
	if(driver == null) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		baseUrl = "https://www.mach.de/unternehmen/karriere/machberlindigital/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
}
@AfterSuite
public void tearDown() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (driver != null) {
		driver.quit();
	}
}


}
