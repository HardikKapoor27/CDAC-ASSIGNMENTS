package onlineFoodOrderingSystem;

import java.util.Scanner;

class FoodOrder {

	int orderId;
	String customerName;
	double price;
	double gst;
	double totalBill;

	Scanner sc = new Scanner(System.in);

	void takeInput() {

		System.out.print("\nEnter Order ID: ");
		orderId = sc.nextInt();

		sc.nextLine();

		System.out.print("\nEnter Customer Name: ");
		customerName = sc.nextLine();

		System.out.print("\nEnter Total Food Item Price: ");
		price = sc.nextDouble();
	}

	void calculateBill() {

		gst = price * 0.05;
		totalBill = price + gst;
	}

	void displayOutput(String orderType) {

		System.out.println("\nOrder ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Order Type: " + orderType);
		System.out.println("Food Price: " + price);
	}
}

class DineInOrder extends FoodOrder {

	double serCharge;

	void calculateBill() {

		gst = price * 0.05;
		serCharge = price * 0.10;
		totalBill = price + gst + serCharge;
	}

	void displayDineInOrder() {

		System.out.println("Service Charge: " + serCharge);
		System.out.println("GST: " + gst);
		System.out.println("Total Bill Amount: " + totalBill);
	}
}

class TakeAwayOrder extends FoodOrder {

	double packCharge;

	void calculateBill() {

		gst = price * 0.05;
		packCharge = price * 0.025;
		totalBill = price + gst + packCharge;
	}

	void displayTakeAwayOrder() {

		System.out.println("GST: " + gst);
		System.out.println("Packaging Charge: " + packCharge);
		System.out.println("Total Bill Amount: " + totalBill);
	}
}

class HomeDeliveryOrder extends FoodOrder {

	double packCharge;
	double deliveryCharge;

	void calculateBill() {

		gst = price * 0.05;
		packCharge = price * 0.025;
		deliveryCharge = price * 0.08;

		totalBill = price + gst + packCharge + deliveryCharge;
	}

	void displayDeliveryOrder() {

		System.out.println("GST: " + gst);
		System.out.println("Packaging Charge: " + packCharge);
		System.out.println("Delivery Charge: " + deliveryCharge);
		System.out.println("Total Bill Amount: " + totalBill);
	}
}