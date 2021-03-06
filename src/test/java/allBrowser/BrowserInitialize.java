package allBrowser;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialize {
	WebDriver driver;
	
	public WebDriver ChooseBrowser() {
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		String BR=rb.getString("Browser");
		if(BR.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get(rb.getString("url"));
		return driver;
	}
	

	public void closeBroser() {
	driver.quit();
	
	}

}//end class
