package com.syntax.practice;

public class DemoOfSingleton {

	public static void main(String[] args) {

		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		// everytime you just create obj (one instance)

	}

}

class Abc { // We do not have Singleton keyword but it is concept

	// First step

	static Abc obj = new Abc();

	// Second step do not allow to user create a default contructor
	private Abc() { // private constructor it means I cannot call Abc

	}

	// Third step
	public static Abc getInstance() {
		return obj;
	}

}