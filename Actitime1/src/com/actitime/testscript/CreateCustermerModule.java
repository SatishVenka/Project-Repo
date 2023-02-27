package com.actitime.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TasksListpage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
 
@Listeners(com.actitime.generic.LIstenersImplimentation.class)
public class CreateCustermerModule extends BaseClass  {
	public FileLib f = new FileLib();
	@Test(priority=1)
	public void createCustermer() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String custermer_name = f.getExcelData("actitime", 1, 0);
		String custermer_desc = f.getExcelData("actitime", 1, 1);
		String taskName = f.getExcelData("actitime", 1, 4);
		Reporter.log("createCustermer",true);
		HomePage hp = new HomePage(driver);
		hp.setTask();
		TasksListpage tp = new TasksListpage(driver);
		tp.getAdNew().click();
		tp.getNeWCust().click();
		tp.getEnterCustermerName().sendKeys(custermer_name);
		tp.getEntercustermerDiscription().sendKeys(custermer_desc);
		tp.getSelectdroupDown().click();
		tp.getOurCompanyTx().click();
		tp.getSelectCreatCustermerButt().click();
		Thread.sleep(2000);
		String actualText = tp.getActualText().getText();
		Assert.assertEquals(actualText,custermer_name);
		Thread.sleep(5000);
	

		;
	
		

	}

}
