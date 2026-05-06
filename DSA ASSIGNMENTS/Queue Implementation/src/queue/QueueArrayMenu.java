package queue;

import java.util.Scanner;

class QueueArray {
    int[] queue;
    int front, rear, capacity;

    QueueArray(int size) {
        capacity = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[++rear] = data;
        System.out.println(data + " inserted.");
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(queue[front++] + " removed.");
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue empty!");
            return;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
}

public class QueueArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(5);

        while (true) {
            System.out.println("\n--- Queue (Array) ---");
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