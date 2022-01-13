package exercise1;

public class Triangle extends Shape {
    public float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double p = getPerimeter() / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    @Override
    void printResult() {
        System.out.println("Side A:" + a);
        System.out.println("Side B:" + b);
        System.out.println("Side C:" + c);
    }
}
