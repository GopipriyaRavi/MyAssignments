package week2.homeassignment.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_LeafTaps {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//To open Leaftaps link in Chrome browser
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the Chrome window
		driver.manage().window().maximize();
		
		//To set the implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To Enter Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//To Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//To click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//To click Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//To click Create Account Tab
		driver.findElement(By.linkText("Create Account")).click();
		
		//To Enter Account name
		driver.findElement(By.id("accountName")).sendKeys("Gopipriya");
		
		//To Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//To select the Industry
		WebElement dropIndustry = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(dropIndustry);
		industry.selectByIndex(3);
		
		//To select Ownership
		WebElement dropOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(dropOwnership);
		ownership.selectByVisibleText("S-Corporation");
		
		//To select Source
		WebElement dropSource = driver.findElement(By.name("dataSourceId"));
		Select source = new Select(dropSource);
		source.selectByValue("LEAD_EMPLOYEE");
		
		//To select Market Campaign
		WebElement dropMC = driver.findElement(By.id("marketingCampaignId"));
		Select marketcampaign = new Select(dropMC);
		marketcampaign.selectByIndex(6);
		
		//To select State/Province
		WebElement dropState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(dropState);
		state.selectByValue("TX");
		
		//To click create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//To close the Chrome browser
		driver.close();
	}
}
