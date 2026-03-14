package hospitalPatientQueueSystem;

import java.util.Scanner;

public class PatientQueueTest {

	public static void main(String[] args) {

		HospitalPatientQueue hpq = new HospitalPatientQueue();

		Scanner sc = new Scanner(System.in);
		int choice;

		System.out.println("======================================");
		System.out.println("     HOSPITAL PATIENT QUEUE SYSTEM");
		System.out.println("======================================");
		
		do {

			System.out.println("\n----------MENU----------\n");
			System.out.println("1. Add Patient");
			System.out.println("2. Serve Patient");
			System.out.println("3. Display Next Patient");
			System.out.println("4. Display All Waiting Patients");
			System.out.println("5. Exit");

			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();

			switch(choice) {

			case 1:
				hpq.addPatient();
				break;

			case 2:
				hpq.servePatient();
				break;

			case 3:
				hpq.nextPatient();
				break;

			case 4:
				hpq.displayAllPatients();
				break;

			case 5:
				System.out.println("\nExiting Patient Management System...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 5);

		sc.close();
	}
}