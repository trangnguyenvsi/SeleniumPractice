package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnhPTQ_DepartmentTSPage {
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
	private WebElement mnDptTS;
	
	@FindBy(className="oe_view_manager_body")
	private WebElement deptTSTable;
	
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
