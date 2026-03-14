package assignment1;

//Program 4: Swap two numbers without third variable

class SwapNumbers {
 public static void main(String[] args) {

     int a = 10;
     int b = 20;

     a = a + b;
     b = a - b;
     a = a - b;

     System.out.println("a: " + a);
     System.out.println("b: " + b);
 }
}