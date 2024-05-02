package vtigerTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;

public class loginPageTest extends Baseclass{
	
	@Test
	public void loginpageTitleTest() {
		String actTitle=loginpage.getTitle();
		Assert.assertEquals(actTitle, driver.getTitle());
		
		
		
	}

}
