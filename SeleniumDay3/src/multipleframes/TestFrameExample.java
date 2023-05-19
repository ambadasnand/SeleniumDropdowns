package multipleframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class TestFrameExample {
	
	@Test
	public void frames() throws InterruptedException {
	
	WebDriver  driver = Helper.startBrowser("GC");
	//driver.get("https://www.easycalculation.com/index.php");
	driver.navigate().to("C:\\Users\\Admin\\Desktop\\frame2.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	int totalframes = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames: " + totalframes);
	
	driver.switchTo().frame("easycalculation");
	driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
	driver.findElement(By.id("log_email")).sendKeys("9740673180");
	driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
	driver.findElement(By.xpath("//input[contains(@name, 'log_submit')]")).click();
	
	driver.navigate().to("C:\\Users\\Admin\\Desktop\\frame2.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/a")).click();
	
	driver.navigate().to("https://www.selenium.dev");
	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	Thread.sleep(5000);
	driver.navigate().to("C:\\Users\\Admin\\Desktop\\frame2.html");
	
	driver.switchTo().frame("My store");
	driver.navigate().to("https://demo.opencart.com");
	driver.findElement(By.xpath("search")).sendKeys("product");
	driver.findElement(By.xpath("/html/body")).click();
	Thread.sleep(5000);
	driver.quit();
	}

}
