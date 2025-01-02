

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.javatpoint.com/");
		
	    List <WebElement> listAnchorEle= driver.findElements(By.tagName("a"));
	    System.out.println(listAnchorEle.size());
	    
	    for (WebElement link: listAnchorEle)
	    {
	    	 System.out.println(" Url  :"+ link);
	    }
	    
	    for(WebElement link:listAnchorEle)
	    {
	    	String url=link.getAttribute("href");
	    	verifyLink(url);
	    }
	}
	
	static void verifyLink(String url) throws  IOException
	{
		try
		{
		URL urlLink=new URL(url);
		HttpURLConnection httpURLConnection=(HttpURLConnection) urlLink.openConnection();
		httpURLConnection.connect();
		
		if(httpURLConnection.getResponseCode()==200)
		{
			System.out.println(url+"  1         "+httpURLConnection.getResponseMessage()+" Valid Link");
			
			
		}
		else
		{
			System.out.println(url+"  2 _  "+ httpURLConnection.getResponseMessage()+" _  is a broken link");
		}
		}
		catch(Exception e)
		{
			System.out.println(url +" 3"+" is a broken link");
		}
		
	}
	
	
}

