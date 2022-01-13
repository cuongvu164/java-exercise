package exercise2;

import java.util.Arrays;

public class Person {
    public static int[] bills;

    public Person(int[] bills) {
        this.bills = bills;
//        Wallet wallet = new Wallet(walletMoney);
//        wallet.compare(wallet.payMoney(walletMoney));
    }

    public static int calcTotal(int[] bills) {
        int total = Arrays.stream(bills).reduce(0, (sub, ele) -> sub + ele);
        return total;
    }

    public static class Wallet {
        public int total;

        public Wallet(int total) {
            this.total = total;
        }

        public boolean payMoney(int total){
            if (calcTotal(bills) < total) {
                return true;
            } else {
                return false;
            }
//            return calcTotal(bills) < total ? true : false;
        }
    }
}
