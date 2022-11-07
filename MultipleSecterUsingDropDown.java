package orgm;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSecterUsingDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement thisiscurrentpart = driver.findElement(By.className("whButtons"));
		//parent windows url"https://www.hyrtutorials.com/p/window-handles-practice.html"
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		thisiscurrentpart.click();
		// im going to switch the parent windows
		Set<String> valuebased = driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<String>(valuebased);
		driver.switchTo().window(arrayList.get(1));
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		Set<String> windowHandles = driver.getWindowHandles();
		arrayList.clear();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(0));
		
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		
		
		
		
				 
		
	
	}

}
