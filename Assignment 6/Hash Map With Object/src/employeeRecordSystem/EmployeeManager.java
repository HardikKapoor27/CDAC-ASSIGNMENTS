package employeeRecordSystem;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManager {

	HashMap<Integer, Employee> employees = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public EmployeeManager() {

		employees.put(101, new Employee(101,"Hardik","IT",60000));
		employees.put(102, new Employee(102,"Virat","Finance",75000));
		employees.put(103, new Employee(103,"Rohit","HR",55000));

	}

	public void addEmployee() {

		System.out.println("\n----- ADD EMPLOYEE -----");

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Department: ");
		String dept = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		employees.put(id, new Employee(id,name,dept,salary));

		System.out.println("\nEmployee Added Successfully");
	}

	public void displayEmployees() {

		if(employees.isEmpty()) {
			System.out.println("\nNo Employee Records Found");
			return;
		}

		System.out.println("\n----- EMPLOYEE LIST -----");
		System.out.println("ID        Name        Department        Salary");
		System.out.println("------------------------------------------------");

		for(Employee e : employees.values()) {
			e.display();
		}
	}

	public void searchEmployee() {

		System.out.print("\nEnter Employee ID to Search: ");
		int id = sc.nextInt();

		Employee e = employees.get(id);

		if(e != null) {

			System.out.println("\nEmployee Found");
			System.out.println("ID        Name        Department        Salary");
			System.out.println("------------------------------------------------");

			e.display();
		}
		else {
			System.out.println("\nEmployee Not Found");
		}
	}

	public void updateEmployee() {

		System.out.print("\nEnter Employee ID to Update: ");
		int id = sc.nextInt();

		Employee e = employees.get(id);

		if(e != null) {

			sc.nextLine();

			System.out.print("Enter New Name: ");
			e.empName = sc.nextLine();

			System.out.print("Enter New Department: ");
			e.department = sc.nextLine();

			System.out.print("Enter New Salary: ");
			e.salary = sc.nextDouble();

			System.out.println("\nEmployee Updated Successfully");
		}
		else {
			System.out.println("\nEmployee Not Found");
		}
	}

	public void deleteEmployee() {

		System.out.print("\nEnter Employee ID to Delete: ");
		int id = sc.nextInt();

		if(employees.remove(id) != null) {
			System.out.println("\nEmployee Deleted Successfully");
		}
		else {
			System.out.println("\nEmployee Not Found");
		}
	}

	public void displayKeys() {

		System.out.println("\nEmployee IDs (Keys):");

		for(Integer id : employees.keySet()) {
			System.out.println(id);
		}
	}

	public void displayValues() {

		System.out.println("\nEmployee Records (Values):");

		for(Employee e : employees.values()) {
			e.display();
		}
	}
}