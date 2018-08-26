package ch04lab1;
import java.util.Scanner ;

/**
 * Displays characters incrementing upon the user input statement in groups of ten.
 * 02/21/2018
 * @author Forrest Halterman
 * @author James Coates
 */

public class CharacterTables {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  // takes user input
        final int MIN_INPUT = 0 ;               // Minimum domain of input
        final int MAX_INPUT = 118 ;             // Maximum  domain of input
        final int NUM_ROW = 10 ;                // number of output iterations
        String userInput ;                      // raw user input
        int userNum ;                           // user input as a usable number
        char userChar ;                         // the incremented user input as ascii
        boolean validEntry ;                    // valid input flag
        int i ;                                 // incrementing number for loops


        //Verifies the user input and displays a chart of numbers and their associated characters
        do {
            // resets flag for each iteration
            validEntry = true;

            System.out.print("Enter a starting integer between 0 and 118: ");
            userInput = scnr.next();  // assigns user input

            // checks to see whether the input is 0 to 3 digits
            if ((userInput.length() <= 3 && userInput.length() > 0))
            {
                //checks to see whether user input is comprised of digits
                for ( i = 0; i < userInput.length(); i++) {
                    if (!Character.isDigit(userInput.charAt(i))) {
                        validEntry = false;
                        break;
                    }
                }

                if (validEntry)              // checks flag for valid input before moving on
                {
                    userNum = Integer.parseInt(userInput); //takes number out of raw user input

                    //determines whether the user's number is within the desired range
                    if (userNum >= MIN_INPUT && userNum <= MAX_INPUT)
                    {
                        /* Starting at inputted number, outputs a ascii character based on the
                            inputted number. Increments until it completes the tenth iteration
                         */
                        for (i = userNum; i < (userNum + NUM_ROW) ; i++)
                        {
                            userChar = (char) i;   //casts user number as its ascii output
                            System.out.println(i + "  " + userChar);
                        }
                    }
                    else {
                        break;      //break if input isn't within desired range
                    }
                }
                else {
                    break;         //break if input isn't comprised of decimal digits
                }
            }
            else
            {
                break;           //break if input isn't between 1 to 3 character long (inclusive)
            }

            //ask the user if they want to continue with another iteration
            System.out.print("Enter C to continue, Q to quit: ");
            userInput = scnr.next() ;      //assign user's input for quit/continue option

        } while (!userInput.equals("Q")) ;  //checks if user wants to quit, otherwise it repeats

        //Statement appears if the user quit the program or entered an error.
        System.out.println ("Game over, thank you for playing.");
    }
}