package com.question3;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	// Non-static method
	public void displayStudentDetails() {
		System.out.println("displayStudentDetails() method Invoked\n");
		
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks);
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// Create two instances of Student class
		Student s1 = new Student();
		Student s2 = new Student();
		
		// Setting details for s1 student
		s1.roll = 5;
		s1.name = "Faizan";
		s1.marks = 493;
		
		// Setting details for s1 student
		s2.roll = 9;
		s2.name = "Nazam";
		s2.marks = 433;
		
		// Call displayStudentDetails on s1 & s2
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		
		// making it eligible for garbage collection
		s1 = null;
		s2 = null;
	}
}
