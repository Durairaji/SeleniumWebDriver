package rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickpannaporam {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions buider=new Actions(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement btnloc = driver.findElement(By.xpath("//span[text()='right click me']"));
		buider.contextClick(btnloc).perform();
		Thread.sleep(3000); 
		// double click
		WebElement btnloc2 = driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(2000);
		buider.doubleClick(btnloc2).perform();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
