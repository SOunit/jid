package com.semanticsquare.basics;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(1001, "John1", "male", 18, 223_22_2222, 3.8, 'B');
		Student student2 = new Student(1002, "John2", "male", 18, 223_22_2222, 3.8, 'B');
		Student student3 = new Student(1003, "John3", "male", 18, 223_22_2222, 3.8, 'B');

		System.out.println("Student.studentCount: " + Student.studentCount);

		System.out.println("student1 name: " + student1.getName());
		System.out.println("student2 name: " + student2.getName());
		System.out.println("student3 name: " + student3.getName());

		student3.setGender("female");
		System.out.println("student3 gender: " + student3.getGender());

		boolean isDuplicate = student3.equals(student3);
		System.out.println("isDuplicate: " + isDuplicate);

		Student student4 = new Student(1004, "John", "male", 18, 223_22_2222, 3.8, 'B');
		Student[] list = {student1, student2, student3};
		for (Student student : list) {
			System.out.println(student.getName());
		}
	}

}
