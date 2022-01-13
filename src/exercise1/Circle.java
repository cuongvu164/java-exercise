package exercise1;

public class Circle extends Shape {
    public float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void printResult() {
        System.out.println("Radius:" + radius);
    }
}
