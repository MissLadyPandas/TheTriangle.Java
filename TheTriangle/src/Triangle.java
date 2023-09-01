//+------------------------------------------+
//|                 Triangle                 |
//|           extends GeometricObject        |
//+------------------------------------------+
//| -side1: double                           |
//| -side2: double                           |
//| -side3: double                           |
//+------------------------------------------+
//| +Triangle()                              |
//| +Triangle(side1: double, side2: double,  |
//|           side3: double)                 |
//| +getSide1(): double                      |
//| +getSide2(): double                      |
//| +getSide3(): double                      |
//| +getArea(): double                       |
//| +getPerimeter(): double                  |
//| +toString(): String                      |
//+------------------------------------------+


public class Triangle extends GeometricObject {
	// instance variable for sides
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }
    // constructor with sides
    public Triangle(double side1, double side2, double side3) {
    	//initialize the sides
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    // getter method for side1
    public double getSide1() {
        return side1;
    }

    // getter method for side2
    public double getSide2() {
        return side2;
    }

    // getter method for side3
    public double getSide3() {
        return side3;
    }

    // calucate area using Heron's formula to find area
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString method to return string representation
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
