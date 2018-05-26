import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.goibibo.com/");
		//Driver.switchTo().alert().accept();
		System.out.println("Before clicking Multi City");
		Thread.sleep(3000l);
		System.out.println(Driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div/div[4]/div[1]/div[2]/div/input[1]")).isDisplayed());
		Driver.findElement(By.xpath("//*[@id=\\\"searchWidgetNew\\\"]/div[2]/span[3]/label")).click();
		System.out.println("After clicking Multi City");
		System.out.println(Driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div/div[4]/div[1]/div[2]/div/input[1]")).isDisplayed());
		

	}

}
