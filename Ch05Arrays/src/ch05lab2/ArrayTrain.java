package ch05lab2;
import java.util.Scanner;

/**
 * Logs the contents of a train.
 * 03/20/2018
 * @author Forrest Halterman
 * @author James Coates
 */

public class ArrayTrain {
   public static void main ( String [] args) {
      Scanner scnr = new Scanner(System.in) ;   // takes user input

      String[] trainContents ;                  //  train container contents
      int numTrains ;                           //  number of train containers
      String userInput ;                        //  assigns user input
      int i ;                                   //  looping number

      System.out.print("How many containers are on the train? ");
      numTrains = scnr.nextInt();               // takes # of containers from user input

      trainContents = new String[numTrains] ;   // assigns user input as number of train containers

      // fills the train's cars with the user input
      for ( i = 0 ; i < trainContents.length ; i++){
         System.out.print("What's in container #" + (i+1));
         userInput = scnr.next() ;            // assigns user input
         trainContents[i] = userInput ;       // puts user input into the train's log

      }
      // prints out the log of the train's content in reverse order
      for ( i = trainContents.length - 1 ; i >= 0 ; i-- ) {
         System.out.println("Unloading " + trainContents[i]+ "." );
      }

   }
}