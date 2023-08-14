package com.for_loop;

import java.util.Scanner;

//Define an integer array and get input in run time. Find the largest and smallest numbers of the array.

public class Assignment6_Q5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        int min = numbers[0],max = numbers[0];

	        for (int i = 1; i < size; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("Smallest number of the array: " + min);
	        System.out.println("Largest number of the array: " + max);
	        scanner.close();
	    }
		
	}




