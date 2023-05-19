package seleniumlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class LinkTextandPartialLink {
	
	@Test
	public void linkTest() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://auth.hollandandbarrett.com/u/login?");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		driver.findElement(By.id("password")).sendKeys("raghuBN@123");
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[3]/button")).click();
		Thread.sleep(15000);
		driver.findElement(By.partialLinkText("Vitamins"));
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int totallinks = links.size();
		System.out.println("No. of  Links in Holland & Barrett Application: " + totallinks);
		
        for (int i=0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Vitamins & Supplements";
			
			if (str==str1)
			{
				driver.findElement(By.linkText("Vitamins & Supplements")).click();
				driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/header/div/div[1]/div[3]/div/section/nav/ul/li[1]/a"));
			}
			
			
		}
		
	}

}
