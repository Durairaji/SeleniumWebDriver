package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollView {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement bottomview = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		js.executeScript("arguments[0].scrollIntoView(true)", bottomview);
		
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//u[text()='Demo website for Selenium Automation Practice - Tutorials Hut']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		
	
	}
}
