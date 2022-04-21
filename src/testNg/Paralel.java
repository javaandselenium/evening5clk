package testNg;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class Paralel {
	public WebDriver driver;
	
	@Parameters({"browserName"})
	@Test
	public void tc1(String browser) {
		if(browser.equals("chrome")){
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}

}
