package trainStationManagement;

import java.util.Scanner;

public class TrainStationTest {

	public static void main(String[] args) {

		TrainStationManager tm = new TrainStationManager();
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("=====================================");
		System.out.println("     TRAIN STATION MANAGEMENT");
		System.out.println("=====================================");

		do {

			System.out.println("\n----------- MENU -----------");
			System.out.println("1. Add Station");
			System.out.println("2. Display Stations");
			System.out.println("3. Add Station at Beginning");
			System.out.println("4. Add Station at End");
			System.out.println("5. Remove Station");
			System.out.println("6. Exit");

			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();

			switch(choice) {

			case 1:
				tm.addStation();
				break;

			case 2:
				tm.displayStations();
				break;

			case 3:
				tm.addStationAtBeginning();
				break;

			case 4:
				tm.addStationAtEnd();
				break;

			case 5:
				tm.removeStation();
				break;

			case 6:
				System.out.println("\nExiting Train Station System...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 6);

		sc.close();
	}
}