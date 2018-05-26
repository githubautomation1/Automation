import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findinglinks {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.ebay.com");
		//count of the link in entire page
		System.out.println("Links in the page");
		System.out.println(Driver.findElements(By.tagName("a")).size());
		//count links in footer section
		System.out.println("Links in the footer");
		WebElement Footer=Driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		//count of links in Subfooter section
		System.out.println("Links in the Subfooter");
		WebElement Subfooter=Footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[2]/ul"));
		System.out.println(Subfooter.findElements(By.tagName("a")).size());
		int count=Subfooter.findElements(By.tagName("a")).size();
		String BeforeClicking=null;
		for(int i=1;i<count;i++)
		{
			String text=Subfooter.findElements(By.tagName("a")).get(i).getText();
			//System.out.println(text);
			if(text.contains("Site map"))
			{
				BeforeClicking=Driver.getTitle();
				Subfooter.findElements(By.tagName("a")).get(i).click();
			}
		}
		String AfterClicking=Driver.getTitle();
		if(BeforeClicking!=AfterClicking)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
			
		}
	}


