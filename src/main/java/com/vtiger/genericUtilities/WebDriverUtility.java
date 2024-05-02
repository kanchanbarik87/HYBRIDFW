package com.vtiger.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {

	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimizeeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void waitForpageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void handleDropdownByIndex(WebElement ele,int index) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	public void handleDropdownByValue(WebElement ele,String value) {
		Select sel1=new Select(ele);
		sel1.selectByValue(value);
	}
	
	public void handleDropdownByVisibleText(WebElement ele,String text) {
		Select sel2=new Select(ele);
		sel2.selectByVisibleText(text);
	}
	
	public void mouseHoverAction(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void rightClickAction(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void doubleClickAction(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).perform();
	}
	
	
	public void getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\Screenshots\\ProjectName"+System.currentTimeMillis()+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}

