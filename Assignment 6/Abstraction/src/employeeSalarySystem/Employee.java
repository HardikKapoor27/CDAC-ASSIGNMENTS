package employeeSalarySystem;

public abstract class Employee {

	int empId;
	String name;

	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	abstract double calculateSalary();

	void displayEmployee() {
		System.out.println("Employee ID   : " + empId);
		System.out.println("Employee Name : " + name);
	}
}

class FullTimeEmployee extends Employee {

	double basic;
	double hra;
	double allowance;

	FullTimeEmployee(int empId, String name, double basic, double hra, double allowance) {
		super(empId, name);
		this.basic = basic;
		this.hra = hra;
		this.allowance = allowance;
	}

	double calculateSalary() {
		return basic + hra + allowance;
	}
}

class ContractEmployee extends Employee {

	int hoursWorked;
	double ratePerHour;

	ContractEmployee(int empId, String name, int hoursWorked, double ratePerHour) {
		super(empId, name);
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
	}

	double calculateSalary() {
		return hoursWorked * ratePerHour;
	}
}