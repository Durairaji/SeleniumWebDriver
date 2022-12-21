package OurBasic.ourbasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithOutSysProperties {
	@Test
	public void cheKing() {
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		*/WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
		

}
