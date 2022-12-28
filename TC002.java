package org.LoginTest;

import org.openqa.selenium.WebElement;
import org.pages.LoginPages;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesBase.PagesBase;
import seleniumBase.Locators;

public class TC002 extends PagesBase {
	@BeforeTest
	public void setData() {
		filename = "TC001";
	}

	@Test(dataProvider = "data")
	public void LoginTest(String[] data) {
		type(element(Locators.id,"username"),"Theanraj");
		type(element(Locators.id,"password"),"Theanraj@123");
		click(element(Locators.id,"login"));
		
//		LoginPages lp=new LoginPages();
//		lp.enterUserName(data[0]);
//		lp.enterPassword(data[1]);
//		lp.clickLoing();
		
//		WebElement element = element(Locators.id,"username");
//		type(element,"Theanraj");
//		WebElement element2 = element(Locators.id,"password");
//		type(element2,"Theanraj@123");
//		WebElement element3 = element(Locators.id,"login");
//		click(element3);
//		
//		click(element(Locators.link, "Log in"));
//		type(element(Locators.name, "emai"), "koushik350@gmail.com");
//		type(element(Locators.name, "password"), "Pass123$");
//		click(element(Locators.css, "button.button.is-primary"));
//		System.out.println("completed");
	
	}
}