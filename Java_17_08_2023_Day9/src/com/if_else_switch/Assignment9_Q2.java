package com.if_else_switch;
//Write a program that gets a number between 1 to 7 from the user and displays the name of the weekday. (using switch statement)

import java.util.Scanner;

public class Assignment9_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number between 1 to 7: ");
		int num = sc.nextInt();
		String dayName;
		
		switch (num){
			case 1:
				dayName = "Sunday";
				break;
			case 2:
				dayName = "Monday";
				break;
			case 3:
				dayName = "Tuesday";
				break;
			case 4:
				dayName = "Wednesday";
	            break;
			case 5:
				dayName = "Thursday";
				break;
			case 6:
				dayName = "Friday";
				break;
			case 7 :
				dayName = "Saturday";
				break;
			default:
				dayName = "Invalid input";
				break;
			
		}
		System.out.println("The name of the week is :"+  dayName);
		sc.close();
	}

	

}
