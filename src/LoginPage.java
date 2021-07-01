import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\\\rubi\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("aaa@yahoo.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		if( driver.findElement(By.xpath("//*[@aria-label='Messenger']")).isDisplayed()){
			System.out.println("Messenger is Visible");
			}else{
			System.out.println("Messenger is InVisible");
			}
		
		if( driver.findElement(By.xpath("//*[@name='global_typeahead']")).isDisplayed()){
			System.out.println("search is Visible");
			}else{
			System.out.println("search is InVisible");
			}
		if( driver.findElement(By.xpath("//*[@search is Visible='Home']")).isDisplayed()){
			System.out.println("home is Visible");
			}else{
			System.out.println("home is InVisible");
			}
		driver.close();
}
}
