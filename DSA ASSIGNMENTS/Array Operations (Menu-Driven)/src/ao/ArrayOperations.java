package ao;

import java.util.Scanner;

public class ArrayOperations {
	
	private int[] arr; 
    private int n = 0;

    public void input(Scanner sc) {
        System.out.print("\nEnter number of elements in array: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        if (n == 0) {
            System.out.println("\nArray is empty.");
            return;
        }

        System.out.print("\nArray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void search(Scanner sc) {
        System.out.print("\nEnter number to search: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }

    public void insert(Scanner sc) {
        System.out.print("\nEnter number to insert: ");
        int num = sc.nextInt();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index < 0 || index > n) {
            System.out.println("Invalid index.");
            return;
        }

        int[] newArr = new int[n + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = num;

        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        arr = newArr;
        n++;

        System.out.println(num + " inserted at index " + index);
    }

    public void update(Scanner sc) {
        System.out.print("\nEnter index to update: ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new value: ");
        arr[index] = sc.nextInt();

        System.out.println("Updated index " + index + " to " + arr[index]);
    }

    public void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted!");
        display();
    }

    public void delete(Scanner sc) {
        System.out.print("\nEnter index to delete: ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Deleted element " + arr[index] + " at index " + index);

        int[] newArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        arr = newArr;
        n--;
    }

    public static void main(String[] args) {
        ArrayOperations ao = new ArrayOperations();
        Scanner sc = new Scanner(System.in);

        boolean isInputDone = false;
        int choice = 0;

        do {
            System.out.println("\n<=== Array Operations Menu ===>");
            System.out.println("1) Input  2) Display  3) Search");
            System.out.println("4) Insert 5) Update   6) Sort");
            System.out.println("7) Delete 8) Exit");
            System.out.print("\nEnter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // clear invalid input
                continue;
            }

            choice = sc.nextInt();

            if (choice < 1 || choice > 8) {
                System.out.println("Invalid choice!");
                continue;
            }

            if (!isInputDone && choice != 1 && choice != 8) {
                System.out.println("Please input the array first (option 1)!");
                continue;
            }

            switch (choice) {
                case 1:
                    ao.input(sc);
                    isInputDone = true;
                    break;
                case 2:
                    ao.display();
                    break;
                case 3:
                    ao.search(sc);
                    break;
                case 4:
                    ao.insert(sc);
                    break;
                case 5:
                    ao.update(sc);
                    break;
                case 6:
                    ao.sort();
                    break;
                case 7:
                    ao.delete(sc);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 8);

        sc.close();
    }

}
