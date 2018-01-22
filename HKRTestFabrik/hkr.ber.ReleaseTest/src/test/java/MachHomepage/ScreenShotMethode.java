package MachHomepage;



import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ScreenShotMethode {

@Test
public void TestJavaS1(){

 // Open Firefox
 //WebDriver driver=new FirefoxDriver();

// call method
                       // ScreenShotMethode.captureScreenShot(driver);

// Maximize the window
//driver.manage().window().maximize();
                       // ScreenShotMethode.captureScreenShot(driver);

// Pass the url
//driver.get("http://www.google.com");
                 // ScreenShotMethode.captureScreenShot(driver);

  }

public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
// now copy the  screenshot to desired location using copyFile method

FileUtils.copyFile(src, new File("C:/users/abbas/Screenshots/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)

{
  System.out.println(e.getMessage()); 
 }
  }

}