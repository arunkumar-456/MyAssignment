package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassXpath {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=username]").sendkeys("Demosalesmanager");
		//driver.findElement(By.xpath("//input[contains(@name='SSWOR)]").sendKeys("Demasalesmanager");
		
	}
}
