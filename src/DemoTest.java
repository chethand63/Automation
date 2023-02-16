import java.util.ArrayList;
import java.util.List;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.get("https://google.com");
//		int sum = 1;
//		String name = "Chethan";
//		int diff = 5;
//		String res = (sum< diff)? "True" : "False";
//		int name1 = 1;
//		switch(name1) {
//		case  4:
//			System.out.println("tou chose 4");
//		case 1:
//			System.out.println("you chose1");
//		case  5:
//			System.out.println(" tou chose 4");
//		}
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.set(0, 9);
		System.out.println(a);
	
//	String d =new String( "Hello, chethan, How, are, you");
//	
//	System.out.println(d.split("chethan")[2]);
//	String name = " chethan";
//	System.out.println(name.trim());
	int arr = (byte) 12;
	DemoTest test = new DemoTest();
	test.walk();
}
	public void walk() {
		System.out.println("Walking");
	}
}


