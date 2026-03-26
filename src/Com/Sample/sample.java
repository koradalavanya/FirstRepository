package Com.Sample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='btn btn-primary'])[1]")));

		driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

//Alert handling 
		//	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//	      
		//	      Actions actions=  new Actions(driver);
		//	      
		//  actions.moveToElement(driver.findElement(By.xpath("(//*[@class="btn btn-primary"])[1]"))).click().perform();	      

		//driver.findElement(By.id("alertButton")).click();


		// alert.dismiss();


	}
}
