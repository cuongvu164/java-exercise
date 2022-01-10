import java.util.Scanner;

public class Main {
    public static void main(String argv[]) {
        int choose;
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
//            choose = ;
            switch (sc.nextInt()) {
                case 1:
                    m.ArithmeticExercise1();
                    break;
                case 2:
                    m.ArithmeticExercise2(125, 24);
                    break;
                case 3:
                    m.JavaExercise();
                    break;
                case 4:
                    m.ArithmeticExercise3();
                    break;
                case 5:
                    m.CircleExercise(7.5f);
                    break;
                case 6:
                    m.RectangleExercise(5.5f, 8.5f);
                    break;
                case 7:
                    m.LogicalExercise(25, 39);
                    break;
                default:
                    sc.close();
                    break;
            }
        }


    }

    public void LogicalExercise(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber) {
            System.out.println(firstNumber + "!=" + secondNumber);
        }
        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + "<=" + secondNumber);
        }
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + ">" + secondNumber);
        }
    }

    public void RectangleExercise(float width, float height) {
        System.out.println("Perimeter is = " + (width + height) * 2);
        System.out.println("Area is = " + width * height);
    }

    public void CircleExercise(float radius) {
        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius, 2)));
    }

    public void ArithmeticExercise1() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public void ArithmeticExercise2(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
        System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber * secondNumber);
        System.out.println(firstNumber + "/" + secondNumber + "=" + firstNumber / secondNumber);
        System.out.println(firstNumber + "%" + secondNumber + "=" + firstNumber % secondNumber);
    }

    public void JavaExercise() {

    }

    public void ArithmeticExercise3() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void menu() {
        System.out.println("=====================================================");
        System.out.println("1.Exercise 1");
        System.out.println("2.Exercise 2");
        System.out.println("3.Exercise 3");
        System.out.println("4.Exercise 4");
        System.out.println("5.Exercise 5");
        System.out.println("6.Exercise 6");
        System.out.println("7.Exercise 7");
        System.out.println("Choose an option:");
    }
}
