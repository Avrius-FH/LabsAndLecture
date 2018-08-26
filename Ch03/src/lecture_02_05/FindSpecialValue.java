package lecture_02_05;

/**
 * <purpose>
 * 2/5/2018
 * @author flh250
 */
import java.util.Scanner;

public class FindSpecialValue {
   public static void main (String [] args) {
      int specialNum = 0;

      specialNum = 17;

      if (specialNum == -99 || specialNum == 0||specialNum == 44) {
         System.out.println("Special number");
      }
      else {
         System.out.println("Not special number");
      }

      return;
   }
}