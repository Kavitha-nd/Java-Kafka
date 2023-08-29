package interface_inheritance;

import java.util.Scanner;

//Implement multiple inheritance to calculate and display the student result.  
//Interface 1: Input Student information - Student roll no, name, Class.
//Interface 2:  Input marks for Tamil, English, Maths, Science and Social.
//Inherit these two interfaces to calculate total and average of the given marks.  Print the result as: Roll no, Name, Class, Total, Average, Result (Pass/Fail).


interface StudentInfo{
	void getInputs();
	void displayInfo();
	
}
interface Marks{
	void getMarks();
	void displayResult();
	
    double calculateTotal();
    double calculateAverage();
    
}

class StudentResult  implements  StudentInfo,Marks{
	int rollNo;
	String name;
	String className;
	double tamil,english,maths,science,social;
	
	@Override
	public void getMarks() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Tamil Marks: ");
        tamil = sc.nextDouble();
        
        System.out.print("Enter English Marks: ");
        english = sc.nextDouble();
        
        System.out.print("Enter Maths Marks: ");
        maths = sc.nextDouble();
        
        System.out.print("Enter Science Marks: ");
        science = sc.nextDouble();
        
        System.out.print("Enter Social Marks: ");
        social = sc.nextDouble();
		
        System.out.println("------------------------------");
	}

	@Override
	public double calculateTotal() {
		
		return tamil + english + maths + science + social;
	}

	@Override
	public double calculateAverage() {
		
		return calculateTotal() / 5;
	}

	@Override
	public void getInputs() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name: ");
		name = sc.next();
		
		System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        
        System.out.print("Enter Class: ");
        className = sc.next();
        
        System.out.println("--------------------------");
	}

	@Override
	public void displayInfo() {
		
		 System.out.println("Student Information:");
	     System.out.println("Roll No: " + rollNo);
	     System.out.println("Name: " + name);
	     System.out.println("Class: " + className);
	     System.out.println("--------------------------");
		
	}
	@Override
	public void displayResult() {
		double total = calculateTotal();
	     double average = calculateAverage();

	     System.out.println("Result:");
	     System.out.println("Total Marks: " + total);
	     System.out.println("Average Marks: " + average);
	     System.out.println("Result: " + (average >= 35 ? "Pass" : "Fail"));
	}
	
}
public class Assignment17_Q2 {

	public static void main(String[] args) {
		StudentResult student = new StudentResult();
		student.getMarks();
		student.calculateTotal();
		student.calculateAverage();
        student.getInputs();
        student.displayInfo();
        student.displayResult();

	}

}
