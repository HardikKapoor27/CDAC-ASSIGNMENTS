package array;

//Program: Demonstrate Array Reference when passed to a Method

class ArrayReferenceDemo {

	public static void modifyArray(int[] arr) {
		arr[0] = arr[0] + 10;
		arr[1] = arr[1] * 2;
		arr[2] = arr[2] / 3;
		arr[3] = arr[3] - 4;
	}

	public static void main(String[] args) {

		int[] arr = {5, 10, 15, 20};

		System.out.print("Array Before Method Call: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		modifyArray(arr);

		System.out.print("\nArray After Method Call: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}