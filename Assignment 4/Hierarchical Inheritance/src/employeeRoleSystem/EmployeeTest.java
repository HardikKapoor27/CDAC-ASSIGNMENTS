package employeeRoleSystem;

class EmployeeTest {

	public static void main(String[] args) {

		Developer d = new Developer(201, "Rahul", "Java");
		d.displayEmployee();
		d.showDeveloperDetails();

		System.out.println();

		Tester t = new Tester(301, "Sneha", "Selenium");
		t.displayEmployee();
		t.showTesterDetails();
	}
}