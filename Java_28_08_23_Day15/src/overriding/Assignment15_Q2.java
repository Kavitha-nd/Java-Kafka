package overriding;

import java.util.Scanner;

//Using hierarchical inheritance, achieve the method overriding to calculate the area of triangle and rectangle.
//Class-1: get the input for length and breadth for calculation


class Area{
	double area;
	
	void calculateArea() {
		System.out.println("Calcualting area: ");
	}
}

class Triangle extends Area{
	double height,base;
	
	void getinputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle: ");
		base = sc.nextDouble();
		
		System.out.println("Enter the height of triangke: ");
		height = sc.nextDouble();
	}
	@Override
	void calculateArea() {
		area = 0.5 * base * height;
		System.out.println("Area of Triangle : "+ area);
	}
}
class Rectangle extends Area{
	double length,width;
	
	void getinputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of rectangle: ");
		width = sc.nextDouble();
		
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextDouble();
	}
	
	void calculateArea() {
		area = length * width;
	    System.out.println("Area of Rectangle: "+ area);
	}
}
public class Assignment15_Q2 {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle();
		obj1.getinputs();
		obj1.calculateArea();
		
		Triangle obj2 = new Triangle();
		obj2.getinputs();
		obj2.calculateArea();

	}

}
