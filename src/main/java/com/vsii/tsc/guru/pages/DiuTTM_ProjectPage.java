package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiuTTM_ProjectPage
{   @FindBy(xpath = "//*[contains(text(),'Project')]")
    public WebElement Project_btn;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[2]/ul[1]/li[4]/a/span")
    public WebElement issue_btn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[1]/tr/th/span[1]")
    public WebElement projectGroup;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[3]")
    public WebElement advSearchBtn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]/tr[6]/td[3]")
    public WebElement ISOproject;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/button[5]/span")
    public WebElement issueISO;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div[3]/div/div[2]")
    public WebElement taomoiCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div[3]/div/div[2]")
    public WebElement xulyCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div[3]/div/div[2]")
    public WebElement kiemtraCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div[3]/div/div[2]")
    public WebElement dongCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div[3]/div/div[2]")
    public WebElement huyboCol;      
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[2]/ul/li[3]")
    public WebElement filterbyProject;
    @FindBy(xpath = "//table/tbody/tr[2]/td[3]/ul/li[2]")
    public WebElement listviewBtn;
 
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[1]/li[6]/a/span")
    public WebElement adIssueBtn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div[2]/div[1]/div/div[2]/div[1]/b")
    public WebElement Issuetitle1;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[1]/h2/span/span[2]")
    public WebElement Issuetitle2;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/label")
    public WebElement asignto;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/label")
    public WebElement contact;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/label")
    public WebElement email;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[4]/td[1]/label")
    public WebElement project;
    @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/label")
    public WebElement ID;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[3]/td[1]/label")
    public WebElement priority;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/label")
    public WebElement level;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[5]/td[1]/label")
    public WebElement type;
    @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[6]/td[1]/label")
    public WebElement task;
  
 
    }
