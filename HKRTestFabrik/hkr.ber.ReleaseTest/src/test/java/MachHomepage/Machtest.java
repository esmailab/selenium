package MachHomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import de.hkr.base.TestbaseMach;
import sample.ScreenShotMethode;

@Test
public class Machtest extends TestbaseMach{
	

	public void pearingpointTest() throws InterruptedException {
		@SuppressWarnings("unused")
		WebElement element = driver.findElement(By.className("logo"));

		ScreenShotMethode.captureScreenShot(driver);
		
		driver.findElement(By.id("ctrl_keywords_13")).sendKeys("");
		driver.findElement(By.id("ctrl_submit_13")).click();
		ScreenShotMethode.captureScreenShot(driver);
		driver.findElement(By.id("ctrl_keywords_14")).isEnabled();
		ScreenShotMethode.captureScreenShot(driver);
		driver.findElement(By.id("ctrl_keywords_14")).sendKeys("eGovernment");
		driver.findElement(By.id("ctrl_submit_14")).click();
		ScreenShotMethode.captureScreenShot(driver);
	
			}
	

	}


	