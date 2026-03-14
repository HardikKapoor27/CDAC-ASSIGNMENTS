package employeeSalarySystem;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("      EMPLOYEE SALARY SYSTEM");
		System.out.println("=================================");

		System.out.println("\n----- FULL TIME EMPLOYEE -----");

		FullTimeEmployee f = new FullTimeEmployee(101, "Hardik", 50000, 10000, 5000);

		f.displayEmployee();
		System.out.println("Salary        : " + f.calculateSalary());


		System.out.println("\n----- CONTRACT EMPLOYEE -----");

		ContractEmployee c = new ContractEmployee(102, "Virat", 120, 500);

		c.displayEmployee();
		System.out.println("Salary        : " + c.calculateSalary());
	}
}