package com.actitime.testscript;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.generic.BaseClass;

public class DemoRunTimePolymophism  {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SATISH\\OneDrive\\Desktop\\JAVA\\Actitime1\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SATISH\\OneDrive\\Desktop\\JAVA\\Actitime1\\driver\\geckodriver.exe");
	}
	public static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Browser = sc.nextLine();
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
