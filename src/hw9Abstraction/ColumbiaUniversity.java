package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	// Abstract methods do not specify a body
	// The abstract method chemistry in type ColumbiaUniversity can only be defined
	// by an abstract class
	/*
	  public abstract void chemistry(){
	  
	 } */

	public void biology() {
		System.out.println("Biology is the scientific study of life");
	}
	
	public ColumbiaUniversity() {
		
	}

	@Override
	public void anatomyLab() {//The type ColumbiaUniversity must implement the inherited abstract method MedicalSchool.anatomyLab()
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() { //The type ColumbiaUniversity must implement the inherited abstract method NursingSchool.hygiene()
		// TODO Auto-generated method stub
		
	}
	
	/*Qa: how many keywords are used for the inheritance in Java for a regular Class?
	 * Ans: Two (Extends & Implements ) Keyword is used for inheritance in JAVA for a Regular Class.
	 * Qa: Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word?
	 * Ans: A Regular Class can inherit other Abstract class or regular class but Regular can not inherit interface.
	 * Qa: How many inheritances is possible by a regular Class?
	 * Ans: A Regular class can inherit only one Abstract or Regular class */

	
	
	

	
	 
		
	

}
