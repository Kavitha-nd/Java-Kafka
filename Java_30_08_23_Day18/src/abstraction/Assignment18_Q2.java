package abstraction;


//Write a program using the information below:
//Create a abstract class with a abstract method to get the employee details such as Empno, Emp Name, Designation, Organization.  
//Create an interface to get the salary details of the employee such as Basic Pay, HRA, Special Allowance and another method to calculate the total Earnings of the employee.
//Create a class to calculate the Net pay of the employee after deducing PF (10% of salary) and tax (Rs. 200/- per month) from the salary.  
//Display the result along with the employee details (from class-1).


abstract class Employee{
	protected int empId;
	protected String name;
	protected String designation;
	protected String organization;
	
	abstract void getInfo();
}

interface Salary{
	double getBasicPay();
    double getHRA();
    double getSpecialAllowance();
    double calculateTotalEarnings();
}

class NetPayCalculator implements Salary {
	
	double basicPay;
	double hra;
	double specialAllowance;
	double pf = 0.10;
	double tax = 200;
	
	public NetPayCalculator(double basicPay, double hra, double specialAllowance) {
		this.basicPay = basicPay;
		this.hra = hra;
		this.specialAllowance = specialAllowance;
	}

	@Override
	public double getBasicPay() {
		
		return basicPay;
	}

	@Override
	public double getHRA() {
	
		return hra;
	}

	@Override
	public double getSpecialAllowance() {
		
		return specialAllowance;
	}

	@Override
	public double calculateTotalEarnings() {
		
		return basicPay + hra + specialAllowance;
	}
	
	public double calculateNetPay() {
		double totalEarnings = calculateTotalEarnings();
        double pfAmount = basicPay * pf;
        double netPay = totalEarnings - (pfAmount + tax);
		return netPay;
		
	}
}


//Concrete class implementing employee details
class ConcreteEmployee extends Employee {
 public ConcreteEmployee(int empId, String name, String designation, String organization) {
     this.empId = empId;
     this.name = name;
     this.designation = designation;
     this.organization = organization;
 }

 @Override
 void getInfo() {
     System.out.println("Employee Details:");
     System.out.println("Emp No: " + empId);
     System.out.println("Emp Name: " + name);
     System.out.println("Designation: " + designation);
     System.out.println("Organization: " + organization);
 }


}
public class Assignment18_Q2 {

	public static void main(String[] args) {
		ConcreteEmployee e= new ConcreteEmployee(707, "Kavi", "Software Engineer", "Navadithi");

        NetPayCalculator n = new NetPayCalculator(12000, 6000, 5000);

        e.getInfo();
        System.out.println("Net Pay: " + n.calculateNetPay() + "/-");

	}

}
