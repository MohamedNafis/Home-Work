package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] args) {
		int myAge = 25;
		int age = 18;
		if (myAge == age) {
			System.out.println("I am a Voter");
		} else if (myAge < age) {
			System.out.println("I am not a Voter");
		} else if (myAge > age) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
