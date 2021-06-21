import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class NewRelic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		http://telco.nrdemo-sandbox.com/static/companyBlog.jsp
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://telco.nrdemo-sandbox.com/browse/plans");
		//driver.findElement(By.name("Password")).sendKeys("123");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("satish.k2010@yahoo.com");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("facebook@123");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("MYRELIC");
		//driver.findElement(By.xpath("//a[contains(@href,'100123')]")).click();
		driver.findElement(By.cssSelector("a[href*='100123']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("Input[type='text']")).clear();
		driver.findElement(By.cssSelector("Input[type='text']")).sendKeys("4");
		driver.findElement(By.xpath("//INPUT[@type='button']")).click();

		//driver.findElement(By.cssSelector("#email")).sendKeys("satish.kumar");

		//driver.close();
		
	}

}



