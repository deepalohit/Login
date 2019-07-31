package basicFunctionalities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login 
{
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Auto\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}		


	//public class loginLink {
	@Test
	public void link() throws InterruptedException{
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("d@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
		
	}
}





