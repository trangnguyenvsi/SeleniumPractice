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
	
	@DataProvider(name="dpAddNewMem")
	public static Object[][]  getAddNewMem() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM25");
		return data;
	}
	
	@DataProvider(name="dpAddNewMem2")
	public static Object[][]  getAddNewMem2() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM28");
		return data;
	}

	@DataProvider(name = "dpEditProject")
	public static Object[][] editProData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM09");
		return data;
	}
	
	
	@DataProvider(name = "dpEditProject1")
	public static Object[][] editProData1() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM10");
		return data;
	}
	
	@DataProvider(name = "dpEditProject2")
	public static Object[][] editCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "EditProject", "PM11");
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
	
	@DataProvider(name = "CheckJIRA")
	public static Object[][]  getCheckJiraInfo() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ServiceImporting", "CheckJIRA");
		return data;
	}
	
	/*
	 * anhptq
	 */
	@DataProvider(name = "dp_PMOLoginAnhPTQ")
	public static Object[][] anhPTQPMOLogin() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "PMO");
		return data;
	}

	@DataProvider(name = "dpLogin_AnhPTQ")
	public static Object[][] anhPTQLogin() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Timesheet", "ProjectMember");
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
	
	@DataProvider(name="dpNewTaskPM")
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
	    @DataProvider(name="Adminlogin")
	    public static Object[][] Adminlogin() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC02");
	        return data;
	    }
	    
	    @DataProvider(name="notAdminlogin")
	    public static Object[][] getLoginnotAdmin() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC03");
	        return data;
	    }
	    @DataProvider(name="ISMSSelectType")
	    public static Object[][] ISMSSelectType() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC10");
	        return data;
	    }
	    @DataProvider(name = "ISMSAssginIssue")
	    public static Object[][] ISMSAssginIssue() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC11");
	        return data;
	    }
	    @DataProvider(name="ISMSAssginSearch")
	    public static Object[][]  ISMSAssginSearch() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC16");
	        return data;
	    }
	    @DataProvider(name="LogAnote")
	    public static Object[][]  LogAnote() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC20");
	        return data;}
	        @DataProvider(name="approveAnote")
	        public static Object[][]  approveAnote() {
	            Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC21");
	            return data;
	    }
	    
	    @DataProvider(name="loginTask")
	    public static Object[][]  loginTask() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC28");
	        return data;
	    }
	    @DataProvider(name="createATask")
	    public static Object[][]  createATask() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC30");
	        return data;
	    }
	    @DataProvider(name="phantich")
	    public static Object[][]  phantich() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC32");
	        return data;
	    }
	    @DataProvider(name="giaiphap")
	    public static Object[][]  giaiphap() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC33");
	        return data;
	    }
	       @DataProvider(name="duyet")
	        public static Object[][]  duyet() {
	            Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC34");
	            return data;
	        }
}
