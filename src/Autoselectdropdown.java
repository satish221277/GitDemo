import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Autoselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);


	}

}
