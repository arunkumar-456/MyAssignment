package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletetestLead {
 
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//WebElement elementwelcomex = driver.findElement(By.xpath("//h2[contains(text(),'Welcome']"));
		//String text = elementwelcomex.getText();
		//System.out.println(text);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		WebElement elementfindlead = driver.findElement(By.linkText("Find Leads"));
		elementfindlead.click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 WebElement elementfind5lead = driver.findElement(By.linkText("Find Leads"));
			elementfind5lead.click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10112");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//	driver.close();
		
}
}