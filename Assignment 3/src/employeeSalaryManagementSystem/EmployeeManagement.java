package employeeSalaryManagementSystem;

import java.util.Scanner;

public class EmployeeManagement {

	int en;
	Scanner sc = new Scanner(System.in);

	public int numberOfEmployees() {
		System.out.print("Enter number of employees: ");
		en = sc.nextInt();
		return en;
	}

	public Employee[] getEmployees() {

		Employee[] e = new Employee[en];

		for (int i = 0; i < e.length; i++) {

			System.out.print("\nEnter Employee ID: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Basic Salary: ");
			double salary = sc.nextDouble();

			e[i] = new Employee(id, name, salary);
		}

		return e;
	}

	public void allEmployeeMethods(Employee[] e) {

		for (int i = 0; i < e.length; i++) {

			e[i].displayEmployee();

			Employee.SalaryCalculator sc = e[i].new SalaryCalculator();
			sc.calculateSalary();
		}
	}
}