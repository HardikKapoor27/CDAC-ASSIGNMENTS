package browserHistorySystem;

import java.util.Stack;
import java.util.Scanner;

public class BrowserHistory {

	Stack<String> history = new Stack<>();
	Scanner sc = new Scanner(System.in);

	public BrowserHistory() {

		history.push("google.com");
		history.push("youtube.com");
		history.push("github.com");

	}

	public void visitPage() {

		System.out.print("\nEnter Webpage URL: ");
		String url = sc.nextLine();

		history.push(url);

		System.out.println("\nPage Visited Successfully");
	}

	public void goBack() {

		if(history.isEmpty()) {
			System.out.println("\nNo browsing history available");
			return;
		}

		String removed = history.pop();

		System.out.println("\nGoing Back From: " + removed);

		if(!history.isEmpty())
			System.out.println("Current Page: " + history.peek());
		else
			System.out.println("No pages left in history");
	}

	public void currentPage() {

		if(history.isEmpty()) {
			System.out.println("\nNo pages currently open");
			return;
		}

		System.out.println("\nCurrent Page: " + history.peek());
	}

	public void displayHistory() {

		if(history.isEmpty()) {
			System.out.println("\nNo browsing history");
			return;
		}

		System.out.println("\n----- BROWSER HISTORY -----");

		for(int i = history.size()-1; i >= 0; i--) {
			System.out.println(history.get(i));
		}
	}
}