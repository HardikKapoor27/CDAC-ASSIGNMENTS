package studentManagementSystem;

public class Student {

	int studentId;
	String studentName;
	String course;
	double marks;

	public Student(int studentId, String studentName, String course, double marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}

	public void display() {
		System.out.println(studentId + "        " + studentName + "        " + course + "        " + marks);
	}
}