package libraryFineCalculationSystem;

public class LibraryMain {

	public static void main(String[] args) {

		LibraryFine l = new LibraryFine();

		l.takeInput();

		double finePerDay = 10;
		double additionalPenalty = 50;

		l.calculateFine(l.noOfLateDays);
		l.calculateFine(l.noOfLateDays, finePerDay);
		l.calculateFine(l.noOfLateDays, finePerDay, additionalPenalty);

	}

}