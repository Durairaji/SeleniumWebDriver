package report;

import org.testng.annotations.BeforeTest;

public class ReportingDetailsClass2 extends ReportingDetails {
	
	@BeforeTest// secound run
	public void dataSetUp() {
		
		 dec="first test";  
		 author="durairaj";
		 catagory="sanity";

		
		
		
	}

}
