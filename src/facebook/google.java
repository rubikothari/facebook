package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\\\rubi\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.cssSelector(".header__aside__nav > li:nth-child(2) > a:nth-child(1)")).click();

		
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("aaa@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();

		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Rub!9408125739");
		driver.findElement(By.cssSelector("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();

	
	
}
}
