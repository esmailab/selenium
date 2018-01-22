package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil2 {
	@DataProvider(name = "TestData")
	public Object[][] getData(){
	Object [][] testData = {{"bmwradio"},{"benzradio"},{"hondaradio"}};
	return testData;
	}

}
