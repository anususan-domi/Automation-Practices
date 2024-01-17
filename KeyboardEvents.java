

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		
		//ctrl +a
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
				
		//tab
		//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();// ONLY IF YOU WANT TO CLICK SINGLE KEY
		
		//ctrl + v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
