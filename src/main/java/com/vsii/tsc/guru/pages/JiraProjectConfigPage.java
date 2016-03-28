package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraProjectConfigPage {

	//Identify Users and Roles option
	@FindBy(xpath=".//*[@id='view_project_roles']")
	private WebElement usersAndRoles;
	
	// Identify add new user option 
	@FindBy(xpath=".//*[@id='roles-add-users-button']")
	private WebElement addNewUserOption;
	
	//Identify user picker area
	@FindBy(xpath=".//*[@id='roles-usergroup-picker-textarea']")
	private WebElement userPicker;
	
	//Identify Role picker OFF TYPE SELECT
	@FindBy(xpath=".//*[@id='roles-role-picker']")
	private WebElement rolePicker;
	
	// Identify add user button
	@FindBy(xpath=".//*[@id='project-config-header']/div/div[3]")
	private WebElement addUserBtn;

	public WebElement getUsersAndRoles() {
		return usersAndRoles;
	}

	public void setUsersAndRoles(WebElement usersAndRoles) {
		this.usersAndRoles = usersAndRoles;
	}

	public WebElement getAddNewUserOption() {
		return addNewUserOption;
	}

	public void setAddNewUser(WebElement addNewUser) {
		this.addNewUserOption = addNewUser;
	}

	public WebElement getUserPicker() {
		return userPicker;
	}

	public void setUserPicker(WebElement userPicker) {
		this.userPicker = userPicker;
	}

	public WebElement getRolePicker() {
		return rolePicker;
	}

	public void setRolePicker(WebElement rolePicker) {
		this.rolePicker = rolePicker;
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public void setAddUserBtn(WebElement addUserBtn) {
		this.addUserBtn = addUserBtn;
	}
	
}
