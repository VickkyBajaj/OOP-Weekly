package Week5_6;

import java.text.NumberFormat;

class Account {
    private final double RATE = 0.035; // Interest rate of 3.5%

    private String name;
    private long acctNumber;
    private double balance;

    // Constructor with name, account number, and initial balance
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    // New constructor with name and account number (default balance = 0)
    public Account(String owner, long account) {
        name = owner;
        acctNumber = account;
        balance = 0.0;
    }

    // Deposit method
    public double deposit(double amount) {
        if (amount > 0)
            balance += amount;
        return balance;
    }

    // Withdraw method
    public double withdraw(double amount, double fee) {
        if (amount + fee > 0 && amount + fee < balance)
            balance -= (amount + fee);
        return balance;
    }

    // Add interest method
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }

    // toString method for displaying account details
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}

public class Transactions {
    public static void main(String[] args) {
        // Creating accounts using both constructors
        Account acc1 = new Account("Vickky Bajaj", 1001, 500.00); // With initial balance
        Account acc2 = new Account("Sanskar Paudel", 1002); // Default balance = 0

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        System.out.println(acc1);
        System.out.println(acc2);

        // Performing some transactions
        acc1.deposit(250);
        acc2.deposit(300); // Depositing in an account that started with 0 balance
        acc2.withdraw(100, 2);

        // Adding interest to both accounts
        acc1.addInterest();
        acc2.addInterest();

        // Displaying final account details after transactions
        System.out.println("\nFinal Account Details After Transactions:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}


