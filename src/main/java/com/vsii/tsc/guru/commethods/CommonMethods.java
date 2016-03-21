package com.vsii.tsc.guru.commethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.utility.TestBase;

public class CommonMethods {
  //Check login or not
	public static void checkLogin(){
		LoginPageMethod objLogin;
		objLogin = new LoginPageMethod(TestBase.driver);
		if(TestBase.driver.findElements(By.name("uid")).size()!=0){
			objLogin.loginToManagerPage("mngr30380", "vAtepYs");
		}
	}
	
	public static void waitUntil(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public static void waitUntilElementLocated(String elementLocated) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementLocated)));
	}
}
