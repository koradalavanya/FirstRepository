package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageclass {
	
	WebDriver driver;//webdriver instance 
	
	 public pageclass(WebDriver driver){
		this.driver=driver;
	}
	

	By username= By.xpath("//*[@name='username']");
	By password= By.xpath("//*[@name='password']");
	By loginbutton= By.xpath("//*[@type='submit']");
	
	
	public void Enterusername() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		driver.findElement(username).sendKeys("Admin");
	}
	public void Enterpassword() {
		driver.findElement(password).sendKeys("admin123");
	}
	public void Enterloginbutton() {
			driver.findElement(loginbutton).click();
	}
	
			

}
