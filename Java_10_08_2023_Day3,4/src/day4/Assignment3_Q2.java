package day4;


//Write a JAVA program to list the properties of an object? 
public class Assignment3_Q2{      
    String name;  
    int salary;  
    boolean married;  
       
    public static void main(String args[]){    
          
        Assignment3_Q2 emp =new Assignment3_Q2();  
        emp.name = "kavitha";  
        emp.salary = 6000;  
        emp.married =true;  
         
        System.out.println(emp.name);    
        System.out.println(emp.salary);  
        System.out.println(emp.married);  
    }    
}  