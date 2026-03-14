package assignment1;

//Program 11: Calculate salary with bonus

class SalaryBonus {
 public static void main(String[] args) {

     double salary = 50000;
     double bonus;

     if(salary > 40000) {
         bonus = salary * 0.10;
     } else {
         bonus = salary * 0.05;
     }

     double finalSalary = salary + bonus;

     System.out.println("Final Salary: " + finalSalary);
 }
}