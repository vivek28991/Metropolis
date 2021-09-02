package mhl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.beust.testng.TestNG;

public class BrouserLaunch {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver= new ChromeDriver();
		
		
	}
	
	@BeforeTest
	public void brosweDetails()
	{
		driver.get("https://apimhl.metropolisindia.com/rni-prod/#/v1.1/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//org.testng.Assert.assertTrue(driver.getCurrentUrl().equals("https://apimhl.metropolisindia.com/rni-prod/#/v1.1/login"));
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "RNI";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		
	}
	
	/*@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	
	@AfterSuite
	public void quiteBroswe()
	{
		driver.quit();
	}*/
	
	
	

}
