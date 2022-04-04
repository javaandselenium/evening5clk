package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.id("email"));
	
	if(username.isDisplayed()) {
		System.out.println("Pass:element is dispalyed");
	}
	else
	{
		System.out.println("Fail:element is not dispalyed");
	}
	
	driver.close();
	}

}
