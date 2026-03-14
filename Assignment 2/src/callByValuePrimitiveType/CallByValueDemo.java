package callByValuePrimitiveType;

//Program: Demonstrate Call by Value using Primitive Type

class CallByValueDemo {

	public static void modifyValue(int num) {
		num = num + 10;
		System.out.println("Value inside method: " + num);
	}

	public static void main(String[] args) {

		int number = 5;

		System.out.println("Value before method call: " + number);

		modifyValue(number);

		System.out.println("Value after method call: " + number);
	}
}