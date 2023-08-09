package day2;

//Add a program to get runtime input for all the data types and to print it.

import java.util.Scanner;

public class Assignment_Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a byte: ");
		byte myByte = scanner.nextByte();
		System.out.println("byte: " + myByte+ " (Type: " + ((Object) myByte).getClass().getName() + ")");
		
		System.out.print("Enter a short: ");
		short myshort = scanner.nextByte();
		System.out.println("short: " + myshort+ " (Type: " + ((Object) myshort).getClass().getName() + ")");
		
		System.out.print("Enter a long: ");
		long mylong = scanner.nextLong();
		System.out.println("long: " + mylong+ " (Type: " + ((Object) mylong).getClass().getName() + ")");
		
		System.out.print("Enter a int: ");
		int myint = scanner.nextInt();
		System.out.println("int: " + myint+ " (Type: " + ((Object) myint).getClass().getName() + ")");
		
		System.out.print("Enter a float: ");
		float myfloat = scanner.nextFloat();
		System.out.println("float: " + myfloat+ " (Type: " + ((Object) myfloat).getClass().getName() + ")");
		
		
		System.out.print("Enter a double: ");
		double mydoub = scanner.nextDouble();
		System.out.println("boolean: " + mydoub+ " (Type: " + ((Object) mydoub).getClass().getName() + ")");
		
		
		System.out.print("Enter a String: ");
		String mystr = scanner.nextLine();
		System.out.println("String: " + mystr+ " (Type: " + mystr.getClass().getName() + ")");

		scanner.close();

	}

}
