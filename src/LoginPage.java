import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\\\rubi\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("aaa@yahoo.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		
		driver.findElement(By.xpath("//*[@name='global_typeahead']")).isDisplayed();
		System.out.println("search is displayed");
		driver.findElement(By.xpath("//*[@aria-label='Home']")).isDisplayed();
		System.out.println("search is home");

		driver.findElement(By.xpath("//*[@aria-label='Messenger']")).isDisplayed();
		System.out.println("search is messenger");


}
}
