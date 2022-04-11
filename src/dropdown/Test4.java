package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement dd = driver.findElement(By.id("MTR"));
Select s=new Select(dd);
s.selectByIndex(0);
s.selectByValue("c");
s.selectByVisibleText("Milk");

 List<WebElement> op = s.getAllSelectedOptions();

for(WebElement alloption:op) {
	System.out.println(alloption.getText());
}
driver.close();
	}

}
