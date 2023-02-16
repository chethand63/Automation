import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String userName = "Chethan";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(),
				"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + userName + ",");
		String name = driver.findElement(By.tagName("h2")).getText();
		String[] splittedString = name.split(" ");
		System.out.println(splittedString[1].substring(0, splittedString[1].length() - 1));
		Assert.assertEquals(splittedString[1].substring(0, splittedString[1].length() - 1), userName);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}