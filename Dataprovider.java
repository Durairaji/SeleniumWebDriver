package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider(name="login")
	private String[][] data() {
		String[][]data=new String[2][2];
		data[0][0]="sdurairaj123123@gmail.com";
		data[0][1]="12345";
		data[1][0]="thaen@1234";
		data[1][1]="4321";
		return data;
		
	}
	@Test(dataProvider="login")
	public void logIn(String email,String pass) {

		System.out.println("emaillocator" + email + "passlocator" + pass);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
