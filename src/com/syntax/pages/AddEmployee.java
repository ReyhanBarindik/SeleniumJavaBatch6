package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddEmployee {

	@FindBy(xpath = "//b[contains(text(),'PIM')]")
	public WebElement pim;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;

	@FindBy(id = "firstName")
	public WebElement empFirstName;

	@FindBy(id = "lastName")
	public WebElement empLastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "btnSave")
	public WebElement saveEmp;

	public AddEmployee() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
