package com.syntax.practice;

public class SingletonNDemo {

	// In OOP, Singleton class is a special class that can have only and only one
	// object.
	// Only single instance of the class at a time.
	// We can create only single instantiate.
	// If we try to create another object it will always point to the same object.
	// Singleton is a pattern so singleton is not like any keyword or any special
	// package or jar file.
	// It is kind of approach and there are different approaches.

	// How to design singleton class :
	// 1. make constructor as private
	// 2. write a public static method that has return type of object of this
	// singleton class. (Lazy initialization)

	// What is the diffreneces between Normal class and Singleton Class ?
	/*
	 * In terms of instantiation is that for Normal class we use constructor to
	 * create object whereas for singleton class we use getInstance method to create
	 * object of the Instantiation
	 * 
	 */

	private static SingletonNDemo singleton_instance = null;

	public String str;

	private SingletonNDemo() {
		str = "Hey, I am using singleton class pattern";
	}

	public static SingletonNDemo getInstance() {
		if (singleton_instance == null)
			singleton_instance = new SingletonNDemo();
		return singleton_instance;
	}

	public static void main(String[] args) {

		SingletonNDemo x = SingletonNDemo.getInstance();
		SingletonNDemo y = SingletonNDemo.getInstance();
		SingletonNDemo z = SingletonNDemo.getInstance();

		x.str = (x.str).toUpperCase();

		// Same output because All these three references are pointing to the same
		// object
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println(z.str);
		System.out.println(x.str);
		System.out.println(y.str);

	}

}
