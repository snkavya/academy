package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Constant {
	public WebDriver driver;
	static
	{
		System.setProperty(Gecko_key, Gecko_value);
	}
	

	@BeforeMethod
	public void openappl()
	{
		 driver=new FirefoxDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		
	}
	
	@AfterMethod
	public void closeappl()
	{
		driver.quit();
	}
}
