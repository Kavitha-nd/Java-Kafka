package class_object;

import java.util.Scanner;

//Create a class and methods for doing arithmetic operations and display the result accordingly. 

class Arthmetic_Operations{
	//add method to add 2 floats 
	static float add(float a,float b) {
		return a + b;
	}
	
	//sub method to subtract 2 integers
	static int sub(int a,int b) {
		return a - b;
	}
	
	static int mul(int a,int b) {
		return a * b;
	}
	
	static float div(int a,int b) {
		return a/b;
	}
	
}

public class Assignment11_Q3{
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 2;
		
		// Using add method from Arithmetic_Operations class to perform addition operation.
		float addition = Arthmetic_Operations.add(n1,n2);
		System.out.println("Addition : " + addition);
		
		
		int subtract = Arthmetic_Operations.sub(n1,n2);
		System.out.println("Substraction : " + subtract);
		
		int  multiplication = Arthmetic_Operations.mul(n1,n2);
		System.out.println("Multiplication : " + multiplication);
		
		float division = Arthmetic_Operations.div(n1,n2);
		System.out.println("Division : " + division);
		
		}
}



