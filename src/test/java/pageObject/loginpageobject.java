package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class loginpageobject {

	public WebDriver driver;

//Login page

	@FindBy(xpath = "//a[@href='/office/saml/login']")
	@CacheLookup
	public WebElement navlogin;

	@FindBy(id = "username")
	@CacheLookup
	public WebElement txtusername;

	@FindBy(id = "password")
	@CacheLookup
	public WebElement txtpassword;

	@FindBy(id = "kc-login")
	@CacheLookup
	public WebElement btnlogin;

}
