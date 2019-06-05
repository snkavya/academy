package generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public abstract class Base_Page {
	public WebDriver driver;
	
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Verifytitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	public void Verifyelement(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present",true);
			Assert.fail();
		}
	}

}
