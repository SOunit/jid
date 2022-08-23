package com.semanticsquare.oop.interfacedemo;

public class TestClient {

	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		System.out.println("Interface------------");
		// A a = new A();
//		A a = new X();
//
//		a.foo();
//		a.bar();
//		((X) a).foobar();

		System.out.println("Cloneable------------");

//		C c = new X();
//		C clone = ((X)c).clone();
//		if(clone != c) {
//			System.out.println("Clone created!");
//		}

		System.out.println("Default methods----------");
		C c = new X();
		c.go();
	}

}
