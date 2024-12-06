import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		/** In single line */
		//new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		
		/** In two lines */
		
		// Wait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//((WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")))).click();
		
	    //In threee lines */
		Wait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement ele= (WebElement)wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		ele.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
		Thread.sleep(5000);
		driver.quit();


	}

}
