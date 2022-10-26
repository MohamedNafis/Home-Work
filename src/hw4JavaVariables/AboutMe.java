package hw4JavaVariables;

public class AboutMe {

	// variables declared
	public String myName;
	public byte myAge;
	public short houseRent;
	public int otherExpenses;
	public long myInvestment;
	public float productHeight;
	public double grossIncome;
	public char gander;
	public boolean usCitizen;

	// Constructor declared
	public AboutMe() {
		System.out.println("This is all ahout us:");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("Name:" + myName + "\nAge:" + myAge + "\nApartment rent:" + houseRent + "\nMonthly expenses:"
				+ otherExpenses + "\nTotal investment:" + myInvestment + "\nHeight:" + productHeight + "\nOther income:"
				+ grossIncome + "\nSex:" + gander + "\nUS citizen:" + usCitizen);
	}
}
