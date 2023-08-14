package com.while_loops;

import java.util.Scanner;

public class Assignment7_Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int height = scanner.nextInt();
		int row = 1;

		while (row <= height) {
            int spaces = height - row;
           
            int col = 1;
            while (col <= spaces) {
                System.out.print("  ");
                col--;
            }
           
            while (col <= 2 * row - 1) {
                System.out.print("* ");
                col++;
            }   
 
            System.out.println();
            row++;
		}
            scanner.close(); 
	}

}
