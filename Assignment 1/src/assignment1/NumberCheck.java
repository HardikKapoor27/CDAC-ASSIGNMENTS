package assignment1;

//Program 13: Check positive, negative or zero

class NumberCheck {
 public static void main(String[] args) {

     int num = -5;

     if(num > 0) {
         System.out.println("Positive");
     }
     else if(num < 0) {
         System.out.println("Negative");
     }
     else {
         System.out.println("Zero");
     }
 }
}