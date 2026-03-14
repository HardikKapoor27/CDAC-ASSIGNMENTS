package bankAccountTransactionSystem;

public class BankAccount {

	int accountNumber;
	String accountHolderName;
	double balance;

	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void displayAccount() {
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}

	class Transaction {

		public void deposit(double amount) {
			balance += amount;
			System.out.println("Amount Deposited: " + amount);
		}

		public void withdraw(double amount) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Amount Withdrawn: " + amount);
			} else {
				System.out.println("Insufficient Balance");
			}
		}

		public void showBalance() {
			System.out.println("Updated Balance: " + balance);
			System.out.println("---------------------------");
		}
	}
}