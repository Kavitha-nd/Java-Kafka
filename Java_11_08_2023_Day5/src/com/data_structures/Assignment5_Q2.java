package com.data_structures;
//Define an array “sampleArray” with following values. 10,13,12,11,16
//Add 20 and 25 to the sampleArray to the end of the array and print the whole array without loop
//Remove 25 from the sampleArray and print the whole array without loop
//Sort the array sampleArray
//Print the index of 13 from sampleArray



import java.util.Arrays;
public class Assignment5_Q2 {
	public static void main(String[] args) {
		
		int[] sampleArrayElement = {10,13,12,11,16};
		
		int[] addArray = Arrays.copyOf(sampleArrayElement,sampleArrayElement.length + 2);
		addArray[addArray.length - 2] = 20;
		addArray[addArray.length - 1] = 25;
		
		System.out.println("Array after adding elements:" +Arrays.toString(addArray));
		
		// Remove 25 from the array
        int[] removeArray= new int[addArray.length - 1];
        System.arraycopy(addArray, 0, removeArray, 0, removeArray.length);

        System.out.println("Array after removing 25:"+ Arrays.toString(removeArray));
        
        
        //Sort the array sampleArray
        Arrays.sort(removeArray);

        System.out.println("Array after sorting:"+ (Arrays.toString(removeArray)));
       
     // Print the index of 13 in the array
        int index = Arrays.binarySearch(removeArray, 13);
        System.out.println("Index of 13: " + (index >= 0 ? index : "not found"));// ternary operator
      
        }
		
	}


