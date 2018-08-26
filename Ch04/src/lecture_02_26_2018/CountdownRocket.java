package lecture_02_26_2018;

public class CountdownRocket {
   public static void main (String [] args) {
      int userNum;
      int i;

      userNum = 3;

      for (i = userNum ; i > 0 ; i--) {

         System.out.println(i);
      }
      System.out.println("Blast Off!");

   }
}