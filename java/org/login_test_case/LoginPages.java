package org.login_test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.PageObjectModels;

public class LoginPages {
	@Test(priority = 1)
	public static void first() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		PageFactory.initElements(driver, PageObjectModels.class);
		PageObjectModels.username.sendKeys("sdurairaj123");
		PageObjectModels.password.sendKeys("123456");
		PageObjectModels.login.click();
		driver.quit();
		
	}
}