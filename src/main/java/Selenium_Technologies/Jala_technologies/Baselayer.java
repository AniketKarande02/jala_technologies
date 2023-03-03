package Selenium_Technologies.Jala_technologies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselayer {


	public static WebDriver driver;
	@Test
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
		
		@BeforeTest
		public void beforetest() {
			
			
		}
}
