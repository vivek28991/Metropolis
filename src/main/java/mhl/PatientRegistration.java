package mhl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PatientRegistration extends LogIndeatils{
	

	
	@Test(priority=0)
	public void searchPatient() throws InterruptedException
	{
		WebElement mno = driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']"));
		mno.click();
		WebElement input = driver.findElement(By.xpath("//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input']"));
		input.sendKeys("9999999999");
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=1)
	public void patientType() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Add New Patient']")).click();
		Actions ac= new Actions(driver);
		WebElement claintName = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[1]/div[3]/div[1]/div[1]/div[1]/app-patient-registration[1]/div[1]/div[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]"));
		claintName.sendKeys("M5067");
		//ac.sendKeys("M5067", Keys.TAB);
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-list-item ui-corner-all']/span")).click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void demographicsDetails() throws InterruptedException
	{
		WebElement salutation = driver.findElement(By.xpath("//label[text()='Select']"));
		salutation.click();
		List<WebElement> selectsalt = driver.findElements(By.xpath("(//li[@class='ng-tns-c3-26 ui-dropdown-item ui-corner-all']/following::span)[16]"));
		
		for(WebElement ele:selectsalt)
		{
			System.out.println("values" +ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contains("Mr."));
			ele.click();
			break;
		}
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("Akash");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("banslod");
		WebElement DOB = driver.findElement(By.xpath("//input[@id='age']"));
		DOB.sendKeys("28");
		WebElement mno = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mno.sendKeys("9123382981");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("mobiletest783");
		WebElement addresh = driver.findElement(By.xpath("(//textarea[@id='remark'])[1]"));
		addresh.sendKeys("Navi Mumbai");
		WebElement zipno = driver.findElement(By.xpath("//input[@id='pincode']"));
		zipno.sendKeys("201303",Keys.TAB);
		Thread.sleep(2000);
		
		
		
	}
	

}
