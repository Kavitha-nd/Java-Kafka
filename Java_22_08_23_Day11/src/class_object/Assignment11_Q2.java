package class_object;

import java.util.Scanner;

//Create a class “Student” with variables Rollno and Name and use methods to get the input for the variables. 
//Use a method with no parameter and with parameters to assign the values. 

class Student{
	String rollno;
	String name;
	
	// Method -  to display student details
	void display() {
		System.out.println("Name of Student and Rollno: " + name + " & " + rollno);
}
	
	
	// Method -  to assign values using parameters
	void studentDetails(String rollno,String name) {
		this.name = name;
		this.rollno = rollno;
		
	}
		
	
	// Method  - to get input for variables with no parameter
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name of the student:" );
		name = sc.next();
		sc.nextLine();
		
		System.out.println("Rollno of the Student: ");
		rollno = sc.next();
		sc.nextLine();
		
		sc.close();	
	}
	
}
public class Assignment11_Q2 {
	public static void main(String[] args) {
			
		// assigning values to variables
		Student s1 = new Student();
		s1.rollno = "cs040";
		s1.name = "Kavitha"; 
		s1.display();
		
		// Using the method with parameters to assign values
		Student s2 = new Student() ;
		s2.studentDetails("cs44","Lokesh");
		s2.display();
		
		//Using the method with no parameters to get input and assign values
		Student s3 = new Student();
		s3.inputDetails();
		s3.display();
			
		
	}
}
