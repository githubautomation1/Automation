import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.com/");
		Actions a=new Actions(Driver); //Driver object will get the capability of Actions class
		WebElement move=Driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		///a.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); //Composite actions
		
		//moves to specific elements
		a.moveToElement(move).contextClick().build().perform(); 

	}

}
