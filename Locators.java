package alert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> allrows = driver.findElements(By.xpath("(//table)[1]//tr"));
		for (WebElement webElement : allrows) {
			System.out.println(webElement.getText());
		}
		System.out.println("========================================");
		WebElement webElement = driver.findElement(By.xpath("//*[text()='Google']//following::td[1]"));
		String text = webElement.getText();
		System.out.println(text);
		List<WebElement> findElements = driver.findElements(By.xpath("(//table)[1]//following::tr[2]"));
		for (WebElement webElement2 : findElements) {
			System.out.println(webElement2.getText());
			
		}
			
	driver.quit();
	}
}
