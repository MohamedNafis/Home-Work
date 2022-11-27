package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		System.out.println("\n--------------------- Regular class ColumbiaUniversity  ------------------------\n");
		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.lawInfo();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.caring();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLa();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.gymnasium();
		columbiaUniversity.dorm();
		columbiaUniversity.morgue();
		columbiaUniversity.vocationalInfo();

		University university = new ColumbiaUniversity();
		System.out.println("\n--------------------- Interface University ------------------------\n");
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		University.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		University.pharmacy();

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		System.out.println("\n--------------------- Abstract Class University ------------------------\n");
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLa();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();
	}

}
