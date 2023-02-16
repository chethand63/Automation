import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.cssSelector("img[alt='Google']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\New folder\\screenshot1.png"));
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(logo.getRect().getDimension().getHeight());
		System.out.println(logo.getRect().getDimension().getWidth());
	}

}
