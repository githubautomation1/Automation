import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://facebook.com");
		/*System.out.println(Driver.getTitle());
		Driver.close();*/
		Driver.findElement(By.id("email")).sendKeys("Shweta.das55@gmail.com");
		Driver.findElement(By.name("pass")).sendKeys("9434419886@ma");
		//Driver.findElement(By.xpath("//input[@value='Log In']")).click(); //Customized Xpath
		//Driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click(); //regular expression for xpath- //TagName[contains(@attribute,'value')]
		Driver.findElement(By.cssSelector("input[id*='u_0']")).click(); //regular expression for CSS- TagName[attribute*='value']
		
	}

}
