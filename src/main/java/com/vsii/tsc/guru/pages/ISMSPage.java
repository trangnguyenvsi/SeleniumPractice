package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ISMSPage
{ 
    @FindBy(xpath = "//*[contains(text(),'ISMS Helpdesk')]")
    public WebElement ISMSHelpdesk_btn;
    
    @FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td/span/span")
    public WebElement namename;
    @FindBy(xpath = "//*[contains(text(),'Log out')]")
    public WebElement logout_btn;
    
    @FindBy(xpath = "//*[contains(text(),'ISMS Request')]")
    public WebElement ISMSRequest;
   
    @FindBy(xpath = " html/body/div[2]/div[1]/a")
    public WebElement xBtn;
 
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[4]/ul/li[1]/a/span")
    public WebElement ISMSIssue; 


    @FindBy(xpath = "//*[contains(text(),'Compose ISMS Request')]")
    public WebElement ComposeISMSRequest;
    
    @FindBy(xpath = "//*[contains(text(),'Issue Management')]")
    public WebElement IssueManagement;
    
    @FindBy(xpath = "//*[contains(text(),'Assets')]")
    public WebElement Assets;
    
    @FindBy(xpath = "//*[contains(text(),'Asset Categories')]")
    public WebElement AssetCategories;
    
    @FindBy(xpath=".//*[@id='oe-field-input-38']")
    public WebElement composeIssue_txb;
    
    @FindBy(xpath=".//*[@id='oe-field-input-39']")
    public WebElement composeCategory_txb;
    
    @FindBy(xpath=".//*[@id='oe-field-input-40']")
    public WebElement composeProblem_txb;
   
    @FindBy(xpath=".//*[@id='oe-field-input-41']")
    public WebElement similarIssue_txb;
    
    @FindBy(xpath="//div[2]/div[2]/div/div/div/div/div[4]/div/div/div[1]/textarea")
    public WebElement descripIssue_txb;
    
    @FindBy(xpath=".//*[@id='ui-id-4']")
    public WebElement composeTitle;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[1]/td[1]")
    public WebElement composeIssue_label;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[2]/td[1]")
    public WebElement composeCategory_lable;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[3]/td[1]")
    public WebElement composeProblem_lable;
    
    @FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div/div[4]/div/div/table/tbody/tr[4]/td[1]")
    public WebElement similarIssue_lable;
    
    @FindBy(xpath="//div[2]/div[11]/div/footer/button[1]")
    public WebElement composeSend_btn;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[2]/a")
    public WebElement actualCate;
    
        @FindBy(xpath="(html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr/td[2])[1]")
    public WebElement issueNamefirstcol;
     @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[1]")
        public WebElement IDcol; 
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[2]")
    public WebElement issuecol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]")
    public WebElement contacrcol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]")
    public WebElement projectCol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]")
    public WebElement priorityCol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]")
    public WebElement dateCol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]")
    public WebElement assignCol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[8]")
    public WebElement progressCol;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[9]")
     public WebElement StageCol;
   
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[1]/h2/span/span")
public WebElement assetTitle;
   @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
    public WebElement assetCreatBtn;
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[1]/input")
    public WebElement assetCatename;
    @FindBy(xpath="  html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/label[1]")
    public WebElement assetCatenamelabl;
  
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[2]/div/input")
    public WebElement assetparentCategory;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[3]/input")
    public WebElement assetSequence;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div/textarea")
    public WebElement assetDescrip;
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
    public WebElement assetSaveBtn;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[1]/span")
    public WebElement AssetexpectName;
    @FindBy(xpath="    html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[2]")
    public WebElement AssetpopularIssue;
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[4]/div/div/div/div/table/thead/tr/th[1]/div")
    public WebElement AssetpopularIssueName;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[4]/div/div/div/div/table/thead/tr/th[2]/div")
    public WebElement AssetpopularIssuePriority;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[4]/div/div/div/div/table/thead/tr/th[3]/div")
    public WebElement AssetpopularIssueType;
    @FindBy(xpath="html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[2]/div/input")
    public WebElement AssetcompanyCate;
    
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[2]/a")
    public WebElement Assetexpectparent;
    
    @FindBy(xpath="    html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/span[3]/span")
    public WebElement expectSeq;
    @FindBy(xpath=" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div/span")
    public WebElement expectDes;
    @FindBy(xpath="  //td[contains(text(),'Test')]")
    public WebElement existCate;
    @FindBy(xpath="   //td[contains(text(),'test123')]")
    public WebElement existCateName;
    @FindBy(xpath="//tr[td[text()='test123']]/th")
    public WebElement radioBtn1;
    @FindBy(xpath="//tr[td[text()='Test']]/th")
    public WebElement radioBtn;
    @FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div[1]/div/div[2]/ul/li/a[contains(text(),'Delete')]")
    public WebElement deleteBtn;
    @FindBy(xpath="    html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div[1]/div/div[2]/button")
    public WebElement moreBtn;
    
    @FindBy(css=".ui-state-error.ui-notify-message.ui-notify-message-style:last-child>h1")
    public WebElement errmsgTit;
    @FindBy(css=".ui-state-error.ui-notify-message.ui-notify-message-style:last-child>ul>li:nth-child(1)")
    public WebElement errmsCont1;
    @FindBy(css=".ui-state-error.ui-notify-message.ui-notify-message-style:last-child>ul>li:nth-child(2)")
    public WebElement errmsCont2;
}
