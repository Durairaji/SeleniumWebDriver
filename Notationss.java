package notions;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class Notionsssss {
	@BeforeClass//1.beforeclass 2.Afterclass 3.before 4.after 5.test
	public static void beforeclass() {
		System.out.println("this is first excution");

	}
	@AfterClass
	public static void afterclass() {
		System.out.println("this is secound excution");

	}
	@Before

	public  void before() {
		System.out.println("this thread excution ");

	}
	@After
	public  void after() {
		System.out.println("this is four excution ");

	}
	@Test
	public  void test01() {
		System.out.println("this is fifth excution");
	}
	@Test
	public  void test02() {
		System.out.println("this is fifth excution2");

	}

}
