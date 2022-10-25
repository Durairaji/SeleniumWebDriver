package draganddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions buider=new Actions(driver);		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		buider.dragAndDrop(source, target).perform();
		WebElement sencound = driver.findElement(By.id("droppableExample-tab-accept"));
		sencound.click();
		
		// it is secound search
		Thread.sleep(2000);
		WebElement source2 = driver.findElement(By.xpath("//div[@id='acceptable']"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		buider.dragAndDrop(source2, target2).perform();
		
		// it is three search
		Thread.sleep(2000);
		WebElement source3 = driver.findElement(By.xpath("//div[@id='notAcceptable']"));
		WebElement target3 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
