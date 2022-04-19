package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	public Skillrary(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	
	public void emailaddress(String username) {
		emailaddresstb.sendKeys(username);
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void sumbitbtn() {
		loginbutton.click();
	}
	
	

}
