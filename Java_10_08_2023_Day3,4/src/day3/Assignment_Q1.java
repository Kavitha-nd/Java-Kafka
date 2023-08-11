package day3;

import java.util.Scanner;

//public class Assignment_Q1 {
//	public static void main(String[] args) {
//		int a = 2;
//		int b = 2;
//		int c = 2;
//		
//		int perimeter = a + b + c;
//		
//		System.out.print("Perimeter of a triangle is:"+ perimeter);
//		
//	}
//
//}

//Write a program to calculate the perimeter of a triangle. Get the dimensions of the sides in run time.

public class Assignment_Q1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of side a:");
		int a = scanner.nextInt();
		
		System.out.println("Enter the value of side b:");
		int b = scanner.nextInt();
		
		System.out.println("Enter the value of side c:");
		int c = scanner.nextInt();
		
		float perimeter = (a+ b+ c);
		System.out.print("Perimeter of a triangle is:"+ perimeter);
		
		scanner.close();
		
	}
}