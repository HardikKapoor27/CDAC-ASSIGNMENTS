package queue;

import java.util.Scanner;

class NodeQ {
    int data;
    NodeQ next;

    NodeQ(int d) {
        data = d;
        next = null;
    }
}

class QueueLL {
    NodeQ front, rear;

    void enqueue(int data) {
        NodeQ n = new NodeQ(data);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        System.out.println(data + " inserted.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue empty!");
            return;
        }
        System.out.println(front.data + " removed.");
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue empty!");
            return;
        }
        NodeQ temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class QueueLLMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL q = new QueueLL();

        while (true) {
            System.out.println("\n--- Queue (Linked List) ---");
            System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: System.out.print("Value: "); q.enqueue(sc.nextInt()); break;
                case 2: q.dequeue(); break;
                case 3: q.display(); break;
                case 4: return;
                default: System.out.println("Invalid!");
            }
        }
    }
}