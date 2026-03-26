package Com.Sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class takescreenshot {
	

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		TakesScreenshot ts= (TakesScreenshot) driver;//driver casting only for scereenshot 
		//(Webdriver any interface lo chrome driver class lo takescreenshot interface ni access chydaniki)
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\hp\\Desktop\\testscreenshots.png.png");
		FileUtils.copyFile(source,destination);
		System.out.println("Screenshot takes successfully");
		driver.quit();
		
		

}
}