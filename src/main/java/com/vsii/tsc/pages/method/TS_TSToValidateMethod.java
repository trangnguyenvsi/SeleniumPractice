package com.vsii.tsc.pages.method;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vsii.tsc.pages.TS_TSToValidatePage;

public class TS_TSToValidateMethod {

	WebDriver driver;
	TS_TSToValidatePage objTSValid = new TS_TSToValidatePage();
	TS_CurrentTSMethod objCurTS;

	public TS_TSToValidateMethod(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, objTSValid);
	}

	public void clickTSToValidate() throws InterruptedException {
		objTSValid.getMnTSToValidate().click();
		Thread.sleep(4000);
	}

	public void clickBtnApprove() throws InterruptedException {
		objTSValid.getBtnApprove().click();
		Thread.sleep(4000);
	}

	public void clickBtnMore() throws InterruptedException {
		objTSValid.getBtnMore().click();
		Thread.sleep(4000);
	}

	public void clickBtnApproveMulti() throws InterruptedException {
		objTSValid.getBtnApproveMulti().click();
		Thread.sleep(4000);
	}

	public String getLblTotalRecord() throws InterruptedException {
		return objTSValid.getLblTotalRecord().getText();

	}

	public void clickBtnX() throws InterruptedException {
		objTSValid.getBtnX().click();
		Thread.sleep(5000);
	}

	public void setChkboxToDel(WebElement chkboxToDel) {
		objTSValid.setChkboxToDel(chkboxToDel);
	}

	public void clickChkboxToDel() throws InterruptedException {
		objTSValid.getChkboxToDel().click();
	}

	public boolean checkUserSubmit() {
		boolean isSubmit = false;
		List<WebElement> rows = objTSValid.getTblTSToValidate().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				if (columns.get(1).getText().equals(objCurTS.getLblNameUser())) {
					if (columns.get(2).getText().equals(objCurTS.getLblTimePeriod())) {
						isSubmit = true;
					} else {
						isSubmit = false;
					}
				}
			}
		}
		return isSubmit;
	}

	public void clickUserToApprove() {
		List<WebElement> rows = objTSValid.getTblTSToValidate().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			columns.get(0).click();
		}
	}

	public boolean checkApproved() {
		boolean isApproved = false;
		if (objTSValid.getBtnApprove().isDisplayed() == true) {
			isApproved = true;
		} else {
			isApproved = false;
		}
		return isApproved;
	}

	// i la so dong muon click de xoa, lay tu file data.xls
	public void clickMultiUserToApprove(String nameUser, String date, String i) {
		// List<WebElement> rows =
		// objTSValid.getTblTSToValidate().findElements(By.tagName("tr"));
		// for (int rnum = 1; rnum < rows.size(); rnum++) {
		// List<WebElement> columns =
		// rows.get(rnum).findElements(By.tagName("td"));
		// for (int j = 1; j <= Integer.parseInt(i); j++) {
		//
		// }
		// }
		for (int j = 1; j < Integer.parseInt(i); j++) {
			List<WebElement> checkBoxes = driver.findElements(By
					.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[td[contains(text(),"
							+ nameUser + ")] and td[contains(text()," + date
							+ ")] and td[contains(text(),'Waiting Approval')]]/th"));

			checkBoxes.get(j).click();
		}
	}

	public void selectUserNotWaitingApp(String i) {
		List<WebElement> rows = objTSValid.getTblTSToValidate().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				for (int j = 1; j <= Integer.parseInt(i); j++) {
					if (columns.get(6).getText().equals("Open") || columns.get(6).getText().equals("Approved")) {
						columns.get(j).click();
					}
				}
			}
		}
	}

}
