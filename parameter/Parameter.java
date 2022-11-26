package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters("going")
	public void name1(String names) {
		System.out.println("my first name " + names);
	}

	@Test
	@Parameters("going1")
	public void name2(String last) {
		System.out.println("my last name" + last);
	}

}
