package studentAcademicSystem;

//Class 1: Student
public class Student {

	int rollNo;
	String name;

	void displayStudent() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
	}
}

//Class 2: Exam (inherits Student)
class Exam extends Student {

	int mark1;
	int mark2;

	void displayMarks() {
		System.out.println("Marks: " + mark1 + " " + mark2);
	}
}

//Class 3: Result (inherits Exam)
class Result extends Exam {

	int total;
	char grade;

	void calculateTotal() {
		total = mark1 + mark2;
	}

	void calculateGrade() {
		int avg = total / 2;

		if(avg >= 80)
			grade = 'A';
		else if(avg >= 60)
			grade = 'B';
		else if(avg >= 40)
			grade = 'C';
		else
			grade = 'F';
	}

	void displayResult() {
		System.out.println("Total Marks: " + total);
		System.out.println("Grade: " + grade);
	}
}