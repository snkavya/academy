package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import generic.Base_Page;

public class QaClickAcademypage extends Base_Page{

	public QaClickAcademypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="user_email")
	private WebElement uname;
	@FindBy(id="user_password")
	private WebElement pwd;
	@FindBy(xpath="//input[@name='commit']")
	private WebElement login;
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement errmsg;
	
	public void uname(String unam)
	{
		uname.sendKeys(unam);
	}
	
	public void pwd(String pwdd)
	{
		pwd.sendKeys(pwdd);
	}
	
	public void login()
	{
		login.click();
	}
	
    public void errmsg(String msg)
    {
    	Verifyelement(errmsg);
    	String text=errmsg.getText();
    	System.out.println(text);
    	try
    	{
    	Assert.assertEquals(text,msg);
    	Reporter.log("errmsg is valid",true);
    	}
    	catch(Exception e)
    	{
    		Reporter.log("errmsg is not valid",true);
    	}
   
    	
    	
    }
}
