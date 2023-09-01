import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
    	// scanner object to find user input
        Scanner scanner = new Scanner(System.in);

        // input the sides
        System.out.println("Enter the sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // create the triangle object
        Triangle triangle = new Triangle(side1, side2, side3);

        // input for color
        System.out.println("Enter the color of the triangle:");
        String color = scanner.next();
        triangle.setColor(color);

        // input for if triangle is filled, true/false
        System.out.println("Is the triangle filled? (true/false)");
        boolean filled = scanner.nextBoolean();
        triangle.setFilled(filled);

        // return the details of the triangle
        System.out.println("Details of the triangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
