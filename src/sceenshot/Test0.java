package sceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step:1 typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step:2 access the method and store in RAM
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		//Step:3 specify the location
		File dest=new File("./photo/amazon.png");
		
		//Step:4 copy paste from Ram to dest location
		FileUtils.copyFile(ram, dest);
		
		
		driver.close();
		
		
		
		
	}

}
