

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleScrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=driver;
				
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		//1) scroll down page by pixel
		
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2) scroll down page till the element is present
		/*WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
			
		js.executeScript("arguments[0].scrollIntoView();",flag);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		//3) scroll down the page till end of the document
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
				
		Thread.sleep(3000);
		
		// go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}
