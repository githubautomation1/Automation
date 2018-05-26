import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://google.co.in");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("facebook");
		
	}

}
