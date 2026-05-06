package ll;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node2 head;

    // Insert at End (helper to build list)
    void insertAtEnd(int data) {
        Node2 newNode2 = new Node2(data);
        if (head == null) {
            head = newNode2;
            return;
        }
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode2;
    }

    //  DELETION 

    // Delete from Beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
    }

    // Delete from End
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // Only one Node2
        if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }

        Node2 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted: " + temp.next.data);
        temp.next = null;
    }

    // Delete from Nth position
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // Delete head (position 1)
        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node2 temp = head;

        // Traverse to (pos - 1)th Node2
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position Out of Bounds.");
                return;
            }
            temp = temp.next;
        }

        // (pos-1)th Node2 is null OR its next is null  position doesn't exist
        if (temp == null || temp.next == null) {
            System.out.println("Position Out of Bounds.");
            return;
        }

        System.out.println("Deleted: " + temp.next.data);
        temp.next = temp.next.next;   // bypass the target Node2
    }

    // Print Linked List
    void printList() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class LinkedListDeletionMain {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        // Build list: 10 -> 20 -> 30 -> 40 -> 50 -> Null
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.print("Original List     : ");
        list.printList();

        // Delete from Beginning
        list.deleteAtBeginning();
        System.out.print("After del at Begin: ");
        list.printList();

        // Delete from End
        list.deleteAtEnd();
        System.out.print("After del at End  : ");
        list.printList();

        // Delete from Position 2
        list.deleteAtPosition(2);
        System.out.print("After del at Pos 2: ");
        list.printList();
    }
}