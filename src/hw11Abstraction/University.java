package hw11Abstraction;

public interface University extends College,Hospital {
	public void classSize();
	public void playGround();
	public void teacher();
	
	/*
	  public University() { //Interfaces cannot have constructors
	 
	 }
	 */
	public default void gymnasium() {

	}
	
	public static void library () {
		
	}
	public static void studyRoom() {
		// TODO Auto-generated method stub
		
	}
	public static void pharmacy() {
		// TODO Auto-generated method stub
	}
	

		
		
	}
	
	/*Qa: how many keywords are used for the inheritance in Interface?
	 * Ans: One (Extends) Keyword is used for inheritance in Interface. 
	 * Qa: Can an interface inherit other Interfaces, or a regular class or abstract class by extends or implements key word?
	 * Ans: An interface can inherit other interface by extend key word , but interface can not inherit regular class or abstract by extend key word.
	 * Qa: How many inheritance is possible?
	 * Ans: An interface can inherit More then one interface */



