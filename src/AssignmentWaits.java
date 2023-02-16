import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String userName = driver.findElement(By.cssSelector("p.text-center")).getText().split(" ")[2];
		String password = driver.findElement(By.cssSelector("p.text-center")).getText().split(" ")[6];
		String formatPass = password.substring(0,password.length()-1);
//		System.out.println(password+" "+formatPass);
		driver.findElement(By.cssSelector("input#username")).sendKeys(userName);
		driver.findElement(By.cssSelector("input#password")).sendKeys(formatPass);
		driver.findElement(By.xpath("//label[@class='customradio']/span[text()=' User']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("button#okayBtn"))));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
//		driver.switchTo().alert().accept();
		Select drop = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		drop.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Shop Name']")));
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		String[] itemsNeeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		List<String> items1 = Arrays.asList(itemsNeeded);
		for(int i=0;i<items.size();i++) {
			String name = items.get(i).getText();
			for (String item2:items1) {
				if(name.contains(item2)) {
					driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				}
			}
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
		driver.findElement(By.id("country")).sendKeys("in");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'India')]")));
		driver.findElement(By.xpath("//a[contains(text(),'India')]")).click();
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		
		
		
	}

}
