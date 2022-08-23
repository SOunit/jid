package com.semanticsquare.oop.interfacedemo;

public class X extends AbstractA implements A, B, C, Cloneable {
	@Override
	public void foo() {
		System.out.println("X: foo");
		System.out.println("A.VAL: " + A.VAL);
		System.out.println("B.VAL: " + B.VAL);
	}

	@Override
	public void foobar() {
		// TODO Auto-generated method stub
		System.out.println("X: foobar");
	}
	
	public C clone() {
		try {
			return (C) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
