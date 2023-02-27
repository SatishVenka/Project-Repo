package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TasksListpage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.LIstenersImplimentation.class)
public class TaskModule extends BaseClass  {
	public FileLib f = new FileLib();
	@Test(priority=3)
	public void taskModule() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String taskName = f.getExcelData("actitime", 1, 4);
		HomePage hp = new HomePage(driver);
		hp.setTask();
		TasksListpage tp = new TasksListpage(driver);
		tp.getAdNew().click();
		Thread.sleep(5000);
		tp.getSelectNewTask().click();
		Thread.sleep(5000);
		tp.getSelectDDown().click();
		Thread.sleep(5000);
		tp.getSelectOurCompany().click();
		Thread.sleep(5000);
		tp.getSelectOperaction().click();
		Thread.sleep(5000);
		tp.getSelectProject().click();
		Thread.sleep(5000);
		tp.getTaskName().sendKeys(taskName);
		Thread.sleep(5000);
		tp.getClickTask().click();
	}

}
