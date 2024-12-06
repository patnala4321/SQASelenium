
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));

		// Using JavascriptExecutor to click on Login Button
		
		
		JavascriptExecutor jExecutor = (JavascriptExecutor)driver;
		

		jExecutor.executeScript("arguments[0].click()", element);
		
		Thread.sleep(2000);

		System.out.println("Login Completed  ");

		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
    	Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
		Thread.sleep(5000);
		driver.quit();

	}
}
