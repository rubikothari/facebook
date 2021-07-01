package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebook1 {

WebDriver driver;
SoftAssert softassert = new SoftAssert();

@BeforeTest		
public void SetDriver()
{

		System.setProperty("webdriver.chrome.driver", "C:\\\\rubi\\\\chromedriver.exe");
		driver=new ChromeDriver();
		 
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rubykothari_96@yahoo.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Rub!9408125739");
		driver.findElement(By.xpath("//*[@name='login']")).click();

}
@Test
public void verifysearch(){

		softassert.assertEquals (true, driver.findElement(By.xpath("//*[@name='global_typeahead']")).isDisplayed());
		System.out.println("search is displayed");
}
@Test
public void verifyHome(){

		softassert.assertEquals (true, driver.findElement(By.xpath("//*[@aria-label='Home']")).isDisplayed());
		System.out.println("home is displayed");
}

@Test
public void verifyIcon(){

		softassert.assertEquals (true, driver.findElement(By.xpath("//*[@aria-label='Messenger']")).isDisplayed());
		System.out.println("icon is displayed");
}
@AfterTest
public void close() {
	driver.close();
}
}
