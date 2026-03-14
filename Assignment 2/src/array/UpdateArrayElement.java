package array;

//Program: Update an Element in an Array

import java.util.Scanner;

class UpdateArrayElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter array elements: ");

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter index to update: ");
		int index = sc.nextInt();

		if(index >= 0 && index < n) {

			System.out.print("Enter new value: ");
			int value = sc.nextInt();

			arr[index] = value;

			System.out.print("Updated Array: ");
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}

		} 
		else {
			System.out.println("Invalid index position");
		}

		sc.close();
	}
}