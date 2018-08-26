package ch04lab2;
import java.util.Scanner ;
import java.util.Random;

/**
 * Play a virtual version of Pass the Pigs, a pig flipping dice game.
 * 03/1/2018
 * @author Forrest Halterman
 * @author James Coates
 */


public class PassThePigs {
    public static void main (String [] args){

        Scanner scnr = new Scanner(System.in) ;     // takes user input
        Random randGen = new Random ();             // generates random number for pig probability

        final String SIDER = "Sider(no dot)" ;               //sider dice outcome
        final String DOT_SIDER = "Sider(dot)" ;      //sider with dot dice outcome
        final String TROTTER = "Trotter" ;           //trotter dice outcome
        final String RAZORBACK = "Razorback" ;       //razorback dice outcome
        final String SNOUTER = "Snouter" ;           //snouter dice outcome
        final String JOWLER = "Leaning jowler" ;     //jowler dice outcome
        final int SIDER_POINTS = 0 ;                 //sider points
        final int DOT_SIDER_POINTS = 0 ;             //sider with dot points
        final int TROTTER_POINTS = 5 ;               //trotter points
        final int RAZORBACK_POINTS = 5 ;             //razorback points
        final int SNOUTER_POINTS = 10 ;              //snouter points
        final int JOWLER_POINTS = 15 ;               //jowler points
        final int SIDER_RNG = 33 ;                   //sider rolling range
        final int DOT_SIDER_RNG = 66 ;               //sider with dot rolling range
        final int TROTTER_RNG = 76 ;                 //trotter rolling range
        final int RAZORBACK_RNG = 96 ;               //razorback rolling range
        final int SNOUTER_RNG = 99 ;                 //snouter rolling range
        final int JOWLER_RNG = 100 ;                 //jowler rolling range(used as rng limit)
        String pigOne = "" ;                         // first dice result
        String pigTwo = "" ;                         // second dice result
        int diceRoll ;                               // random number generator result
        int turnScore = 0 ;                          // total turn score
        int rollScore ;                              // current iteration's score
        boolean questionFlag = true ;               // condition for repeat iteration
        int i ;                                      // incrementing number for loop
        String userInput ;                           // stores user input



        //flips two pigs and restarts if the player wants to continue, but stops for a pig out
        do {

            rollScore = 0 ;                             // resets roll score for new iteration

            // for each run it rolls the dice and assigns a pig outcome
            for (i = 0 ; i < 2 ; i++) {
                diceRoll = randGen.nextInt(JOWLER_RNG);   //assigns rng outcome

                if (diceRoll < SIDER_RNG) {         //checks for sider range
                    rollScore += SIDER_POINTS ;    //adds the pig's attributed score to roll score
                    if (i < 1) {                    // determines if loop has ran before
                        pigOne = SIDER;             // assigns first pig outcome
                        continue ;                  // reiterates to assign the second pig
                    }
                    pigTwo = SIDER ;                // assigns second pig outcome
                }
                else if (diceRoll < DOT_SIDER_RNG) {   // checks for sider with dot range
                    rollScore += DOT_SIDER_POINTS ;    // adds pig's attributed score to roll score
                    if ( i < 1 ) {                     // determines if loop has ran before
                        pigOne = DOT_SIDER;            // assigns first pig outcome
                        continue ;                     // reiterates to assign the second pig
                    }
                    pigTwo = DOT_SIDER ;              // assigns second pig outcome

                }
                else if (diceRoll < TROTTER_RNG) {   //checks for pig's range
                    rollScore += TROTTER_POINTS ;    // adds pig's attributed score to roll score
                    if (i < 1) {                     // determines if loop has ran before
                        pigOne = TROTTER;            // assigns first pig outcome
                        continue ;                    // reiterates to assign the second pig
                    }
                    pigTwo = TROTTER ;               // assigns second pig outcome
                }
                else if (diceRoll < RAZORBACK_RNG) {  //checks for pig's range
                    rollScore += RAZORBACK_POINTS ;   // adds pig's attributed score to roll score
                    if (i < 1){                      // determines if loop has ran before
                        pigOne = RAZORBACK;          // assigns first pig outcome
                        continue ;                    // reiterates to assign the second pig
                    }
                    pigTwo = RAZORBACK ;              // assigns second pig outcome

                }
                else if (diceRoll < SNOUTER_RNG) {   //checks for pig's range
                    rollScore += SNOUTER_POINTS ;   // adds pig's attributed score to roll score
                    if (i < 1) {                    // determines if loop has ran before
                        pigOne = SNOUTER;            // assigns first pig outcome
                        continue ;                   // reiterates to assign the second pig
                    }
                    pigTwo = SNOUTER ;             // assigns second pig outcome
                }
                else {                            // otherwise the pig is a leaning jowler
                    rollScore += JOWLER_POINTS ;  // adds pig's attributed score to roll score
                    if (i < 1) {                  // determines if loop has ran before
                        pigOne = JOWLER;          // assigns first pig outcome
                        continue;                  // reiterates to assign the second pig
                    }
                    pigTwo = JOWLER ;             // assigns second pig outcome
                }
            }

            System.out.println("Rolling... " + pigOne + " & " + pigTwo);

            //checks for a pig out, double sider, or double score
            if ((pigOne.equals(SIDER) || pigTwo.equals(SIDER)) &&
                    (pigOne.equals(DOT_SIDER) || pigTwo.equals(DOT_SIDER))) {

                turnScore = 0 ;         // not really used unless multi-player added at later date
                System.out.println("Pig Out! No Score. \nYour turn is over.");
                break ;                 // stops loop if player gets a pig out
                }
            else if ((pigOne.equals(pigTwo)) && (pigOne.equals(SIDER) || pigTwo.equals(DOT_SIDER)))
            {
                rollScore += 1 ;          //one point is added for a double sider
            }
            else if (pigOne.equals(pigTwo)) {
                // doubles roll score for a double pig outcome (excluding sides)
                rollScore += rollScore ;
                }


            turnScore += rollScore ;                   //adds the roll's score to turn score
            System.out.println("this roll: " + rollScore);
            System.out.println("this turn: " + turnScore);
            System.out.print("Roll again (y/n)?");
            userInput = scnr.next();        //assigns user input to answer previous question.

            if (!userInput.equals("y")){         //if user answers y then loop will continue
                questionFlag = false ;
            }

        }while ( questionFlag );       // takes another turn at pigs if user answers y



    }
}
