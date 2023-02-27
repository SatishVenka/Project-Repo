package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksListpage {
	@FindBy(xpath="//div[text()='Add New']")
	public WebElement adNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	public WebElement neWCust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
			public WebElement enterCustermerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	public WebElement entercustermerDiscription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class= 'emptySelection']")
	public WebElement selectdroupDown;
	
	@FindBy(xpath="//div[text()='Our company' and @class= 'itemRow cpItemRow ']")
	public WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer' and @class= 'components_button_label']")
	public WebElement selectCreatCustermerButt;
	
	@FindBy(xpath="//div[text()='AxiesBank_001' and @class='title']")
	public WebElement ActualText;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	public WebElement selectNewProject;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	public WebElement projectName;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	public WebElement projectDiscription;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	public WebElement SelectDD;
	
	@FindBy(xpath=("//div[text()='Our company' and @class='itemRow cpItemRow ']"))
	public WebElement selectCompany;
	
	@FindBy(xpath="//div[text()='Create Project']")
	public WebElement selectButton;
	
	@FindBy(xpath="//div[text()='+ New Tasks' and @class='item createNewTasks']")
	public WebElement selectNewTask; 
	
	@FindBy(xpath="(//div[@class='selectedItem'])[15]")
	public WebElement selectDDown;
	
	@FindBy(xpath="(//div[@class='searchItemList'])[15]/div[12]")
	public WebElement selectOurCompany;
	
	@FindBy(xpath="(//div[@class='selectedItem'])[16]")
	public WebElement selectOperaction;
	
	@FindBy(xpath="(//div[@class='searchItemList'])[16]/div[4]")
	public WebElement selectProject;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder'])[2]")
	public WebElement taskName;
	
	@FindBy(xpath="(//div[@class='components_button withPlusIcon'])")
	public WebElement clickTask;

	public TasksListpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAdNew() {
		return adNew;
	}

	public WebElement getNeWCust() {
		return neWCust;
	}

	public WebElement getEnterCustermerName() {
		return enterCustermerName;
	}

	public WebElement getEntercustermerDiscription() {
		return entercustermerDiscription;
	}

	public WebElement getSelectdroupDown() {
		return selectdroupDown;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getSelectCreatCustermerButt() {
		return selectCreatCustermerButt;
	}

	public WebElement getActualText() {
		return ActualText;
	}
	
	public WebElement getSelectNewProject() {
		return selectNewProject;
	}

	public WebElement getProjectName() {
		return projectName;
	}
	
	
	public WebElement getProjectDiscription() {
		return projectDiscription;
	}
	

	public WebElement getSelectDD() {
		return SelectDD;
	}
	

	public WebElement getSelectCompany() {
		return selectCompany;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getSelectNewTask() {
		return selectNewTask;
	}
	

	public WebElement getSelectDDown() {
		return selectDDown;
	}
	

	public WebElement getSelectOurCompany() {
		return selectOurCompany;
	}
	

	public WebElement getSelectOperaction() {
		return selectOperaction;
	}
	

	public WebElement getSelectProject() {
		return selectProject;
	}

	public WebElement getTaskName() {
		return taskName;
	}

	public WebElement getClickTask() {
		return clickTask;
	}
	
	

	
	
	
	
	
	
	
	
		

}
