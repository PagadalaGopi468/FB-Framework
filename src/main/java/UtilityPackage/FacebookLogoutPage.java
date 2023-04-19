package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogoutPage {

	@FindBy(xpath = "//div[@class='x78zum5 x1n2onr6']")
	private WebElement btn;
	
	@FindBy(xpath = "//span[text()='Log Out']")
	private WebElement logoutbtn;
	
	public FacebookLogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBtn() {
		return btn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public void logout()
	{
		btn.click();
		logoutbtn.click();
	}
	
}
