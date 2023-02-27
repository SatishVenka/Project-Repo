package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Task extends BaseClass {
	@Test
	public void future()
	{
		Reporter.log("future",true);
	}

}
