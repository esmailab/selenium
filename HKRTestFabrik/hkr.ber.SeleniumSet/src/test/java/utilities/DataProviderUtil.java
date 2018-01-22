package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	@DataProvider(name = "TestData")
	public Object[][] getData(){
	Object [][] testData = {{"bmwradio"},{"benzradio"},{"hondaradio"}};
	return testData;
	}

}
