package ThreadExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Parameters {
	RemoteWebDriver driver;

	@org.testng.annotations.Parameters({ "email", "pass", "browser" })
	@Test
	public void logIn(String email, String pass, String browser) {

		System.out.println("emaillocator" + email + "passlocator" + pass);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		switch (browser) {
		case "chrome":
			break;
		case "firefox":
			break;
		default:
			System.out.println("browser is not defined");
			break;

		}
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys(email);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys(pass, Keys.TAB, Keys.TAB, Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
