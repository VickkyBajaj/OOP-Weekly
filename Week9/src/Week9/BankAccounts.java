package Week9;

public class BankAccounts {

    // Inner class representing a bank account
    static class LLBankAccount {
        private String name;
        private int accNumber;
        private double balance;

        public LLBankAccount(String name, int accNumber) {
            this.name = name;
            this.accNumber = accNumber;
            this.balance = 0.0;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited " + amount + " into account number " + accNumber);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds in account number " + accNumber);
            } else if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from account " + accNumber);
            }
        }

        public void addInterest() {
            balance += balance * 0.03;
        }

        public void display() {
            System.out.printf("Account: %d, Name: %s, Balance: %.2f%n", accNumber, name, balance);
        }
    }

    // Main method
    public static void main(String[] args) {
        LLBankAccount[] customers = new LLBankAccount[30];

        customers[0] = new LLBankAccount("Vickky Bajaj", 5550);
        customers[1] = new LLBankAccount("Sanskar Paudel", 5551);

        customers[0].deposit(1500);
        customers[1].deposit(2000);

        customers[0].withdraw(1400);
        customers[1].withdraw(2500); // Invalid - Insufficient funds

        customers[0].addInterest();
        customers[1].addInterest();

        customers[0].display();
        customers[1].display();
    }
}
