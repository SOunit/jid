package com.semanticsquare.basics;

public class BasicsDemo {
	// 1. Naming for class / methods / variables
	// a) 1st letter: letters, underscore, $
	// other letters: letters, underscore, $, numbers
	// b) no reserved keywords

	// 2. Java is case-sensitive
	public void foo() {
		System.out.println("Foo");
	}

	public BasicsDemo() {
		System.out.println("No args constructor");
	}

	public BasicsDemo(int id) {
		System.out.println("Constructor with parameter");
	}

	// instance initializer
	{
		System.out.println("Inside instance initializer");
	}

	public static void main(String[] args) {
		BasicsDemo bd = new BasicsDemo(1);

	}
}
