package exercise1;

public class Rectangle extends Shape {
    public float width, height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    void printResult() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
