 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DriverManager {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("//input[contains(@id,'chk_IndArm')]")).click();
		System.out.println();
//		Assert.assertEquals(driver.findElement(By.xpath("//input[contains(@id,'chk_IndArm')]")).isSelected(), true);
		List<WebElement> checkboxes= driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println();
//		Assert.assertEquals(checkboxes.size(),7);
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")));
//		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
//		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(staticDropDown);
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "AED");
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[contains(text(),'United States')])[1]")).click();
//		driver.findElement(By.id("divpaxinfo")).click();
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		System.out.println(options);
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		int i= 1;
//		while(i<=4) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
				
//	}
//		driver.findElement(By.id("hrefIncChd")).click();
//	driver.findElement(By.id("btnclosepaxoption")).click();
//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='MAA']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='13'])[1]")).click();
//	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	}

	private static char[] len(List<WebElement> checkboxes) {
		// TODO Auto-generated method stub
		return null;
	}

}
