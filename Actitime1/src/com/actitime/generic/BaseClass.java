package com.actitime.generic;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.POM.HomePage;
import com.actitime.POM.LoginPage;
import com.beust.jcommander.Parameters;

public class BaseClass {
	
static
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SATISH\\OneDrive\\Desktop\\JAVA\\ActiTimee\\driver\\chromedriver109.exe.exe");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SATISH\\OneDrive\\Desktop\\JAVA\\Actitime1\\driver\\geckodriver.exe");
}

public static WebDriver driver;
FileLib f = new FileLib();

@Parameters("browser")
@BeforeTest
public void openBrowser(String browser)
{
	Reporter.log("open browser",true);

	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}

	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterTest
public void closeBrowser()
{
	Reporter.log("close browser",true);
	Scanner sc = new Scanner(System.in);
	String Browser = sc.nextLine();
	if(Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	driver.close();
}
@BeforeMethod
public  void login() throws IOException
{
	Reporter.log("login",true);
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	driver.get(url);
	LoginPage lp = new LoginPage(driver);
	lp.setLogin(un, pw);
	
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	HomePage hp = new HomePage(driver);
	hp.setLogout();
}

}