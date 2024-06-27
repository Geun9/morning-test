package test_20240627.classtest.account;

public class Account {

    private static int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        if (balance >= MIN_BALANCE && MAX_BALANCE >= balance) {
            Account.balance = balance;
        }
    }
}
