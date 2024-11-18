package seleniumprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesEx {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Local Disk\\Softwares\\Selenium\\Selenium_Student_SW\\HtmlFiles\\multiplewindows.html");

		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn3")).click();

		Set<String> wind = driver.getWindowHandles();

		System.out.println(wind);

		Iterator it = wind.iterator();
		int count = 0;

		while (it.hasNext()) {

			count++;

			System.out.println(it.next());

		}

		Thread.sleep(5000);
		System.out.println(count);
		Thread.sleep(5000);
		driver.close();
	}
}
