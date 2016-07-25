package com.vsii.tsc.pages.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.vsii.tsc.pages.ISMSPage;
import com.vsii.tsc.pages.ISMS_ProjectPage;
import com.vsii.tsc.utility.TestBase;

public class ISMS_ProjectMethod
{    
    
    WebDriver driver;    
    public ISMS_ProjectPage ObjecProject = new ISMS_ProjectPage();
     ISMS_LoginPageMethod objLogin;

    public ISMS_ProjectMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, ObjecProject);  
        objLogin = new ISMS_LoginPageMethod(TestBase.driver);
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
public void filterbyPriority(){
    ObjecProject.filterbyPriority.click();
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
Assert.assertEquals(ObjecProject.type.getText(), "Type");
Assert.assertEquals(ObjecProject.descriptionTab.getText(), "Description");
Assert.assertEquals(ObjecProject.worklogTab.getText(), "Worklogs");
Assert.assertEquals(ObjecProject.extraInfoTab.getText(), "Extra Info");
Assert.assertEquals(ObjecProject.relationTab.getText(), "Relations");
Assert.assertEquals(ObjecProject.relatedTaskTab.getText(), "Related Tasks");}

public void VerifyissueofProject(){
    ObjecProject.taomoiCol.isDisplayed();
    ObjecProject.xulyCol.isDisplayed();
    ObjecProject.kiemtraCol.isDisplayed();
    ObjecProject.dongCol.isDisplayed();
    ObjecProject.huyboCol.isDisplayed();  
}
public void clickEditIssue(){
TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.oe_button.oe_form_button_edit")));
myDynamicElement.click();

}
public void selectLevel(String level){
	new Select(ObjecProject.type_level).selectByVisibleText(level);  	
}
public String getActulLevel(){
TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
return ObjecProject.expectedLevel.getText();
}
public void inputAssginee(String Assignee){
    Actions action = new Actions(driver);
    action.moveToElement(ObjecProject.assignto_txb).doubleClick().build().perform();
    action.moveToElement(ObjecProject.assignto_txb).doubleClick().build().perform();
    ObjecProject.assignto_txb.clear();
	ObjecProject.assignto_txb.sendKeys(Assignee);
	ObjecProject.assignto_txb.sendKeys(Keys.ARROW_DOWN);
	ObjecProject.assignto_txb.sendKeys(Keys.ENTER);
}
public void verifyselectassigncorrect(String Assignee2){
	Assert.assertEquals(ObjecProject.expectAssignee.getText(),Assignee2);
}
public void clickSaveIssueBtn(){
	ObjecProject.saveIssuebtn.click();
}
public void editLevel(String user, String pass, String Level){
    objLogin.login(user,pass);   
    GotoProjectPage();
    clickIssueProjbtn2();
    clickIssueTitle1();
    clickEditIssue();
    selectLevel(Level);
    clickSaveIssueBtn();
}
public void clickDoneBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.DoneBtn.click();
}
public void clickCancelIssueBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.cancelIssueBtn.click();
}
public void clickMoreBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.moreBtn.click();
}
public void selectDelete(){
	ObjecProject.deleteIsueBtn.click();
}
public void clickOKonDeleteIssueAlert(){
    Alert alert = driver.switchTo().alert();
    alert.accept();
}
public void verifyDeleteSuccess(){
    Assert.assertEquals(ObjecProject.Issuetitle2.getText(), "Issues");
}

public void inputSearchissueCondition(String user, String pass, String searchCodi){
    objLogin.login(user,pass);   
    GotoProjectPage();
    clickIssueProjbtn2(); 
    ObjecProject.searchIssue_Txb.sendKeys(searchCodi);
    ObjecProject.searchIssue_Txb.sendKeys(Keys.ENTER);
}
public void verifyFilterbyPriorityCorrectly(){
    Assert.assertEquals(ObjecProject.normalPriority.getText(),"Normal");
    Assert.assertEquals(ObjecProject.highPriority.getText(),"High");
    Assert.assertEquals(ObjecProject.lowPriority.getText(),"Low");
}
public void filterbyMyIssue(){
    ObjecProject.myIssue.click();}

