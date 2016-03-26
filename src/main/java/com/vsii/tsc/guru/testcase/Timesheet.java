package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import com.vsii.tsc.guru.pages.method.ClickHumanResourcesMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class Timesheet {

	
	ClickHumanResourcesMethod objClickHumanResources;
	
	@BeforeClass
	public void setupClass() throws NumberFormatException, IOException {
		
		objClickHumanResources = new ClickHumanResourcesMethod(TestBase.driver);
		
	}
	
	// @Test(priority = 0)
		public void TM01() throws InterruptedException {
			objClickHumanResources.clickHumanResources();
		
		}
	
}
