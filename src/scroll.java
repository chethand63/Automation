import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)","");
		((JavascriptExecutor) driver).executeScript("document.querySelector(\".tableFixHead\").scrollTop = 25", "");
		List<WebElement> tr = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<tr.size();i++) {
			String num = tr.get(i).getText();
//			System.out.println(num);
			int numb = Integer.parseInt(num);
			sum+=numb;
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(total, sum);
	}

}
