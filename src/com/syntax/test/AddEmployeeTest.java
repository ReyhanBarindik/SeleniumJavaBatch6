package com.syntax.test;

import com.syntax.pages.AddEmployee;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPage login = new LoginPage();

		sendText(login.username, ConfigsReader.getProperty("username"));

		sendText(login.password, ConfigsReader.getProperty("password"));

		waitAndClick(login.loginBtn);

		AddEmployee emp1 = new AddEmployee();
		
		waitAndClick(emp1.pim);
		
		waitAndClick(emp1.addEmp);
		
		sendText (emp1.empFirstName, ConfigsReader.getProperty("employeeFirstname"));
		
		sendText(emp1.empLastName, ConfigsReader.getProperty("employeeLastname"));
		
		//sendText(emp1.employeeId, ConfigsReader.getProperty("employeeID"));
		
		waitAndClick(emp1.saveEmp);
		
		
		
		
		
		
	}

}
