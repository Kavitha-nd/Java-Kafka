package abstraction;

//Declare area and perimeter methods as abstract and define them in square class to calculate the area and perimeter of a square and in triangle class, 
//to calculate for triangle.  Print the result from the non-abstract method in super class. 


abstract class Shape{
	abstract double calculateArea();
    abstract double calculatePerimeter();

    void printAreaAndPerimeter() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}   

class Square extends Shape{
	
	double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	double calculateArea() {
		
		return side * side ;
	}

	@Override
	double calculatePerimeter() {
		
		return 4 * side;
	}
	
}
class Triangle extends Shape{
	double s1;
	double s2;
	double s3;
	
	public Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	
	}

	@Override
	double calculateArea() {
		 double s = (s1 + s2 + s3) / 2;
	     return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	@Override
	double calculatePerimeter() {
		
		return s1 + s2 + s3;
	}
	
}
public class Assignment18_Q1 {

	public static void main(String[] args) {
		Square square = new Square(2);
        System.out.println("Square:");
        square.printAreaAndPerimeter();

        System.out.println("--------------------");

        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Triangle:");
        triangle.printAreaAndPerimeter();

	}

}
