package onlinePaymentProcessingSystem;

import java.util.Scanner;

class PaymentGateway {

	int accountNumber;
	String accountHolderName;
	double amount;

	Scanner sc = new Scanner(System.in);

	void takeInput() {

		System.out.println("----------- ENTER ACCOUNT DETAILS -----------");

		System.out.print("Enter Payment Account Number: ");
		accountNumber = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Account Holder Name: ");
		accountHolderName = sc.nextLine();

		System.out.print("Enter Transaction Amount: ");
		amount = sc.nextDouble();

		System.out.println();
	}

	void displayAccountDetails(String paymentMode) {

		System.out.println("----------- ACCOUNT DETAILS -----------");
		System.out.println("Account Number       : " + accountNumber);
		System.out.println("Account Holder Name  : " + accountHolderName);
		System.out.println("Payment Mode         : " + paymentMode);
		System.out.println("Transaction Amount   : ₹" + amount);
		System.out.println();
	}
}

class CreditCardPayment extends PaymentGateway {

	long cardNumber;
	String expiryDate;
	int cvv;
	double serviceCharge;

	void processPayment() {

		sc.nextLine();

		System.out.println("----------- ENTER PAYMENT DETAILS -----------");

		System.out.print("Enter Credit Card Number: ");
		cardNumber = sc.nextLong();

		sc.nextLine();

		System.out.print("Enter Expiry Date (MM/YY): ");
		expiryDate = sc.nextLine();

		System.out.print("Enter CVV: ");
		cvv = sc.nextInt();

		System.out.println();
	}

	void printReceipt() {

		serviceCharge = amount * 0.02;
		double totalAmount = amount + serviceCharge;

		System.out.println("=========== CREDIT CARD PAYMENT RECEIPT ===========\n");

		displayAccountDetails("Credit Card");

		System.out.println("----------- CARD DETAILS -----------");
		System.out.println("Card Number          : " + cardNumber);
		System.out.println("Expiry Date          : " + expiryDate);
		System.out.println();

		System.out.println("----------- BILL SUMMARY -----------");
		System.out.println("Service Charge (2%)  : ₹" + serviceCharge);
		System.out.println("Total Amount Deducted: ₹" + totalAmount);

		System.out.println("\n✔ Credit Card Payment Successful\n");
	}
}

class UPIPayment extends PaymentGateway {

	String upiId;
	int upiPin;

	void processPayment() {

		sc.nextLine();

		System.out.println("----------- ENTER PAYMENT DETAILS -----------");

		System.out.print("Enter UPI ID: ");
		upiId = sc.nextLine();

		System.out.print("Enter UPI PIN: ");
		upiPin = sc.nextInt();

		System.out.println();
	}

	void printReceipt() {

		System.out.println("=========== UPI PAYMENT RECEIPT ===========\n");

		displayAccountDetails("UPI");

		System.out.println("----------- UPI DETAILS -----------");
		System.out.println("UPI ID              : " + upiId);
		System.out.println();

		System.out.println("----------- PAYMENT SUMMARY -----------");
		System.out.println("Amount Paid         : ₹" + amount);

		System.out.println("\n✔ UPI Payment Successful\n");
	}
}

class NetBankingPayment extends PaymentGateway {

	String bankName;
	String ifscCode;
	double transactionFee;

	void processPayment() {

		sc.nextLine();

		System.out.println("----------- ENTER PAYMENT DETAILS -----------");

		System.out.print("Enter Bank Name: ");
		bankName = sc.nextLine();

		System.out.print("Enter IFSC Code: ");
		ifscCode = sc.nextLine();

		System.out.println();
	}

	void printReceipt() {

		transactionFee = 10;
		double totalAmount = amount + transactionFee;

		System.out.println("=========== NET BANKING PAYMENT RECEIPT ===========\n");

		displayAccountDetails("Net Banking");

		System.out.println("----------- BANK DETAILS -----------");
		System.out.println("Bank Name           : " + bankName);
		System.out.println("IFSC Code           : " + ifscCode);
		System.out.println();

		System.out.println("----------- BILL SUMMARY -----------");
		System.out.println("Transaction Fee     : ₹" + transactionFee);
		System.out.println("Total Amount Deducted: ₹" + totalAmount);

		System.out.println("\n✔ Net Banking Payment Successful\n");
	}
}