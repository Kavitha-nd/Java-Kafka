package hybrid_hierachical;

import java.util.Scanner;

////Write a program to get and display the details of the Employee using Single Inheritance. 
//Get the input for employee’s Id, First Name, Last Name, Year of Birth and Salary in a constructor whereas in the derived class,
//calculate the annual salary and age of the employee.  Print the employee’s Id, Full name, age and Annual Salary.

//Base class 'Employee'
class Employee{
	protected int empId;
	protected String firstName;
	protected String lastName;
	protected int yearOfBirth;
	protected double salary;
	
	//Constructor 'Employee' with parameters to initializes
	public Employee(int eId, String f_Name, String l_Name, int yearOfBirth, double salary){
		this.empId = eId;
		this.firstName = f_Name;
		this.lastName = l_Name;
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;	
	}
}

//Derived class 'DerivedEmployee'
class DerivedEmployee extends Employee{
	//Here Constructor 'DerivedEmployee' with parameters to initializes both base class and sub-class  
	public DerivedEmployee(int eId, String f_Name, String l_Name, int yearOfBirth, double salary) {
		super(eId, f_Name, l_Name, yearOfBirth, salary);// the call to the constructor of the base class
		
	}
	
	public double calculateSalary() {
		return salary * 12;
		
	}
	
	public int age(int currentYear) {
		return currentYear - yearOfBirth;
	}
}

public class Assignment14_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Employee Id: ");
		int empId = sc.nextInt();
		
		System.out.print("Enter First name: ");
		String firstName = sc.next();
		
		System.out.print("Enter Last name: ");
		String lastName = sc.next();
		
		System.out.print("Enter Year of Birth: ");
		int yearOfBirth = sc.nextInt();
		
		System.out.print("Enter the salary: ");
		double salary = sc.nextDouble();
	
	
		
		DerivedEmployee emp = new DerivedEmployee(empId, firstName, lastName, yearOfBirth, salary);
		
		int currentYear = 2023;
		int age = emp.age(currentYear);
		double annualSalary = emp.calculateSalary();
		
		System.out.println("Employee ID: " + empId);
	    System.out.println("Full Name: " + firstName + " " + lastName);
	    System.out.println("Age: " + age);
	    System.out.println("Annual Salary: $" + annualSalary);
	    
	    sc.close();
		
	}

}
