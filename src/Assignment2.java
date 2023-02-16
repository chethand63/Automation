import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Chethan Dana");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Chethandana767@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Chethan@23");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("03/11/1998");
		driver.findElement(By.className("btn-success")).click();
		Thread.sleep(6000);
		driver.close();
	}

	private static boolean AssertEquals(String text) {
		// TODO Auto-generated method stub
		return false;
	}

}
