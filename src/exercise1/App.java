package exercise1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input width of Rectangle:");
        float width = sc.nextFloat();
        System.out.println("Input height of Rectangle:");
        float height = sc.nextFloat();
        System.out.println("Input radius of Circle:");
        float radius = sc.nextFloat();
        System.out.println("Input side A of Triangle:");
        float a = sc.nextFloat();
        System.out.println("Input side B of Triangle:");
        float b = sc.nextFloat();
        System.out.println("Input side C of Triangle:");
        float c = sc.nextFloat();

        Rectangle rectangle = new Rectangle(width, height);
        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(a, b, c);

        System.out.println("-----Rectangle-----");
        rectangle.printResult();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("-----Circle-----");
        circle.printResult();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("-----Triangle-----");
        triangle.printResult();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
