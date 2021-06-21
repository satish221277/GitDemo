import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestivedropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satish.kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("In");
		Thread.sleep(3000);
		List<WebElement> Option= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for( WebElement opt : Option)
		{
			if (opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				
				break;
				
			}
		}			
		
		
	}

}
