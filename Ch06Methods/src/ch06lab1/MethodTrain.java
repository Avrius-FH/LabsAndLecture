package ch06lab1;

import java.util.Scanner;

/**
 * simulate a container train, version 2 (methods)
 * https://docs.google.com/a/email.vccs.edu/
 * document/d/1OXaNv2rVuroaSH_EakOgCAchPDlDolnotFay982e_Zk/edit?usp=sharing
 * 04/05/2018
 * @version 2
 * @author John Maxfield
 * @author Forrest Halterman
 * @author Randall Guidry
 */
public class MethodTrain {
    public static Scanner scnr = new Scanner(System.in);   // for user input

    /**
     * calls methods to load and unload train
     * @param args if present, used for descriptions of container
     */
    public static void main(String[] args) {
        String[] trainContainers;             // Strings describing contents of containers on train

        // if the command line args exists, use it to load the "train"
        if (args.length > 0 && args != null) {
            trainContainers = args;             // new reference to command line arguments
            System.out.println("Strings copied from command line.");
        }

        // otherwise, get the train contents from the user
        else {
            trainContainers = getContainers();
        }

        // "unload" the train
        unloadTrain(trainContainers);
    }
    /**
    * Asks the user for the number of train cars and returns their input.
     * @return number of train cars
    */
    public static int getNumContainers(){
        int numTrains ;                   // holds user input for containers

        // asks user for number of containers
        do {
            System.out.print("How many containers are on the train? ");
            numTrains = scnr.nextInt();               // takes # of containers from user input
        }while(numTrains <= 0) ;
        return numTrains ;

    }

    /**
     * Fills the train car containers
     * @return the reference for the filled array
     *
     */

    public static String[] getContainers() {
        int numContainers = getNumContainers() ;              // calls for number of containers
        String[] trainContents = new String[numContainers];   // contents of the train
        int i;                                                //looping number

        // fills the train's cars with the user input
        for (i = 0; i < trainContents.length; i++) {
            System.out.print("What's in container #" + (i + 1));
            trainContents[i] = scnr.next();                 // puts user input into the train's log
        }

        return trainContents;
    }

    /**
     * Asks user if which way they want to unload the train
     * unloads front to back within the method
     * unloads back to front by calling reverseVals
     * @see #reverseVals(String[])
     * @param trainContainers: log of train's contents
     */

    public static void unloadTrain(String[] trainContainers) {
        String frontOrBack ;                  // user's preference for train ordering

        System.out.print("Unload from front or back? (f/b)");
        frontOrBack = scnr.next() ;           // assigns user's preference

        // determines whether the user wants the the train to log front to back or vice versa
        if (frontOrBack.charAt(0) == 'f') {
            for (int i = 0 ; i < trainContainers.length  ; i++){
                System.out.println("Unloading " + trainContainers[i] + ".");
            }
        }
        else if (frontOrBack.charAt(0) == 'b'){
            reverseVals(trainContainers);            // calls for reverse order; back to front
        }


    }

    /**
     * Prints an array backwards
     * @param trainContents: log of the train's contents
     */

    public static void reverseVals ( String[] trainContents) {
        int i ;                                      // looping number

        // prints out the log of the train's content in reverse order
        for ( i = trainContents.length - 1 ; i >= 0 ; i-- ) {
            System.out.println("Unloading " + trainContents[i]+ "." );
        }
    }
}
