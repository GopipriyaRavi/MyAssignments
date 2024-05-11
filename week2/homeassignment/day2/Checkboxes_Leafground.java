package week2.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Leafground {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		
		//To launch the link in chrome browser
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To set implicit wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To click the "Basic Checkbox”
		driver.findElement(By.xpath("//div[contains(@class, 'ui-chkbox-box')]")).click();
		
		//To click the "Notification Checkbox"
		driver.findElement(By.xpath("(//div[contains(@class, 'ui-chkbox-box')])[2]")).click();
		
		//To find and verify whether the expected message is displayed after clicking the "Notification Checkbox"
		String msg = driver.findElement(By.xpath("//span[@class= 'ui-growl-title']")).getText();
		if (msg.equalsIgnoreCase("checked")) {
			System.out.println("The expected message is displayed: " +msg);			
		}
		else
		{
			System.out.println("The expected message is not displayed");
		}
		
		//To click the favorite languages
		driver.findElement(By.xpath("//div[@class= 'ui-chkbox ui-widget']")).click();   	//Java
		driver.findElement(By.xpath("(//div[@class= 'ui-chkbox ui-widget'])[2]")).click();	//Python
		driver.findElement(By.xpath("(//div[@class= 'ui-chkbox ui-widget'])[5]")).click();	//Others
		
		//To wait for 6000ms
		Thread.sleep(6000);
		
		//To click the Tri state checkbox
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		
		//To wait for 1000ms
		Thread.sleep(1000);
		
		//To verify which tri-state option has been chosen.
		String tristate = driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		System.out.println("Tristate option choosen: " +tristate);
		
		//To wait for 6000ms
		Thread.sleep(6000);
		
		//To click the Toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//To wait for 1000ms
		Thread.sleep(1000);
		
		//To verify whether the expected message is displayed
		String togglemsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		if (togglemsg.equalsIgnoreCase("checked")) {
			System.out.println("The expected message is printed: " +togglemsg);
		}
		else
		{
			System.out.println("The expected message is not printed");
		}
		
		//To check "verify if the Checkbox is disabled."
		boolean verifycheckbox = driver.findElement(By.xpath("(//div[contains(@class,'selectbooleancheckbox')])[3]")).isSelected();
		if (verifycheckbox == false) {
			System.out.println("The 'Checkbox is disabled' is selected: " +verifycheckbox);			
		}
		else
		{
		System.out.println("The 'Checkbox is disabled' is selected: " +verifycheckbox);
		}
		
		//To click the dropdown of multiple checkboxs in the dropdown
		driver.findElement(By.xpath("//ul[contains(@class,'multiple-container')]")).click();
		
		//To select multiple checkboxes
		driver.findElement(By.xpath("//li[contains(@class,'selectcheckboxmenu')]/div")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'selectcheckboxmenu')])[3]/div")).click();
		driver.findElement(By.xpath("(//li[contains(@class,'selectcheckboxmenu')])[6]/div")).click();

		//To close the dropdown
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-close')]")).click();
		
		//Additional actions
		boolean enabled = driver.findElement(By.xpath("(//div[@class= 'ui-chkbox ui-widget'])[3]")).isSelected();
		if (enabled == true) {
			System.out.println("Java script is enabled: " +enabled);
		}
		else
		{
			System.out.println("Java script is enabled: " +enabled);
		}
		
		//To close the popup
		driver.findElement(By.xpath("//div[contains(@class,'closethick')]")).click();
		
		//To wait for 5000ms
		Thread.sleep(5000);
		
		//To click the Tri state checkbox
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		
		//To verify which tri-state option has been chosen.
		String tristate1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		System.out.println("Tristate option choosen: " +tristate1);
		
		//To close the browser
		driver.close();
	}
}
