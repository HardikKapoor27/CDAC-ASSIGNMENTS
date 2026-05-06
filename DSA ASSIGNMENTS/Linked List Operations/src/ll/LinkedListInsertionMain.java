package ll;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

class LinkedList {
	Node head;
	
	//Insert at Beginning
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//Insert at End
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	//Insert at Nth position
	void insertAtPosition(int data, int pos) {
		
		if(pos == 1) {
			insertAtBeginning(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node temp = head;
		
		// Traverse to (pos - 1)th node
		for(int i = 1; i < pos-1; i++) {
			if(temp == null) {
				System.out.println("Position Out of Bounds");
				return;
			}
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Position Out of Bounds");
			return;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	//Print Linked List
	void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
}

public class LinkedListInsertionMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//Insert at beginning
		list.insertAtBeginning(10);
		list.insertAtBeginning(7);
		
		//Insert at end
		list.insertAtEnd(50);
		list.insertAtEnd(80);
		
		//Insert at position
		list.insertAtPosition(18, 3);
		list.insertAtPosition(27, 6);
		
		//Print List
		list.printList();
	}
}