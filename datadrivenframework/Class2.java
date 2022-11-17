package datadrivenframework;

import org.testng.annotations.DataProvider;

public class Class2 {
	
	@DataProvider(name="login")
	public  String[][] data() {
		String[][] readXlData=Class1.getXlData();
		return readXlData;
	}
}
