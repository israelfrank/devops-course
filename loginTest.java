package testcases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import base.TestBase;
import pages.LoginPage;
import pages.signUpPage;


public class loginTest extends TestBase {
	LoginPage loginPage;
	signUpPage  signupage;
	
	public loginTest() {
		super();
	}
	
	@BeforeClass
	public void SetUp(){	
	initialization();
	loginPage = new LoginPage();
	logger = extent.createTest("login");
	
	}
	
	@Test(priority = 1)
	public void button() {
		
	loginPage.enable();
	}
	
	@Test(priority = 2)
	public void pressOnSignUp()  {

		loginPage.checkIfEnabled();
		
		signupage = loginPage.objectsFunction();
	     
		
	}
	
	@AfterClass
	public void teardown123() {
		extent.flush();
		//driver.close();

	}
}
