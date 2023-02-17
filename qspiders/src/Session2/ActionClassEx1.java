package Session2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEx1 {

	public static void main(String[] args) {
	
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		/*WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		
		//Action()
		Actions act=new Actions(driver);
		act.moveToElement(mobiles).perform();*/
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(fashion).perform();
		act1.contextClick(fashion).perform();
		
		
	}

}
