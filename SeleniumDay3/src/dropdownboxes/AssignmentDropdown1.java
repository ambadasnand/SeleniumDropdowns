package dropdownboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Helper;

public class AssignmentDropdown1 {
	
	@Test
	public void countnumber() throws InterruptedException {
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.easycalculation.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("log_rgstr")).click();
		System.out.println("Page Title is: " + driver.getTitle());
		
		WebElement country_dropdown = driver.findElement(By.name("country"));
		Select countries = new Select(country_dropdown);
		
		List<WebElement> country_list = countries.getOptions();
		int total_month = country_list.size();
		System.out.println("Total country count in the List : " + total_month);
		
		System.out.println("Country Names are :");
		
		for (WebElement ele : country_list) {
			
			String country_name = ele.getText();
			System.out.println(country_name);
		}
		
		driver.quit();
	}

}
