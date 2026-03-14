package assignment1;

//Program 14: Calculate electricity bill

class ElectricityBill {
 public static void main(String[] args) {

     int units = 120;
     double bill;

     if(units <= 100) {
         bill = units * 5;
     }
     else {
         bill = units * 7;
     }

     System.out.println("Total Bill: " + bill);
 }
}