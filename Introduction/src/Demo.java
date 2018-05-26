import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		//Selenium Code
		//invoke .exe file first
		//Create a Driver object
		//Need to implement methods of WebDriver(interface)-provides all methods for automation.
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver Driver=new ChromeDriver();
			Driver.get("http://google.com");
			System.out.println(Driver.getTitle());
	}

}
