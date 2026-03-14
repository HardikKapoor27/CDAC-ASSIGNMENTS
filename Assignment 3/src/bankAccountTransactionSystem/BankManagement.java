package bankAccountTransactionSystem;

import java.util.Scanner;

public class BankManagement {

	int bn;
	Scanner sc = new Scanner(System.in);

	public int numberOfAccounts() {
		System.out.print("Enter number of accounts: ");
		bn = sc.nextInt();
		return bn;
	}

	public BankAccount[] getAccounts() {

		BankAccount[] b = new BankAccount[bn];

		for(int i=0;i<b.length;i++) {

			System.out.print("\nEnter Account Number: ");
			int acc = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Account Holder Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Balance: ");
			double bal = sc.nextDouble();

			b[i] = new BankAccount(acc,name,bal);
		}

		return b;
	}

	public void allBankMethods(BankAccount[] b) {

		for(int i=0;i<b.length;i++) {

			b[i].displayAccount();

			BankAccount.Transaction t = b[i].new Transaction();

			System.out.print("Enter deposit amount: ");
			double d = sc.nextDouble();
			t.deposit(d);

			System.out.print("Enter withdraw amount: ");
			double w = sc.nextDouble();
			t.withdraw(w);

			t.showBalance();
		}
	}
}