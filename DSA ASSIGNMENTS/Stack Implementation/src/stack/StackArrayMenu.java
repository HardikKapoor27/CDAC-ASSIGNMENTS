package stack;

import java.util.Scanner;

class StackArray {
    int[] stack;
    int top;
    int capacity;

    StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed.");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(stack[top--] + " popped.");
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
}

public class StackArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray s = new StackArray(5);

        while (true) {
            System.out.println("\n--- Stack (Array) ---");
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