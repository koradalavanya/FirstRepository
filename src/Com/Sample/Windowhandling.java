package Com.Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://demoqa.com/browser-windows");
	      
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
	    element.click();
	    
	    String parentwindow=driver.getWindowHandle();
	    Set<String> allwindows=driver.getWindowHandles();
	    
	      for(String ref:allwindows) {
	    	  if(!ref.equals(parentwindow)) {
	    		  driver.switchTo().window(ref);
	    		    
	    		 
	    	  }
	    	    System.out.println(driver.getTitle());
	      }
	  
	      
	}

}
