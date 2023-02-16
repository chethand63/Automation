import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://path2usa.com/travel-companions");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1136)", "");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
//		boolean month=driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span")).getText().contains("April ");
//		System.out.println(month);
		
		while (!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span")).getText()
				.contains("May")) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			System.out.println(driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span")).getText());
//			System.out.println(month);
		}
		Thread.sleep(5000);
		List<WebElement> days = driver.findElements(By.className("flatpickr-day"));
		for (int i = 0; i < days.size(); i++) {
			System.out.println(days.get(i).getText());
			if (days.get(i).getText().equalsIgnoreCase("24")) {
				days.get(i).click();

				break;
			}
		}
	}

}
