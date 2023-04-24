package GenericUtility;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import UtilityPackage.BaseClass;
@Listeners(UtilityPackage.ListnerImplementationClass.class)
public class ClickOnReelsTest extends BaseClass{
@Test(groups = "Smoke")
	public void Reels()
	{
		driver.findElement(By.xpath("//a[@href='/watch/?ref=tab']")).click();
		Reporter.log("Click on Reels Successfully..!!!");

	}

}
