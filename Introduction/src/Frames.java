import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://jqueryui.com/droppable/");
		Driver.switchTo().frame(Driver.findElement(By.className("demo-frame")));
		//Driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(Driver);
		WebElement source=Driver.findElement(By.id("draggable"));
		WebElement target=Driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		Driver.switchTo().defaultContent(); //switch to normal window
	}

}
