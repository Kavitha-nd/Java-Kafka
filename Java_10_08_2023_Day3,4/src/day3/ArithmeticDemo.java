package day3;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// Arithmetic (Right to Left)
		int x = 10;
		System.out.println("Value of x is: "+ x);
		
		//Arithmetic Operators(+ - * / %)
		int a = 4;
		int b = 2;
		
		 
		System.out.println("Output of a + b :" + (a+b) );
		System.out.println("Output of a - b :" + (a-b));
		System.out.println("Output of a * b :" + (a*b) );
		System.out.println("Output of a / b :" + (a/b));
		System.out.println("Output of a % b :" + (a%b) );

		//Unary Operators
		int m = 5;
		System.out.println("value of --m is:" + (--m));
		System.out.println("value of m is:" + m);
		
		//Unary operator(!)
		boolean bool =true;
		System.out.println("Value of boolean value:" + bool);
		System.out.println("Value of boolean value:" + !bool);
		 
		// Combination Operators
		b += 3;
		System.out.println("value of b = b+3 is:" + b);
		
		//boolean 
		boolean result = (a == 4) && (b == 2);
		System.out.println(result);
		
		//Ternary operators
		int z = 9;
		int ternaryresult = (z == 9) ? 0 : -1;
		System.out.println(ternaryresult);

		//Bitwise Operators
		  int p=2;  // 0010
		  int q= 4;  // 0100
		  
		  System.out.println("Before Operation:" + p);
		  p = ~p;
		  System.out.println("After Operation:" + p);
		  
		
		
		
		
		
		
	}

}
