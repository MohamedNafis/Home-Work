package hw3JavaVariables;


public class AboutMe {
	// Variable Declare
	public String myName = " ";

	// Variable Initialize
	public byte myAge = 25;
	public short myMonthlyRent = 32000;
	public int myYearlyIncome = 249877889;
	public long my_investment = 238999988888999999l;
	public float product_hight = 3.4544444f;
	public double road_distance = 7.327465847564536;
	public char gander = 'M';
	public boolean citizen = true;
	
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.myMonthlyRent);
		System.out.println(aboutMe.my_investment);
		System.out.println(aboutMe.road_distance);
		System.out.println("product hight: "+ aboutMe.product_hight + ", road distance: "  + aboutMe.road_distance);
		
	}
}