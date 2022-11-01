package dataproviderr;

import org.testng.annotations.DataProvider;

public class Child {
	//indices namakku thevayana particular data matum adukkulam 
	@DataProvider(name="login",parallel=true)
	public  String[][] data() {
		String[][]data=new String[2][2];
		data[0][0]="sdurairaj123123@gmail.com";
		data[0][1]="12345";
		data[1][0]="thaen@1234";
		data[1][1]="4321";
		return data;
	}
}
