package studentResultProcessingSystem;

import java.util.Scanner;

public class StudentManagement {

	int sn;
	Scanner sc = new Scanner(System.in);

	public int numberOfStudents() {
		System.out.print("Enter number of students: ");
		sn = sc.nextInt();
		return sn;
	}

	public Student[] getStudents() {

		Student[] s = new Student[sn];

		for(int i=0;i<s.length;i++) {

			System.out.print("\nEnter Roll No: ");
			int r = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter Name: ");
			String n = sc.nextLine();

			System.out.print("Enter Marks: ");
			int m = sc.nextInt();

			s[i] = new Student(r,n,m);
		}

		return s;
	}

	public void allStudentMethods(Student[] s) {

		for(int i=0;i<s.length;i++) {

			s[i].displayStudent();

			Student.Result r = s[i].new Result();
			r.calculateGrade();
		}
	}
}