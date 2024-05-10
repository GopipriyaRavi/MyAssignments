package week2.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadInformation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//To Open Leaftaps link
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To set implicit wait for 20secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To locate and enter Username field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//To locate and enter Password field
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//To locate and click Login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//To click the CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//To click the Leads tab
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		
		//To click the Create Lead tab
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		//To locate and enter Company name field
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		
		//To locate and enter First name field
		driver.findElement(By.xpath("//input[contains(@id, 'firstName')]")).sendKeys("Gopipriya");
		
		//To locate and enter last name field
		driver.findElement(By.xpath("//input[contains(@id, 'lastName')]")).sendKeys("R");
		
		//To locate and enter first name(local) field
		driver.findElement(By.xpath("//input[contains(@id, 'firstNameLocal')]")).sendKeys("GP");
				
		//To locate and enter Department Name
		driver.findElement(By.xpath("//input[contains(@id, 'departmentName')]")).sendKeys("Selenium Automation Tester");
		
		//To locate and enter Description
		driver.findElement(By.xpath("//textarea[contains(@id, 'description')]")).sendKeys("Automation Testing using Selenium JAVA");

		//To locate and enter Email
		driver.findElement(By.xpath("//input[contains(@id, 'Email')]")).sendKeys("gopipriya@gmail.com");
		
		//To locate and select State/Province
		WebElement state = driver.findElement(By.xpath("//select[contains(@id, 'StateProvince')]"));
		Select stateprovince = new Select(state);
		stateprovince.selectByVisibleText("New York");
		
		//To locate and click Create Lead button
		driver.findElement(By.xpath("//input[contains(@name, 'submitButton')]")).click();
		
		//To locate and click Edit button
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		//To locate and clear the description field
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).clear();
		
		//To locate and enter Important note field
		driver.findElement(By.xpath("//textarea[contains(@id,'importantNote')]")).sendKeys("Learning Selenium Webdriver using JAVA, finding elements with XPATH");
		
		//To click Update button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//To print the Title of the Resulting page
		System.out.println(driver.getTitle());
		
		//To close the browser window
		driver.close();
	}
}
