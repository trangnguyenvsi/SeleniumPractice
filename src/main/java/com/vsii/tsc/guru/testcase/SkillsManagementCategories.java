package com.vsii.tsc.guru.testcase;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.method.CategoriesPageMethod;
import com.vsii.tsc.guru.pages.method.CreateCategoryPageMethod;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.PMHomePageMethod;
import com.vsii.tsc.guru.pages.method.SettingsPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.TestBase;

public class SkillsManagementCategories extends TestBase {
	LoginPageMethod objLoginPage;
	PMHomePageMethod objPMHomePage;
	SettingsPageMethod objSettingsPage;
	CategoriesPageMethod objCategoriesPage;
	CreateCategoryPageMethod objCreateCategoryPage;
	

	@BeforeClass
	public void setupClass() {
		objLoginPage = new LoginPageMethod(driver);
		objPMHomePage = new PMHomePageMethod(driver);
		objSettingsPage = new SettingsPageMethod(driver);
		objCategoriesPage = new CategoriesPageMethod(driver);
	}
	
	@Test(priority = 9, description = "Verify that Categories List is displayed correctly", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class)
	public void SM_09 (String username, String password) throws InterruptedException {
		objLoginPage.loginToManagerPage(username, password);
		objPMHomePage.clickSettingsLink();
		objSettingsPage.clickCategoriesSection();
		
		CommonMethods.waitUntil(objCategoriesPage.getNameValueRows());
		Assert.assertTrue(objCategoriesPage.shouldEachRowEachSkill());
		Assert.assertTrue(objCategoriesPage.getCheckAllCbx().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getNameHeader().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getTypeHeader().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getParentCategoryHeader().isDisplayed());
	}
	
	@Test(priority = 10, description = "Verify that the system confirm before deleting a category", dataProvider = "deleteCategory", dataProviderClass = TestData.class)
	public void SM_10 (String skillName, String parentCategory) throws InterruptedException {
		objCategoriesPage.markToDelete(skillName, parentCategory);
		objCategoriesPage.clickMoreBtn();
		objCategoriesPage.clickDeleteBtn();
		
		Thread.sleep(1000);
		Assert.assertTrue(objCategoriesPage.alertShouldBeCorrect("Do you really want to remove these records?"));
	}
	
	@Test(priority = 11, description = "Verify that user can postpone a request to delete a Category", dataProvider = "deleteCategory", dataProviderClass = TestData.class)
	public void SM_12 (String skillName, String parentCategory) {
		objCategoriesPage.cancelPopup();
		
		Assert.assertTrue(objCategoriesPage.getSkillToDeleteCbx(skillName, parentCategory).isDisplayed());
	}
	
	@Test(priority = 12, description = "Verify that user can delete a category from Categories List", dataProvider = "deleteCategory", dataProviderClass = TestData.class)
	public void SM_11 (String skillName, String parentCategory) {
		objCategoriesPage.clickDeleteBtn();
		objCategoriesPage.acceptPopup();
		
		Assert.assertFalse(objCategoriesPage.getSkillToDeleteCbx(skillName, parentCategory).isDisplayed());
	}
	
	@Test(priority = 13, description = "Verify that Create form is opened correctly")
	public void SM_13() {
		Assert.fail("Not completed this test case yet!");
	}
	
	@Test(priority = 14, description = "Verify that the fields 'Name', 'Type'  are required field")
	public void SM_14() {
		objCategoriesPage.clickCreateBtn();
		objCreateCategoryPage.inputCategoryName("");
		objCreateCategoryPage.selectCategoryType("");
		objCreateCategoryPage.inputCategoryDescription("");
		objCreateCategoryPage.clickSave();
		
		Assert.assertTrue(objCreateCategoryPage.getRequiredNotification("Name", "Type").isDisplayed());
	}
	
	@Test(priority = 15, description = "Verify that user can create a new category", dataProvider = "createCategory", dataProviderClass = TestData.class)
	public void SM_15(String categoryName, String categoryType, String categoryDescription) {
		
	}

	
}