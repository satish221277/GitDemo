import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://bcv.social/login");
		driver.findElement(By.id("E-mail")).sendKeys("satish.kumar@rategain.com");
		driver.findElement(By.id("Password")).sendKeys("Changeme@123");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("satish.k2010@yahoo.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("facebook@123");
		//driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div/form/button")).click();
		driver.findElement(By.linkText("Four Seasons Hotel Austin")).click();		
		driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/div[2]/div/div/div[2]/div/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[5]/div/div/div/div/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[5]/div/div/div/div/ul/div/div[6]/div[5]/button/i")).click();
			//System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[1]")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[2]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/div[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/div[3]/div[2]")).getText());
		Thread.sleep(50000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/div[1]")).getText());
		//driver.findElement(By.cssSelector("#email")).sendKeys("satish.kumar");
		driver.close();
		
	}

}

