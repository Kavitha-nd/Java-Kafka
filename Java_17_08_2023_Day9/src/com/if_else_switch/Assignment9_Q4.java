package com.if_else_switch;

import java.util.Scanner;

//Get the Mathematics mark of 5 students in run time.
//If the mark is above 90 grade it A+
//If the mark is between 80-89 grade it A
//If the mark is between 60-79 grade it B
//If the mark is between 40-59 grade it C
//If the mark is below 39 grade it F


public class Assignment9_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter the Maths marks of student"+i+ ":");
			int mark = sc.nextInt();
			String grade = calculateGrade(mark);
			System.out.println("Enter the grade:"+grade );
		}
		sc.close();
	}
	public static String calculateGrade(int mark) {
		
        if (mark > 90) {
            return "A+";
        } else if (mark >= 80 && mark <= 89) {
            return "A";
        } else if (mark >= 60 && mark <= 79) {
            return "B";
        } else if (mark >= 40 && mark <= 59) {
            return "C";
        } else {
            return "F";
        }
    }
	
}
