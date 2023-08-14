package com.while_loops;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class Assignment7_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of integers:");
		int num = sc.nextInt();
		
		int Even = 0,Odd = 0,i = 1;
	
		while(i<=num){  
		System.out.print("Enter an integer: ");
	    int num1 = sc.nextInt();
		if(i%2==0) 
		    Even =Even+i;
		else
		    Odd =Odd+i;
		 	i++;
		}
		System.out.println("Sum of all odd numbers are: "+Odd);
		System.out.println("Sum of all even numbers are: "+Even);
		sc.close();
		}		
}


