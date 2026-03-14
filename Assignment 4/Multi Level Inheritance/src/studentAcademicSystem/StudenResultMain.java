package studentAcademicSystem;

public class StudenResultMain {

	public static void main(String[] args) {

		Result r = new Result();

		r.rollNo = 21;
		r.name = "Arun";
		r.mark1 = 85;
		r.mark2 = 90;

		r.displayStudent();
		r.displayMarks();
		r.calculateTotal();
		r.calculateGrade();
		r.displayResult();
	}

}
