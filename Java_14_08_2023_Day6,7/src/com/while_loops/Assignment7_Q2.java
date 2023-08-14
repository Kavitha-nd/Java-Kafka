package com.while_loops;

import java.util.Scanner;

//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
//For example, if the input is 12345, the output should be 54321.


public class Assignment7_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int reversed = 0;
		while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
		}
            System.out.println("Reversed number: " + reversed);
            sc.close();
	}

}
