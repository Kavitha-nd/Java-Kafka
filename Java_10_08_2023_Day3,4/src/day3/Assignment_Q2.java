package day3;


// Write a program to add 8 to the number 2345 and then divide it by 3. 
//Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. 
//Display the final result.
public class Assignment_Q2 {
	
	public static void main(String[] args) {
		int number = 2345;
		number = number + 8;
		System.out.println("Add 8 to 2345:"+ number);
		
		int quotient = number / 3;
		System.out.println("Divide by 3:"+ quotient);
		 
		int modulus = quotient % 5;
		System.out.println("Modulus of 5:" + modulus);
		
		int multiply= modulus * 5;
		System.out.println("Multiply of 5:"+ multiply);
		
	}
	

}
