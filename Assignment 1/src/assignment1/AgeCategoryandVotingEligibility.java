package assignment1;

//Program 10: Check age category

class AgeCategoryandVotingEligibility {
	public static void main(String[] args) {

		int age = 19;

		// Age category check
		if(age < 13) {
			System.out.println("Category: Child");
		}
		else if(age < 20) {
			System.out.println("Category: Teenager");
		}
		else {
			System.out.println("Category: Adult");
		}

		// Voting eligibility check
		if(age >= 18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible to Vote");
		}

	}
}