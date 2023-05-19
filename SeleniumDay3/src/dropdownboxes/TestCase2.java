package dropdownboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Helper;

public class TestCase2 {
	
	@Test
	public void fbLaunch() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		List<WebElement> month_list = month_dd.getOptions();
		int total_month = month_list.size();
		System.out.println("Total months count in List : " + total_month);
		
		for (WebElement ele : month_list) {
			
			String month_name = ele.getText();
			System.out.println("Month Names are :" + month_name);
		}
		
		driver.quit();
	}

}
