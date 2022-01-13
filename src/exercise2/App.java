package exercise2;

import exercise2.Person.Wallet;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of bill");
        int n = sc.nextInt();
        int[] bills = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("input value of bill " + (i + 1) + ":");
            bills[i] = sc.nextInt();
        }

        System.out.print("Input value of wallet: ");
        int wallet = sc.nextInt();

        Person person = new Person(bills);
        System.out.print("This is total of bill: " + person.calcTotal(bills));

        Wallet test = new Wallet(wallet);
        boolean test2 = test.payMoney(wallet);
        if (test2) {
            System.out.println("\nYou can buy it");
        } else {
            System.out.println("\nYou can't buy it");
        }

    }
}
