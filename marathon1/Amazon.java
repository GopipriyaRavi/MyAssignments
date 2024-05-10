/*
 * Testcase:2(Amazon)
===============
01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags for b" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 30,000 results for "bags for boys"
06) Select the first brand in the left menu
    (like American Tourister)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())
 */

package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		//To open the Amazon website in the chrome browser
		driver.get("https://www.amazon.in/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//To set implicit wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To print the text in the search element
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		
		//To wait for 3000ms
		Thread.sleep(3000);
		
		//To click the search button
		driver.findElement(By.xpath("(//div[@class='left-pane-results-container']/div)[1]")).click();
		
		//To get the Total number of result
		String totalresult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Total No of Result: " +totalresult);
		
		//To select the first brand
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span/span/li/span")).click();
		
		//To wait for 3000ms
		Thread.sleep(3000);

		//To select the Newest arrivals in the "sort by" dropdown
		WebElement sortby = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select sort = new Select(sortby);
		sort.selectByVisibleText("Newest Arrivals");

		//To wait for 3000ms
		Thread.sleep(3000);

		//To print the Product name
		String productname = driver.findElement(By.xpath("//span[contains(@class,'a-color-base a-text-normal')]")).getText();
		System.out.println("Product Name: " +productname);
		
		//To print the discount price
		String discountprice = driver.findElement(By.xpath("//span[contains(@class,'a-price-whole')]")).getText();
		System.out.println("Discount price: " +discountprice);
		
		//To get the title of the page
		System.out.println("Title of the page: " +driver.getTitle());
	
		//To close the browser
		driver.close();
	}

}
