package day4;


//Write a JAVA a program to delete the roll no property from the following object. 
//Also, print the object before and after deleting the property
//Sample Object - 
//{name : " happy ", class : "XII", roll no : 12 };

import org.json.JSONObject;

public class Assignment3_Q3 {
	  
	public static  void main(String[] args) {
		JSONObject obj1 = new JSONObject();
		
		obj1.put("name","kavi");
		obj1.put("class", "XII");
		obj1.put("roll no", 12);
		System.out.println("Object before deleting property:"+ obj1);
		
		obj1.remove("roll no");
		System.out.println("Object After deleting property:"+obj1);
	
		
	}

}