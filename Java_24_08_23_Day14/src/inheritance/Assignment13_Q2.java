package inheritance;

import java.util.Scanner;

//Write a program using Multi_level inheritance. (Use Method with parameters and return type)
//Class-1: Calculate the area for rectangle, circle and square.  
//Class-2: Calculate the peri_meter of rectangle, square and Circumference of the circle.  
//Class-3: Display all the result with their inputs like:
//OUTPUT:
//Rectangle: 
//Inputs: input1, input2,...
//Area: result
//Peri_meter: result


class Rectangle{
	//l for length , w for width 
	public double areaRectangle(int l,int w) {
		return l * w;	
	}	
	public double perimeterRectangle(int l,int w) {
		return 2 *(l + w);
	}
}
class Circle extends Rectangle{
	double pi = 3.14;
	public double areaCircle(double r) {
		return pi * r * r;
	}
	public double circumferenceCircle(double r){
		return 2 * pi * r;
	}
	
}

class Square extends Circle{
	public double areaSquare(double side) {
		return side * side;
	}
	public double perimeterSquare(double side) {
		return 4 * side;
	}
}

public class Assignment13_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length:");
		int length = sc.nextInt();
		System.out.println("Enter width:");
		int width = sc.nextInt();
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		System.out.println("Enter side:");
		double side = sc.nextDouble();
			
		Square s = new Square();
		
		System.out.println("Area of rectangle: " + s.areaRectangle(length,width));
		System.out.println("Area of circle: " + s.areaCircle(radius));
		System.out.println("Area of side: " + s.areaSquare(side));
		
		System.out.println("Perimeter of rectangle: " + s.perimeterRectangle(length, width));
		System.out.println("Circumference of circle: " + s.circumferenceCircle(radius));
		System.out.println("Perimeter of Square: "+ s.perimeterSquare(side));
		
		
		sc.close();
	}

}
