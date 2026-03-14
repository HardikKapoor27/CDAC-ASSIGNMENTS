package trainStationManagement;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainStationManager {

	LinkedList<Station> stations = new LinkedList<>();
	Scanner sc = new Scanner(System.in);

	public TrainStationManager() {

		stations.add(new Station(101,"Delhi","08:00 AM"));
		stations.add(new Station(102,"Agra","09:30 AM"));
		stations.add(new Station(103,"Gwalior","11:00 AM"));

	}

	public void addStation() {

		System.out.println("\n----- ADD NEW STATION -----");

		System.out.print("Enter Station ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Station Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Arrival Time: ");
		String time = sc.nextLine();

		stations.add(new Station(id,name,time));

		System.out.println("\nStation Added Successfully");
	}

	public void addStationAtBeginning() {

		System.out.println("\n----- ADD STATION AT BEGINNING -----");

		System.out.print("Enter Station ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Station Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Arrival Time: ");
		String time = sc.nextLine();

		stations.addFirst(new Station(id,name,time));

		System.out.println("\nStation Added At Beginning");
	}

	public void addStationAtEnd() {

		System.out.println("\n----- ADD STATION AT END -----");

		System.out.print("Enter Station ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Station Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Arrival Time: ");
		String time = sc.nextLine();

		stations.addLast(new Station(id,name,time));

		System.out.println("\nStation Added At End");
	}

	public void removeStation() {

		System.out.print("\nEnter Station ID to Remove: ");
		int id = sc.nextInt();

		for(Station s : stations) {

			if(s.stationId == id) {
				stations.remove(s);
				System.out.println("\nStation Removed Successfully");
				return;
			}
		}

		System.out.println("\nStation Not Found");
	}

	public void displayStations() {

		if(stations.isEmpty()) {
			System.out.println("\nNo Stations Available");
			return;
		}

		System.out.println("\n----- TRAIN STATION LIST -----");
		System.out.println("ID        Station Name        Arrival Time");
		System.out.println("------------------------------------------------");

		for(Station s : stations) {
			s.display();
		}
	}
}