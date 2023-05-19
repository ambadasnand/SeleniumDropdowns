package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class TestScrollBy {
	
	String url = "https://www.spicejet.com/";
	@Test
	public void test( ) throws InterruptedException {
		
		WebDriver driver = Helper.startBrowser("GC");
		driver.manage().window().maximize();
		driver.get(url);
		((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		Thread.sleep(6000);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-800)");
		driver.close();
		
	}

}
