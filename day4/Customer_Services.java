package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customer_Services {
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
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		//Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//4. Click on Products and Mousehover on Service
		Shadow dom=new Shadow(driver);
		WebElement product=dom.findElementByXPath("//span[text()='Products']");
		product.click();
        
		Thread.sleep(100);
		WebElement service=dom.findElementByXPath("//div[text()='Service']");
		Actions act=new Actions(driver);
		act.moveToElement(service).perform();
		
		WebElement customerService=dom.findElementByXPath("//a[text()='Customer Service']");
		customerService.click();
		
		List<WebElement> namesOfServices = driver.findElements(By.xpath("//ul[@class='page-list page-list-level-2']//a"));
		System.out.println("List of Services Availables");
		System.out.println("  ");
		int n=1;
		for(int i=0;i<namesOfServices.size();i++) {
			System.out.println(n+". "+namesOfServices.get(i).getText());
			n++;
		}
		System.out.println("  ");
		//7. Verify the title
		System.out.println("Title of the page: "+driver.getTitle());
		
		
		
		
		
	}
}
