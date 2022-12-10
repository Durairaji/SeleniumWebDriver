package alert;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();;
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
	WebElement until=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("firstname"));
			}
		});
		until.sendKeys("hi");
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
