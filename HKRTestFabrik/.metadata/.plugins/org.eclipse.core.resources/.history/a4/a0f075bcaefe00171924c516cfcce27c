package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import de.hkr.base.Testbase;
import utilities.DataProviderUtil;

public class RadioButtonTest extends Testbase{
	
	
	@Test(dataProvider = "TestData", dataProviderClass= DataProviderUtil.class)
	public void radioButtnBmwTest(String radioButton) {
		WebElement radioButtontest = driver.findElement(By.id(radioButton));
		radioButtontest.click();
		AssertJUnit.assertTrue(radioButtontest.isSelected());
	}
}