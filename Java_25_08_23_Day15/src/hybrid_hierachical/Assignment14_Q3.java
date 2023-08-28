package hybrid_hierachical;

import java.util.Scanner;

//Write a program by implementing hybrid inheritance using following details: 
//For 3 employee’s create 3 different class to get the input as id, name, salary per day.  
//For each employee class, create a sub class and get the number of leaves and the marital status.  
//In a super class, calculate the all employee’s monthly salary by adding 5% for the married employee.  Print the id, name and total salary.  

class Employee1{
	protected int empId;
	protected String name;
	protected double salaryPerDay;
	
	void getInput() {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter employee ID: ");
        empId = sc.nextInt();
       
        System.out.print("Enter employee name: ");
        name = sc.next();
        
        System.out.print("Enter employee's salary per day: ");
        salaryPerDay = sc.nextDouble();
    }
}
class LeaveAndMaritalInfo extends Employee1{
	int numberOfLeaves;
	boolean isMarried;
	
	void getLeaveAndMaritalInfo(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of leaves: ");
        numberOfLeaves = sc.nextInt();
        
        System.out.print("Is employee married? (true/false): ");
        isMarried = sc.nextBoolean();
    }
}

class MonthlySalaryCalculator extends LeaveAndMaritalInfo {
    double calculateMonthlySalary() {
        double totalSalary = salaryPerDay * (30 - numberOfLeaves); 
        if (isMarried) {
            totalSalary += totalSalary * 0.05; // Adding 5% for married employees
        }
        return totalSalary;
    }      
        void displaySalaryInfo() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + name);
            System.out.println("Total Monthly Salary: " + calculateMonthlySalary());
        }
    }

public class Assignment14_Q3 {

	public static void main(String[] args) {
        MonthlySalaryCalculator emp1 = new MonthlySalaryCalculator();
        MonthlySalaryCalculator emp2 = new MonthlySalaryCalculator();
        MonthlySalaryCalculator emp3 = new MonthlySalaryCalculator();

        System.out.println("Enter details for Employee 1:");
        emp1.getInput();
        emp1.getLeaveAndMaritalInfo();

        System.out.println("Enter details for Employee 2:");
        emp2.getInput();
        emp2.getLeaveAndMaritalInfo();

        System.out.println("Enter details for Employee 3:");
        emp3.getInput();
        emp3.getLeaveAndMaritalInfo();

        System.out.println("\nSalary Information for Employee 1:");
        emp1.displaySalaryInfo();

        System.out.println("\nSalary Information for Employee 2:");
        emp2.displaySalaryInfo();

        System.out.println("\nSalary Information for Employee 3:");
        emp3.displaySalaryInfo();
    }
}
