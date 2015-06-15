public class PrintNumberInWord {   // saved as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;
 
      // Using nested-if
      if (number == 1) {
         System.out.println("ONE");
      } else if (......) {
         ......
      } else if (......) {
         ......
         ......
      } else {
         ......
      }
 
      // Using switch-case
      switch(number) {
         case 1: System.out.println("ONE"); break;
         case 2: ......
         ......
         ......
         default: System.out.println("OTHER"); 
      }
   }
}