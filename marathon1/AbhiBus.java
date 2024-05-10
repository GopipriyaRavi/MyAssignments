
/*
 Testcase:1 (AbhiBus)
==========
01) Launch Firefox / Chrome / Safari / Edge  
02) Load https://www.abhibus.com/
  Add  implicitlyWait -  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Chennai" in the FROM text box
04) Click the first option from the popup box
05) Type "Bangalore" in the TO text box
06) Click the first option from the popup box
07) Click the'Tomorrow' button
08) Print the name of the first resulting bus (use .getText())
09) Choose SLEEPER in the left menu from Bus Type
10) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
11) Click Show Seats
12) Choose any one Available seat
13) Select the first resulting checkbox from the Boarding Point and Dropping Point
14) Print Seats Selected, Total Fare
15) Get the Title of the page(use .getTitle())
16) Close the browser
 */
package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		//To open the Abhibus website in the chrome browser
		driver.get("https://www.abhibus.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To set implicit wait for 20sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//To wait for 3000ms
		Thread.sleep(3000);
		
		//To type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//div[contains(@class,'col')]/input")).sendKeys("Chennai");
		
		//To click the first option
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		
		//To type "Bangalore" in the TO text box
		driver.findElement(By.xpath("(//div[contains(@class,'col')]/input)[2]")).sendKeys("Bangalore");
		
		//To click the first option
		driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]")).click();
		
		//To click "Tomorrow"
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		
		//To wait for 3000ms
		Thread.sleep(3000);
		
		//To print the name of the first resulting bus
		String bus = driver.findElement(By.xpath("//h5[@class='title']")).getText();
		System.out.println("Name of the first resulting Bus: " +bus);
		
		//To wait for 3000ms
		Thread.sleep(3000);
		
		//To click the sleeper 
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		//To print the first resulting bus seat count
		String seatcount = driver.findElement(By.xpath("//div[@class='text-grey']/small")).getText();
		System.out.println("Seat Count: " +seatcount);
		
		//To click the show seats
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		
		//To wait for 3000ms
		Thread.sleep(3000);
		
		//To Choose any one Available seat
		driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[2]//button")).click();
				
		//To select the Boarding point
		driver.findElement(By.xpath("(//input[@class='primary  '])[5]")).click();
		
		//To select the Dropping Point
		driver.findElement(By.xpath("(//input[@class='primary  '])[4]")).click();
		
		//To get and print the selected seats
		String seatselected = driver.findElement(By.xpath("//span[@class='text-primary']")).getText();
		System.out.println("Seats Selected: " +seatselected);
		
		//To get and print the Total fare
		String totalfare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("Total Fare: " +totalfare);

		//To get the title of the page
		System.out.println("Title of the page: " +driver.getTitle());
		
		//To close the browser
		driver.close();
	}
}
