package mhl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PaymentMode extends PatientRegistration{
	
	
	
	@Test(priority=3)
	public void addTest() throws InterruptedException
	{
		 WebElement addtest = driver.findElement(By.xpath("//span[text()='Add Test']"));
		 addtest.click();
		 Thread.sleep(2000);
		WebElement Rby = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-order[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]"));
		Rby.sendKeys("PRAVIN");
		driver.findElement(By.xpath("//span[text()='PRAVIN   SHAH']")).click();
		Thread.sleep(4000);
		WebElement pleloname = driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input'])[3]"));
		pleloname.sendKeys("SHAILENDRA");
		driver.findElement(By.xpath("//span[text()='SHAILENDRA GAVALI']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Proceed to Search and Add Test']")).click();;
		
	}
	
	@Test(priority=4)
	public void ProcessAddTest() throws InterruptedException
	{
		WebElement processtoadd = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-order[1]/div[3]/p-accordion[1]/div[1]/p-accordiontab[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]"));
		processtoadd.click();
		Thread.sleep(4000);
		WebElement testcode = driver.findElement(By.xpath("(//input[@type='text'])[19]"));
		testcode.sendKeys("G0027");
		WebElement cbctest = driver.findElement(By.xpath("//span[text()='G0027 - Fasting Glucose  plasma']"));
		cbctest.click();
		WebElement addtest = driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]"));
		addtest.click();
		
		
	}

}
