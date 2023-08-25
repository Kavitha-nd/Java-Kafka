package constructors;


//Create a class “Employee” get values for Employee Id, Employee Name , Salary and Experience through constructor. 
//Create a static method to calculate their salary based on the experience.  
//If the experience is below 2 years, the salary remains same. 
//If it is between 2 and 5 , the salary gets multiplied by 1.5, otherwise, the salary gets doubled.  Print the result along with the employee id and name.


class Employee {
	int e_Id ;
	String e_name;
	double salary ;
	int experience;
	
	public Employee(int e_id, String e_name, double salary, int experience) {
		this .e_Id = e_id;
		this.e_name = e_name;
		this.salary = salary;
		this.experience = experience;
	}
	
	static double calculate_salary(double salary, int experience) {
		
		if (experience < 2) {
			return salary;
		}else if (experience >=2 && experience <=5) {
			return salary * 1.5;
		}else {
			return salary * 2;
		}		
	}
	void display() {
		double calculated_salary   = calculate_salary(salary, experience) ;
		System.out.println("Employee Id: " + e_Id);
		System.out.println("Employee Name: " + e_name);
		System.out.println("Calculated Salary: "+ calculated_salary);
	}
}
public class Assignment12_Q2 {

	public static void main(String[] args) {
		Employee e = new Employee(1, "abc",500, 2 );
		e.display();
		System.out.println("Congratulations");
		
	}

}
