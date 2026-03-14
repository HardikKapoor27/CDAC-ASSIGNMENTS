package bankAccountTransactionSystem;

public class BankApp {

	public static void main(String[] args) {

		BankManagement bm = new BankManagement();

		bm.numberOfAccounts();
		BankAccount[] b = bm.getAccounts();
		bm.allBankMethods(b);
	}
}