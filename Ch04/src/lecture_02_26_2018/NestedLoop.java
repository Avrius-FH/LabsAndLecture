package lecture_02_26_2018;

public class NestedLoop {
   public static void main (String [] args) {
      int userNum;
      int i;
      int j;

      userNum  = 3;

      for (i = 0 ; i <= userNum ; i++ ) {
         for ( j = i ; j > 0 ; j--){
            System.out.print(" ");
         }
         System.out.println(i);


      }

      /* Your solution goes here  */

   }
}