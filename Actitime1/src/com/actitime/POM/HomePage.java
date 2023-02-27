package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	public WebElement logOut;
	
	@FindBy(xpath="//div[text()='Tasks']")
	public WebElement taSk;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogout()
	{
		logOut.click();
	}
	public void setTask()
	{
		taSk.click();
	}

}
