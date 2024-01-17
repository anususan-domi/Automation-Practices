

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorUsage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//inputbox
		//driver.findElement(By.id("RESULT_TextField-1")).sendKeys("John");
		WebElement firstname=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')", firstname);
		

		//radio button
		//driver.findElement(By.id("RESULT_RadioButton-7_0")).click();
		WebElement male_rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();", male_rd);
		
		//checkbox
		
		//driver.findElement(By.id("RESULT_CheckBox-8_0")).click();
		WebElement chkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();", chkbox);
		
		
		//button
		WebElement btn=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();", btn);
		
		
	}

}
