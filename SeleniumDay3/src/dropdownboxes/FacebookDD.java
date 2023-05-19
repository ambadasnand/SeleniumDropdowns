package dropdownboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Helper;

public class FacebookDD {
	
	@Test
	public void fbLaunch() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		Thread.sleep(1000);
		month_dd.selectByIndex(3);
		Thread.sleep(5000);
		month_dd.selectByIndex(11);
		Thread.sleep(5000);
		month_dd.selectByVisibleText("Sep");
		Thread.sleep(5000);
		Helper.closeBrowser(driver);
	}

}
