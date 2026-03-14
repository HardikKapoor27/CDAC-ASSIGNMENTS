package hotelRoomBookingSystem;

import java.util.Scanner;

public class RoomBooking {

	int days;

	void takeInput() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Days: ");
		days = sc.nextInt();
	}

	void calculateCost(int days) {

		int costPerDay = 1000;
		int totalCost = days * costPerDay;

		System.out.println("\nTotal Cost using Days: " + totalCost);
	}

	void calculateCost(int days, int costPerDay) {

		int totalCost = days * costPerDay;

		System.out.println("\nCost Per Day: " + costPerDay);
		System.out.println("Total Cost using Days + Cost Per Day: " + totalCost);
	}

	void calculateCost(int days, int costPerDay, int foodCharges) {

		int totalCost = (days * costPerDay) + foodCharges;

		System.out.println("\nFood Charges: " + foodCharges);
		System.out.println("Total Cost using Days + Cost Per Day + Food Charges: " + totalCost);
	}
}