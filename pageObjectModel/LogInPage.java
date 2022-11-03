package org.login_test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

import pageObjectModel.PageObjectModel;

public class LogInPage extends PageObjectModel {
	@Test(priority=1)
	public static void first() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	PageObjectModel.username(driver).sendKeys("hi");
	PageObjectModel.password(driver).sendKeys("passwork#");
	PageObjectModel.login(driver).click();
	driver.quit();
	
	
	}
}
