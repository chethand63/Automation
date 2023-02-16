import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		Actions a = new Actions(driver);
		for (int i = 1; i < column.findElements(By.tagName("a")).size(); i++) {
			String links = Keys.chord(Keys.CONTROL, Keys.ENTER);
			a.moveToElement(column.findElements(By.tagName("a")).get(i)).keyDown(Keys.CONTROL).click().build()
					.perform();
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(child);
//		System.out.println(driver.getTitle());
		while (it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			driver.close();
		}
	}

}
