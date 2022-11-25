package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	
	
	public Father() {
		System.out.println("This Constructor is come from Father class");
		
	}


	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(" Name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen: " + usCitizen);
	}
	
	public void father() {
		System.out.println("This Method is come from Father class");
	}
	
	public void fatherinfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen: " + usCitizen);
	}
	
	

}
