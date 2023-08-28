package hybrid_hierachical;


//Write a program using inheritance.  (Use Method with parameters and return type)
//Class-1: Calculate the area for rectangle, circle and square.  
//Class-2: Calculate the peri-meter of rectangle, square and Circumference of the circle.  
//Class-3: Display all the result with their inputs
//Declare class 2 as final class.  

class AreaCalculator {
    double areaRectangle(double l, double w) {
        return l * w;
    }

    double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    double areaSquare(double side) {
        return side * side;
    }
}

final class PerimeterCalculator extends AreaCalculator {
    double perimeterRectangle(double l, double w) {
        return 2 * (l + w);
    }

    double perimeterSquare(double side) {
        return 4 * side;
    }

    double circumferenceCircle(double radius) {
        return 2 * Math.PI * radius;
    }
}

class Result {
    void areaResult(double area) {
        System.out.println("Area: " + area);
    }

    void perimeterResult(double perimeter) {
        System.out.println("Perimeter: " + perimeter);
    }
}


public class  Assignment14_Q4{
    public static void main(String[] args) {
    	
        AreaCalculator shapeCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        Result result = new Result();

        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        double circleRadius = 2.5;
        double squareSide = 4.0;

        double areaRectangle = shapeCalculator.areaRectangle(rectangleLength, rectangleWidth);
        double areaCircle = shapeCalculator.areaCircle(circleRadius);
        double areaSquare = shapeCalculator.areaSquare(squareSide);

        double perimeterRectangle = perimeterCalculator.perimeterRectangle(rectangleLength, rectangleWidth);
        double perimeterSquare = perimeterCalculator.perimeterSquare(squareSide);
        double circumferenceCircle = perimeterCalculator.circumferenceCircle(circleRadius);

        System.out.println("Area Results:");
        result.areaResult(areaRectangle);
        result.areaResult(areaCircle);  
        result.areaResult(areaSquare);

        System.out.println("\nPerimeter and Circumference Results:");
        result.perimeterResult(perimeterRectangle);
        result.perimeterResult(perimeterSquare);
        result.perimeterResult(circumferenceCircle);
    }
}


