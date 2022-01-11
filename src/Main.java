import java.util.*;

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
                    m.SumAverageRunningInt(1, 100);
                    break;
                case 2:
                    m.ArrayContains();
                    break;
                case 3:
                    m.FrequentNumber();
                    break;
                case 4:
                    m.ArrayReverse();
                    break;
                default:
                    sc.close();
                    return;
            }
        }


    }

    private void ArrayReverse() {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> reversedList = new ArrayList<>();

        System.out.println("Enter length of array ");
        int len = sc.nextInt();

        System.out.print("Enter item of array:");
        for (int i = 0; i < len; i++) {
            arrayList.add(sc.nextInt());
        }
        System.out.println("Original Array: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Reversed Array: " + arrayList);
    }

    private void FrequentNumber() {
        int i = 0, count = 0;
        List<Integer> newArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array ");
        int len = sc.nextInt();

        Integer[] array = new Integer[len];
        System.out.print("Enter item of array:");
        do {
            array[i] = sc.nextInt();
            i++;
        } while (i < len);

        System.out.print("Enter value:");
        int value = sc.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                count++;
                newArray.add(j);
            }
        }

        System.out.println("Amount of frequence: " + count);
        System.out.println("Indexs: " + newArray);
    }

    private void ArrayContains() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n = sc.nextInt();

        String[] stringArray = new String[n];
        System.out.print("Enter item of array:");
        for (int i = 0; i < n; i++) {
            stringArray[i] = sc.next();
        }
//        Arrays.stream(stringArray).forEach(item -> System.out.println(item));
        System.out.println("Enter a string variable ");
        String sValue = sc.next();

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(sValue)) {
                System.out.println("Check " + sValue + "in Array: Contained!");
                return;
            } else {
                System.out.println("Check '" + sValue + "' in Array: No Contain!");
                return;
            }
        }
    }

    private void SumAverageRunningInt(int firstNumber, int lastNumber) {
        int sum;
        List<Integer> array = new ArrayList<>();
        for (int i = firstNumber; i <= lastNumber; i++) {
            array.add(i);
        }
        sum = array
                .stream()
                .reduce(0, (sub, ele) -> sub + ele);
        System.out.println("Average: " + (sum / array.size()));
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
