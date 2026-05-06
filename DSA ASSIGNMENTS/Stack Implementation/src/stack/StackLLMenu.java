package stack;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class StackLL {
    Node top;

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        System.out.println(data + " pushed.");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(top.data + " popped.");
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack empty!");
            return;
        }
        System.out.println("Top: " + top.data);
    }

    void display() {
        if (top == null) {
            System.out.println("Stack empty!");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class StackLLMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL s = new StackLL();

        while (true) {
            System.out.println("\n--- Stack (Linked List) ---");
            System.out.println("1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: System.out.print("Value: "); s.push(sc.nextInt()); break;
                case 2: s.pop(); break;
                case 3: s.peek(); break;
                case 4: s.display(); break;
                case 5: return;
                default: System.out.println("Invalid!");
            }
        }
    }
}