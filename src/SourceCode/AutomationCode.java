package SourceCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationCode {
	public WebDriver driver;
	
	public void OpenUrl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\demo\\src\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	public void FacebookLoginLogout() throws Exception{
		driver.findElement(By.id("email")).sendKeys("phossain010@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("10845@pvz");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

	public static void main(String[] args) throws Exception{
		AutomationCode fb = new AutomationCode();
		fb.OpenUrl();
		fb.FacebookLoginLogout();
	}

}
