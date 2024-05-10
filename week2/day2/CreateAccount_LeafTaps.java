package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_LeafTaps {
	
public static void main(String[] args) {
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url -> get() -> Load a new web page in the current browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// Locate the username text field
		WebElement eleUsername = driver.findElement(By.xpath("//input[@id = 'username']"));
		
		// perform the action on the WebELement
		eleUsername.sendKeys("Demosalesmanager");
		
		// enter the password in the password field
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		
		// Click on the Login button
		driver.findElement(By.xpath("//input[contains(@class, 'dec')]")).click();
		
		//to get the title -> getTitle() -> Get the title of the current page. 
		System.out.println(driver.getTitle());
		
		// click crmsfa link
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		// click Leads link
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		
		// click CreateLead Link
		driver.findElement(By.xpath("(//a[contains(text(), 'Lead')])[3]")).click();
		
		// enter the company name
		driver.findElement(By.xpath("//input[contains(@id, 'company')]")).sendKeys("TestLeaf");
		
		// enter the firstname
		driver.findElement(By.xpath("//input[contains(@id, 'firstName')]")).sendKeys("Gopipriya");
		
		// enter the lastname
		driver.findElement(By.xpath("//input[contains(@id, 'lastName')]")).sendKeys("Ravi");
		
		// locate the source dropdown
		WebElement sourceDD = driver.findElement(By.xpath("//select[contains(@id, 'SourceId')]"));
		// Instantiate the Select class
		Select sec = new Select(sourceDD);
		// To select the Direct Mail dropdown options use Select class methods
		sec.selectByIndex(3);
		
		// To select the Car and Driver option inside Market Campaign dropdown
		WebElement marketDD = driver.findElement(By.xpath("//select[contains(@id, 'marketingCam')]"));
		Select sec1 = new Select(marketDD);
		sec1.selectByVisibleText("Car and Driver");
		
		// To select by using value 
		WebElement industryDD = driver.findElement(By.xpath("//select[contains(@id, 'industry')]"));
		Select sec2 = new Select(industryDD);
		sec2.selectByValue("IND_MEDIA");
		
		// to close the browser -> close() -> Close the current window
		driver.close();
	}
}
