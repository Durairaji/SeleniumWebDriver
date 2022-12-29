package testng;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=0)
	public void firstTestCase() {
		System.out.println("this is first test case");
	}

	@Test(priority=1,enabled=false)
	public void secoundTestCase() {
		System.out.println("this is secound test case");

	}

	@Test(priority=2)
	public void thirdTestCase() {
		System.out.println("this is third test case");
	}

	@Test(priority=3)
	public void fourthTestCase() {
		System.out.println("this is the fourth test case");

	}

}
