package vtigerTC;

import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.objectRepositories.HomePage;

public class CreateContactTC extends Baseclass{
	
	@Test
	public void createContact() {
		//click on orgmodule
		HomePage hp=new HomePage(driver);
		hp.clickOnCreatecontact();
		
		System.out.println("===Contact IS CREated and TC is PASS===");
		
		
	}


}
