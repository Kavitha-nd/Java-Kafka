package com.while_loops;

import java.util.Scanner;

//Define an integer array and get input in run time. Find the largest and smallest numbers of the array.
public class Assignment7_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size  of arrays :");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		int i = 0;
		System.out.println("Enter the elements of the array:");
		while (i < size) {
	            System.out.print("Enter element @@@" + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	            i++;
	        }

	        int max = numbers[0],min = numbers[0];

	        i = 1;
	        while (i < size) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            } else if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            i++;
	        }    
         System.out.println("Smallest numberof the array: " + min);
	     System.out.println("Largest number of the array: " + max);
	     sc.close();    
	}
}
