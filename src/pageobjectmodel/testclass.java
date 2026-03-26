package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		pageclass pg= new pageclass(driver);
		pg.Enterusername();
		pg.Enterpassword();
		pg.Enterloginbutton();
		
	}

}
