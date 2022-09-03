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

public class New_Nyke {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act=new Actions(driver);
		WebElement brands=driver.findElement(By.xpath("//a[text()='brands']"));
		act.moveToElement(brands).perform();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("Loreal");
		Thread.sleep(1000);
		WebElement LorealP= driver.findElement(By.xpath("//span[text()='2839']"));
		LorealP.click();
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Category']")).click();	
		Thread.sleep(2000);
		WebElement hair = driver.findElement(By.xpath("//span[text()='Hair']"));
		act.moveToElement(hair).click().perform();
		Thread.sleep(2000);
		WebElement hairCare = driver.findElement(By.xpath("//span[text()='Hair Care']"));
		act.moveToElement(hairCare).click().perform();
		Thread.sleep(1000);
		WebElement shampoo =driver.findElement(By.xpath("//span[text()='Shampoo']"));
		act.moveToElement(shampoo).click().perform();
		
		Thread.sleep(2000);
		WebElement hair1 = driver.findElement(By.xpath("//span[text()='Hair']"));
		act.moveToElement(hair1).click().perform();
		Thread.sleep(2000);
		WebElement concern =driver.findElement(By.xpath("//span[text()='Shop By Concern']"));
		act.moveToElement(concern).click().perform();
		Thread.sleep(2000);
		WebElement colorProtection =driver.findElement(By.xpath("//span[text()='Color Protection']"));
		act.moveToElement(colorProtection).click().perform();
		
		WebElement inFilter =driver.findElement(By.xpath("//span[@class='filter-value']"));
		if(inFilter.getText().equals("Shampoo")){
			System.out.println("The Filter is applied with Shampoo");
		}
		
		Thread.sleep(1000);
		WebElement lp = driver.findElement(By.xpath("(//div[@class='css-wkluxr']/following::a)[5]"));
		act.moveToElement(lp).click().perform();
		Thread.sleep(1000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//select[@title='SIZE']")).click();	
		driver.findElement(By.xpath("(//select[@title='SIZE']/option)[2]")).click();
		
		System.out.println("MRP of the product is: "+driver.findElement(By.xpath("(//span[text()='189'])[1]")).getText());
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();	
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();	
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(frame1);
		WebElement grandTotal = driver.findElement(By.xpath("//div[@class='value medium-strong']"));
		String gt1=grandTotal.getText();
	    System.out.println("Grand total amount is: "+gt1);
		
	    driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
	    
	    //17) Check if this grand total is the same in step 14
	    WebElement grandTotal2 = driver.findElement(By.xpath("(//div[@class='value'])[2]"));
	    String gt2=grandTotal2.getText();
		if(gt2.equalsIgnoreCase(gt1)) {
			System.out.println("Grand total is the same");
		}
	    //18) Close all windows
		driver.quit();
	    
	    
	}
}
