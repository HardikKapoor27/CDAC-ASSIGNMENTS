package libraryManagementSystem;

class LibraryTest {

	public static void main(String[] args) {

		Book b = new Book(1, "Java Programming", "James Gosling");
		b.displayItem();
		b.displayAuthor();

		System.out.println();

		Magazine m = new Magazine(2, "Tech Monthly", 45);
		m.displayItem();
		m.displayIssueNumber();
	}
}