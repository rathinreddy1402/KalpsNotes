package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar 
{
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\Shobha\\\\Downloads\\\\chromedriver_win32 (7)\\\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		          String month = "December 2022";
                   String date = "30";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::"
				+ "div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	driver.findElement(By.xpath("//span[text()='Done']")).click();
	
		
	}
}
