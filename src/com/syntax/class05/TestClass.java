package com.syntax.class05;

import com.syntax.utils.BaseClass;

public class TestClass extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		String title=driver.getTitle();
		System.out.println(title);
		tearDown();
		
		
		

	}

}
