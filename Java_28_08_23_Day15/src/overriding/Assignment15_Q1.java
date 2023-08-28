package overriding;

//Implement method overriding in multi-level inheritance.  
//In class-1, get and display the personal details.
//In class-2, get and display the educational details with the name.
//In class-3, get and display the professional details with the name. 
//Use the method “printDetails” to display the result in all 3 classes.


class PersonalDetails{
	String name;
	void getName(String name) {
		this.name = name;
	}
	
	void printDetails() {
		System.out.println("Name: " + name);
	}
}

class EducationDetails extends PersonalDetails{
	String education;
	void getEdu(String education) {
		this.education = education;
	}
	@Override
	void printDetails() {
		super.printDetails();
		System.out.print("Education: " + education);
	}
}

class ProfessionalDetails extends EducationDetails{
	String profession;
	void getProfession(String profession) {
		this.profession = profession;
	}
	@Override
	void printDetails() {
		super.printDetails();
		System.out.println("Profession: " + profession);
	}
	
}
public class Assignment15_Q1 {
	public static void main(String[] args) {
		ProfessionalDetails obj = new ProfessionalDetails();
		obj.getName("Kavi");
		obj.getEdu("B.E. \n");
		obj.getProfession("Software");
		
		obj.printDetails();
		
	}
}
