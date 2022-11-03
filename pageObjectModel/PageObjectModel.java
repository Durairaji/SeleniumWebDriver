package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PageObjectModel {
	// username,password,login
	 @Test
		public static WebElement username(WebDriver driver) {
			return driver.findElement(By.id("email"));
		}

		public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("pass"));
		}

		public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("//*[text()='Log in']"));
		}

	}