public void filterbyStage(){
    ObjecProject.filter_Stage.click();}

public void verifySearchTrue(String searchCondition){
    Assert.assertTrue(ObjecProject.searchTitleResult.getText().contains(searchCondition));
}
public void clickLogaNote_Btn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
    ObjecProject.logAnote.click();
}
public void InputNoteArea(String Note){
    ObjecProject.logAnoteTextArea.sendKeys(Note);
}
public void clickSaveNote_btn(){
    ObjecProject.logNote_Btn.click();
}
public void logAnoteSucc(String Note){
    titletoclick();
    ObjecProject.logAnoteBtn2.click();
    ObjecProject.logArea.sendKeys(Note);
    ObjecProject.LogBtn.click();
}
public void VerifyTrueResultafterClickDoneOrCancel(){
    Assert.assertEquals(ObjecProject.Issuetitle2.getText(), "Issues");
}
public void VerifyMakeNoteSucc(String expNote){ 
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    Assert.assertEquals(ObjecProject.expect_noteTile.getText(), expNote);
}
public void VerifyStage(){
    ObjecProject.Filter_taomoiCol.isDisplayed();
    ObjecProject.Filter_xulyCol.isDisplayed();
    ObjecProject.Filter_kiemtraCol.isDisplayed();
    ObjecProject.Filter_dongCol.isDisplayed();
    ObjecProject.Filter_newCol.isDisplayed();
}
public void clickCreateEditTask_icon(){ 
    ObjecProject.CreateEditTask_icon.click();    
}
public void selectCreateEditTasklable(){ 
    ObjecProject.CreateEditTasklable.click();    
}
public void VerifyCreateTaskDissplayCorrect(){
    ObjecProject.Task_Title.click();
    ObjecProject.Task_Sumary.isDisplayed();
    ObjecProject.Task_ProjectDrop.isDisplayed();
   
    ObjecProject.Task_AssigntoDrop.isDisplayed();

    ObjecProject.Task_TypeDrop.isDisplayed();

  ObjecProject.Task_IsbillDrop.isDisplayed();

  ObjecProject.Task_ProjPhaseDrop.isDisplayed();
    ObjecProject.Task_InitiTxb.isDisplayed();
    ObjecProject.Task_deadLineTxb.isDisplayed();
    ObjecProject.Task_Tags.isDisplayed();
    ObjecProject.Task_Progress.isDisplayed();
    ObjecProject.Task_DescripTab.isDisplayed();
    ObjecProject.Task_DeligationTab.isDisplayed();
    ObjecProject.Task_ExtraInfoTab.isDisplayed();
    ObjecProject.Task_RelatedTab.isDisplayed();

}
public void ClickrelationTab(){ 
    ObjecProject.relationTab.click();    
}
public void clickAddBtn(){ 
    ObjecProject.addBtn.click();    
}
public void checkAIssue(){ 
    ObjecProject.selectIssue_chb.click();    
}
public void clickSelectBtn(){ 
    ObjecProject.SelectBtn.click();    
}
public String getFeatureDescripTitle(){ 
    
     return ObjecProject.featureDescripTitle.getText();   
    
}
public String getExpfeatureDescripTitle(){ 
   
    return ObjecProject.ExpfeatureDescripTitle.getText();    
}
public void inputTasksummary(String Sum){ 
    ObjecProject.Task_Sumary.sendKeys(Sum);
}

