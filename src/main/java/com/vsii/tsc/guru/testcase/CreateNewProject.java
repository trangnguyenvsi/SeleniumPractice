package com.vsii.tsc.guru.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vsii.tsc.guru.pages.method.ProjectCreateNewMethod;
import com.vsii.tsc.guru.pages.method.ProjectGroupPageMethod;
import com.vsii.tsc.guru.pages.LoginPage;
import com.vsii.tsc.guru.pages.ProjectCreateNew;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.guru.commethods.CommonMethods;

public class CreateNewProject {
    LoginPageMethod objLogin;
    ProjectCreateNewMethod objCreateProjectMethod;
    ProjectCreateNew objCreateProject;

    @BeforeClass
    public void setupClass() throws Exception {
        objLogin = new LoginPageMethod(TestBase.driver);
        objCreateProjectMethod = new ProjectCreateNewMethod(TestBase.driver);
//      CommonMethods.checkLogin();
    }
    
//  @Test(priority = 0, description = "Verify that Project List is displayed correctly")
    public void PM01() throws InterruptedException {
        TestBase.methodName = "PM01";   
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(3000); 
        objCreateProjectMethod.clickDepartment();
        Assert.assertEquals(objCreateProjectMethod.getlbProject1(), "TSC_General _Non project works");
        Assert.assertEquals(objCreateProjectMethod.getlbProject2(), "Laplink 07");
        Assert.assertEquals(objCreateProjectMethod.getlbProject3(), "VIB-IP3");
        Assert.assertEquals(objCreateProjectMethod.getlbProject4(), "Vpbank testing");      
    }
    
//  @Test(priority = 0, description = "Verify paging")
    public void PM02() throws InterruptedException {
        TestBase.methodName = "PM01";   
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        objCreateProjectMethod.clickRemoveOpenFilter();
        Thread.sleep(3000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        Assert.assertTrue(objCreateProjectMethod.getEightythProject().isDisplayed());
        objCreateProjectMethod.clickNextpagebtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getProjectwith3stage().isDisplayed());
        
    }
    
//  @Test(priority = 0, description = "Verify that Project Group List is displayed correctly")
    public void PM03() throws InterruptedException {
        TestBase.methodName = "PM03";   
//      objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(3000);
        Assert.assertEquals(objCreateProjectMethod.getGrouplb(), "Group");
        Assert.assertEquals(objCreateProjectMethod.getProjectName(), "Project Name");
        Assert.assertEquals(objCreateProjectMethod.getProjectManager(), "Project Manager");
        Assert.assertEquals(objCreateProjectMethod.getContact(), "Contact");
        Assert.assertEquals(objCreateProjectMethod.getPlannedTime(), "Planned Time");
        Assert.assertEquals(objCreateProjectMethod.getTotalTime(), "Total Time");
        Assert.assertEquals(objCreateProjectMethod.getSpendTime(), "Time Spent");
        Assert.assertEquals(objCreateProjectMethod.getProjectCode(), "Project Code");
        Assert.assertEquals(objCreateProjectMethod.getProgress(), "Progress");
        Assert.assertEquals(objCreateProjectMethod.getStatus(), "Status");      
 
    }
    
//  @Test(priority = 0, description = "Verify that a Group Project is displayed correctly")
    public void PM04() throws InterruptedException {
        TestBase.methodName = "PM04";
//      objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(3000);
        Assert.assertEquals(objCreateProjectMethod.getGrouplb(), "Group");
        Assert.assertEquals(objCreateProjectMethod.getProjectName(), "Project Name");
        Assert.assertEquals(objCreateProjectMethod.getProjectManager(), "Project Manager");
        Assert.assertEquals(objCreateProjectMethod.getContact(), "Contact");
        Assert.assertEquals(objCreateProjectMethod.getPlannedTime(), "Planned Time");
        Assert.assertEquals(objCreateProjectMethod.getTotalTime(), "Total Time");
        Assert.assertEquals(objCreateProjectMethod.getSpendTime(), "Time Spent");
        Assert.assertEquals(objCreateProjectMethod.getProjectCode(), "Project Code");
        Assert.assertEquals(objCreateProjectMethod.getProgress(), "Progress");
        Assert.assertEquals(objCreateProjectMethod.getStatus(), "Status");      
 
    }
    
//  @Test(priority = 0, description = "Verify view detail a project work correctly")
    public void PM05() throws InterruptedException {
        TestBase.methodName = "PM05";   
//      objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(3000);
        Assert.assertEquals(objCreateProjectMethod.getGrouplb(), "Group");
        Assert.assertEquals(objCreateProjectMethod.getProjectName(), "Project Name");
        Assert.assertEquals(objCreateProjectMethod.getProjectManager(), "Project Manager");
        Assert.assertEquals(objCreateProjectMethod.getContact(), "Contact");
        Assert.assertEquals(objCreateProjectMethod.getPlannedTime(), "Planned Time");
        Assert.assertEquals(objCreateProjectMethod.getTotalTime(), "Total Time");
        Assert.assertEquals(objCreateProjectMethod.getSpendTime(), "Time Spent");
        Assert.assertEquals(objCreateProjectMethod.getProjectCode(), "Project Code");
        Assert.assertEquals(objCreateProjectMethod.getProgress(), "Progress");
        Assert.assertEquals(objCreateProjectMethod.getStatus(), "Status");      
 
    }

//  @Test(priority = 0, description = "Create New Project with valid data", dataProvider = "dpNewProject", dataProviderClass = TestData.class)
    public void PM06(String projectName, String refContract, String projectCode, String privacy, String projectManager,
            String appEffort, String department, String projectType, String commDetails, String customer)
                    throws Exception {

        TestBase.methodName = "PM06";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
        Thread.sleep(1000);
        objCreateProjectMethod.clickCreatebtn();
        objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager,
                appEffort, department, projectType, commDetails, customer);
        Thread.sleep(3000);
        Assert.assertEquals(objCreateProjectMethod.getCreateSucc(),projectName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
//  @Test(priority = 1, description = "Create New Project with invalid data", dataProvider = "dpInvalidCreate1", dataProviderClass = TestData.class)
    public void PM07(String projectName, String refContract, String projectCode, String privacy, String projectManager,
            String appEffort, String department2, String projectType, String commDetails, String customer)
                    throws Exception {
        TestBase.methodName = "PM07";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
        objCreateProjectMethod.clickCreatebtn();
        objCreateProjectMethod.createNewProject2(projectName, refContract, projectCode, privacy, projectManager,
                appEffort, department2, projectType, commDetails, customer);
        Assert.assertTrue(objCreateProjectMethod.getErrorMes().contains("Access Denied"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
//  @Test(priority = 2, description = "Create New Project with leaving required fields blank", dataProvider = "dpInvalidCreate2", dataProviderClass = TestData.class)
    public void PM08(String projectName, String refContract, String projectCode, String privacy, String projectManager,
            String appEffort, String department, String projectType, String commDetails, String customer)
                    throws Exception {

        TestBase.methodName = "PM08";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
        objCreateProjectMethod.clickCreatebtn();
        objCreateProjectMethod.createNewProject(projectName, refContract, projectCode, privacy, projectManager,
        appEffort, department, projectType, commDetails, customer);
        Assert.assertTrue(objCreateProjectMethod.getPopupText().contains("Following fields are invalid"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
//  @Test(priority = 0, description = "Edit Project with valid data", dataProvider = "dpEditProject", dataProviderClass = TestData.class)
    public void PM09(String privacy,String appEffort)
                    throws Exception {

        TestBase.methodName = "PM09";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        CommonMethods.waitUntil(objCreateProjectMethod.getProjectDemo());
        objCreateProjectMethod.clickProjectDemo();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject(privacy, appEffort);
        Assert.assertEquals(objCreateProjectMethod.getNewPrivacy(),privacy);
        Assert.assertEquals(objCreateProjectMethod.getNewEffort(),appEffort);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
//  Case 10 always wrong: Edit successfully instead of changing department
//  @Test(priority = 0, description = "Edit Project with invalid data 1", dataProvider = "dpEditProject1", dataProviderClass = TestData.class)
    public void PM10(String department)
                    throws Exception {

        TestBase.methodName = "PM10";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        CommonMethods.waitUntil(objCreateProjectMethod.getProjectDemo1());
        objCreateProjectMethod.clickProjectDemo1();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject2(department);
        Assert.assertEquals(objCreateProjectMethod.getDepart(),department);
//      Assert.assertTrue(objCreateProjectMethod.getErrorMes().contains("Access Denied"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
//  Case 11: Can NOT get xpath of alert at the right corner 
//  @Test(priority = 0, description = "Edit Project with invalid data 2", dataProvider = "dpEditProject2", dataProviderClass = TestData.class)
    public void PM11(String department, String projectType, String commDetails)
                    throws Exception {

        TestBase.methodName = "PM11";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        CommonMethods.waitUntil(objCreateProjectMethod.getProjectDemo());
        objCreateProjectMethod.clickProjectDemo();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject3(department, projectType, commDetails);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        
    }
    
//  Case 12:
//  @Test(priority = 0, description = "Verify cancel edit by clicking Discard")
    public void PM12()
            throws Exception {

        TestBase.methodName = "PM12";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        CommonMethods.waitUntil(objCreateProjectMethod.getProjectDemo());
        objCreateProjectMethod.clickProjectDemo();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.discardEditProject("100", "VSII / TSC");
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getPopupText().contains("Warning, the record has been modified, your changes will be discarded"));
        objCreateProjectMethod.cickCancelOnPopup();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
//  Case 13: Click on OK on pop-up
//  @Test(priority = 0, description = "Verify cancel edit by clicking Discard")
    public void PM13()
            throws Exception {

        TestBase.methodName = "PM13";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        CommonMethods.waitUntil(objCreateProjectMethod.getProjectDemo());
        objCreateProjectMethod.clickProjectDemo();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.discardEditProject("VSII / TSC", "100");
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getPopupText().contains("Warning, the record has been modified, your changes will be discarded"));
        objCreateProjectMethod.closePopup();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
//  Case 14: Submit to review
//  @Test(priority = 0, description = "Verify Submit to Review")
    public void PM14() throws Exception {

        TestBase.methodName = "PM14";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        CommonMethods.waitUntil(objCreateProjectMethod.getbtnCreate());
        Thread.sleep(1000);
        objCreateProjectMethod.clickCreatebtn();
        objCreateProjectMethod.createNewProject("Project 2016","IBM Customer", "SDC.2016-IBM.01", "All Users", "Phuong-Nguyen Thi Phuong",
                "80:00", "VSII / SDC", "Training", "Internal Project", "VSI-INTERNATIONAL, VSII");
        Thread.sleep(3000);
        objCreateProjectMethod.clickSubmitToReviewbtn();
        Assert.assertTrue(objCreateProjectMethod.getColorReviewbtn().contains("#3465a4"));
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
//  Case 15: Login with account TSC's  management
//  @Test(priority = 0, description = "Verify Submit to Review")
    public void PM15() throws Exception {

        TestBase.methodName = "PM15";
//      objLogin.loginToManagerPage("lienlt", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProjectTSC());
        objCreateProjectMethod.clickProjectTSCmn();
//      CommonMethods.waitUntil(objCreateProjectMethod.getSearchAdtxt());
        Thread.sleep(1000);
        objCreateProjectMethod.clickSearchAd();
        objCreateProjectMethod.clickReviewStt();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        Thread.sleep(3000);     
        Assert.assertTrue(objCreateProjectMethod.getProjectstt().contains("Check Project Status"));
        Assert.assertTrue(objCreateProjectMethod.getStatus().contains("Review"));
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
//  Case 16: Projects with new/review status will NOT have Timesheet and Task 
    
//  @Test(priority = 0, description = "Verify Submit to Review")
    public void PM16() throws Exception {

        TestBase.methodName = "PM16";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        objCreateProjectMethod.clickRemoveOpenFilter();
        objCreateProjectMethod.clickSearchAd();
        objCreateProjectMethod.clickNewstt();
        objCreateProjectMethod.clickReviewStt();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        Thread.sleep(3000);     
        objCreateProjectMethod.clickProjectNew();
        Assert.assertFalse(objCreateProjectMethod.getTask().isDisplayed());
        Assert.assertFalse(objCreateProjectMethod.getTimesheet().isDisplayed());
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // Case 17: Verify function Approve a Project
//  @Test(priority = 0, description = "Verify function Approve a Project")
    public void PM17() throws Exception {

        TestBase.methodName = "PM17";
        objLogin.loginToManagerPage("anhntv", "12345678");
        // can create NEw project > Submit at this step. After that, check approving created project
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        objCreateProjectMethod.clickRemoveOpenFilter();
        objCreateProjectMethod.clickSearchAd();
        objCreateProjectMethod.clickReviewStt();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectApproving();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject("Employees Only","100");
        Thread.sleep(3000); 
        objCreateProjectMethod.clickApprove();
        Thread.sleep(5000); 
        Assert.assertTrue(objCreateProjectMethod.getColorProgessbtn().contains("#3465a4"));
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
    // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // Case 18: Verify that PMO can not approve a Project unless PMO input approve effort
//      @Test(priority = 0, description = "Verify fuction Approve a Project")
        public void PM18() throws Exception {

            TestBase.methodName = "PM18";
            objLogin.loginToManagerPage("anhntv", "12345678");
            // can create NEw project > Submit at this step. After that, check approving created project
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            objCreateProjectMethod.clickRemoveOpenFilter();
            objCreateProjectMethod.clickSearchAd();
            objCreateProjectMethod.clickReviewStt();
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickProjectApproving();
            Thread.sleep(3000); 
            objCreateProjectMethod.clickApprove();
            Assert.assertTrue(objCreateProjectMethod.getWarning().contains("Please enter the Approve Effort !!!"));
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
        // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        // Case 19: Verify function Refuse a Project
//      @Test(priority = 0, description = "Verify function Refuse a Project")
        public void PM19() throws Exception {

            TestBase.methodName = "PM19";
            objLogin.loginToManagerPage("anhntv", "12345678");
            // can create NEw project > Submit at this step. After that, check approving created project
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            objCreateProjectMethod.clickRemoveOpenFilter();
            objCreateProjectMethod.clickSearchAd();
            objCreateProjectMethod.clickReviewStt();
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickProjectApproving();
            objCreateProjectMethod.getEditbtn();
            objCreateProjectMethod.editProject("Employees Only","100");
            objCreateProjectMethod.clickRefuseApproving();
            Thread.sleep(3000);
            Assert.assertTrue(objCreateProjectMethod.getSubmitAfterRef().isDisplayed());
//          Assert.assertTrue(objCreateProjectMethod.getColorNewbtn().contains("#3465a4"));
            
            Thread.sleep(3000);     
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
        // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    // Case 20: Verify that when Edit an in progress project with Not required fields, project is not change to NEW
//  @Test(priority = 0, description = "Verify edit an in progress Project")
            public void PM20() throws Exception {

            TestBase.methodName = "PM20";
            objLogin.loginToManagerPage("anhhm", "12345678");
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickProjectEditWithPS();
//          objCreateProjectMethod.clickEditbtn();
            objCreateProjectMethod.getEditbtn();
            objCreateProjectMethod.editProject4("LIENLT", "Employees Only");
            objCreateProjectMethod.isCheckedWorklog();
            Thread.sleep(3000);
            objCreateProjectMethod.clickAddMember();
            objCreateProjectMethod.addNewMember("Diu-Tran Thi Minh Diu");
            Thread.sleep(3000);
            objCreateProjectMethod.clickSavebtn();
            Assert.assertFalse(objCreateProjectMethod.getColorProgessbtn().contains("#3465a4"));
            Thread.sleep(3000);     
                    
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        
    // Case 21: Verify function Close a Project 
//  @Test(priority = 0, description = "Verify function Close a Project")
        public void PM21() throws Exception {
        TestBase.methodName = "PM21";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(3000);
        objCreateProjectMethod.clickCloseProjectbtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getColorClosedbtn().contains("#3465a4"));
        Assert.assertTrue(objCreateProjectMethod.getReopenProjbtn().isDisplayed());
        objCreateProjectMethod.clickReopenProjectbtn();
        Assert.assertTrue(objCreateProjectMethod.getColorProgessbtn().contains("#3465a4"));
        Assert.assertTrue(objCreateProjectMethod.getCloseProjbtn().isDisplayed());
    }
    
    // Case 22: Verify function Pending a Project   
//  @Test(priority = 0, description = "Verify function Pending a Project")
        public void PM22() throws Exception {
        TestBase.methodName = "PM22";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(3000);
        objCreateProjectMethod.clickPendingProjbtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getReopenProjbtn().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getCloseProjectbtn().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getCancelProjectbtn().isEnabled());
        objCreateProjectMethod.clickReopenProjectbtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getCloseProjectbtn().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getCancelProjectbtn().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getPendingProjectbtn().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getSetAsTemp().isEnabled());
        }
        
    // Case 23: Verify function Set as Template a Project   
//  @Test(priority = 0, description = "Verify function Set as Template a Project")
        public void PM23() throws Exception {
        TestBase.methodName = "PM23";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(1000);
        objCreateProjectMethod.clickSetAsTempbtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getTemplate1().isEnabled());
        Assert.assertTrue(objCreateProjectMethod.getTemplate2().isEnabled());

    }   
                
    // Case 24: Verify function Cancel a Project    
//  @Test(priority = 0, description = "Verify function Cancel a Project")
        public void PM24() throws Exception {
        TestBase.methodName = "PM24";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(1000);
        objCreateProjectMethod.clickCancelProjbtn();
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getReopenProjbtn().isEnabled());
        }
        
    // Case 25: Verify function Add member into a project
//  @Test(priority = 0, description = "Verify function Add member into a project", dataProvider = "dpAddNewMem", dataProviderClass = TestData.class)
        public void PM25(String usernameMember, String startDate, String endDate, String allocate) throws Exception {
        TestBase.methodName = "PM25";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(1000);
        objCreateProjectMethod.editProject4("LIENLT", "Employees Only");
        Thread.sleep(3000);
        objCreateProjectMethod.clickAddMember();
        Thread.sleep(3000);
        objCreateProjectMethod.addNewMember1(usernameMember, startDate, endDate, allocate);
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getteamMember().contains(usernameMember));
        }
    
    // Case 26: Verify that Allocation Rate is displayed correctly with valid data
//  @Test(priority = 0, description = "Verify that Allocation Rate is displayed correctly with valid data")
    public void PM26() throws Exception {
        TestBase.methodName = "PM26";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject4("LIENLT", "Employees Only");
        objCreateProjectMethod.isCheckedWorklog();
        Thread.sleep(3000);
        objCreateProjectMethod.clickAddMember();
        objCreateProjectMethod.addNewMember("Nhung-Pham Tuyet Nhung");
        Assert.assertFalse(objCreateProjectMethod.getAllocate().contains("80.00"));
        Thread.sleep(3000);     
    }
    
    // Case 27: Verify that Allocation Rate is displayed correctly with invalid data
//  @Test(priority = 0, description = "Verify that Allocation Rate is displayed correctly with invalid data")
    public void PM27() throws Exception {
        TestBase.methodName = "PM27";
        objLogin.loginToManagerPage("phuongnt3", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        objCreateProjectMethod.getEditbtn();
        objCreateProjectMethod.editProject4("LIENLT", "Employees Only");
        objCreateProjectMethod.isCheckedWorklog();
        Thread.sleep(3000);
        objCreateProjectMethod.clickAddMember();
        objCreateProjectMethod.addNewMember("Tinh-Le Thi Tinh");
        Assert.assertFalse(objCreateProjectMethod.getAllocate().contains("-50.00"));
        Assert.assertFalse(objCreateProjectMethod.getAllocate().contains("Invalid Allocated Rate"));
        Thread.sleep(3000);     
    }
    
    // Case 28: Verify function Add member into a project. To check with dataProvider has many row, must logout
//  @Test(priority = 0, description = "Verify function Add member into a project", dataProvider = "dpAddNewMem2", dataProviderClass = TestData.class)
    public void PM28(String usernameMember, String startDate, String endDate, String allocate) throws Exception {
        TestBase.methodName = "PM28";
        objLogin.loginToManagerPage("anhhm", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        Thread.sleep(1000);
        objCreateProjectMethod.editProject4("LIENLT", "Employees Only");
        Thread.sleep(3000);
        objCreateProjectMethod.clickAddMember();
        Thread.sleep(3000);
        objCreateProjectMethod.addNewMember1(usernameMember, startDate, endDate, allocate);
        Thread.sleep(3000);
        Assert.assertTrue(objCreateProjectMethod.getteamMember().contains(usernameMember));
        }   

    // Case 29: Verify function Remove member from a project
//  @Test(priority = 0, description = "Verify function Remove member from a project")
    public void PM29() throws Exception {
        TestBase.methodName = "PM29";
        objLogin.loginToManagerPage("anhhm", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        objCreateProjectMethod.clickEditProjbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.clickDelMem();
        Thread.sleep(3000);
        objCreateProjectMethod.closePopup();
        objCreateProjectMethod.clickSaveEdbtn();
//      Assert.assertFalse(objCreateProjectMethod.getteamMember().contains("Anh-Hoang Mai Anh"));
    }   
// Case 30: Verify project member list be paged correctly
//  @Test(priority = 0, description = "Verify project member list be paged correctly")
    public void PM30() throws Exception {
        TestBase.methodName = "PM30";
        objLogin.loginToManagerPage("anhhm", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectEditWithPS();
        objCreateProjectMethod.clickEditProjbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.clickDelMem();
        Thread.sleep(3000);
        objCreateProjectMethod.closePopup();
        objCreateProjectMethod.clickSaveEdbtn();
//      Assert.assertFalse(objCreateProjectMethod.getteamMember().contains("Anh-Hoang Mai Anh"));
    }
    
    // Case 31: Verify that PM can change Project Stages correctly: Default
//  @Test(priority = 0, description = "Verify that PM can change Project Stages correctly")
    public void PM31() throws Exception {
        TestBase.methodName = "PM31";
        objLogin.loginToManagerPage("anhhm", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickNewProject();
        objCreateProjectMethod.clickEditProjbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.clickStageProjectTab();
        Assert.assertTrue(objCreateProjectMethod.getNEWdefaultstt().isDisplayed());
        Assert.assertTrue(objCreateProjectMethod.getInProgressdefaultstt().isDisplayed());
        Assert.assertTrue(objCreateProjectMethod.getDonedefaultstt().isDisplayed());
        
    }   
    
    // Case 31_InCase: Verify that PM can change Project Stages correctly
//      @Test(priority = 0, description = "Verify that PM can change Project Stages correctly")
        public void PM312() throws Exception {
            TestBase.methodName = "PM31";
            objLogin.loginToManagerPage("anhhm", "12345678");
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickStageOfProject();
            objCreateProjectMethod.clickEditProjbtn();
            Thread.sleep(3000);
            objCreateProjectMethod.clickStageProjectTab();
            Thread.sleep(3000);
            objCreateProjectMethod.clickAddStagebtn();
            Thread.sleep(3000);
            objCreateProjectMethod.clickNewStage();
            Thread.sleep(3000);
            objCreateProjectMethod.clickAddStagebtn();
            Thread.sleep(3000);
            objCreateProjectMethod.clickInProgressStage();
            Thread.sleep(3000);
            objCreateProjectMethod.clickAddStagebtn();
            Thread.sleep(3000);
            objCreateProjectMethod.clickDoneStage();
            Thread.sleep(3000);
            objCreateProjectMethod.clickSaveEdbtn();
            Thread.sleep(3000);
            objCreateProjectMethod.clickSubmitToReviewbtn();
            Thread.sleep(3000);
            objCreateProjectMethod.logout();
            Thread.sleep(6000);
            objCreateProjectMethod.getUsername().clear();
            objLogin.loginToManagerPage("anhntv", "12345678");
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            objCreateProjectMethod.clickRemoveOpenFilter();
            objCreateProjectMethod.clickSearchAd();
            objCreateProjectMethod.clickReviewStt();
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickStageOfProject();
            Thread.sleep(3000); 
            objCreateProjectMethod.clickApprove();
            Thread.sleep(3000); 
            objCreateProjectMethod.getUsername().clear();
            objLogin.loginToManagerPage("quyentx", "12345678");
            CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
            objCreateProjectMethod.clickProjectmn();
            Thread.sleep(1000);
            CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
            objCreateProjectMethod.clickDepart();
            objCreateProjectMethod.clickStageOfProject();
            Thread.sleep(3000); 
            Assert.assertTrue(objCreateProjectMethod.getNEWstt().isDisplayed());
            Assert.assertTrue(objCreateProjectMethod.getINPROGRESSstt().isDisplayed());
            Assert.assertTrue(objCreateProjectMethod.getDONEstt().isDisplayed());
            
        }   
        
    // Case 32: Verify that PM can delete stage/ stages correctly
//  @Test(priority = 0, description = "Verify that PM can delete stage/ stages correctly")
    public void PM32() throws Exception {
        TestBase.methodName = "PM31";
        objLogin.loginToManagerPage("anhhm", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectwith3Stage();
        objCreateProjectMethod.clickEditProjbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.clickStageProjectTab();
        Thread.sleep(3000);
        objCreateProjectMethod.clickDeleteNewStage();
        objCreateProjectMethod.closePopup();
        objCreateProjectMethod.clickDeleteDoneStage();
        objCreateProjectMethod.closePopup();
        objCreateProjectMethod.clickSaveEdbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.clickSubmitToReviewbtn();
        Thread.sleep(3000);
        objCreateProjectMethod.logout();
        Thread.sleep(6000);
        objCreateProjectMethod.getUsername().clear();
        objLogin.loginToManagerPage("anhntv", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        objCreateProjectMethod.clickRemoveOpenFilter();
        objCreateProjectMethod.clickSearchAd();
        objCreateProjectMethod.clickReviewStt();
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        objCreateProjectMethod.clickProjectwith3Stage();
        Thread.sleep(3000); 
        objCreateProjectMethod.clickApprove();
        Thread.sleep(3000); 
        objCreateProjectMethod.getUsername().clear();
        objLogin.loginToManagerPage("quyentx", "12345678");
        CommonMethods.waitUntil(objCreateProjectMethod.getmnProject());
        objCreateProjectMethod.clickProjectmn();
        Thread.sleep(1000);
        CommonMethods.waitUntil(objCreateProjectMethod.getDepart());
        objCreateProjectMethod.clickDepart();
        Thread.sleep(1000);
        objCreateProjectMethod.clickProjectwith3Stage();
        }
    
    @AfterMethod
    public void afterMethod() throws Exception {
        CommonOperations.takePicture();
    }

    @AfterClass
    public void teardownClass() {
        objLogin = null;
    }
}
