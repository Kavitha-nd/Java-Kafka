package day4;

public class Assignment4_Q2 {
	public static void main(String[] args) {
		String A1 = "Java";
		String A2 = "Python";
		System.out.println("A1:" +A1);
		System.out.println("A2:" +A2);
		
		String A3 = new String("My String Operation Program") ;
		//a. Calculate length A1.
		int lengthA1 = A1.length();
		System.out.println("Length of A1:"+ lengthA1);


		//b .Combine A2 and A3.
		String combined = A2 + A3;
		System.out.println("Combined A2 + A3:"+combined);
		
		
		//c. Print “Operation” from variable A3.
		String substring = A3.substring(10,19);
		System.out.println("Substring 'Operation' from A3: " + substring);
		
		
		//d. Replace “My” with “our” from variable A3.
		String  replace = A3.replace("My", "Our");
		System.out.println("Replacing my with our:" + replace);
		
		// e.Find the index of the letter ‘P’ from variable A1
		int index = A1.indexOf('J');
		System.out.println("Index of 'J':"+index);
				
		//f. Compare A1 and A2.
		System.out.println("Compare " +A1+ " and " +A2+ ":"+A1.equals(A2) );
		
		//g. Change variable A3 to lower case and store it in a new variable A4
		String A4 = A3.toLowerCase();
		System.out.println("A3 to lower case: "+ A4);
		
		//h .Change variable A4 to upper case and store it in a new variable A5
		String A5 = A4.toUpperCase();
		System.out.println("A3 to upper case: "+ A5);
		
		// i. Print the hash code of the variable A5.
		int hashcode = A5.hashCode();
		System.out.println("Hash code of A5:"+hashcode);
	}
	
}
