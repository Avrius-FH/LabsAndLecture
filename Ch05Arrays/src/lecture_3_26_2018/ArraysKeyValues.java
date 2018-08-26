package lecture_3_26_2018;

import java.util.Scanner;

public class ArraysKeyValues {
   public static void main (String [] args) {
      final int NUM_ROWS = 2;
      final int NUM_COLS = 2;
      int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
      int i;
      int j;
      int maxMiles; // Assign with first element in milesTracker before loop
      int minMiles; // Assign with first element in milesTracker before loop

      milesTracker[0][0] = -10;
      milesTracker[0][1] = 20;
      milesTracker[1][0] = 30;
      milesTracker[1][1] = 40;
      maxMiles = minMiles = milesTracker[0][0] ; // works too
      maxMiles = milesTracker[0][0] ;
      minMiles = milesTracker[0][0] ;

      for ( i = 0 ; i < milesTracker.length ; i++) {
         for ( j = 0 ; j < milesTracker[j].length ; j++) {

            if (milesTracker[i][j] > maxMiles) {
               maxMiles = milesTracker[i][j] ;
            }
            else if (milesTracker[i][j] < minMiles) {
               minMiles = milesTracker[i][j] ;
            }
         }
      }

      System.out.println("Min miles: " + minMiles);
      System.out.println("Max miles: " + maxMiles);
   }
}