package studentManagementSystem;

import java.util.Scanner;

public class StudentManagementTest {

	public static void main(String[] args) {

		StudentManagement sm = new StudentManagement();
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("=======================================");
		System.out.println("        STUDENT MANAGEMENT SYSTEM");
		System.out.println("=======================================");
		
		do {

			System.out.println("\n----------MENU----------\n");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Sort Students By Name");
			System.out.println("7. Sort Students By Marks");
			System.out.println("8. Exit");

			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();

			switch(choice) {

			case 1:
				sm.addStudent();
				break;

			case 2:
				sm.displayStudents();
				break;

			case 3:
				sm.searchStudent();
				break;

			case 4:
				sm.updateStudent();
				break;

			case 5:
				sm.deleteStudent();
				break;

			case 6:
				sm.sortByName();
				break;

			case 7:
				sm.sortByMarks();
				break;

			case 8:
				System.out.println("\nExiting Student Management System...");
				break;

			default:
				System.out.println("\nInvalid Choice");
			}

		} while(choice != 8);

		sc.close();
	}
}