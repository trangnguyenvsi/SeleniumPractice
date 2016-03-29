package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.ISMSPage;
import com.vsii.tsc.guru.pages.method.ISMSMethod;
import com.vsii.tsc.guru.pages.method.ISMS_LoginPageMethod;
import com.vsii.tsc.guru.pages.method.ISMS_ProjectMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class ISMS_Project extends TestBase
{
    ISMS_LoginPageMethod objLogin; 
    ISMSMethod objISMS;
    ISMS_ProjectMethod objProject;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new ISMS_LoginPageMethod(TestBase.driver);
        objProject = new ISMS_ProjectMethod(TestBase.driver);
        objISMS = new ISMSMethod(TestBase.driver);
    }

 // @Test(priority = 0, description = "Verify that user can see the issues of a project 1")
    public void TC07() throws IOException {     
        TestBase.methodName = "TC07";       
        objLogin.login("diuttm","12345678");   
        objProject.GotoProjectPage();
        objProject.ExpandProj();
        objProject.ISOProjectPage();
        objProject.Clickissuebtn();
        objProject.VerifyissueofProject();
        objISMS.logout();
    }
 // @Test(priority = 1, description = "Verify that user can see the issues of a project 2")
  public void TC08() throws IOException {     
      TestBase.methodName = "TC08";       
      objLogin.login("diuttm","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn();
      objProject.clickAdvSearchBtn();
      objProject.filterbyProject();
      objProject.clickAdvSearchBtn();
      objProject.clickListView();
      objISMS.logout();
  }
 // @Test(priority = 2, description = "Verify that a issue is displayed correctly")
  public void TC09() throws IOException {     
      TestBase.methodName = "TC09";       
      objLogin.login("admin","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.verifyIssuedisplayCorrectly();
      objISMS.logout();
  }
//@Test(priority = 3, description = "Verify that user can classify the severity of the issue.",dataProvider = "ISMSSelectType", dataProviderClass = TestData.class)
  public void TC10(String Level, String Level2) throws IOException {     
      TestBase.methodName = "TC10";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickEditIssue();
      objProject.selectLevel(Level);
      objProject.clickSaveIssueBtn();
      objProject.verifyselectlevelcorrect(Level2);  
      objISMS.logout();
  }
  //@Test(priority = 4, description = "Verify that user can assign a task to a person",dataProvider = "ISMSAssginIssue", dataProviderClass = TestData.class)
  public void TC11(String Assignee, String Assignee2) throws IOException {     
      TestBase.methodName = "TC11";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickEditIssue();
     objProject.inputAssginee(Assignee);
     objProject.clickSaveIssueBtn();
     objProject.verifyselectassigncorrect(Assignee2);     
     objISMS.logout();
  }
  //Case nay bi loi nen mac dinh la fail
 //@Test(priority = 5, description = "Verify that user can close the issue")
  public void TC12() throws IOException {     
      TestBase.methodName = "TC12";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickDoneBtn();
      objProject.VerifyTrueResultafterClickDoneOrCancel();
      objISMS.logout();
      
  }
//Case nay bi loi nen mac dinh la fail
// @Test(priority = 6, description = "Verify that user can cancel a issue")
  public void TC13() throws IOException {     
      TestBase.methodName = "TC13";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickCancelIssueBtn();
      objProject.VerifyTrueResultafterClickDoneOrCancel();
      objISMS.logout();
  }
//Case nay bi loi nen mac dinh la fail
 //@Test(priority = 7, description = "Verify that user can postpone a request to delete a issue")
  public void TC15() throws IOException {     
      TestBase.methodName = "TC15";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickMoreBtn();
      objProject.selectDelete();
      objProject.clickOKonDeleteIssueAlert();
      objProject.verifyDeleteSuccess();
      objISMS.logout();
               
  }
//@Test(priority = 8, description = "Verify that Seach Box works correctly",dataProvider = "ISMSAssginSearch", dataProviderClass = TestData.class)
 public void TC16(String searchCodi, String searchCondition) throws IOException {     
     TestBase.methodName = "TC16";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2(); 
     objProject.inputSearchissueCondition(searchCodi);
     objProject.verifySearchTrue(searchCondition);     
     objISMS.logout();
 }
 //@Test(priority = 9, description = "Verify that user can filter the issues according to priority levels")
 public void TC17() throws IOException {     
     TestBase.methodName = "TC17";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickAdvSearchBtn();
     objProject.filterbyPriority();
     objProject.verifyFilterbyPriorityCorrectly();
     objISMS.logout();

 }
 //@Test(priority = 10, description = "Verify that user can filter to see the issues which he is assigned to ")
 public void TC18() throws IOException {     
     TestBase.methodName = "TC18";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickAdvSearchBtn();
     objProject.filterbyMyIssue();//chua verify
 }
//@Test(priority = 11, description = "Verify that user can filter to see the issues which he is assigned to ")
public void TC19() throws IOException {     
    TestBase.methodName = "TC19";       
    objLogin.login("lienlt","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn2();
    objProject.clickAdvSearchBtn();
    objProject.filterbyStage();
    objProject.VerifyStage();
    objISMS.logout();
}
// @Test(priority = 12, description = "Verify that user can propose the solutions for solving the issue",dataProvider = "LogAnote", dataProviderClass = TestData.class)
 public void TC20(String Note, String expNote) throws IOException {     
     TestBase.methodName = "TC20";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickIssueTitle1();
     objProject.clickLogaNote_Btn();
     objProject.InputNoteArea(Note);
     objProject.clickSaveNote_btn();
     objProject.VerifyMakeNoteSucc(expNote);
     objISMS.logout();
 }
 //@Test(priority = 13, description = "Verify that user can propose the solutions for solving the issue",dataProvider = "approveAnote", dataProviderClass = TestData.class)
 public void TC21(String Note, String expNote) throws IOException {     
     TestBase.methodName = "TC21";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickIssueTitle1();
     objProject.clickLogaNote_Btn();
     objProject.InputNoteArea(Note);
     objProject.clickSaveNote_btn();
     objProject.VerifyMakeNoteSucc(expNote);
     objISMS.logout();
 }
//@Test(priority = 14, description = "Verify that form Create Task is opened corectly")
public void TC22() throws IOException {     
    TestBase.methodName = "TC22";       
    objLogin.login("diuttm","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn();
    objProject.clickIssueTitle1();
    objProject.clickEditIssue();
  objProject.clickCreateEditTask_icon();
  objProject.selectCreateEditTasklable();
objProject.VerifyCreateTaskDissplayCorrect();  
objISMS.logout();
}
//@Test(priority = 15, description = "Verify that user can create a task ")
public void TC23() throws IOException {     
  TestBase.methodName = "TC23";       
  objLogin.login("diuttm","12345678");   
  objProject.GotoProjectPage();
  objProject.clickIssueProjbtn();
  objProject.clickIssueTitle1();
  objProject.clickEditIssue();

objProject.clickCreateEditTask_icon();
objProject.selectCreateEditTasklable();
objProject.inputTasksummary("Task xu ly CV");
objProject.inputassign("NAMTT");
//objProject.VerifyCreateTaskDissplayCorrect();  
objISMS.logout();
}

//@Test(priority = 16, description = "Verify that form Create Task is opened corectly")
public void TC27() throws IOException {     
    TestBase.methodName = "TC27";       
    objLogin.login("diuttm","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn();
    objProject.clickIssueTitle1();
    objProject.clickEditIssue();
  objProject.ClickrelationTab();
objProject.clickAddBtn();
String a= objProject.getFeatureDescripTitle();
objProject.checkAIssue();  
objProject.clickSelectBtn();
String b= objProject.getExpfeatureDescripTitle();
Assert.assertEquals(a,b);
objISMS.logout();
}
//@Test(priority = 17, description = "Verify that form New is opened correctly ",dataProvider = "loginTask", dataProviderClass = TestData.class)
public void TC28(String user, String pass) throws IOException {     
  TestBase.methodName = "TC28";       
  objLogin.login(user,pass);   
  objProject.GotoProjectPage();
  objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
 objProject.clickkhacphucphongnguataskBtn();
objProject.clickCreate();
objProject.VerifyCreateTaskkppnDissplayCorrect();
objISMS.logout();
}
//@Test(priority = 18, description = "Verify that form New is opened correctly ",dataProvider = "loginTask", dataProviderClass = TestData.class)
public void TC29(String user, String pass) throws IOException {     
  TestBase.methodName = "TC29";       
  objLogin.login(user,pass);   
  objProject.GotoProjectPage();
  objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
objProject.clicktitle();
 objProject.clickkhacphucphongnguataskBtn(); 
objProject.clickCreate();
objProject.VerifyCreateTaskkppnDissplayCorrect();
objISMS.logout();
}
//@Test(priority = 19, description = "Verify that user can create a new task",dataProvider = "createATask", dataProviderClass = TestData.class)
public void TC30(String user, String pass, String Summ,String assign, String Inti, String DEs ) throws IOException, InterruptedException {     
TestBase.methodName = "TC30";       
objProject.createAnewTask(user, pass,Summ, assign ,  Inti,  DEs);
objISMS.logout();//chua verify
}
//chua xong
//@Test(priority = 3, description = "Verify that user can add the related issues")
public void TC31() throws IOException, InterruptedException {     
  TestBase.methodName = "TC31";       
  objLogin.login("nhungpth","12345678");   
  objProject.GotoProjectPage();
  objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
objProject.clicktitle();
 objProject.clickkhacphucphongnguataskBtn(); 
objProject.clickKppnTaskTitle();
objProject.clickkppnEditBtn();
objProject.clickkppnRelatedTab(); 
objProject.clickkppnAddRelatedBtn();
objISMS.logout();
}

//@Test(priority = 20, description = "Verify that user can update data on stage Phan tich ",dataProvider = "phantich", dataProviderClass = TestData.class)
public void TC32(String Descrip, String Descripex, String StageExp) throws IOException, InterruptedException {     
TestBase.methodName = "TC32";       
objLogin.login("vanph","12345678");   
objProject.GotoProjectPage();
objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
objProject.clicktitle();
objProject.clickkhacphucphongnguataskBtn(); 
objProject.clickKppnTaskTitle();
objProject.clickkppnEditBtn();
objProject.editTaskToPhanTichSucc(Descrip,Descripex,StageExp);
objISMS.logout();
}

//@Test(priority = 21, description = "Verify that user can update data on stage Giai phap",dataProvider = "giaiphap", dataProviderClass = TestData.class)
public void TC33(String Descrip, String Descripex, String StageExp) throws IOException, InterruptedException {     
TestBase.methodName = "TC33";       
objLogin.login("vanph","12345678");   
objProject.GotoProjectPage();
objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
objProject.clicktitle();
objProject.clickkhacphucphongnguataskBtn(); 
objProject.clickKppnTaskTitle();
objProject.clickkppnEditBtn();
objProject.editTaskToGiaiPhapSucc(Descrip,Descripex,StageExp);
objISMS.logout();
}

@Test(priority = 3, description = "Verify that user can update data on stage Phe duyet",dataProvider = "duyet", dataProviderClass = TestData.class)
public void TC34(String note,String Descripex, String StageExp) throws InterruptedException{     
TestBase.methodName = "TC34";       
objLogin.login("vanph","12345678");   
objProject.GotoProjectPage();
objProject.clickVSIIProject();
objProject.selectkhacphucphongngua();
objProject.clicktitle();
objProject.clickkhacphucphongnguataskBtn(); 
objProject.clickKppnTaskTitle();
objProject.editTaskToPheDuyetSucc(note,Descripex,StageExp);


}
//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }
}
