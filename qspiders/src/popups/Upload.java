package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.monsterindia.com/");
			
driver.findElement(By.xpath("//div[contains(@class,'heroSection-buttonContainer_secondaryBtn secondaryBtn')]")).click();

WebElement data = driver.findElement(By.xpath("//input[@id='file-upload']"));
data.sendKeys("C:\\\\Users\\\\Shobha\\\\Downloads\\\\extentReportDoc.txt");

System.out.println("uploaded");
	}

}
