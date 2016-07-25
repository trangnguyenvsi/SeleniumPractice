package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_DepartmentTSPage {
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
	private WebElement mnDptTS;
	
	@FindBy(className="oe_view_manager_body")
	private WebElement deptTSTable;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]")
	private WebElement tblUser;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]/div")
	private WebElement ttlEmployee;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]/div")
	private WebElement ttlDateFrom;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]/div")
	private WebElement ttlDateTo;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]/div")
	private WebElement ttlDept;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]/div")
	private WebElement ttlTotalTS;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[8]/div")
	private WebElement ttlStatus;

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[21]/th")
	private WebElement lstMonth;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/button")			
	private WebElement btnMore;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[4]/a")			
	private WebElement btnDelete;
	
	public WebElement getTblUser() {
		return tblUser;
	}

	public void setTblUser(WebElement tblUser) {
		this.tblUser = tblUser;
	}

	public WebElement getBtnMore() {
		return btnMore;
	}

	public void setBtnMore(WebElement btnMore) {
		this.btnMore = btnMore;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(WebElement btnDelete) {
		this.btnDelete = btnDelete;
	}

	public WebElement getLstMonth() {
		return lstMonth;
	}

	public void setLstMonth(WebElement lstMonth) {
		this.lstMonth = lstMonth;
	}

	public WebElement getTtlEmployee() {
		return ttlEmployee;
	}

	public void setTtlEmployee(WebElement ttlEmployee) {
		this.ttlEmployee = ttlEmployee;
	}

	public WebElement getTtlDateFrom() {
		return ttlDateFrom;
	}

	public void setTtlDateFrom(WebElement ttlDateFrom) {
		this.ttlDateFrom = ttlDateFrom;
	}

	public WebElement getTtlDateTo() {
		return ttlDateTo;
	}

	public void setTtlDateTo(WebElement ttlDateTo) {
		this.ttlDateTo = ttlDateTo;
	}

	public WebElement getTtlDept() {
		return ttlDept;
	}

	public void setTtlDept(WebElement ttlDept) {
		this.ttlDept = ttlDept;
	}

	public WebElement getTtlTotalTS() {
		return ttlTotalTS;
	}

	public void setTtlTotalTS(WebElement ttlTotalTS) {
		this.ttlTotalTS = ttlTotalTS;
	}

	public WebElement getTtlStatus() {
		return ttlStatus;
	}

	public void setTtlStatus(WebElement ttlStatus) {
		this.ttlStatus = ttlStatus;
	}

	public WebElement getMnDptTS() {
		return mnDptTS;
	}

	public void setMnDptTS(WebElement mnDptTS) {
		this.mnDptTS = mnDptTS;
	}

	public WebElement getDeptTSTable() {
		return deptTSTable;
	}

	public void setDeptTSTable(WebElement deptTSTable) {
		this.deptTSTable = deptTSTable;
	}
}
