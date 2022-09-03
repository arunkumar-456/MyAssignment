package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Sales {
	public static void main(String[] args) throws InterruptedException {
		
      WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//span[@dir='ltr'])[2]")).click();
		Set<String>set=driver.getWindowHandles();
		List<String>list=new ArrayList<String>(set);
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		System.out.println("Title of current Window: "+driver.getTitle());
		
		driver.switchTo().window(list.get(0));
		System.out.println("Title of parent window: "+driver.getTitle());
		
		//11.close the browser
		driver.quit();
		
	}



}
