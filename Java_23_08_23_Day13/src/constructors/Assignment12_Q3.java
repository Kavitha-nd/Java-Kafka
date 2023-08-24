package constructors;
//Create a static method which returns the maximum and minimum number of an array and a normal method to return the square root and cube of a given number. 
//Initialization will be done in construct
public class Assignment12_Q3 {
	//Instance Variable 'numbers' will hold array of integers 
	int[] numbers;

	//Constructor
	Assignment12_Q3(int[] numbers){
		this.numbers= numbers;
	}
	static int maximum(int[] arr) {
		  int max = arr[0];
		  for (int i = 1; i < arr.length; i++) {
			  if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	}
	static int minimum(int[] arr) {
		 int min = arr[0];
		 for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min; 
	}
	
	public double square(int num) {
		return  Math.sqrt(num);
		
	}
	
	public double cube(int num) {
		return  Math.pow(num,3);
		
		
	}
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		Assignment12_Q3 a = new Assignment12_Q3(numbers);
		
		int max = Assignment12_Q3.maximum(numbers);
		int min = Assignment12_Q3.minimum(numbers);
		
		System.out.println("Max: " + max +" &" + " Min: "+ min);
		
		
		int num = 3;
		System.out.println("Square: "+ a.square(num));
		System.out.println("Cube: "+ a.cube(num));
		

	}
	
}
