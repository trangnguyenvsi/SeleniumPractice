package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.method.DiuTTM_ISMSMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_LoginPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class DiuTTM_Home 
{
    DiuTTM_LoginPageMethod objLogin; 
    DiuTTM_ISMSMethod objISMS;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new DiuTTM_LoginPageMethod(TestBase.driver);
        objISMS = new DiuTTM_ISMSMethod(TestBase.driver);
    }

   @Test(priority = 0, description = "Verify OpenERP can open correctly")
    public void TC01() throws IOException {     
        TestBase.methodName = "TC01";
        objLogin.verifyLoginPage();          
    }
   @Test(priority = 2, description = "Admin_Verify that ISMS Helpdesk is displayed correctly_User is admin or ISMS Managers"
       ,dataProvider = "Adminlogin", dataProviderClass = TestData.class)
    public void TC02(String username, String password) throws IOException {     
        TestBase.methodName = "TC02";
        objLogin.login(username,password); 
        objISMS.GotoISMSPage();
        objISMS.VerifyISMSAdmin();
    }
 @Test(priority = 1, description = "Verify that ISMS Helpdesk is displayed correctly_User is not admin or ISMS Managerss",dataProvider = "notAdminlogin", dataProviderClass = TestData.class)
    public void TC03(String username, String password) throws IOException {     
        TestBase.methodName = "TC03";     
        objLogin.login(username,password);
        objISMS.GotoISMSPage();
        objISMS.VerifyISMSnotAdmin();
        objISMS.logout();
    }

  @AfterMethod
  public void afterMethod() throws Exception {
   CommonOperations.takePicture();
  //TestBase.driver.quit();
 }

//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }

//}


}
