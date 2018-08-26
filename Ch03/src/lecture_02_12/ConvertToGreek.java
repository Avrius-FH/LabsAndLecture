package lecture_02_12;

import java.util.Scanner;

public class ConvertToGreek {
   public static void main (String [] args) {
      char origLetter;

      origLetter = 'a';

      switch (origLetter){
         case 'a':case 'A' :
            System.out.print ("Alpha"   );
            break;
         case 'b' : case 'B' :
            System.out.print("Beta");
            break;
         default:
            System.out.println("Unknown");
            break;

      }

      /* Your solution goes here  */

   }
}