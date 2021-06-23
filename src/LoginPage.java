import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\\\rubi\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rubykothari_96@yahoo.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Rub!9408125739");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		driver.close();
		
	}

}
