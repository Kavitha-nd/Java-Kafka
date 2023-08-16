package com.do_while;

import java.util.Scanner;

//Define an integer array of 10 values and get the inputs in run time.
//Print the values of the array using do while loop. If the array has the value 11 in it, break the loop.
public class Assignment8_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int i=0;
		do {
			System.out.print("Enter the inputs of array "+ i + ": ");
			int value = sc.nextInt();
			array[i]=value;
			
			if (value == 11) {
                System.out.println("Breaking loop because value 11 is entered.");
                break;
            }
			i++;
		}while( i < 10);
		sc.close();
	}

}
