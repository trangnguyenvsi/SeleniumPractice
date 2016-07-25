package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ProjectListPage {
 
	
@FindBy (xpath= ".//*[contains(text(),'VSII / TSC')]")
private WebElement lbDepartement;

@FindBy (xpath= ".//*[contains(text(),'TSC_General _Non project works')]")
private WebElement lbProject1;

@FindBy (xpath= ".//*[contains(text(),'VIB-IP3')]")
private WebElement lbProject3;

@FindBy (xpath= ".//*[contains(text(),'Vpbank testing')]")
private WebElement lbProject4;

@FindBy (xpath= ".//*[contains(text(),'Laplink 07')]")
private WebElement lbProject2;

@FindBy (xpath= ".//*[contains(text(),'LIENLT')]")
private WebElement  lbProjectMan1;

@FindBy (xpath= ".//*[contains(text(),'Ho√?ng Kim Dung')]")
private WebElement lbProjectMan2;

@FindBy (xpath= ".//*[contains(text(),'Laplink 07')]")
private WebElement lbLaplink;

public WebElement getLbDepartement() {
	return lbDepartement;
}

public void setLbDepartement(WebElement lbDepartement) {
	this.lbDepartement = lbDepartement;
}

public WebElement getLbProject1() {
	return lbProject1;
}

public void setLbProject1(WebElement lbProject1) {
	this.lbProject1 = lbProject1;
}

public WebElement getLbProject2() {
	return lbProject2;
}

public void setLbProject2(WebElement lbProject2) {
	this.lbProject2 = lbProject2;
}

public WebElement getLbProjectMan1() {
	return lbProjectMan1;
}

public void setLbProjectMan1(WebElement lbProjectMan1) {
	this.lbProjectMan1 = lbProjectMan1;
}

public WebElement getLbProjectMan2() {
	return lbProjectMan2;
}

public void setLbProjectMan2(WebElement lbProjectMan2) {
	this.lbProjectMan2 = lbProjectMan2;
}

public WebElement getLbLaplink() {
	return lbLaplink;
}

public void setLbLaplink(WebElement lbLaplink) {
	this.lbLaplink = lbLaplink;
}

public WebElement getLbProject3() {
	return lbProject3;
}

public void setLbProject3(WebElement lbProject3) {
	this.lbProject3 = lbProject3;
}

public WebElement getLbProject4() {
	return lbProject4;
}

public void setLbProject4(WebElement lbProject4) {
	this.lbProject4 = lbProject4;
}


}
