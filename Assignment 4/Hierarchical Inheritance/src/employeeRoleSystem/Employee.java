package employeeRoleSystem;

public class Employee {

	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	void displayEmployee() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Name: " + empName);
	}
}

class Developer extends Employee {

	String programmingLanguage;

	public Developer(int empId, String empName, String programmingLanguage) {
		super(empId, empName);
		this.programmingLanguage = programmingLanguage;
	}

	void showDeveloperDetails() {
		System.out.println("Programming Language: " + programmingLanguage);
	}
}

class Tester extends Employee {

	String testingTool;

	public Tester(int empId, String empName, String testingTool) {
		super(empId, empName);
		this.testingTool = testingTool;
	}

	void showTesterDetails() {
		System.out.println("Testing Tool: " + testingTool);
	}
}