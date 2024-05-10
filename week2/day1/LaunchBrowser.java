package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url in the chrome browser
		driver.get("https://www.facebook.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//To enter the mail id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//To enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//To click the Login button
		driver.findElement(By.name("login")).click();
		
		//To click "Find your account and log in"
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//To get and print the Title of the current window
		System.out.println(driver.getTitle());
				
		//To close the browser
		driver.close();
	}
}
