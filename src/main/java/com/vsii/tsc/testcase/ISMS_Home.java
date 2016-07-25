package com.vsii.tsc.testcase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.pages.method.ISMSMethod;
import com.vsii.tsc.pages.method.ISMS_LoginPageMethod;
import com.vsii.tsc.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class ISMS_Home extends TestBase
{
    ISMS_LoginPageMethod objLogin; 
    ISMSMethod objISMS;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new ISMS_LoginPageMethod(TestBase.driver);
        objISMS = new ISMSMethod(TestBase.driver);
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
 public void afterMethod(ITestResult testResult) throws Exception {
  CommonOperations.getMethodTestResult(testResult);
  CommonOperations.takePicture();}

//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }

//}


}
