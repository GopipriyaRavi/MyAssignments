package week2.homeassignment.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//To open Facebook page in Chrome browser
		driver.get("https://en-gb.facebook.com/");
		
		//To maximize the screen
		driver.manage().window().maximize();
		
		//To add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To Open Create new account window
		driver.findElement(By.linkText("Create new account")).click();
		
		//To Enter First name
		driver.findElement(By.name("firstname")).sendKeys("Gopipriya");
		
		//To Enter Last name
		driver.findElement(By.name("lastname")).sendKeys("Ravi");
		
		//To Enter Mail ID 
		driver.findElement(By.name("reg_email__")).sendKeys("gopipriyaravi@gmail.com");
		
		//To Enter Password
		driver.findElement(By.id("password_step_input")).sendKeys("Test@1072");
		
		//To select date from dropdown using SelectByIndex
		WebElement dropDate = driver.findElement(By.id("day"));
		Select date = new Select(dropDate);
		date.selectByIndex(1);
		
		//To select Month from dropdown using SelectByVisible
		WebElement dropMonth = driver.findElement(By.id("month"));
		Select month = new Select(dropMonth);
		month.selectByVisibleText("Feb");
		
		//To select year from dropdown using SelectByValue
		WebElement dropYear = driver.findElement(By.id("year"));
		Select year = new Select(dropYear);
		year.selectByValue("1996");
		
		//To select Radio button
		driver.findElement(By.name("sex")).click();
		
		//To close the Chrome browser
		driver.close();
	}

}
