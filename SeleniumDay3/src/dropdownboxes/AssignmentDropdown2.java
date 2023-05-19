package dropdownboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Helper;

public class AssignmentDropdown2 {
	
	@Test
	public void fbLaunch() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement day_dropdown = driver.findElement(By.id("day"));
		Select day_dd = new Select(day_dropdown);
		
		Thread.sleep(1000);
		day_dd.selectByIndex(3);
		Thread.sleep(4000);
		day_dd.selectByIndex(11);
		Thread.sleep(4000);
		day_dd.selectByVisibleText("26");
		Thread.sleep(3000);
		
		List<WebElement> day_list = day_dd.getOptions();
		int total_days = day_list.size();
		System.out.println("Total Days count in List : " + total_days);
		
		for (WebElement ele : day_list) {
			
			String day_name = ele.getText();
			System.out.println("Day Names are :" + day_name);
		}
		
		Helper.closeBrowser(driver);
	}

}
