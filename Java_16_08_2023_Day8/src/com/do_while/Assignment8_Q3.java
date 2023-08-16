package com.do_while;

public class Assignment8_Q3 {
	 public static void main(String[] args) {
		 int row = 1;
	        do {
	            int col = 1;

	            do {
	                System.out.print(col + " ");
	                col++;
	            } while (col <= row);

	            System.out.println();
	            row++;
	        } while (row <= 5);
	    }
	}






