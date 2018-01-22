package example;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FensterWechseln {
	public WebDriver driver;
	public String baseUrl;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void fensterWechselnTest() {
		WebElement buttonelement = driver.findElement(By.id("openwindow"));
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		buttonelement.click();
		Set<String> windowsHandels = driver.getWindowHandles();
		for(String window : windowsHandels) {
		if(!window.equals(mainWindow))	{
			driver.switchTo().window(window);
			WebElement searchField = driver.findElement(By.id("search-courses"));
			searchField.sendKeys("JavaScript");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
			break;
		}
		}
		driver.switchTo().window(mainWindow);
		WebElement checkBoxBmw = driver.findElement(By.id("bmwcheck"));
	
		checkBoxBmw.click();
	}
	

@AfterClass
public void tearDown() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}



}

