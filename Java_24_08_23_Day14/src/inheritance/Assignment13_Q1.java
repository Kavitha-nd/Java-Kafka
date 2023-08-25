package inheritance;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

////Implementing Single Inheritance & Multi_level Inheritance

//Write a program to get and display the details of the Employee using Single Inheritance. 
//In base class get the input for employee’s Id, First Name, Last Name, Year of Birth and Salary whereas in the derived class, 
//calculate the annual salary and age of the employee.  Print the employee’s Id, Full name, age and Annual Salary.

//Base class
class Employee{
	int employeeId;
	String firstName;
	String lastName;
	int yearOfBirth;
	double salary;
	
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
	    employeeId = sc.nextInt();
		
	    System.out.print("Enter First Name: ");
        firstName = sc.next();

        System.out.print("Enter Last Name: ");
        lastName = sc.next();

        System.out.print("Enter Year of Birth: ");
        yearOfBirth = sc.nextInt();
        
        
        
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        sc.close();
	}
	
}

//Derived class
class AnnualSalary extends Employee{
	void calculate() {
		LocalDate dob = LocalDate.of(yearOfBirth,8,28);  
		LocalDate currentDate= LocalDate.now();  
		
		int age = Period.between(dob, currentDate).getYears();
		double annualsalary = salary * 12;
		
		 System.out.println("Employee ID: " + employeeId);
	     System.out.println("Full Name: " + firstName + " " + lastName);
	     System.out.println("Age: " + age);
	     System.out.println("Annual Salary: $" + annualsalary);
	}
	
}


public class Assignment13_Q1 {

	public static void main(String[] args) {
		AnnualSalary e = new AnnualSalary();
		e.getDetails();
		e.calculate();

	}

}
