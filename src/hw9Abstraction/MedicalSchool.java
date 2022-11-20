package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Located In New York");

	}

	public MedicalSchool() {
		
	}
	/*Qa: how many keywords are used for the inheritance in Java for Abstract Class?
	 * Ans: One (Extends) Keyword is used for inheritance in JAVA for  Abstract Class.
	 * Qa: Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends keyword?
	 * Ans: An Abstract Class can inherit other Abstract class or regular class but Abstract can not inherit interface.
	 * Qa: How many inheritances is possible by an Abstract Class?
	 * Ans: An Abstract class can inherit only one Abstract or Regular class  */

}
