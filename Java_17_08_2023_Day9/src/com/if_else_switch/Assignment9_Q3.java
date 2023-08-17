package com.if_else_switch;
//Write a program to check whether the input year is a leap year or not using if statement.

import java.util.Scanner;

public class Assignment9_Q3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
			System.out.println(year +"is a leap year");
		}
		else {
			System.out.println(year + "is not a leap year");
		}
		sc.close();
	}
}
