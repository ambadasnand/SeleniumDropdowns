package dropdownboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Helper;

public class AssignmentDropdown3 {
	
	@Test
	public void fbLaunch() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement year_dropdown = driver.findElement(By.id("year"));
		Select year_dd = new Select(year_dropdown);
		
		Thread.sleep(1500);
		year_dd.selectByIndex(1);
		Thread.sleep(3000);
		year_dd.selectByIndex(11);
		Thread.sleep(3000);
		year_dd.selectByVisibleText("1990");
		Thread.sleep(2000);
		
		List<WebElement> year_list = year_dd.getOptions();
		int total_year = year_list.size();
		System.out.println("Total months count in List : " + total_year);
		
		System.out.println("Year Names are: ");
		
		for (WebElement ele : year_list) {
			
			String year_name = ele.getText();
			System.out.println(year_name);
		}
		
		Helper.closeBrowser(driver);
	}

}
