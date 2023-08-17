package com.if_else_switch;
//Write a program to perform arithmetic operation based on the operator given by the user using switch statement.

import java.util.Scanner;

public class Assignment9_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt(); 
		System.out.print("Enter the operator +,-,*,/:");
		char operator = sc.next().charAt(0);
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		int result;
		switch (operator) {
		case '+': 
			result = num1 + num2;
			System.out.println(num1+" + " + num2+ " =" + result);
			break;
		case '-': 
			result = num1 - num2;
			System.out.println(num1+" - " + num2+ " =" + result);
			break;
		case '*': 
			result = num1 * num2;
			System.out.println(num1+" *"  + num2+ " =" + result);
			break;	
		case '/': 
			result = num1 / num2;
			System.out.println(num1+" / " + num2+ " =" + result);
			break;	
		default:
			System.out.println("Invaild Operator..");
		}
		sc.close();
	}
}
