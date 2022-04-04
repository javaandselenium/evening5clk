package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 WebElement ele = driver.findElement(By.name("sex"));
		if(ele.isSelected()) {
			System.out.println("Pass:element is selected");
		}
		else
		{
			System.out.println("fail:element is not selected");
			
		}
		driver.close();
		}
		

	}


