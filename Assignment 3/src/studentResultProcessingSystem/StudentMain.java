package studentResultProcessingSystem;

public class StudentMain {

    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();

        sm.numberOfStudents();
        Student[] s = sm.getStudents();
        sm.allStudentMethods(s);
    }
}