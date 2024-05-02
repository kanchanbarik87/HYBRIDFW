package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtilities.WebDriverUtility;

public class HomePage {
	
	@FindBy(linkText="Organizations")private WebElement organizationLink;
	
	@FindBy(linkText="Contacts")private WebElement contactsLink;
	
	@FindBy(linkText="Opportunities")private WebElement opprtunitiesLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement administarorIMG;
	
	@FindBy(linkText="Sign Out")private WebElement signoutLink;
	
	public void clickOnCreatecontact() {
		contactsLink.click();
	}
	
	public void clickOnopprtunities() {
		opprtunitiesLink.click();
	}
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpprtunitiesLink() {
		return opprtunitiesLink;
	}

	public WebElement getAdministarorIMG() {
		return administarorIMG;
	}

	
	public WebElement getSignoutLink() {
		return signoutLink;
	}
	//Business Library
		public void logoutfromApp(WebDriver driver) {
			administarorIMG.click();
			signoutLink.click();
		}
		
		public void clickOnOrgLink() {
			organizationLink.click();
		}
	
	

}
