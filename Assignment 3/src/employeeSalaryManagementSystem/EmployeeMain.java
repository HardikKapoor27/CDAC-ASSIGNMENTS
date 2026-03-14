package employeeSalaryManagementSystem;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.numberOfEmployees();
        Employee[] e = em.getEmployees();
        em.allEmployeeMethods(e);
    }
}