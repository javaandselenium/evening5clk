package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");

WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].click();",ele);




String title = driver.getTitle();
System.out.println(title);

if(title.equals("actiTIME - Login")) {
	System.out.println("Pass:home page is displayed");
}
else
{
	System.out.println("Fail:home page is not dispalyed");
}

String url = driver.getCurrentUrl();
System.out.println(url);

driver.close();


	}

}
