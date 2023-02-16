import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("Pavan");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("Pavan");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Chethan");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("chethandana61@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9908099726");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	}
	
}
