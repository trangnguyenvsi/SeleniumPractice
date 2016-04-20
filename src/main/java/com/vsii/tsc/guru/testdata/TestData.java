package com.vsii.tsc.guru.testdata;

import org.testng.annotations.DataProvider;
import com.vsii.tsc.utility.ExcelHandle;;

public class TestData {
	@DataProvider(name="reset")
	public static Object[][] getLoginValid() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "LO03");
		return data;
	}
	
	@DataProvider(name = "dpLogin")
	public static Object[][] getLoginData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "LO02");
		return data;
	}

	@DataProvider(name = "dpValidateCustomer")
	public static Object[][] getValidateCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN02");
		return data;
	}
	
	@DataProvider(name="dpNewCustomer")
	public static Object[][]  getCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN03");
		return data;
	}
	@DataProvider(name="dpNewProject")
	public static Object[][]  getCreateNewData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewProject", "PM06");
		return data;
	}
	
	@DataProvider(name="dpInvalidCreate1")
	public static Object[][]  getInvalidData1() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewProject", "PM07");
		return data;
	}
	
	@DataProvider(name="dpInvalidCreate2")
	public static Object[][]  getInvalidData2() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewProject", "PM08");
		return data;
	}

	@DataProvider(name = "dpEditProject")
	public static Object[][] editCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM09");
		return data;
	}
//	@DataProvider(name = "dpEditCustomer")
//	public static Object[][] editCustomerData() {
//		Object[][] data = Utility.getTable("./data/TestData.xlsx", "EditCustomer", "ED03");
//		return data;
//	}
	
	/*
	 * quyentx dataProvider section
	 */
	
	@DataProvider(name = "W01")
	public static Object[][]  getServiceData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W01");
		return data;
	}
	
	@DataProvider(name = "W02")
	public static Object[][]  getVSIIProjectDetails() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W02");
		return data;
	}
	
	
	@DataProvider(name = "W03")
	public static Object[][]  getProjectName() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W03");
		return data;
	}
	
	@DataProvider(name = "W04")
	public static Object[][]  getWorklogDetail() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W04");
		return data;
	}
	
	@DataProvider(name = "W05")
	public static Object[][]  getWorklogJira() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W05");
		return data;
	}
	
	@DataProvider(name = "W06")
	public static Object[][]  getEditWorklogJira() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W06");
		return data;
	}
	
	@DataProvider(name = "W07")
	public static Object[][]  getDeleteWorklogJira() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "W07");
		return data;
	}
	
	@DataProvider(name = "createProject")
	public static Object[][]  getProjectInfo() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "CreateProject");
		return data;
	}	
	
	/*
	  * anhptq
	  */
	 @DataProvider(name = "dp_PMOLoginTS")
	 public static Object[][] anhPTQPMOLogin() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "PMO");
	  return data;
	 }

	 @DataProvider(name = "dpLogin_TS")
	 public static Object[][] anhPTQLogin() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "ProjectMember");
	  return data;
	 }
	 
	 @DataProvider(name = "dpLogin_PMO_TS")
	 public static Object[][] anhPTQLoginPMO() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TC03");
	  return data;
	 }
	 
	 @DataProvider(name = "dpLogin_PM_TS")
	 public static Object[][] anhPTQLoginPM() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TC05");
	  return data;
	 }
	 
	 @DataProvider(name = "dpCreate_TS_Valid")
	 public static Object[][] anhPTQCreateTS() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS09");
	  return data;
	 }
	 
	 @DataProvider(name = "dpCreate_TS_Invalid")
	 public static Object[][] anhPTQCreateTSInvalid() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS10");
	  return data;
	 }
	 
	 @DataProvider(name = "dpEdit_TS_Valid")
	 public static Object[][] anhPTQEditTSValid() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS17");
	  return data;
	 }
	 
	 @DataProvider(name = "dpDel_TS_Single")
	 public static Object[][] anhPTQDelSingleTS() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS20");
	  return data;
	 }
	 
	 @DataProvider(name = "dpDismis_TS_Single")
	 public static Object[][] anhPTQDismisSingleTS() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS21");
	  return data;
	 }
	 
	 @DataProvider(name = "dpDel_TS_Multi")
	 public static Object[][] anhPTQDelMultiTS() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS22");
	  return data;
	 }
	 
	 @DataProvider(name = "dpSelect_User_Multi")
	 public static Object[][] anhPTQSelectMultiUser() {
	  Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "TS26");
	  return data;
	 }
	
	
	/*
	 * TrangLT
	 */
	@DataProvider(name="dpNewTaskErr")
	public static Object[][]  getTaskDataErr() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_PM", "TM03");
		return data;
	}
	
	@DataProvider(name="dpNewTask")
	public static Object[][]  getTaskDataPM() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_PM", "TM04");
		return data;
	}
	
	@DataProvider(name="dpNewTaskUserOutside")
	public static Object[][]  getTaskDataUserOutside() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_PM", "TM05");
		return data;
	}
	
	@DataProvider(name="dpNewTaskEdit")
	public static Object[][]  getTaskDataEdit() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_PM", "TM06");
		return data;
	}
	
	@DataProvider(name="dpStatusListNotAllowToDone")
	public static Object[][]  getStatusListNotAllowToDone() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_Member", "TM18");
		return data;
	}
	
	@DataProvider(name="dpNumberOfTaskWantToSelect")
	public static Object[][]  getNumberOfTaskWantToSelect() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_Member", "TM28");
		return data;
	}
	
	@DataProvider(name="dpTaskAdminDelete")
	public static Object[][]  getTaskAdminDelete() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateTask_PM", "TM31");
		return data;
	}
	
    @DataProvider(name = "employeeLogin")
    public static Object[][]  employeeLogin() {
        Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Account", "Employee");
        return data;
    }
    
    @DataProvider(name = "projectManagerLogin")
    public static Object[][]  projectManagerLogin() {
        Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Account", "ProjectManager");
        return data;
    }
    
    @DataProvider(name = "deleteSkill")
    public static Object[][] deleteSkill() {
    	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Skill", "SelectedSkill");
    	return data;
    }
    
    @DataProvider(name = "deleteCategory")
    public static Object[][] deleteCategory() {
    	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Category", "DeleteCategory");
    	return data;
    }
    
    @DataProvider(name = "createCategory")
    public static Object[][] createCategory() {
      	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Category", "CreateCategory");
       	return data;
    }
    
    @DataProvider(name = "editCategory")
    public static Object[][] editCategory() {
      	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Category", "EditCategory");
       	return data;
    }
    
    @DataProvider(name = "createSkill")
    public static Object[][] createSkill() {
      	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Skill", "CreateSkill");
       	return data;
    }

    @DataProvider(name = "editSkill")
    public static Object[][] editSkill() {
      	Object[][] data = ExcelHandle.getTable("./data/SkillsManagement_TestData.xlsx", "Skill", "EditSkill");
       	return data;
    }
}
