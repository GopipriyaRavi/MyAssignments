package week2.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//To open Leafground Button link in browser
		driver.get("https://leafground.com/button.xhtml");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To set implicit wait for 20sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To click the button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//To wait for 3000ms
		Thread.sleep(3000);

		//To Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("dashboard")) {
			System.out.println("The Title of the page is " +title);			
		}

		//To navigate the previous window
		driver.navigate().back();
		
		//To find whether the button id Enabled /Disabled
		boolean enabled = driver.findElement(By.xpath("(//button[@type='button'])[2]")).isEnabled();
		if (enabled == false) {
			System.out.println("Is the button disabled: YES, the button is disabled");
		}
		else
		{
			System.out.println("Is the button disabled: NO, the button is enabled");
		}
		
		//To find and print the location of the Submit button
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("The position of the button with the text ‘Submit’: " +location);
		
		//To find and print the color of the Save button
		String color = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("The color of the 'Save' button: " +color);
		
		//To find and print the Width and Height of the 'Submit' button
		Dimension size = driver.findElement(By.xpath("(//button[@type='button'])[5]")).getSize();
		System.out.println("The Width and Height of the 'Submit' button: " +size);
		
		//To close the browser
		driver.close();
	}
}
