package hw4Constructor;

import java.security.Identity;

public class Student {

	public String name;
	public int id;
	public char gender;
	public float grade;
	public Boolean isProgrammer;
	
	
	
	
	public Student () {
		System.out.println("This is all about Student");
	}
	
	
	
	public Student(String name, int id, char gender, float grade, Boolean isProgrammer) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		
		System.out.println("\nStudent Name: " + name + " ,ID:"+ id + " ,Gender " + gender + " ,Grade " + grade + " ,Java Programmer? Ans: " + isProgrammer);
	}
	
}
	
	



	


