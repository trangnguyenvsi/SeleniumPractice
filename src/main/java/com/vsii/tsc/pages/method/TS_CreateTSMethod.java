package com.vsii.tsc.pages.method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.TS_CreateTSPage;

public class TS_CreateTSMethod {

	WebDriver driver;
	TS_CreateTSPage objCreateTS = new TS_CreateTSPage();

	public TS_CreateTSMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objCreateTS);
	}

	public void clickBtnCreate() throws InterruptedException {
		Thread.sleep(2000);
		objCreateTS.getBtnCreate().click();
		
	}
	
	public void getDtFrom(String dtFrom) throws InterruptedException {
		Thread.sleep(2000);
		objCreateTS.getDtFrom().clear();
		objCreateTS.getDtFrom().sendKeys(dtFrom.toString());
	}

	public void getDtTo(String dtTo) throws InterruptedException {
		Thread.sleep(2000);
		objCreateTS.getDtTo().clear();
		objCreateTS.getDtTo().sendKeys(dtTo.toString());;
	}
	
	public void inputDate(String dtFrom, String dtTo) throws InterruptedException {
		Thread.sleep(2000);
		this.getDtFrom(dtFrom);
		this.getDtTo(dtTo);
		objCreateTS.getDtTo().sendKeys(Keys.TAB);
	}

	// public void selectDatefromMultiDate(String date) {
	// By calendarXpath = By
	// .xpath("//td[not(contains(@class,'oe_input_icon
	// oe_datepicker_trigger'))]/a[text()='" + date + "']");
	// driver.findElement(calendarXpath).click();
	//
	// // get list of times
	// List<WebElement> allTime = driver.findElements(
	// By.xpath("//div[@data-role='popup'][contains(@style,'display:
	// block')]//ul//li[@role='option']"));
	//
	// // select correct time
	// for (WebElement webElement : allTime) {
	// if (webElement.getText().equalsIgnoreCase(date)) {
	// webElement.click();
	// }
	// }
	// }

	public void clickBtnAddLine() {
		objCreateTS.getBtnAddLine().click();
	}

	public void clickCbbProject() {
		objCreateTS.getCbbProject().click();
	}

	public void selectEleProject(String project) throws InterruptedException {
//		Thread.sleep(1000);
//		objCreateTS.getEleProject().clear();
		objCreateTS.getEleProject().sendKeys(project);
		Thread.sleep(1000);
		objCreateTS.getEleProject().sendKeys(Keys.TAB);
	}

	public void clickAdd() {
		objCreateTS.getBtnAdd().click();
	}

	public void inputTime(String time) {
		objCreateTS.getTxtInputTime().sendKeys(time);
	}
	
	public void clickSave() {
		objCreateTS.getBtnSave().click();
	}
	public String getLblStatus() {
		return objCreateTS.getLblStatus().getText();
	}
	
	public String getLblMessage() {
		return objCreateTS.getLblMessage().getText();
	}
}