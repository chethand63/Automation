import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class price {
	public static void main(String args[] ){
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.findElement(By.linkText("Top Deals")).click();
	Set<String> url=driver.getWindowHandles();
	Iterator<String> it = url.iterator();
	String parent = it.next();
	String child= it.next();
	driver.switchTo().window(child);
	WebElement select = driver.findElement(By.id("page-menu"));
	Select j = new Select(select);
//	j.selectByValue("20");
//	driver.findElement(By.cssSelector("table th:nth-child(1)")).click();
	
	List<String> price;
	do {
	List<WebElement> names = driver.findElements(By.cssSelector("tbody tr td:nth-child(1)"));
	price = names.stream().filter(s->s.getText().contains("Guava")).map(s->getPrice(s)).collect(Collectors.toList());
	price.forEach(s->System.out.println(s));
	if(price.size()<1) {
	driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
	}
	}while(price.size()<1);
	}
	private static String getPrice(WebElement s) {
		String prices = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return prices;
	}
}
