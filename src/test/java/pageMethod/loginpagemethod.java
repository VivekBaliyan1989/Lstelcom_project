package pageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageObject.loginpageobject;

public class loginpagemethod {
	
	
	loginpageobject logpage = new loginpageobject();
	
	public WebDriver driver;

	public loginpagemethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,logpage);
	}

    //Login functionality
    
    public void navLoginPage()
    {
    	logpage.navlogin.click();
    }

    public void setUserName(String username)
    {
    	logpage.txtusername.clear();
    	logpage.txtusername.sendKeys(username);
    }

    public void setPassword(String password)
    {
    	logpage.txtpassword.clear();
    	logpage.txtpassword.sendKeys(password);
    }

    public void clklogin()
    {
    	logpage.btnlogin.click();
    }


}
