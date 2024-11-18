package seleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");

		Thread.sleep(5000);

		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys(Keys.ENTER);

		ele.click();

	}

}
