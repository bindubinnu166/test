package seleniumwebdrivertest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
	}

}
