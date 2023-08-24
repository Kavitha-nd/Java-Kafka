package constructors;
//create a class “Student” with variables Roll Number, Name, College, Department.
//Initialize values using ‘this’ keyword in constructor and print the student details. 


class Student{
	// Variables
	String name;
	int rollno;
	String college;
	String department;
	
	// Constructor
	public Student(String name, int rollno, String college, String department ) {
		this.name = name;
		this.rollno = rollno;
		this.college = college;
		this.department = department;
	}
		
	//Display
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + rollno);
		System.out.println("College: " + college);
		System.out.println("Department: " + department);
	
	}
}
public class Assignment12_Q1 {

	public static void main(String[] args) {
		Student s1 = new Student("Kavitha" , 11 ,"SEA COllege", "CSE" );
		s1.display();
	}

}