public void inputassign(String Sum){ 
    ObjecProject.taskassignto_txb.click();
    ObjecProject.taskassignto_txb.clear();
    ObjecProject.taskassignto_txb.sendKeys(Sum);
}
public void createTask(String user, String pass, String taskTitle, String assgnee){ 
    objLogin.login(user,pass);     
    GotoProjectPage();
    clickIssueProjbtn();
    clickIssueTitle1();
    clickEditIssue();
  clickCreateEditTask_icon();
  selectCreateEditTasklable();
  inputTasksummary(taskTitle);
  inputassign(assgnee);
}
public void clickVSIIProject(){ 
    ObjecProject.VSIIProject.click();
}
public void selectkhacphucphongngua(){ 
    ObjecProject.khacphucphongngua.click();
}
public void clickkhacphucphongnguataskBtn(){ 
    ObjecProject.khacphucphongnguataskBtn.click();
}
public void clickCreate(){ 
    ObjecProject.Create.click();
}
public void VerifyCreateTaskkppnDissplayCorrect(){
    ObjecProject.mota.isDisplayed();
    ObjecProject.phantich.isDisplayed();
   
    ObjecProject.giaiphap.isDisplayed();

    ObjecProject.pheduyet.isDisplayed();

  ObjecProject.thuchiengiaiphap.isDisplayed();

  ObjecProject.kiemtra1.isDisplayed();
    ObjecProject.kiemtra2.isDisplayed();
    ObjecProject.dong.isDisplayed();
    ObjecProject.huybo.isDisplayed();
    ObjecProject.kppnTaskSum.isDisplayed();
    ObjecProject.kppnassignTo.isDisplayed();
   
    ObjecProject.kppnisBillChk.isDisplayed();

    ObjecProject.kppnTaskType.isDisplayed();

  ObjecProject.kppnisBillChk.isDisplayed();

  ObjecProject.kppnprojphase.isDisplayed();
    ObjecProject.kppnInti.isDisplayed();
    ObjecProject.kppndeadline.isDisplayed();
    ObjecProject.kppnTags.isDisplayed();
    ObjecProject.kppnprogress.isDisplayed();
    ObjecProject.kppnDEscripTab.isDisplayed();
    ObjecProject.kppnDeligationTab.isDisplayed();
    ObjecProject.kppnExtrTab.isDisplayed();
    ObjecProject.kppnRelatedTab.isDisplayed();
}
public void iputTakSumm(String Summ){ 
    ObjecProject.kppnTaskSum.sendKeys(Summ);
}
public void iputAssign(String assign){ 
    ObjecProject.kppnassignTo.click();
    ObjecProject.kppnassignTo.clear();
    ObjecProject.kppnassignTo.sendKeys(assign);
    ObjecProject.kppnassignTo.sendKeys(Keys.ARROW_DOWN);
    ObjecProject.kppnassignTo.sendKeys(Keys.ENTER);
    
}

