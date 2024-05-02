package vtigerTC;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.CreateNewOrganizationPage;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInfoPage;
import com.vtiger.objectRepositories.OrganizationPage;

public class CraeteOrganizationTC extends Baseclass{
	
	@Test
	public void createorg() {
		//click on orgmodule
		HomePage hp=new HomePage(driver);
		//hp.logoutfromApp(driver);
		hp.clickOnOrgLink();
		//click on lookup image
		OrganizationPage op=new OrganizationPage(driver);
		op.clickOnOrgLookUpImg();
		//give org name
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization("Capgemini"+ju.getRandomNum());
		
		OrganizationInfoPage oip=new OrganizationInfoPage(driver);
		WebElement ele=oip.getOrgHeaderText();
		String header=ele.getText();
		//System.out.println(ele.getText());
		//verify
		Assert.assertTrue(header.contains("Capgemini"));
		System.out.println("===ORGANIZATION IS CREated and TC is PASS===");
	}

}
