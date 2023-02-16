import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rowSize = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		int columnSize = driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(1) th")).size();
		System.out.println(rowSize);
		System.out.println(columnSize);
		List<WebElement> secondRow = driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td"));
		for (int i = 0; i < secondRow.size(); i++) {
			System.out.println(secondRow.get(i).getText());
		}

	}
}
