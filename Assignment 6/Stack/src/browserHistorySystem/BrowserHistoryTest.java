package browserHistorySystem;

import java.util.Scanner;

public class BrowserHistoryTest {

	public static void main(String[] args) {

		BrowserHistory bh = new BrowserHistory();
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("=================================");
		System.out.println("      BROWSER HISTORY SYSTEM");
		System.out.println("=================================");

		do {

			System.out.println("\n----------- MENU -----------");
			System.out.println("1. Visit Page");
			System.out.println("2. Go Back");
			System.out.println("3. Display Current Page");
			System.out.println("4. Display Browser History");
			System.out.println("5. Exit");

			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {

			case 1:
				bh.visitPage();
				break;

			case 2:
				bh.goBack();
				break;

			case 3:
				bh.currentPage();
				break;

			case 4:
				bh.displayHistory();
				break;

			case 5:
				System.out.println("\nExiting Browser History System...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 5);

		sc.close();
	}
}