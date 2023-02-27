package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	public WebElement usNa;
	
	@FindBy(name="pwd")
	public WebElement psWd;
	
	@FindBy(xpath="//div[text()='Login ']")
	public WebElement loG;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogin(String un,String pw)
	{
		usNa.sendKeys(un);
		psWd.sendKeys(pw);
		loG.click();
	}

}
