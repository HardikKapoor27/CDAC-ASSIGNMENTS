package array;

//Program: Reverse an Array

import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter array elements: ");

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("\nOriginal Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nReversed Array: ");

		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}