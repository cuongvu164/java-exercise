import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int choose;
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
//            choose = ;
            switch (sc.nextInt()) {
                case 1:
                    m.DatatypeAndOperators();
                    break;
                case 2:
                    m.LogicalOperators(101, 122, 123, 111);
                    break;
                case 3:
                    m.ArithmeticOperators(121, 12, 123, 22, 23);
                    break;
                case 4:
                    m.CylinderComputation(4.4f,10);
                    break;
                default:
                    sc.close();
                    return;
            }
        }


    }

    public void DatatypeAndOperators() {
        System.out.println((101 + 0) / 3);
        System.out.println((3.0e-6 * 10000000.1));
        System.out.println((true && true));
        System.out.println((false && true));
        System.out.println(((false && false) || (true && true)));
        System.out.println((false || false) && (true && true));
    }

    public void LogicalOperators(int firstNumber, int secondNumber, int thirdNumber, int fourNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourNumber) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    public void ArithmeticOperators(int firstNumber, int secondNumber, int thirdNumber, int fourNumber, int fiveNumber) {
        System.out.println("The sum is " + (firstNumber + secondNumber + thirdNumber + fourNumber + fiveNumber));
    }

    public void CylinderComputation(float radius, float height){
        double baseArea = 2*Math.PI*Math.pow(radius,2);
        double surfaceArea = baseArea + 2*Math.PI*radius*height;
        double volume = Math.PI*Math.pow(radius,2)*height;
        System.out.println("Surface area = " + surfaceArea);
        System.out.println("Base area  = " + baseArea);
        System.out.println("Volume  = " + volume);
    }

    public static void menu() {
        System.out.println("=====================================================");
        System.out.println("1.Exercise 1");
        System.out.println("2.Exercise 2");
        System.out.println("3.Exercise 3");
        System.out.println("4.Exercise 4");
        System.out.println("Choose an option:");
    }
}
