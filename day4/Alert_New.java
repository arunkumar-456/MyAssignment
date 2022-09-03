package week4.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_New {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Number of windows openned: " + windowHandles.size());
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(list.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println("Number of windows openned: " + windowHandles2.size());
		List<String> list1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(list1.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(list1.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Text in alert  " + alert.getText());
		alert.accept();
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
	}}
