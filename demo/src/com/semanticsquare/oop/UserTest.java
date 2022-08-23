package com.semanticsquare.oop;

public class UserTest {

	public void printUserType(User u) {
		u.printUserType();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);

		// part 2

		// error, compiler check reference type
		// editor.approveReview();
		((Editor) editor).approveReview();

		user.postAReview();
		staff.postAReview();
		editor.postAReview();

		// JVM start search method from object type
		editor.saveWebLink();
	}

}
