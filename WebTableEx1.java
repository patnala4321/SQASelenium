package seleniumprograms;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx1 {
	

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Local%20Disk/Softwares/Selenium/Selenium_Student_SW/HtmlFiles/WebTable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

		//Finding number of Rows

		List<WebElement> rowsNumber = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

		//Finding number of Columns
		
		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		//Finding cell value at 4th row and 3rd column

		WebElement cellAddress = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[3]/td[3]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " +value);

		driver.quit();
}
}