package sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;

import org.testng.annotations.Test;

//import com.sun.java.util.jar.pack.Package.File;
import com.google.common.io.Files;
import de.hkr.base.SampleTestbase;
//import utilities.DataProviderUtil2;
//import de.hkr.base.Testbase;
//import utilities.DataProviderUtil2;

public class GoogleSearch extends SampleTestbase{
	

	
	@Test
	public void googlesearchTest() {
		WebElement element = driver.findElement(By.name("q"));
		
		String suchbegrieff = "Bearing Point";
				element.sendKeys(suchbegrieff);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 getscreenshot();
		      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       //The below method will save the screen shot in d drive with name "screenshot.png"
	          try {
				Files.copy(scrFile, new File("C:\\Users\\abbas\\HKR\\Screenshots\\screenshot1.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	  }

				
				AssertJUnit.assertTrue(!suchbegrieff.isEmpty());
				WebElement element2 = driver.findElement(By.id("gsr"));
				
			
						element2.click();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	 
	}

	private void getscreenshot() {
		// TODO Auto-generated method stub
		
	}
}








