package hw12Polymorphism;

public class Sister {

	public void sister() {
		System.out.println("This Method is come from Stster class");
	}

	public void sister(int age1, int age2) {
		int age = age1 + age2;
		System.out.println(age);
	}

	public int sister(int age1, int age2, int age3) {
		int age = age1 + age2 + age3;
		System.out.println(age);
		return age;
	}

	public int sister(int age1, String age4, int age2) {
		int age = age1 + Integer.parseInt(age4) + age2;
		System.out.println(age);
		return age;
	}

	public int sister(int age1, int age2, String age4) {
		int age = age1 + age2 + Integer.parseInt(age4);
		System.out.println(age);
		return age;
	}

	public static int sister(int age1, int age2, int age3, String age4) {
		int age = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println(age);
		return age;
	}

	public final int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int age = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println(age);
		return age;
	}
	/*
	 * When different methods exist with the same method name but with different
	 * parameters or different parameters location or signature, it is called method overloading.
	 */

}
