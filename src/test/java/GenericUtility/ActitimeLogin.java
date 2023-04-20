package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(UtilityPackage.ListnerImplementationClass.class)
public class ActitimeLogin {
@Test(dataProvider = "Credentials")
	public void login(String Username, String Password) throws Exception
	{
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Username);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(Password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}

@DataProvider(name="Credentials")
public Object[][] getData()
{
	Object[][] o=new Object[2][2];
	o[0][0]="admin";
	o[0][1]="manager";
	
	o[1][0]="trainee";
	o[1][1]="trainee";
	return o;
}
}
