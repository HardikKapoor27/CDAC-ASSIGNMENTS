package assignment1;

//Program 5: Calculate final price after discount

class DiscountPrice {
 public static void main(String[] args) {

     double price = 1000;
     double discount = 20;

     double finalPrice = price - (price * discount / 100);

     System.out.println("Final Price: " + finalPrice);
 }
}