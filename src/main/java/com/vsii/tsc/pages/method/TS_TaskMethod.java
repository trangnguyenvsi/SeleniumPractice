package com.vsii.tsc.pages.method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.TS_TaskPage;

public class TS_TaskMethod {
	WebDriver driver;
	TS_TaskPage objTask = new TS_TaskPage();

	public TS_TaskMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objTask);
	}

	public void clickTask() {
		objTask.getMnTask().click();
	}

	public void createTask(String taskName) throws InterruptedException {
		// Thread.sleep(2000);
		objTask.getBtnCreate().click();
		objTask.getTxtTaskSum().sendKeys(taskName);
		objTask.getDrpdwnProject().click();
		Thread.sleep(2000);
		driver.findElements(By.xpath("//a[contains (@id, 'ui-id-')]")).get(10).click();
		objTask.getLnkAddItem().click();
		Thread.sleep(3000);
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("08:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/04/2016 22:54:39");
		objTask.getLnkAddItem().click();
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("08:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/05/2016 22:54:39");
		objTask.getLnkAddItem().click();
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("08:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/06/2016 22:54:39");
		objTask.getLnkAddItem().click();
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("08:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/07/2016 22:54:39");
		objTask.getLnkAddItem().click();
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("08:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/08/2016 22:54:39");
		objTask.getLnkAddItem().click();
		driver.findElements(By.xpath("//input[contains(@maxlength,'128')]")).get(1)
				.sendKeys("Write test script for OpenERP");
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).clear();
		driver.findElements(By.xpath("//input[contains(@type,'text')]")).get(9).sendKeys("04:00");
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).clear();
		driver.findElements(By.xpath("//input[contains(@name,'date')]")).get(1).sendKeys("04/09/2016 22:54:39");
		
		objTask.getBtnSave().click();
	}
}
