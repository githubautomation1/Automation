import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(Driver.switchTo().alert().getText());
		Driver.switchTo().alert().accept();
		

	}

}
