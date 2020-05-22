package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;

public class HrmsLogoDisplay extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		
		LoginPage login = new LoginPage();
		
		
		isDisplay(login.displayLogo);

		
		
		
	}

}
