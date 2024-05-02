package com.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.LoginPage;

public class Baseclass {
	public PropertyFileUtility pu=new PropertyFileUtility();
	public ExcelFileUtility eu=new ExcelFileUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public JavaUtility ju=new JavaUtility();
	public WebDriver driver=null;//runtime poilymorphism
	protected LoginPage loginpage=new LoginPage(driver);
	@BeforeSuite
	public void bsconfig() {
		System.out.println("===DB CONNECTION===");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("===DB DISCONNECTION==");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = pu.readProprtyFile("browser");
		String URL = pu.readProprtyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("===Edgedriver is Launched===");
		}
		else if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("===Chrome is Launched===");
		}
		else {
			System.out.println("===INVALID BROWSER NAME===");
		}
		wu.maximizeWindow(driver);
		
		wu.waitForpageLoad(driver);
		driver.get(URL);
		System.out.println("===BROWSER IS OPENED===");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("===BROWSER IS CLOSED===");
		
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN = pu.readProprtyFile("un");
		String PWD = pu.readProprtyFile("pwd");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(UN, PWD);
		System.out.println("===LOGIN IS DONE SUCCESSFULLY===");
	}
	@AfterMethod
	public void amconfig() {
		HomePage hp=new HomePage(driver);
		hp.logoutfromApp(driver);
		//hp.getSignoutLink();
		System.out.println("===LOGOUT IS DONE SUCCESSFULLY===");
				
	}

}
