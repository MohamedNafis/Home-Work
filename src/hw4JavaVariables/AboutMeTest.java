package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe info1 = new AboutMe(); // Constructor initialized

		// variables initialized,
		info1.myName = "Mihammde Nafis";
		info1.myAge = 25;
		info1.houseRent = 3500;
		info1.otherExpenses = 273567966;
		info1.myInvestment = 56788394884993l;
		info1.productHeight = 2.66466f;
		info1.grossIncome = 7.7687865434567654;
		info1.gander = 'M';
		info1.usCitizen = true;
		info1.aboutMe(); // method initialized.

		System.out
				.println("\n--------------------------------------------------------------------------------------\n");

		AboutMe info2 = new AboutMe();
		// variables initialized,
		info2.myName = "Alex";
		info2.myAge = 27;
		info2.houseRent = 5500;
		info2.otherExpenses = 87773966;
		info2.myInvestment = 1554673993l;
		info2.productHeight = 5.66466f;
		info2.grossIncome = 3.7687865434567654;
		info2.gander = 'M';
		info2.usCitizen = false;
		info2.aboutMe(); // method initialized.

	}

}
