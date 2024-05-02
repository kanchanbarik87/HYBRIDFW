package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	@FindBy(xpath="//img[@title='Create Contact...']")private WebElement createContact;
	
	@FindBy(xpath="//img[@title='Search in Contacts...']")private WebElement searchContact;
	//img[@title='Search in Contacts...']
	public ContactsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateContact() {
		return createContact;
	}
	public WebElement getSearchContact() {
		return searchContact;
	}
	
	
	
}
