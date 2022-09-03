package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bouncycastle.jcajce.provider.digest.SHA1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_Certificate {
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
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		driver.findElement(By.xpath("//a[text()='Resources']")).click();
		
		Shadow dom=new Shadow(driver);
		WebElement shadowElement=dom.findElementByXPath("//span[text()='Learning']");//click on learning
		Actions act=new Actions(driver);
		act.moveToElement(shadowElement).click().perform();
		Thread.sleep(1000);
		
		WebElement shadowElement2=dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(shadowElement2).perform();
		
		WebElement shadowElement3=dom.findElementByXPath("//a[text()='Salesforce Certification']");
		act.moveToElement(shadowElement3).click().perform();
		
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		Set<String>set2=driver.getWindowHandles();
		List<String>list2=new ArrayList<String>(set2);
		driver.switchTo().window(list2.get(1));	
		
		System.out.println("The Certifications available for Administrator are: ");
		System.out.println("   ");
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='trailMix-card-body_title']/a"));
		int n=1;
		for(WebElement s:findElements) {
			System.out.println(n+". "+s.getText());
		    n++;
		}
	}
}
