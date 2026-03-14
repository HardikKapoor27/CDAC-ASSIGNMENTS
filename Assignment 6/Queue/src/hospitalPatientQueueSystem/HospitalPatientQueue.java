package hospitalPatientQueueSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HospitalPatientQueue {

	Queue<Patient> queue = new LinkedList<>();
	Scanner sc = new Scanner(System.in);

	public HospitalPatientQueue() {

		queue.add(new Patient(101, "Rohit", "Fever"));
		queue.add(new Patient(102, "Virat", "Cold"));
		queue.add(new Patient(103, "Hardik", "Cough"));

	}

	public void addPatient() {

		System.out.println("\n----- ADD NEW PATIENT -----\n");

		System.out.print("Enter Patient ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Patient Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Disease: ");
		String disease = sc.nextLine();

		Patient p = new Patient(id, name, disease);

		queue.add(p);

		System.out.println("\nPatient Added Successfully");
	}

	public void servePatient() {

		if(queue.isEmpty()) {
			System.out.println("\nNo patients in queue");
			return;
		}

		Patient p = queue.remove();

		System.out.println("\n----- SERVING PATIENT -----\n");
		System.out.println("ID        Name        Disease");
		System.out.println("--------------------------------");

		p.display();
	}

	public void nextPatient() {

		if(queue.isEmpty()) {
			System.out.println("\nNo patients in queue");
			return;
		}

		Patient p = queue.peek();

		System.out.println("\n----- NEXT PATIENT -----\n");
		System.out.println("ID        Name        Disease");
		System.out.println("--------------------------------");

		p.display();
	}

	public void displayAllPatients() {

		if(queue.isEmpty()) {
			System.out.println("\nNo patients waiting");
			return;
		}

		System.out.println("\n----- WAITING PATIENT LIST -----\n");
		System.out.println("ID        Name        Disease");
		System.out.println("--------------------------------");

		for(Patient p : queue) {
			p.display();
		}
	}
}