public void inpuInti(String Inti){
    ObjecProject.kppnInti.clear();
    
    ObjecProject.kppnInti.sendKeys(Inti);
}
public void inpudescripttionArea(String DEs){ 
    ObjecProject.descripttionArea.sendKeys(DEs);
}
public void clickSave() throws InterruptedException{ 
   
    ObjecProject.saveee.click();
    Thread.sleep(3000);
}
public void clicktitle(){ 
    ObjecProject.title.click();
}
public void createAnewTask(String user, String pass,String Summ,String assign, String Inti, String DEs ) throws InterruptedException{ 
    objLogin.login(user,pass);
   GotoProjectPage();
   clickVSIIProject();
    selectkhacphucphongngua();
    clicktitle();
    clickkhacphucphongnguataskBtn();
   clickCreate();
    iputTakSumm(Summ);
    iputAssign(assign);
    inpuInti(Inti);
    inpudescripttionArea(DEs);         
    clickSave();
}
public void clickKppnTaskTitle(){ 
    ObjecProject.kppnTasktitle.click();
}
public void clickkppnEditBtn(){ 
    titletoclick();
    ObjecProject.kppnEditBtn.click();
}
public void clickkppnRelatedTab(){ 
    ObjecProject.kppnRelatedTab.click();
}
public void clickkppnAddRelatedBtn() throws InterruptedException{ 
    //Thread.sleep(3000);
    ObjecProject.kppnAddRelatedBtn.click();
}
public void clickgiaiphap(){ 
    ObjecProject.giaiphap.click();
}
public void clickphantich(){ 
    ObjecProject.phantich.click();
}
public void clickpheduyet(){ 
    ObjecProject.pheduyet.click();
}
public void titletoclick(){ 
    ObjecProject.titletoclick.click();
}
public void clickTaskLinkTex(){ 
    ObjecProject.TaskLinkTex.click();
}
public void inputGiaiPhaptoDescription(String Descrip){ 
    ObjecProject.descripttionArea.clear();
    ObjecProject.descripttionArea.sendKeys(Descrip);  
     
}
public void inputDescription(String Descrip){ 
    ObjecProject.descripttionArea.clear();
     ObjecProject.descripttionArea.sendKeys(Descrip);     
}
public void goToKhacPhucPhongNguaTasks(){ 
    GotoProjectPage();
    clickVSIIProject();
    selectkhacphucphongngua();   
    clicktitle();
  clickkhacphucphongnguataskBtn(); 
  clickKppnTaskTitle();
  clicktitle();
}
public void editTaskToPhanTichSucc(String Descrip, String Descripex, String StageExp) throws InterruptedException{ 
    clickphantich();
   inputDescription(Descrip);
    clickSave();
    Assert.assertEquals(ObjecProject.epctdescripttion.getText(), Descripex);
    clickTaskLinkTex();
    Assert.assertEquals(ObjecProject.StageCol.getText(), StageExp);    
}
public void editTaskToGiaiPhapSucc(String Descrip, String Descripex, String StageExp) throws InterruptedException{ 
    clickgiaiphap();
   inputGiaiPhaptoDescription(Descrip);
    clickSave();
    Assert.assertEquals(ObjecProject.epctdescripttion.getText(), Descripex);
    clickTaskLinkTex();
    Assert.assertEquals(ObjecProject.StageCol.getText(), StageExp);     
}
public void editTaskToPheDuyetSucc(String note, String Descripex, String StageExp) throws InterruptedException{ 
    clickpheduyet();
    logAnoteSucc(note);
    Assert.assertEquals(ObjecProject.actLog.getText(), Descripex);
    clickTaskLinkTex();
    Assert.assertEquals(ObjecProject.StageCol.getText(), StageExp);     
}
public void editTaskToThucHienGiaiPhapSucc(String note, String Descripex, String StageExp) throws InterruptedException{ 
    clickthuchiengiaiphap();
    logAnoteSucc(note);
    Assert.assertEquals(ObjecProject.actLog.getText(), Descripex);
    clickTaskLinkTex();
    Assert.assertEquals(ObjecProject.StageCol.getText(), StageExp);     
}
public void clickthuchiengiaiphap(){ 
    ObjecProject.thuchiengiaiphap.click();
}
public void clickkiemtra1(){ 
    ObjecProject.kiemtra1.click();
}
public void clickaddAnItem(){ 
    ObjecProject.addAnItem.click();
   ObjecProject. content.click();
    ObjecProject. content.sendKeys(Keys.TAB);
   // ObjecProject. timeSpent.clear();
    ObjecProject. timeSpent.sendKeys("12");
    ObjecProject. timeSpent.sendKeys(Keys.TAB);
}
public void editTaskToKiemtra1Succ(String user, String pass, String Description, String StageExp) throws InterruptedException{ 
    objLogin.login(user,pass);   
    GotoProjectPage();
    clickVSIIProject();
    selectkhacphucphongngua();
    clicktitle();
    clickkhacphucphongnguataskBtn(); 
    clickKppnTaskTitle();
    clickkiemtra1();
    clickkppnEditBtn();
    inputDescription(Description);
    clickSave();  
}
public String getActDes() throws InterruptedException{ 
    return ObjecProject.epctdescripttion.getText() ;   
}
public String getActStage() throws InterruptedException{ 
    return ObjecProject.StageCol.getText() ;        
}
}
