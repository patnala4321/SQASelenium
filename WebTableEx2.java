package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEx2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///D:/Local%20Disk/Selenium/Html/Table1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Finding number of Rows(//table/thead)

		List<WebElement> rowsNumber = driver.findElements(By.xpath(" //table/thead|//table/tbody/tr"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		WebElement cellAddress = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " + value);

		WebElement cell = null;
		String cellValue = null;
		
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 4; j++) {

				cell = driver.findElement(By.xpath("//table/thead/tr[" + i + "]/th[" + j + "]"));
				cellValue = cell.getText();
				System.out.format("%15s", cellValue);
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 4; j++) {

				cell = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]"));
				cellValue = cell.getText();
				System.out.format("%15s", cellValue);
			}
			System.out.println();
		}
		driver.quit();
	}
}
