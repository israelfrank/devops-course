package testcases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.signUpPage;
import pages.validatePhone;

public class signUpTest extends TestBase {
	LoginPage loginPage;
	signUpPage signupage;
    validatePhone validate;
 
    
	public signUpTest() {
	super();
	}
	
    
    @BeforeClass
	public void SetUp123(){
   //initialization();
	signupage = new signUpPage();
	loginPage = new LoginPage();
	
	
	}	
	@Test(alwaysRun = true)
	public void register() {
		logger = extent.createTest("signUp");
		
		validate = signupage.action("frankarlozorov@gmail.com", "0507147124");
	}
	
	@AfterClass
	public void teardown() {
	  extent.flush();
		//driver.close();
	}


}
