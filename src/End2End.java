import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).sendKeys("Del");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[34]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ben");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Bengaluru')])[1]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[14]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][normalize-space()='21'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'][normalize-space()='Senior Citizen']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
	}

}
