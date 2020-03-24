package DataDriven1stSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMCasesSection {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\\\Personal\\Selenium files\\\\Eclisps standalone and extension fles\\\\Chrome extension 79 file\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("srinivas60.yerala@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("srinu@2906");
		
		driver.findElement(By.xpath("//span[contains(text(),'Cases')]")).click();;
		
		driver.findElement(By.xpath("//button[@class ='ui linkedin button']//i[@class='edit icon'])")).click();
		
		
		
		
		
	}

}
