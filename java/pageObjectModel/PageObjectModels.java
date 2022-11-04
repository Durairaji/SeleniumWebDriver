package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModels {
	// username,password,login
		 @FindBy(id="email")
		 public static WebElement username;
		 @FindBy(name="pass")
		 public static WebElement password;
		 @FindBy(xpath="//*[text()='Log in']")
		 public static WebElement login;
		

}
