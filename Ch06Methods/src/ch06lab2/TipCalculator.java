package ch06lab2;
import java.text.DecimalFormat;
import java.util.Scanner ;

/**
 * Calculates tip for a meal and then splits the total cost between diners
 * 4/2/2018
 * @author Forrest Halterman
 * @author Randall Guidry
 */
public class TipCalculator {
   public static Scanner scnr = new Scanner(System.in);  // for user input

   /**
    * calls methods to calculate tip for each person
    * @param args unused console array
    */

   public static void main ( String [] args) {
     double totalPerPerson ;              // pay per person attending meal
     double tipPct ;                      // tip amount
     double checkAmount ;                 // total initial amount to pay


     checkAmount = getCheckAmount() ;     // stores initial check amount
     tipPct = getTipPct() ;               // stores tip in decimal form

     //determines amount of money each has to pay
     totalPerPerson = getTotal(checkAmount, tipPct) / getDinerCount() ;

     tipPct = tipPct * 100 ;             // converts decimal into percentage

      // displays the outcome of calculations
     displayData(checkAmount, tipPct, totalPerPerson);


   }

    /**
     * Asks user for a valid check amount
     * @return a valid initial check amount
     */

   public static double getCheckAmount () {

     final double VALID_INPUT = 0.0 ;     // left limit of input
     double userInput ;                   // takes user input

         System.out.print("Enter amount of check(before tip): ");
         userInput = scnr.nextDouble();

         // checks input for validity and asks user for a second input if invalid
      while (userInput <= VALID_INPUT ) {
         System.out.print( "Error! check amount must be greater than " + VALID_INPUT);
         System.out.print(". Please re-enter: " );
         userInput = scnr.nextDouble() ;

      }

      return userInput ;

   }

    /**
     * Asks the user for the tip they to want give
     * @return tip percentage in decimal form
     */

   public static double getTipPct (){
      double userInputTip ;               // takes user input
      final double VALID_INPUT = 0.0 ;    // left limit of input
      final double VALID_LIMIT = 1.0 ;    // right limit of input

      System.out.print("How much should the tip be?");
      userInputTip = scnr.nextDouble() /100 ;          // converts input to usable percentage

       //determines whether input is valid or not. If not, error and reentry request
      while ( userInputTip < VALID_INPUT || userInputTip >= VALID_LIMIT ) {
         System.out.print ( "Error! Tip must be between 0 and 100. Please re-enter:");
         userInputTip = scnr.nextDouble() / 100 ;     // converts input to usable percentage

      }

      return userInputTip ;
   }

    /**
     * Sums the tip and the check amount together
     * @param checkAmount initial check amount for the meal
     * @param tipPct tip percentage in decimal form
     * @return total cost of meal without splitting it between diners
     */

   public static double getTotal(double checkAmount , double tipPct) {
      double total ;                      // total amount to pay with tip

      total = checkAmount + ( checkAmount * tipPct) ;        //sum of tip and initial check

      return total ;
   }

    /**
     * Asks the user for number people splitting the bill
     * @return number of people paying
     */

   public static int getDinerCount() {
      int userInputInt;                   // takes user input

      System.out.print ( "How many will share the bill? ") ;
      userInputInt = scnr.nextInt() ;

      // checks for valid input. If invalid, error and asks for reentry
      while ( userInputInt <= 0 ) {
         System.out.print("Error! Number of diners must be at least 1. ");
         System.out.print("Please re-enter: " + userInputInt);
         userInputInt = scnr.nextInt() ;

      }

      return userInputInt ;

      }

    /**
     * Converts format and prints outcome of calculations for the meal's payment
     * @param checkAmount initial check amount received
     * @param tipPct tip percentage (not decimal)
     * @param dinnerShare number people sharing the bill for the meal.
     */

   public static void displayData (double checkAmount, double tipPct, double dinnerShare) {

       // formats values for proper use and easy reading
       DecimalFormat numberFormat = new DecimalFormat("##.##") ;


      System.out.println("If the check is $" + checkAmount);
      System.out.println("and the desired tip is " + numberFormat.format(tipPct) + "%");
      System.out.println("then each person's share is $" + numberFormat.format(dinnerShare));
   }



   }


