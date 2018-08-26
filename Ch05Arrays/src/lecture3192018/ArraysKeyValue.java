package lecture3192018;

import java.util.Scanner;

public class ArraysKeyValue {
   public static void main (String [] args) {
      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      int[] itemsList = new int[SIZE_LIST];
      int i;

      keysList[0] = 42;
      keysList[1] = 105;
      keysList[2] = 101;
      keysList[3] = 100;

      itemsList[0] = 10;
      itemsList[1] = 20;
      itemsList[2] = 30;
      itemsList[3] = 40;

      for (i = 0 ; i < keysList.length ; i++){
         if (keysList[i] > 100){
            System.out.print (itemsList[i] + " ");
         }

      }

      System.out.println("");
   }
}