package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Mohammed Nafis");
		employee.setAge(30);
		employee.setSex('M');
		employee.setUsCitizen(true);
		System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nGander: "
				+ employee.getSex() + "\nUS Citizen:" + employee.isUsCitizen());
	}

}
