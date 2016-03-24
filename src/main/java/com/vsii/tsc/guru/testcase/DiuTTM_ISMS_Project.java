package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.DiuTTM_ISMSPage;
import com.vsii.tsc.guru.pages.method.DiuTTM_ISMSMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_LoginPageMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_ProjectMethod;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class DiuTTM_ISMS_Project extends TestBase
{
    DiuTTM_LoginPageMethod objLogin; 
    //ISMSMethod objISMS;
    DiuTTM_ProjectMethod objProject;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new DiuTTM_LoginPageMethod(TestBase.driver);
        objProject = new DiuTTM_ProjectMethod(TestBase.driver);
    }

 // @Test(priority = 0, description = "Verify that user can see the issues of a project 1")
    public void TC07() throws IOException {     
        TestBase.methodName = "TC07";       
        objLogin.login("diuttm","ddduong123*");   
        objProject.GotoProjectPage();
        objProject.ExpandProj();
        objProject.ISOProjectPage();
        objProject.Clickissuebtn();
        objProject.VerifyissueofProject();
    }
  //@Test(priority = 1, description = "Verify that user can see the issues of a project 2")
  public void TC08() throws IOException {     
      TestBase.methodName = "TC08";       
      objLogin.login("diuttm","ddduong123*");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn();
      objProject.clickAdvSearchBtn();
      objProject.filterbyProject();
      objProject.clickAdvSearchBtn();
      objProject.clickListView();
  }
  @Test(priority = 2, description = "Verify that user can see the issues of a project 3")
  public void TC09() throws IOException {     
      TestBase.methodName = "TC09";       
      objLogin.login("admin","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.verifyIssuedisplayCorrectly();
  }

//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }
}
