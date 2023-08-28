package hybrid_hierachical;

import java.util.Scanner;

//Write a program to implement the hierarchical inheritance for calculating total and average of the given marks for 3 different students. 
//Input the marks with their name and department which will be output along with the result.  


class Student{
	String name;
	String department;
	int[] marks;
	
	public Student(String name, String department, int[] marks) {
		this.name = name;
		this.department = department;
		this.marks = marks;
	}		
}

class TotalAverage extends Student{

	public TotalAverage(String name, String department, int[] marks) {
		super(name, department, marks);
	}
	public int calculateTotalMarks(){
		int total = 0 ;
		for(int i = 0; i< marks.length; i++) {
			total= total + marks[i];
		}
		return total;
	}
	public double calculateAverage() {
		double average = (double) calculateTotalMarks() / marks.length;
		return average;
	}
	
}
public class Assignment14_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the Student"+ (i+1) + " Details");
			
			System.out.print("Enter the Name: ");
			String name = sc.next();
			
			System.out.print("Enter the  Department: ");
			String department = sc.next();
			
			System.out.print("Enter the Marks: ");
			int[] marks = new int[3];
			for(int j=0; j<3; j++) {
				marks[j] = sc.nextInt();
			}
			
			
			TotalAverage a = new TotalAverage(name, department, marks);
			
			System.out.println("Student Details: ");
			System.out.println("Name: " + a.name);
            System.out.println("Department: " + a.department);
            System.out.println("Marks: " + a.marks[0] + ", " + a.marks[1] + ", " + a.marks[2]);
            System.out.println("Total Marks: " + a.calculateTotalMarks());
            System.out.println("Average Marks: " + a.calculateAverage());
		}

	}

}
