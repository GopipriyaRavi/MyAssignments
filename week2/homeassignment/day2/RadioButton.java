package week2.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//To launch the URL in the chrome browser
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To set implicit wait for 30 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To select the any radio button under 'Your most favourite browser'
		driver.findElement(By.xpath("(//h5[contains(text(),'Your most favorite browser')]//following::label)[2]")).click();
		
		//To check whether the radio button is selected or not
		boolean selected = driver.findElement(By.xpath("(//h5[contains(text(),'Your most favorite browser')]//following::label)[2]")).isSelected();

		//To confirm the status of the radio button and if already selected, tried to deselect by clicking again
		if(!selected)
		{
			System.out.println("Yes, the radio button under 'Your most favorite browser' is selected");
			driver.findElement(By.xpath("(//h5[contains(text(),'Your most favorite browser')]//following::label)[2]")).click();
			boolean deselected = driver.findElement(By.xpath("(//h5[contains(text(),'Your most favorite browser')]//following::label)[2]")).isSelected();
			if(!deselected)
			{
				System.out.println("No, the radio button under 'Your most favorite browser' is not deselected");
			}
			else
			{
				System.out.println("Yes, the radio button under 'Your most favorite browser' is deselected");
			}
		}
		else
		{
			System.out.println("No, the radio button under 'Your most favorite browser' is not selected");
		}
		
		//To select the any radio button under 'Unselectable'
		driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label")).click();
		
		//To check whether the radio button is selected or not
		boolean usselected = driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label")).isSelected();

		//To confirm the status of the radio button and if already selected, tried to deselect by clicking again
		if(!usselected)
		{
			System.out.println("Yes, the radio button under 'Unselectable' is selected");
			
			//To add 3000sec wait
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label")).click();
			boolean usdeselected = driver.findElement(By.xpath("//h5[text()='UnSelectable']/following::label")).isSelected();
			if(usdeselected== false)
			{
				System.out.println("Yes, the radio button under 'Unselectable' is deselected");
			}
			else
			{
				System.out.println("No, the radio button under 'Unselectable' is not deselected");
			}
		}
		else
		{
			System.out.println("No, the radio button under 'Unselectable' is not selected");
		}
				
		//To Identify the radio button that is initially selected by default
		boolean enabled = driver.findElement(By.xpath("(//h5[contains(text(),'Find the default select radio button')]//following::label)[3]")).isEnabled();
		System.out.println("Is the button enabled by default: "+enabled);

		//To Identify the radio button that is initially selected by default

//		for (int i = 1; i <= 4; i++) {
//			boolean rbdefault = driver.findElement(By.xpath("(//h5[contains(text(),'Find the default select radio button')]//following::label)[i]")).isSelected();
//
//			if(rbdefault == true)
//			{
//				String enabledbutton = driver.findElement(By.xpath("(//h5[contains(text(),'Find the default select radio button')]//following::label)[i]")).getText();
//				System.out.println("The button is "+enabledbutton);
//			}
//			else
//			{
//				System.out.println("The button is disabled");
//			}
//		}
		
		//To check and select the age group (21-40 Years) if not already selected.
		boolean ageselect = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("Is the age group(21-40 Years) enabled by default: " +ageselect);
		
		driver.close();
	}
}
