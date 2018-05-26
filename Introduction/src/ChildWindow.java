import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://accounts.google.com/SignUp");
		Driver.findElement(By.xpath("//div[@class='clearfix']/div/p/a")).click();
		Set<String>ids=Driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		Driver.switchTo().window(childId);
		System.out.println(Driver.getTitle());
	}

}
