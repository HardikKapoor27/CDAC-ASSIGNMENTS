package assignment1;

//Program 3: Calculate total and average of three subjects

class MarksAverage {
 public static void main(String[] args) {

     int m1 = 80;
     int m2 = 75;
     int m3 = 90;

     int total = m1 + m2 + m3;
     double average = total / 3;

     System.out.println("Total Marks: " + total);
     System.out.println("Average Marks: " + average);
 }
}