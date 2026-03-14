package employeeRecordSystem;

public class Employee {

	int empId;
	String empName;
	String department;
	double salary;

	public Employee(int empId, String empName, String department, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}

	public void display() {
		System.out.println(empId + "        " + empName + "        " + department + "        " + salary);
	}
}