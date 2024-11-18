package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chrome Driver\\130\\chromedriver.exe");
		WebDriver driver;
		//driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		Thread.sleep(5000L);
//		
//		driver=new InternetExplorerDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(20000L);
//		
		
//		driver = new OperaDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();	
//		
		driver.quit();
	}

}
