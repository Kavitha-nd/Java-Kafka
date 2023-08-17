package com.if_else_switch;

import java.util.Scanner;

//Create a program with if statement by getting 2 strings at runtime and check whether the first string matches “Navadhiti” and second one with “Java”. 
//If yes, print “Welcome to Navadhiti..”, otherwise, print “Invalid credentials.. Try again..”.  

public class Assignment9_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the 1st string:");
		String firststring = sc.nextLine();
		
		System.out.println("Enter the 2nd string:");
		String secondstring = sc.nextLine();
		
		if(firststring.equals("Navadhiti") && secondstring.equals("Java")){
			System.out.println("Welcome to Navadhiti..");
		}else {
			System.out.println("Invalid Credentials.. Try again..");
		}
		sc.close();
	}

}
