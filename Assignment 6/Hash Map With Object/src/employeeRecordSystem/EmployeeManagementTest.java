package employeeRecordSystem;

import java.util.Scanner;

public class EmployeeManagementTest {

	public static void main(String[] args) {

		EmployeeManager em = new EmployeeManager();
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("=====================================");
		System.out.println("      EMPLOYEE RECORD MANAGEMENT");
		System.out.println("=====================================");

		do {

			System.out.println("\n----------- MENU -----------");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Display All Keys");
			System.out.println("7. Display All Values");
			System.out.println("8. Exit");

			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();

			switch(choice) {

			case 1:
				em.addEmployee();
				break;

			case 2:
				em.displayEmployees();
				break;

			case 3:
				em.searchEmployee();
				break;

			case 4:
				em.updateEmployee();
				break;

			case 5:
				em.deleteEmployee();
				break;

			case 6:
				em.displayKeys();
				break;

			case 7:
				em.displayValues();
				break;

			case 8:
				System.out.println("\nExiting Employee Management System...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 8);

		sc.close();
	}
}