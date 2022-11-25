package hw10UseOfSuperInChildClass;

public class TestFamily {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	System.out.println("---------- default constructor initialized from Father Class ----------");
		Father father = new Father();
		
		System.out.println("\n---------- parameterized constructor initialized from Father Class ----------");
		Father father2 = new Father("Mohanned Nafis" , 27 , 'M' , true);
		
		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father.father();
		
		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
		father.fatherinfo("Mohammed Nafis", 27, 'M', true);
		*/
		System.out.println("\n---------- default constructor initialized from Daughter Class ----------");
		Daughter daughter = new Daughter();
		
	/*	System.out.println("\n---------- parameterized constructor initialized from Daughter Class ----------");
		Daughter daughter2 = new Daughter( "March",10);
		*/
		System.out.println("\n---------- Void Method initialized from Daughter Class ----------");
		daughter.daughter();
		
	/*	System.out.println("\n---------- parameterized method initialized for Daughter Class ----------");
		daughter.daughterinfo("April", 15);
		*/
	}

}

