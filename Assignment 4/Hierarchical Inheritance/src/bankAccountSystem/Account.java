package bankAccountSystem;

public class Account {

    int accountNumber;
    String customerName;

    public Account(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
    }
}

class SavingsAccount extends Account {

    double interestRate;

    public SavingsAccount(int accountNumber, String customerName, double interestRate) {
        super(accountNumber, customerName);
        this.interestRate = interestRate;
    }

    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
    }

    void calculateInterest() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {

    double overdraftLimit;

    public CurrentAccount(int accountNumber, String customerName, double overdraftLimit) {
        super(accountNumber, customerName);
        this.overdraftLimit = overdraftLimit;
    }

    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Current Account");
    }

    void displayOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}