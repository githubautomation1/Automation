import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.spicejet.com");
		Driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Driver.findElement(By.xpath("//a[@value='DIB']")).click();
		Driver.findElement(By.xpath("(//a[@value='GAU'])[2]")).click();
	}

}
