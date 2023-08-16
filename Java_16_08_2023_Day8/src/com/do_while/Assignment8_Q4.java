package com.do_while;

//Print 1 to 30 by skipping the multiples of 3.
public class Assignment8_Q4 {

	public static void main(String[] args) {
		int num=1;
		do {
			if(num%3 != 0) {
				System.out.print(num + " ");
			}
			num++;
			}while(num <= 30);	
	}

}


