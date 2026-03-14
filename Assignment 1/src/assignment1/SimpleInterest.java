package assignment1;

//Program 9: Calculate simple interest and check high or low

class SimpleInterest {
 public static void main(String[] args) {

     double principal = 5000;
     double rate = 5;
     int time = 2;

     double SI = (principal * rate * time) / 100;

     System.out.println("Simple Interest: " + SI);

     if(SI > 1000) {
         System.out.println("Interest is High");
     } else {
         System.out.println("Interest is Low");
     }
 }
}