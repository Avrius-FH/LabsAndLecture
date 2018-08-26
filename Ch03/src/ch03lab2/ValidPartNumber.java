package ch03lab2;

import java.util.Scanner;

/**
 * Determines whether the user's inputted part number is valid or not.
 * 02/14/2018
 * @author Forrest Halterman
 * @author James Coates
 */

public class ValidPartNumber {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);  // For user Input

      boolean   isValid      = true; // The flag that determines the final output statement
      final int VALID_LENGTH = 6;    // the valid length of a user entry
      String    userPartNumber;       // user's entered part number
      String partAlphaCode;          // the first two characters(string) of the user's part number
      String isOrIsNot;              // switches to "is" or "is not" based on flag

      System.out.print("Enter the Part Number: ");
      userPartNumber = scnr.next();  //assigns user input as the Part #




      //checks to see if the user's input is of valid length
      if (userPartNumber.length() == VALID_LENGTH) {
         //Assigns the first two characters as a string
         partAlphaCode = userPartNumber.substring(0, 2);

         //checks the first part of the user's input with all valid Alpha combinations
         switch (partAlphaCode) {
            case "SR":
               break;
            case "SD":
               break;
            case "TU":
               break;
            case "TR":
               break;
            default:                    //if no matches are found, the flag is marked as false
               isValid = false;
               break;
         }

         //checks whether flag was set to false in previous statements
         if (isValid) {

         /* Checks each index greater than or equal to 2 for a valid character. If the statement
          finds a false outcome, it will stop and mark the flag as false
         */

            if (userPartNumber.charAt(2) != '-') {
               isValid = false;
            }
            else if (!Character.isDigit(userPartNumber.charAt(3))) {
               isValid = false;
            }
            else if (!Character.isDigit(userPartNumber.charAt(4))) {
               isValid = false;
            }

            else if (!Character.isDigit(userPartNumber.charAt(5))) {
               isValid = false;
            }
         }
      }
      else {                            //if the part # is not of valid length, the flag is false
         isValid = false;
      }



      // checks to see if the flag is false or true and assigns a string accordingly
      isOrIsNot = isValid ? "is" : "is not";

      System.out.println("The part number (" + userPartNumber + ") " + isOrIsNot + " valid.");
   }
}





