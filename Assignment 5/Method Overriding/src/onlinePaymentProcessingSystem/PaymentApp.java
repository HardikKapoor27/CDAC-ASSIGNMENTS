package onlinePaymentProcessingSystem;

public class PaymentApp {

	public static void main(String[] args) {

		System.out.println("==============================================");
		System.out.println("            CREDIT CARD PAYMENT");
		System.out.println("==============================================\n");

		CreditCardPayment c = new CreditCardPayment();
		c.takeInput();
		c.processPayment();
		c.printReceipt();



		System.out.println("\n==============================================");
		System.out.println("                UPI PAYMENT");
		System.out.println("==============================================\n");

		UPIPayment u = new UPIPayment();
		u.takeInput();
		u.processPayment();
		u.printReceipt();



		System.out.println("\n==============================================");
		System.out.println("             NET BANKING PAYMENT");
		System.out.println("==============================================\n");

		NetBankingPayment n = new NetBankingPayment();
		n.takeInput();
		n.processPayment();
		n.printReceipt();

	}
}