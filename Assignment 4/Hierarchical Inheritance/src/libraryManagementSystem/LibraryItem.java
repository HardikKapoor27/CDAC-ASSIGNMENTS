package libraryManagementSystem;

public class LibraryItem {

	int itemId;
	String title;

	public LibraryItem(int itemId, String title) {
		this.itemId = itemId;
		this.title = title;
	}

	void displayItem() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
	}
}

class Book extends LibraryItem {

	String author;

	public Book(int itemId, String title, String author) {
		super(itemId, title);
		this.author = author;
	}

	void displayAuthor() {
		System.out.println("Author: " + author);
	}
}

class Magazine extends LibraryItem {

	int issueNumber;

	public Magazine(int itemId, String title, int issueNumber) {
		super(itemId, title);
		this.issueNumber = issueNumber;
	}

	void displayIssueNumber() {
		System.out.println("Issue Number: " + issueNumber);
	}
}