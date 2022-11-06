package datadriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothInCorrect {
	@Test
	@Parameters({ "username", "password" })

	public void bothCorret(String uname,String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(uname);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(pass, Keys.TAB, Keys.TAB, Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();


	}

}
