package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.DiuTTM_ISMSPage;
import com.vsii.tsc.guru.pages.method.DiuTTM_ISMSMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class DiuTTM_ComposeISMS extends TestBase
{
    DiuTTM_LoginPageMethod objLogin; 
    DiuTTM_ISMSMethod objISMS;
    DiuTTM_ISMSPage objISMSPage;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new DiuTTM_LoginPageMethod(TestBase.driver);
        objISMS = new DiuTTM_ISMSMethod(TestBase.driver);
        objISMSPage = new DiuTTM_ISMSPage();
    }

  @Test(priority = 1, description = "Verify that the form Compose ISMS Request is opened correctly")
    public void TC04() throws IOException {     
        TestBase.methodName = "TC04";       
        objLogin.login("diuttm","ddduong123*");   
        objISMS.GotoISMSPage();
        objISMS.ClickComposeISMSRequest();
        objISMS.VerifyComposeISMSReuestPopUp();
    }
   @Test(priority = 2, description = "Verify that user can report a issue")
    public void TC05() throws IOException {     
        TestBase.methodName = "TC05";
        //objLogin.login("diuttm","ddduong123*"); 
        //objISMS.ClickComposeISMSRequest();
        objISMS.ComposeISMSReuest("Causing confusion in the use for users","Files and Documents");
       // objISMS.logout();
    }
   @Test(priority = 3, description = "Verify that ISMS Issues List is displayed correctly")
    public void TC06() throws IOException, InterruptedException {     
        TestBase.methodName = "TC06";
        //objLogin.login("diuttm","ddduong123*"); 
        Thread.sleep(10000);
        objISMS.ClickISMSissue();
        objISMS.VerrifyISMSIssuesListdisplayedcorrectly();
    }
}
