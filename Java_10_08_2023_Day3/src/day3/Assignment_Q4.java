package operators;


// Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,write two programs to swap the values of the two variables.
//****first program by using a third variable
//****second program without using any third variable( Swapping means interchanging the values of the two variables 
//E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)

public class Assignment_Q4 {
	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		System.out.println("Before Swapping: a =" + a +",b = " + b);
		
		//using a third variable
		int c=a;
		a=b;
		b=c;
//		System.out.println(a);
//		System.out.println(b);	
		System.out.println("After Swapping: a = " + a + ", b = " + b);
		
		
		//without using a third variable
		int x = 6;
		int y = 8;
		
		x= x+y; // 6+8 = 14
		y = x- y; // 14-8=6
		x = x - y;//14-6 =8
		
		System.out.println("Without third variable x:" +x  +",y :" +y);
		
		
	}

}
