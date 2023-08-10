package day4;

public class Practice {
	public static void main(String[] args) {
		String s1 = new String("Simplelearn");
		String s2 = new String("Practice");
		
		System.out.println("Compare " +s1+ " and " +s2+ ":"+s1.equals(s2) );
		
		StringBuilder  s3 = new StringBuilder("apple")	;
		s3 .append(s3);
		System.out.println(s3);
		s3 = s3. reverse();
		System.out.println(s3);
		
	}

}
