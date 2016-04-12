package com.vsii.tsc.guru.pages.method;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.TS_DepartmentTSPage;
import com.vsii.tsc.utility.CommonOperations;

public class TS_DepartmentTSMethod {
	Properties p;
	WebDriver driver;
	TS_DepartmentTSPage objDptTS = new TS_DepartmentTSPage();

	public TS_DepartmentTSMethod(WebDriver driver) throws IOException {
		p = CommonOperations.readConfig();
		this.driver = driver;
		PageFactory.initElements(driver, objDptTS);
	}

	public String getTtlEmp() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlEmployee().getText();
	}

	public String getTtlDateFrom() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlDateFrom().getText();
	}

	public String getTtlDateTo() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlDateTo().getText();
	}

	public String getTtlDept() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlDept().getText();
	}

	public String getTtlTotalTS() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlTotalTS().getText();
	}

	public String getTtlStatus() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getTtlStatus().getText();
	}

	public String getLstMonth() throws InterruptedException {
		Thread.sleep(2000);
		return objDptTS.getLstMonth().getText();
	}

	public boolean compareTitle(String employee, String dateFrom, String dateTo, String department,
			String totalTimesheet, String status) throws InterruptedException {
		boolean isMatch = false;

		String ttlEmp = getTtlEmp();
		String ttlDateFrom = getTtlDateFrom();
		String ttlDateTo = getTtlDateTo();
		String ttlDepartment = getTtlDept();
		String ttlTotalTS = getTtlTotalTS();
		String ttlStatus = getTtlStatus();

		if (ttlEmp.equals(employee) && ttlDateFrom.equals(dateFrom)
				&& ttlDateTo.equals(dateTo) && ttlDepartment.equals(department)
				&& ttlTotalTS.equals(totalTimesheet)
				&& ttlStatus.equals(status)) {
			isMatch = true;
		} else {
			isMatch = false;
		}

		return isMatch;
	}

	public void clickDepartmentTS() throws InterruptedException {
		objDptTS.getMnDptTS().click();
		Thread.sleep(4000);
	}

	public void clickMonthTS() throws InterruptedException {
		List<WebElement> rows = objDptTS.getDeptTSTable().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("th"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				columns.get(cnum).click();
			}
		}
		Thread.sleep(20000);
	}

	public boolean getTSStatus() throws InterruptedException {
		boolean isColor = false;
		List<WebElement> rows = objDptTS.getDeptTSTable().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 6; cnum < columns.size(); cnum++) {
				String statusColor = columns.get(6).getCssValue("color");
				Color color = Color.fromString(statusColor.toString());
				String colorHex = color.asHex();
				String status = columns.get(6).getText();

				switch (status) {
				case "Approved":
					colorHex = "#0000ff";
					isColor = true;
					break;
				case "Open":
					colorHex = "#808080";
					isColor = true;
					break;
				case "Waiting Approval":
					colorHex = "#000000";
					isColor = true;
					break;
				default:
					isColor = false;
					break;
				}
			}
		}
		Thread.sleep(20000);
		return isColor;
	}

	public boolean getTSMonth() throws ParseException {
		boolean isMatch = false;
		List<String> expectedList = null;
		List<String> actualList = null;
		DateFormat dateFormat = new SimpleDateFormat("MMMMMMMMM" + " " + "yyyy");

		String beginMonth = "July" + " " + "2014";
		String endMonth = dateFormat.format(Calendar.getInstance().getTime());

		Calendar beginCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();

		beginCalendar.setTime(dateFormat.parse(beginMonth));
		endCalendar.setTime(dateFormat.parse(endMonth));
		endCalendar.add(Calendar.MONTH, 1);

		while (beginCalendar.before(endCalendar)) {
			String month = dateFormat.format(beginCalendar.getTime());
			beginCalendar.add(Calendar.MONTH, 1);
			expectedList = Arrays.asList(month);
		}

		// Get Month in Timesheet
		List<WebElement> rows = objDptTS.getDeptTSTable().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("th"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				String strTrimBracket = columns.get(cnum).getText().replaceAll("\\(.*?\\)", "");
				String strTrimSpace = strTrimBracket.substring(0, strTrimBracket.length() - 1);
				actualList = Arrays.asList(strTrimSpace);
			}
		}
		// Compare two lists
		if (actualList.equals(expectedList)) {
			isMatch = true;
		} else {
			isMatch = false;
		}
		return isMatch;
	}

	// click vao list thang 3
	public void clickLstMonth() throws InterruptedException {
		// objDptTS.getLstMonth().click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(getLstMonth())).click();
	}

	// Duyet tim theo dong, cot co du ten user = namUser va Date from = timeDel,
	// sau do click chon dong do
	public void selectUser(String nameUser, String timeDel) {
		List<WebElement> rows = objDptTS.getTblUser().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				if (columns.get(cnum).getText().equals(nameUser)) {
					if (columns.get(cnum).getText().equals(timeDel)) {
						columns.get(1)
								.findElement(By
										.xpath("/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]/tr[1]/th/input"))
								.click();
					}
				}
			}
		}
	}

	// Duyet tim theo dong, cot co du ten user = namUser va Date from = timeDel,
	// sau do click chon nhieu dong thoa man dk
	public void selectMultiUser(String nameUser, String timeDel, String i) {
		List<WebElement> rows = objDptTS.getTblUser().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				if (columns.get(cnum).getText().equals(nameUser)) {
					if (columns.get(cnum).getText().equals(timeDel)) {
						columns.get(cnum).click();
					}
				}
			}
		}
	}

	// click button More
	public void clickBtnMore() throws InterruptedException {
		objDptTS.getBtnMore().click();
		// Thread.sleep(4000);
	}

	// click button Delete
	public void clickBtnDelete() throws InterruptedException {
		objDptTS.getBtnDelete().click();
		Thread.sleep(2000);
	}

	// check da xoa
	public boolean checkDel(String nameUser, String timeDel) throws InterruptedException {
		boolean isDel = true;
		List<WebElement> rows = objDptTS.getTblUser().findElements(By.tagName("tr"));
		for (int rnum = 1; rnum < rows.size(); rnum++) {
			List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
			for (int cnum = 0; cnum < columns.size(); cnum++) {
				if (columns.get(cnum).getText().equals(nameUser)) {
					if (columns.get(cnum).getText().equals(timeDel)) {
						isDel = false;
					} else {
						isDel = true;
					}
				}
			}
		}
		return isDel;
	}
}
