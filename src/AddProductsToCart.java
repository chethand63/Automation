import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//		Thread.sleep(3000);
		String[] desiredproducts = {"Brocolli", "Cucumber","Cauliflower","Grapes","Mango"};
		
		AddProductsToCart  cart = new AddProductsToCart();
		cart.additems(driver, desiredproducts);
	}
	public void additems(WebDriver driver,String[] desiredproducts) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
//		System.out.println(products.size());
		
//		List desired = Arrays.asList(desiredproducts);
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText().split("-")[0].trim();
			System.out.println(product+"-"+i);
			int j= 0;
			for (String products1 : desiredproducts) {
				if (products1.contains(product)) {
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					j++;
					if(j==desiredproducts.length) {
						break;
					}
				}
			}

		}
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacedemy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

}
