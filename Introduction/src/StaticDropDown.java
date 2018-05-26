import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.airindia.in/");
		//Driver.findElement(By.xpath("//div[@class='bannerWrap']/ul/li[1]/a")).click();
		Select  staticdropdown=new Select(Driver.findElement(By.id("ddladult1")));
		staticdropdown.selectByValue("3");
		
	
	}

}
