package com.for_loop;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class Assignment6_Q3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);
        
        scanner.close();
    }
}
