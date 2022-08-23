package com.semanticsquare.oop.p1;

public class C1 extends A1 {
	public static void main(String[] args) {

//		System.out.println("private member: " + privateMember);

		// inherit member can directly accessible
		System.out.println("default member: " + defaultMember);
		System.out.println("protected member: " + protectedMember);
		System.out.println("public member: " + publicMember);
	}
}
