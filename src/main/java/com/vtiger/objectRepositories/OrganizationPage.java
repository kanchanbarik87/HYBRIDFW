package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgLookupImg;
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgLookupImg() {
		return orgLookupImg;
	}
	public void clickOnOrgLookUpImg() {
		orgLookupImg.click();
	}
		

}
