import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValueEx {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com";
	      driver.get(url);
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      
	      // identify element
	      WebElement l = driver.findElement(By.id("search-strings"));
	      // enter texts
	      l.sendKeys("Selenium");
	      
	      Thread.sleep(5);
	      // get value attribute with getAttribute()
          String val = l.getAttribute("value");
          
        //  String val1=l.getText();
          
          System.out.println("Entered text is: " + val);
         // System.out.println("Entered text is: " + val1);
	      driver.quit();

	}

}
