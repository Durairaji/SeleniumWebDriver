package testng;

import org.testng.annotations.Test;

public class TestNg {
	@Test(priority = 0)
	public void firstTestCas() {
		System.out.println("this is first test case");
	}

	@Test(dependsOnMethods = "firstTestCas")
	public void secoundTestCase() {
		System.out.println("this is secound test case");

	}

	@Test(dependsOnMethods="secoundTestCase")
	public void thirdTestCase() {
		System.out.println("this is third test case");
	}

	@Test(dependsOnMethods="thirdTestCase")
	public void fourthTestCase() {
		System.out.println("this is the fourth test case");

	}

}
