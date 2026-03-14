package bankAccountSystem;

public class BankTest {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(12345, "Kumar", 5);
        s.displayAccountInfo();
        s.calculateInterest();

        System.out.println();

        CurrentAccount c = new CurrentAccount(67890, "Meena", 50000);
        c.displayAccountInfo();
        c.displayOverdraftLimit();
    }
}
