import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.*;
//import java.util.*;

public class AssignmentPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for='honda']/input")).click();
		String selectedText = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(selectedText);
		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		drop.selectByVisibleText(selectedText);
		driver.findElement(By.id("name")).sendKeys(selectedText);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		String formatText = text.split(" ")[1];
		String formt = formatText.substring(0,formatText.length()-1);
//		System.out.println(formt);
		driver.switchTo().alert().accept();
		Assert.assertEquals(selectedText,formt);
	}

}
