import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
public class badssl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
//		driver.get("https://expired.badssl.com/");
		driver.get("https://www.google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\screenshot.png"));
	}

}
