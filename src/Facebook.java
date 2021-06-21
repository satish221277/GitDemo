import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testing.chartrequest.com/");
		driver.findElement(By.name("Username")).sendKeys("123");
		driver.findElement(By.name("Password")).sendKeys("123");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("satish.k2010@yahoo.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("facebook@123");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.name("Signin")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("satish.kumar");

		//driver.close();
		
	}

}
