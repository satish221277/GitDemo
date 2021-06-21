import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Salesforce2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sat");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
	}

}