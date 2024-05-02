package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")private WebElement organizationName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void createNewOrganization(String ORGNAME)
	{
		organizationName.sendKeys(ORGNAME);
		saveBtn.click();
	}

}
