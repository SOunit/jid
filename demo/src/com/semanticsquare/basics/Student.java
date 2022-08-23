package com.semanticsquare.basics;

class Student {
	static int studentCount;

	private int id;
	private String name;
	private int iGender;
	private String gender;
	private int age;

	private long phone;
	private double gpa;
	private char degree;

	private boolean international;
	private double tuitionFee = 12000.0;
	private double internationalFee = 5000.0;

	public boolean isInternational() {
		return international;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equals("male")) {
			iGender = 1;
		} else if (gender.equals("female")) {
			iGender = 2;
		} else if (gender.equals("transgender")) {
			iGender = 3;
		}

		if (iGender == 0) {
			throw new IllegalArgumentException("Invalid gender!!");
		} else {
			this.gender = gender;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public char getDegree() {
		return degree;
	}

	public void setDegree(char degree) {
		this.degree = degree;
	}

	Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
		this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
	}

	Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree,
			boolean international) {
		this.id = newId;
		this.name = newName;
		this.gender = newGender;
		this.age = newAge;
		this.phone = newPhone;
		this.gpa = newGpa;
		this.degree = newDegree;
		this.international = international;

		studentCount += 1;

		if (international) {
			tuitionFee = tuitionFee + internationalFee;
		}
	}

	Student() {
	}

	boolean equals(Student s) {
		return s.id == id;
	}

}
