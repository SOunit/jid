package com.semanticsquare.oop.abstractdemo;

public class ConcreteSubClass extends AbstractSubClass {

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}

	public static void main(String[] args) {
		ConcreteSubClass concrete = new ConcreteSubClass();
		concrete.test1();
		concrete.test2();
		concrete.test3();

		// cannot instantiate
		// AbstractSuperClass test = new AbstractSuperClass();

	}

}
