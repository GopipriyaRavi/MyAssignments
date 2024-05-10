package week2.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'x-tab-strip-text ')])[2]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		Thread.sleep(3000);

		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();

		System.out.println("The Lead ID is " +text);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		
		if(text2.contains("No records to display"))
		{
			System.out.println("Lead details are successfully deleted, Hence closing"); 
		}
		
		driver.close();

	}
}
