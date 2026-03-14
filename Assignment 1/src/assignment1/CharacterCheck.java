package assignment1;

//Program 12: Check uppercase or lowercase

class CharacterCheck {
 public static void main(String[] args) {

     char ch = 'a';

     if(ch >= 'A' && ch <= 'Z') {
         System.out.println("Uppercase");
     } else {
         System.out.println("Lowercase");
     }
 }
}