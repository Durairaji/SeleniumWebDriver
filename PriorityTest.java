package ThreadExecution;

import java.util.NoSuchElementException;

import org.hamcrest.Description;
import org.junit.Assert;
import org.testng.annotations.Test;


public class PriorityTest {


	@Test(groups= {"sanity"},priority=1)
	public void sin_up1() {
		System.out.println("this is sinup page 1 execution");

	}

	@Test(groups= {"smoke"})
	public void user_name2() {
		System.out.println("this is user name page 2 execution");
	}
	@Test(groups= {"reg"})
	public void passWork3() {
		System.out.println("this password page 3 execution");
	}
	@Test(groups= {"smoke"})
	public void logIn4() {
		System.out.println("this is log in page 4 execution");
	}

}
