package com.vsii.tsc.guru.pages.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vsii.tsc.guru.pages.DiuTTM_ISMSPage;
import com.vsii.tsc.guru.pages.DiuTTM_ProjectPage;

public class DiuTTM_ProjectMethod
{    
    
    WebDriver driver;    
    public DiuTTM_ProjectPage ObjecProject = new DiuTTM_ProjectPage();

    public DiuTTM_ProjectMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, ObjecProject);      
    }  
    
public void GotoProjectPage(){
    ObjecProject.Project_btn.click();
}
public void clickIssueProjbtn(){
    ObjecProject.issue_btn.click();
}
public void clickAdvSearchBtn(){
    ObjecProject.advSearchBtn.click();
}
public void filterbyProject(){
    ObjecProject.filterbyProject.click();
}
public void clickListView(){
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    ObjecProject.listviewBtn.click();
}
public void ExpandProj(){
    ObjecProject.projectGroup.click();
}
public void ISOProjectPage(){
    ObjecProject.ISOproject.click();
}
public void Clickissuebtn(){
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    ObjecProject.issueISO.click();
}
public void clickIssueProjbtn2(){
    ObjecProject.adIssueBtn.click();
}
public void clickIssueTitle1(){
    ObjecProject.Issuetitle1.click();
}
 
public void verifyIssuedisplayCorrectly(){
    Assert.assertEquals(ObjecProject.ID.getText(), "ID");
    Assert.assertEquals(ObjecProject.asignto.getText(), "Assigned to");
Assert.assertEquals(ObjecProject.contact.getText(), "Contact");
Assert.assertEquals(ObjecProject.email.getText(), "Email");
Assert.assertEquals(ObjecProject.project.getText(), "Project");
Assert.assertEquals(ObjecProject.priority.getText(), "Priority");
Assert.assertEquals(ObjecProject.level.getText(), "Level");
Assert.assertEquals(ObjecProject.type.getText(), "Type");}

public void VerifyissueofProject(){
    ObjecProject.taomoiCol.isDisplayed();
    ObjecProject.xulyCol.isDisplayed();
    ObjecProject.kiemtraCol.isDisplayed();
    ObjecProject.dongCol.isDisplayed();
    ObjecProject.huyboCol.isDisplayed();  
}
}

