package llm;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;
    private int size;

    SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println(data + " inserted at the beginning.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
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
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position - 1; i++)
            current = current.next;
        newNode.next = current.next;
        current.next = newNode;
        size++;
        System.out.println(data + " inserted at position " + position + ".");
    }

    public void deleteFromBeginning() {
        if (isEmpty()) return;
        int removed = head.data;
        head = head.next;
        size--;
        System.out.println(removed + " deleted from the beginning.");
    }

    public void deleteFromEnd() {
        if (isEmpty()) return;
        int removed;
        if (head.next == null) {
            removed = head.data;
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null)
                current = current.next;
            removed = current.next.data;
            current.next = null;
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
        Node current = head;
        for (int i = 1; i < position - 1; i++)
            current = current.next;
        int removed = current.next.data;
        current.next = current.next.next;
        size--;
        System.out.println(removed + " deleted from position " + position + ".");
    }

    public void traverse() {
        if (isEmpty()) return;
        System.out.print("List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" -> NULL");
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

public class LinkedListMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        do {
            System.out.println("\n--- Singly Linked List ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Position");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
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
                    list.traverse();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Enter 1-8.");
            }

        } while (true);
    }
}