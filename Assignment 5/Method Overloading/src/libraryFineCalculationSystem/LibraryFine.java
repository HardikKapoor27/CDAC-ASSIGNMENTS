package libraryFineCalculationSystem;

import java.util.Scanner;

public class LibraryFine {

	int noOfLateDays;

	void takeInput() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Late Days : ");
		noOfLateDays = sc.nextInt();
	}

	void calculateFine(int lateDays) {

		double totalFine = lateDays * 5;

		System.out.println("\nFine using Late Days : " + totalFine);
	}

	void calculateFine(int lateDays, double finePerDay) {

		double totalFine = lateDays * finePerDay;

		System.out.println("\nFine Per Day : " + finePerDay);
		System.out.println("Fine using Late Days + Per Day Fine : " + totalFine);
	}

	void calculateFine(int lateDays, double finePerDay, double penalty) {

		double totalFine = (lateDays * finePerDay) + penalty;

		System.out.println("\nAdditional Penalty : " + penalty);
		System.out.println("Fine using Late Days + Per Day Fine + Penalty : " + totalFine);
	}

}