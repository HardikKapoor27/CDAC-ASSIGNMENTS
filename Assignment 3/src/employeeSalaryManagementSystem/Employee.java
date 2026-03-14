package employeeSalaryManagementSystem;

public class Employee {

	int empId;
	String empName;
	double basicSalary;

	public Employee(int empId, String empName, double basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public void displayEmployee() {
		System.out.println("\nEmployee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Basic Salary: " + basicSalary);
	}

	class SalaryCalculator {

		public void calculateSalary() {

			double hra = basicSalary * 0.20;
			double da = basicSalary * 0.10;
			double total = basicSalary + hra + da;

			System.out.println("HRA: " + hra);
			System.out.println("DA: " + da);
			System.out.println("Total Salary: " + total);
			System.out.println("----------------------------");
		}
	}
}