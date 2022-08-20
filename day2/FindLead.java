package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("babu");
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    System.out.println("The title is:"+ driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("I confirmed the title has View Lead");
		}
		else
			System.out.println("Not confirmed");
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("LNT");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//driver.close();

		
		
}
}

