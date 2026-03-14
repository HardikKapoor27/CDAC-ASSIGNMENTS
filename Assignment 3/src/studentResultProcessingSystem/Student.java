package studentResultProcessingSystem;

public class Student {

    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    class Result {

        public void calculateGrade() {

            char grade;

            if(marks >= 80)
                grade = 'A';
            else if(marks >= 60)
                grade = 'B';
            else if(marks >= 40)
                grade = 'C';
            else
                grade = 'F';

            System.out.println("Grade: " + grade);
            System.out.println("---------------------------");
        }
    }
}