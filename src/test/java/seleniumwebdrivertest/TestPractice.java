package seleniumwebdrivertest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TestPractice {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String str=driver.getTitle();
		System.out.println(str);
		if(str.equals("Google"))
			System.out.println("true");
		else
		{
			System.out.println("false");
			
		}
		
	// 	driver.wait(1000);
		driver.close();
		
		

		driver.get("https://www.google.com/");

		//File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//FileUtils.copyFile(screenshotFile, new File("screenshot.png"));
		
			
		
		

	}
	

}
