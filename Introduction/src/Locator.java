import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://login.salesforce.com/?locale=in");
		/*System.out.println(Driver.getTitle());
		Driver.close();*/
		Driver.findElement(By.id("username")).sendKeys("Shweta.das55@gmail.com");
		Driver.findElement(By.name("pw")).sendKeys("9434419886@ma");
		Driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	}

}
