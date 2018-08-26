package lecture3192018;

import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) { //THIS IS AN ARRAY of STRINGs; it is the CMDLINE
     // final int NUM_VALS = 4; // his pref is for arrayVariable.length
      //int[] userValues = new int[NUM_VALS];
      int[] userValues = {2,2,1,2} ;
      int i;
      int matchValue;
      int numMatches = -99; // Assign numMatches with 0 before your for loop

//      userValues[0] = 2;
//      userValues[1] = 2;
//      userValues[2] = 1;
//      userValues[3] = 2;

      matchValue = 2;
      numMatches = 0 ; // when you use something in a loop change it to initial value
     // for ( i = 0 ; i < userValues.length ; i++) {
      for ( i = userValues.length -1 ; i >= 0 ; i--) {          // backwards
         if ( userValues[i] == matchValue ) {
            ++numMatches ;
         }
      }


      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}