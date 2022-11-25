package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Mohammed Nafis", 27, 'M', true);
		super.father();
		super.fatherinfo("Shafqat", 25, 'M', false);
		super.familyName = "Mohammed Hanif";
		System.out.println(familyName);
		System.out.println("This Construstor is come from Daughter class");
	}

	public Daughter(String birthMonth, int age) {

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherinfo("Mariya", 9, 'F', true);
		super.familyName = "Nobir Hussain";
		System.out.println(familyName);
		System.out.println("This Method is come from Daughter class");
	}

	public void daughterinfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + ", Age: " + age);
	}

}
