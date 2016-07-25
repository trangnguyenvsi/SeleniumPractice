package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_PMOViewPage {
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[3]/li[6]/a/span")
	private WebElement mnPMOView;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]/div")
	private WebElement ttlEmp;
	
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

	public WebElement getMnPMOView() {
		return mnPMOView;
	}

	public void setMnPMOView(WebElement mnPMOView) {
		this.mnPMOView = mnPMOView;
	}

	public WebElement getTtlEmp() {
		return ttlEmp;
	}

	public void setTtlEmp(WebElement ttlEmp) {
		this.ttlEmp = ttlEmp;
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
}
