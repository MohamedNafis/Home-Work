package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Located In New York");

	}

	public MedicalSchool() {
		
	}
	/*Qa: how many keywords are used for the inheritance in Java for Abstract Class?
	 * Ans: Tow (Extends & Implements) Keyword is used for inheritance in JAVA for  Abstract Class.
	 * Qa: Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends or implements keyword?
	 * Ans: An Abstract Class can inherit other Abstract class or regular class by Extends keyword and Abstract can inherit interface by implements keyword.
	 * Qa: How many inheritances is possible by an Abstract Class?
	 * Ans: An Abstract class can inherit only one Abstract or Regular class by Extends keyword and Abstract class also inherit more then one interface by implements keyword  */

}
