package mhl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LogIndeatils extends BrouserLaunch {

	@Test
	public void loginDetails() throws InterruptedException {
		Actions ac = new Actions(driver);
		WebElement username = driver.findElement(By.xpath("//input[@id='userId']"));
		username.sendKeys("vivek.singh2");
		ac.sendKeys(username,Keys.TAB).build().perform();
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Metropolis@07");
		ac.sendKeys(password, Keys.TAB).build().perform();
		/*
		 * WebElement selorg =
		 * driver.findElement(By.xpath("//label[contains(text(),'ULHASNAGAR')]")
		 * ); Select sc= new Select(selorg);
		 * sc.selectByVisibleText("ULHASNAGAR"); Thread.sleep(5000);
		 */
		
		WebElement org = driver.findElement(By.xpath("//div[@class='ui-inputgroup']/following::label"));
		org.click();
		List<WebElement> selectproloc= driver.findElements(By.xpath("//span[text()='ULHASNAGAR']"));
		System.out.println(selectproloc.size());
		for(WebElement ele:selectproloc)
		{
			System.out.println("values" +ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contains("ULHASNAGAR"));
			ele.click();
			break;
		}
		
		Thread.sleep(3000);
		/*WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();*/
		
		
		WebElement samplelocation = driver.findElement(By.xpath("//label[contains(text(),'Select Location')]"));
		samplelocation.click();
		List<WebElement> list = driver
				.findElements(By.xpath("//li[@class='ng-tns-c3-3 ui-dropdown-item ui-corner-all']/following::span"));
		System.out.println(list.size());
		for (WebElement els : list) {

			System.out.println("Values " + els.getAttribute("innerHTML"));

			if (els.getAttribute("innerHTML").contains("KALYAN PATRI POOL")) {

				els.click();
				break;
			}
		}
		
			WebElement processlocation = driver.findElement(By.xpath("//label[text()='Default Location']"));
			processlocation.click();
			List<WebElement> selectproloc1= driver.findElements(By.xpath("(//div[@class='ui-dropdown-items-wrapper']/following::li)[3]"));
			System.out.println(selectproloc1.size());
			for(WebElement ele:selectproloc1)
			{
				System.out.println("values" +ele.getAttribute("innerHTML"));
				if(ele.getAttribute("innerHTML").contains("VIDYAVIHAR"));
				ele.click();
				break;
			}
			
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
			login.click();
			

	}

}
