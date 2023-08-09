package day2;


//Initialize variables with all the data types supported by JAVA.
//followed with the appropriate value for the specified data type of the variable. 
//Log all the variable values along with the data type of respective variables.



public class Assignment_Q2 {
	public static void main(String[] args) {
		//Primitive
		boolean mybool = true;
		char  mychar = 'A';
		byte  mybyte = 12;
		byte  mybyte1 =-111;
		short myshort = 4567;
		int myint =2147483647;
		long mylong = 1276766466877554L;
		float myfloat = 12.7f;
		double mydoub = 12.435763455345d;
		
		//Non-Primitive
		String mystr = "Day2 of learning";
	
		
		// show data types of variables by using getClass() and getSimpleName() methods  
		System.out.println( mybool +" ------> Type is :"+((Object)mybool).getClass().getSimpleName());
		System.out.println( mychar +" -------> Type is :"+((Object)mychar).getClass().getSimpleName());
		System.out.println( mybyte + "," + mybyte1 +" ------> Type is :"+((Object)mybyte).getClass().getSimpleName());
		System.out.println( myshort+" ------> Type is :"+((Object)myshort).getClass().getSimpleName());
		System.out.println(mylong+" ------>Type is :"+((Object)mylong).getClass().getSimpleName());
		System.out.println(myint+" ------> Type is :"+((Object)myint).getClass().getSimpleName());
		System.out.println(myfloat+" ------> Type is :"+((Object)myfloat).getClass().getSimpleName());
		System.out.println(mydoub +" ------> Type is :"+((Object)mydoub).getClass().getSimpleName());
		System.out.println(mystr +" ------> Type is :"+((Object)mystr).getClass().getSimpleName());
		
		 		
		
	}

}
