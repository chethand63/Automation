import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("blinkingText"))).click().build().perform();
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")));
		String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split(" ")[4];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
