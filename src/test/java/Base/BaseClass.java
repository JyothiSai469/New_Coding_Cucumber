package Base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static void BrowserLanch() {
				
	driver = new ChromeDriver();
	}
	
	public static void maxBrowser() {
		
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	
}
