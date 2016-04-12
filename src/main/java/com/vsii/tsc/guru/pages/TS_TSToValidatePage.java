package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_TSToValidatePage {

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[2]/a")
	private WebElement mnTSToValidate;
	
	@FindBy(className = "oe_list_content")
	private WebElement tblTSToValidate;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/header/button[2]")
	private WebElement btnApprove;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/header/button[4]")
	private WebElement btnRefuse;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/button")
	private WebElement btnMore;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[5]/a")
	private WebElement btnApproveMulti;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[5]/a")
	private WebElement lblTotalRecord;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/div[2]/span[1]")
	private WebElement btnX;
	
	@FindBy(xpath = "")
	private WebElement chkboxToDel;
	
	public WebElement getChkboxToDel() {
		return chkboxToDel;
	}

	public void setChkboxToDel(WebElement chkboxToDel) {
		this.chkboxToDel = chkboxToDel;
	}

	public WebElement getBtnX() {
		return btnX;
	}

	public void setBtnX(WebElement btnX) {
		this.btnX = btnX;
	}

	public WebElement getLblTotalRecord() {
		return lblTotalRecord;
	}

	public void setLblTotalRecord(WebElement lblTotalRecord) {
		this.lblTotalRecord = lblTotalRecord;
	}

	public WebElement getBtnMore() {
		return btnMore;
	}

	public void setBtnMore(WebElement btnMore) {
		this.btnMore = btnMore;
	}

	public WebElement getBtnApproveMulti() {
		return btnApproveMulti;
	}

	public void setBtnApproveMulti(WebElement btnApproveMulti) {
		this.btnApproveMulti = btnApproveMulti;
	}

	public WebElement getTblTSToValidate() {
		return tblTSToValidate;
	}

	public void setTblTSToValidate(WebElement tblTSToValidate) {
		this.tblTSToValidate = tblTSToValidate;
	}

	public WebElement getMnTSToValidate() {
		return mnTSToValidate;
	}

	public void setMnTSToValidate(WebElement mnTSToValidate) {
		this.mnTSToValidate = mnTSToValidate;
	}

	public WebElement getBtnApprove() {
		return btnApprove;
	}

	public void setBtnApprove(WebElement btnApprove) {
		this.btnApprove = btnApprove;
	}

	public WebElement getBtnRefuse() {
		return btnRefuse;
	}

	public void setBtnRefuse(WebElement btnRefuse) {
		this.btnRefuse = btnRefuse;
	}
	
}
