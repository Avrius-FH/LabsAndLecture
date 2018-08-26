package lecture_02_19;

import java.util.Scanner;

public class NonNegativeLooper {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;

      userNum = 9;


      while (userNum >= 0) {
         System.out.println("Body");
         userNum = scnr.nextInt();
      }
      System.out.println("Done.");
   }
}