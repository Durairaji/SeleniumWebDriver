package frams;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frams {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		WebElement frame1swich = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//Dimension size = frame1swich.getSize();
		//System.out.println(size);
		driver.switchTo().frame(frame1swich);
		WebElement btn1 = driver.findElement(By.tagName("input"));
		btn1.sendKeys("durairaj");
		//Actions builder=new Actions(driver);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame2);
		WebElement check = driver.findElement(By.xpath("//*[@id='a']"));
		//builder.click(check).perform();
		check.click();
		
		driver.quit();
	}

}
