import java.util.*;

public class Main {
    public static void main(String argv[]) throws Exception {
        int choose;
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
//            choose = ;
            switch (sc.nextInt()) {
                case 1:
//                    m.SumAverageRunningInt(1, 100);
                    break;
                case 2:
                    m.BMI();
                    break;
                default:
                    sc.close();
                    return;
            }
        }
    }

//    public double calculate(double a, VectorOperators.Operator operator, double b){
//        return 0;
//    }

    public void BMI() {
        Scanner sc = new Scanner(System.in);
        double weight = 0, height = 0;
        inputHeightAndWeight(sc, false, false, weight, height);
    }

    public void inputHeightAndWeight(Scanner sc, boolean doneWeight, boolean doneHeight, double height, double weight) {
        while (!doneWeight) {
            try {
                System.out.print("Enter Weight:");
                weight = Double.parseDouble(sc.nextLine());
                doneWeight = true;
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit");
            }
        }

        while (!doneHeight) {
            try {
                System.out.print("Enter Height:");
                height = Double.parseDouble(sc.nextLine());
                if (height <= 0) throw new ArithmeticException();
                doneHeight = true;
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit");
            } catch (ArithmeticException e) {
                System.out.println("Height must be great than 0");
            }
        }

        System.out.println("BMI Number: " + calculateBMI(weight, height));
        System.out.print("BMI Status: ");
        System.out.println(statusBMI.getValue(calculateBMI(weight, height)));

    }

    public double calculateBMI(double weight, double height) {
        return (weight / Math.pow(height, 2)) * 10000;
    }

    public enum statusBMI {
        SUBSTANDARD, STANDARD, OVERWEIGHT, FAT, OBESE;
        statusBMI() {}

        public static statusBMI getValue(double indexBMI) {
            if (indexBMI < 19) {
                return SUBSTANDARD;
            } else if (indexBMI >= 19 && indexBMI < 25) {
                return STANDARD;
            } else if (indexBMI >= 25 && indexBMI < 30) {
                return OVERWEIGHT;
            } else if (indexBMI >= 30 && indexBMI < 40) {
                return FAT;
            } else {
                return OBESE;
            }
        }
    }

    public static void menu() {
        System.out.println("=====================================================");
        System.out.println("1.Normal Calculator");
        System.out.println("2.BMI Calculator");
        System.out.println("3.Exit");
        System.out.println("Choose an option:");
    }
}
