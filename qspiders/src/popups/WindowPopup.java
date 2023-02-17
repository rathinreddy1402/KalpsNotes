package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPopup {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\Shobha\\\\Downloads\\\\chromedriver_win32 (7)\\\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver	.manage().window().maximize();	
		driver.get("https://www.naukri.com");
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(jobs).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Jobs by skill")).click();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		//switch to new window
		
	  String mainId = driver.getWindowHandle();
	  System.out.println(mainId);
	  Set<String> allId = driver.getWindowHandles();
	  for(String id:allId)
	  {
		  System.out.println(id);
		  if(!mainId.equals(id))
		  {
			 
			  driver.switchTo().window(id);
			 // System.out.println(id);
		  }
	  }
	  Thread.sleep(2000);
	
	  driver.switchTo().window(mainId);
	 
	 }
}
