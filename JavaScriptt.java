package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='text']"));
		findElement2.sendKeys("iphone"+Keys.ENTER);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		js.executeScript("arguments[0].scrollIntoView(true)",findElement);
		WebElement findElement3 = driver.findElement(By.xpath("//img[@alt='Apple iPhone 12 (128GB) - Black']"));
		js.executeScript("arguments[0].scrollIntoView(false)",findElement3);
		driver.quit();
	}

}
