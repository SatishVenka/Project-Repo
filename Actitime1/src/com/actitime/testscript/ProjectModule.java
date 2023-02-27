package com.actitime.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TasksListpage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.LIstenersImplimentation.class)
public class ProjectModule extends BaseClass{
	public FileLib f = new FileLib();
	@Test(priority=2)
	public void projectModule() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String project_name = f.getExcelData("actitime", 1, 2);
	String projetDiscription = f.getExcelData("actitime", 1, 3);
	Reporter.log("project Module",true);
	HomePage hp = new HomePage(driver);
	hp.setTask();
	TasksListpage tp = new TasksListpage(driver);
	tp.getAdNew().click();
	Thread.sleep(5000);
	tp.getSelectNewProject().click();
	Thread.sleep(5000);
	tp.getProjectName().sendKeys(project_name);
	Thread.sleep(5000);
	tp.getSelectDD().click();
	Thread.sleep(5000);
	tp.getSelectCompany().click();
	Thread.sleep(5000);
	tp.getProjectDiscription().sendKeys(projetDiscription);
	Thread.sleep(5000);
	tp.getSelectButton().click();
	Thread.sleep(5000);

}
}