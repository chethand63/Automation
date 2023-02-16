import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutodropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		Actions a = new Actions(driver);
//		for(WebElement option:options) {
//			System.out.println(option.getText());
//			if(option.getText().equalsIgnoreCase("India")) {
//				a.moveToElement(option).click().build().perform();
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equalsIgnoreCase("India")) {
				options.get(i).click();
			}
			
			}
		}
	}


