package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Architect_Class {
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
		
		Shadow dom = new Shadow(driver);
		WebElement shadowElement=dom.findElementByXPath("//span[text()='Learning']");//click on learning
		Actions act=new Actions(driver);
		act.moveToElement(shadowElement).click().perform();
		Thread.sleep(1000);
		
		Shadow dom1=new Shadow(driver);
		WebElement shadowElement2=dom1.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(shadowElement2).perform();
		
		Shadow dom2=new Shadow(driver);
		WebElement shadowElement3=dom2.findElementByXPath("//a[text()='Salesforce Certification']");
		act.moveToElement(shadowElement3).click().perform();
		
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		
		WebElement text=driver.findElement(By.xpath
		("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
		System.out.println("       Salesforce Architect");
		System.out.println("       ");
		System.out.println(text.getText());
		System.out.println("       ");
		
		List<WebElement> listCert = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		System.out.println("List of Salesforce Architect Certifications Available are");
		System.out.println("       ");
		int n=1;
		for(int i=0;i<listCert.size();i++) {
		System.out.println(n+". "+listCert.get(i).getText());
		n++;
		}
		System.out.println("       ");
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		//10. Get the List of Certifications available
		List<WebElement> listCertForArchitect = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		System.out.println("List of Application Architect Certifications Available are");
		System.out.println("       ");
		for(int i=0;i<=3;i++) {
		System.out.println(listCertForArchitect.get(i).getText());
		
	} 
}
