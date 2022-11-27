package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister sis = new Sister();
		System.out.println("-------------SisterClass------------");
		sis.sister();
		sis.sister(5, 6);
		sis.sister(1, 2, 3);
		sis.sister(2, "2", 2);
		sis.sister(4, 4, "4");
		Sister.sister(7, 8, 9, "10");
		sis.sister(10, 20, 30, "40", 50, 60);

		Niece niece = new Niece();
		niece.sister();
		niece.sister(6, 8);
		niece.sister(10, 40, 60);
		niece.sister(4, "35", 25);
		niece.sister(33, 22, "46");
		// Niece.sister(21, 55, 86, "44");
		// niece.sister(2, 4, 8, "10", 12, 14);
	}

}
