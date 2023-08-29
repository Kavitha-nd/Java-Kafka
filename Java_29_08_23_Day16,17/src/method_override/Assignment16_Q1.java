package method_override;

import java.util.Scanner;

//Implement method overriding in multi-level inheritance.  
//In class-1, get and printDetails the personal details.
//In class-2, get and printDetails the educational details with the name.
//In class-3, get and printDetails the professional details with the name. 
//Use the method “printDetails” to printDetails the result in all 3 classes.

class Personal{
	String name;
	public void getPersonalDetails() {
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter name: ");
	     name = sc.nextLine();
	}
	
	void printDetails() {
		System.out.println("Name : "+ name);
	}
}
class Education extends Personal{
	String education;
	public void getEducationalDetails() {
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter Education: ");
	     education= sc.nextLine();
	}
	
	@Override
	void printDetails() {
		super.printDetails();
		System.out.println("Education : "+ education);
	}
}
class Profession extends Education{
	String profession;
	public void getProfessionalDetails() {
		Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter Profession: ");
	     profession= sc.nextLine();
	}
	
	@Override
	void printDetails() {
		super.printDetails();
		System.out.println("Profession : "+ profession);
	}
}
public class Assignment16_Q1 {

	public static void main(String[] args) {
		Profession obj = new Profession();
		
		obj.getPersonalDetails();
		obj.getEducationalDetails();
		obj.getProfessionalDetails();
		
		obj.printDetails();

	}

}
