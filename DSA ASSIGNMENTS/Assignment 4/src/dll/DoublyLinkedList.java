package dll;

import java.util.Scanner;

class DLLNode {
    int data;
    DLLNode prev, next;

    DLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DLL {
    private DLLNode head, tail;
    private int size;

    DLL() {
        head = tail = null;
        size = 0;
    }

    public void insertAtBeginning(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        System.out.println(data + " inserted at the beginning.");
    }

    public void insertAtEnd(int data) {
        DLLNode newNode = new DLLNode(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(data + " inserted at the end.");
    }

    public void insertAtPosition(int data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position! Valid range: 1 to " + (size + 1));
            return;
        }
        if (position == 1) { insertAtBeginning(data); return; }
        if (position == size + 1) { insertAtEnd(data); return; }
        DLLNode newNode = new DLLNode(data);
        DLLNode current = head;
        for (int i = 1; i < position - 1; i++)
            current = current.next;
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
        System.out.println(data + " inserted at position " + position + ".");
    }

    public void deleteFromBeginning() {
        if (isEmpty()) return;
        int removed = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println(removed + " deleted from the beginning.");
    }

    public void deleteFromEnd() {
        if (isEmpty()) return;
        int removed = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println(removed + " deleted from the end.");
    }

    public void deleteFromPosition(int position) {
        if (isEmpty()) return;
        if (position < 1 || position > size) {
            System.out.println("Invalid position! Valid range: 1 to " + size);
            return;
        }
        if (position == 1) { deleteFromBeginning(); return; }
        if (position == size) { deleteFromEnd(); return; }
        DLLNode current = head;
        for (int i = 1; i < position; i++)
            current = current.next;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println(current.data + " deleted from position " + position + ".");
    }

    public void traverseForward() {
        if (isEmpty()) return;
        System.out.print("Forward: NULL <-> ");
        DLLNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" <-> ");
            current = current.next;
        }
        System.out.println(" <-> NULL");
    }

    public void traverseBackward() {
        if (isEmpty()) return;
        System.out.print("Backward: NULL <-> ");
        DLLNode current = tail;
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) System.out.print(" <-> ");
            current = current.prev;
        }
        System.out.println(" <-> NULL");
    }

    private boolean isEmpty() {
        if (head == null) {
            System.out.println("List is empty!");
            return true;
        }
        return false;
    }

    public int getSize() { return size; }
}

public class DoublyLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL list = new DLL();

        do {
            System.out.println("\n--- Doubly Linked List ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Position");
            System.out.println("7. Traverse Forward");
            System.out.println("8. Traverse Backward");
            System.out.println("9. Exit");
            System.out.print("\nChoice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Value: ");
                    int v = sc.nextInt();
                    System.out.print("Position (1 to " + (list.getSize() + 1) + "): ");
                    list.insertAtPosition(v, sc.nextInt());
                    break;
                case 4:
                    list.deleteFromBeginning();
                    break;
                case 5:
                    list.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Position (1 to " + list.getSize() + "): ");
                    list.deleteFromPosition(sc.nextInt());
                    break;
                case 7:
                    list.traverseForward();
                    break;
                case 8:
                    list.traverseBackward();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Enter 1-9.");
            }

        } while (true);
    }
}