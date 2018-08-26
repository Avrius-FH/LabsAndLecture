package lecture_02_19;

import java.util.Scanner;

public class InsectGrowth {
   public static void main (String [] args) {
      int numInsects;

      numInsects = 8; // Must be >= 1

      while (numInsects < 100)
      {
         System.out.print (numInsects + " ") ;
         numInsects *= 2 ;

      }
      System.out.println("");
   }
}