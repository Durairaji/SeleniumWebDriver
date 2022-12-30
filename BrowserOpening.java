package browserOpening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.page.model.NavigatedWithinDocument;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpening {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement createbt = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		createbt.click();
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("this is current url"+currentUrl);
		 driver.navigate().back();
		 System.out.println("this current url"+driver.getCurrentUrl());
		 driver.navigate().forward();
		 System.out.println("this is current url"+driver.getCurrentUrl());
		 driver.navigate().refresh();
		 driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		 driver.getCurrentUrl();
		 System.out.println("this is current"+driver.getCurrentUrl());
		 driver.quit();
		

}
}