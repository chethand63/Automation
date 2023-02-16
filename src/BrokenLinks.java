import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert a = new SoftAssert();
		for(int i=0;i<links.size();i++) {
		String url = links.get(i).getAttribute("href");
		HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int code = con.getResponseCode();
		a.assertTrue(code<400, "Broken");
		}
		a.assertAll();
		
//		String url=driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
		
		
//		System.out.println(con.getResponseCode());
	}

}
