package studentManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {

	ArrayList<Student> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public StudentManagement() {

		list.add(new Student(101,"Hardik","Java",85));
		list.add(new Student(102,"Rohit","Python",78));
		list.add(new Student(103,"Virat","Data Science",92));

	}

	public void addStudent() {

		System.out.println("\n----- ADD NEW STUDENT -----");

		System.out.print("Enter Student ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Course: ");
		String course = sc.nextLine();

		System.out.print("Enter Marks: ");
		double marks = sc.nextDouble();

		list.add(new Student(id,name,course,marks));

		System.out.println("\nStudent Added Successfully");
	}

	public void displayStudents() {

		if(list.isEmpty()) {
			System.out.println("\nNo Student Records Found");
			return;
		}

		System.out.println("\n----- STUDENT LIST -----");
		System.out.println("ID        Name        Course        Marks");
		System.out.println("------------------------------------------------");

		for(Student s : list) {
			s.display();
		}
	}

	public void searchStudent() {

		System.out.print("\nEnter Student ID to Search: ");
		int id = sc.nextInt();

		for(Student s : list) {

			if(s.studentId == id) {

				System.out.println("\nStudent Found");
				System.out.println("ID        Name        Course        Marks");
				System.out.println("--------------------------------------------");

				s.display();
				return;
			}
		}

		System.out.println("\nStudent Not Found");
	}

	public void updateStudent() {

		System.out.print("\nEnter Student ID to Update: ");
		int id = sc.nextInt();

		for(Student s : list) {

			if(s.studentId == id) {

				sc.nextLine();

				System.out.print("Enter New Name: ");
				s.studentName = sc.nextLine();

				System.out.print("Enter New Course: ");
				s.course = sc.nextLine();

				System.out.print("Enter New Marks: ");
				s.marks = sc.nextDouble();

				System.out.println("\nStudent Updated Successfully");
				return;
			}
		}

		System.out.println("\nStudent Not Found");
	}

	public void deleteStudent() {

		System.out.print("\nEnter Student ID to Delete: ");
		int id = sc.nextInt();

		for(Student s : list) {

			if(s.studentId == id) {

				list.remove(s);
				System.out.println("\nStudent Deleted Successfully");
				return;
			}
		}

		System.out.println("\nStudent Not Found");
	}

	public void sortByName() {

		Collections.sort(list, Comparator.comparing(s -> s.studentName));

		System.out.println("\nStudents Sorted By Name");
		displayStudents();
	}

	public void sortByMarks() {

		Collections.sort(list, Comparator.comparingDouble(s -> s.marks));

		System.out.println("\nStudents Sorted By Marks");
		displayStudents();
	}
}