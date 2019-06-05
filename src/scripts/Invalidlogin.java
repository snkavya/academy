package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.QaClickAcademypage;
import generic.Base_Test;
import generic.excel;

public class Invalidlogin extends Base_Test {
	
	@Test
	public void testInvalidlogin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String uname = excel.getcellvalue(Path, "Invalidlogin", 1, 0);
		String pwd = excel.getcellvalue(Path, "Invalidlogin", 1, 1);
		String msg = excel.getcellvalue(Path, "Invalidlogin", 1, 2);
		QaClickAcademypage qa=new QaClickAcademypage(driver);
		qa.uname(uname);
		qa.pwd(pwd);
		qa.login();
		Thread.sleep(2000);
		qa.errmsg(msg);
	}

}
