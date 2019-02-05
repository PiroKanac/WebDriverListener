package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import listener.DriverUpdate;

public class TC_001 {
	
	@Test
	public void tc001() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Create objects for event driver and listener and register driver
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		DriverUpdate listener = new DriverUpdate();
		eventDriver.register(listener);
		
		
		
		eventDriver.navigate().to("http://www.theTestingWorld.com");
		
		eventDriver.findElement(By.xpath("//a[@title='CorporateTraining']")).click();
	}

}
