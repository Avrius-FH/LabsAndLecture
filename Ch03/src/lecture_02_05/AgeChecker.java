package lecture_02_05;

/**
 * <purpose>
 * 2/5/2018
 * @author flh250
 */
public class AgeChecker {
   public static void main (String [] args) {
      int userAge;

      userAge = 17;

      if(userAge>= 18 && userAge <=25){
         System.out.println("Eligible");
      }
      else{
         System.out.println("Ineligible");
      }

      return;
   }
}