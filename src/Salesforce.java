import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://bg.rategain.com/login#internal");
		driver.findElement(By.xpath("//*[@id=\'input_0\']")).sendKeys("satish.k2010@yahoo.com");
		//driver.get("http://bg.rategain.com/login#internal");	
		driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("satish.k2010@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'input_1\']")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/ui-view/div/md-content/div[1]/form/md-content/div/button")).click();
		// This is just a comment 
		//This is in Devleop branch only	

	}

}