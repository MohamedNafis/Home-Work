package hw12Polymorphism;

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This Method is come from Stster class");
	}

	@Override
	public void sister(int age1, int age2) {
		int age = age1+5 + age2+3;
		System.out.println(age);
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int age = age1*3 + age2/2 + age3-2;
		System.out.println(age);
		return age;
	}

	@Override
	public int sister(int age1, String age4, int age2) {
		int age = age1+7 + Integer.parseInt(age4)+10 + age2;
		System.out.println(age);
		return age;
	}

	@Override
	public int sister(int age1, int age2, String age4) {
		int age = age1-1 + age2 + Integer.parseInt(age4)+20;
		System.out.println(age);
		return age;
	}

	// because static is a local member method of a class)
	// So, static method can't be override, if we remove @override it will work as
	// static method of this Niece class

	/*
	 * @Override public static int sister(int age1, int age2, int age3, String age4)
	 * { int age = age1 + age2 + age3 + Integer.parseInt(age4);
	 * System.out.println(age); return age; }
	 */

	// Final type method cannot be Overriden
	// Cannot override the final method from Sister

	/*
	@Override
	public final int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int age = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println(age);
		return age;
	}
	*/

	/*
	 * When different methods exist with the same method name with same parameters
	 * or signature but with different syntax or logic, it is called method
	 * overriding. Method Overriding occurs during run time.
	 */

}
