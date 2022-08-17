package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		findElement.sendKeys("newcrazy12@gmail.com");
		findElement.clear();
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		findElement2.sendKeys("Crazy12345");
		findElement2.clear();
		WebElement findElement3 = driver.findElement(By.linkText("Create New Account"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.name("firstname"));
		findElement4.sendKeys("New");
		WebElement findElement5 = driver.findElement(By.name("lastname"));
		findElement5.sendKeys("crazy");
		WebElement findElement6 = driver.findElement(By.name("reg_email__"));
		findElement6.sendKeys("newcrazy12@gmail.com");
		WebElement findElement7 = driver.findElement(By.name("reg_passwd__"));
		findElement7.sendKeys("reg_passwd__");
		WebElement findElement8 = driver.findElement(By.id("day"));
		Select fn = new Select(findElement8);
		fn.selectByValue("10");
		WebElement findElement9 = driver.findElement(By.id("month"));
		Select fI = new Select(findElement9);
		fI.selectByIndex(10);
		WebElement findElement10 = driver.findElement(By.id("year"));
		Select fl = new Select(findElement10);
		fl.selectByVisibleText("2020");
		driver.findElement(By.name("sex")).click();

}
}