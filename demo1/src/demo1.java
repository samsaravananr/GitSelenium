import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo1 
{
@Test
public void one()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\geckodriver.exe");
	WebDriver myD=new FirefoxDriver();
	myD.get("https://www.google.co.in");
	System.out.println(myD.getTitle());
}
}
