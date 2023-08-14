package com.for_loop;
//Write a program to print following triangle structure      

import java.util.Scanner;


public class Assignment6_Q4 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
        	 for (int j = n; j >= i; j--)
        	        System.out.print(" ");
        	 for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
