package com.if_else_switch;
//Write a program using switch case to check the input character is a vowel or not.

import java.util.Scanner;

public class Assignment9_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the letter:");
		char letter = sc.next().charAt(0);
		
//		char vowel;
		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(letter + " is a vowel");
			break;
		default:
			System.out.println(letter + " is not a vowel");
			break;
		}
	sc.close();
	}
}
