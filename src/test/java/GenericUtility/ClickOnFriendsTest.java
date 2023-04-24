package GenericUtility;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import UtilityPackage.BaseClass;
@Listeners(UtilityPackage.ListnerImplementationClass.class)
public class ClickOnFriendsTest extends BaseClass{
@Test(groups = "Smoke")
	public void Friends() throws Exception
	{
		driver.findElement(By.xpath("//a[@aria-label='Friends']")).click();
		Reporter.log("Click on Friends Successfully..!!!");
	}


}
