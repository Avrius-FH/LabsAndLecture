package ch07lab2;

import java.util.Scanner;

/**
 * Logs the contents of train's freight cars ands lists them frontwards or backwards.
 * 04/19/2018
 * @author Forrest Halterman
 * @author Randall Guidry
 */

public class TrainMain {
    private static Scanner scnr = new Scanner (System.in) ;  // for user input

    /**
     * Calls methods to log a train's freight
     * @param args unused console array
     */

    public static void main ( String [] args) {

        Train train = new Train() ;                   // train log; /jk AKA the Pain Train

        getContainers(train);                         // filling the train

        unloadTrain(train);                           // unloading it

    }


    /**
     * asks the user for the contents of each container
     * @param train
     */

    public static void getContainers ( Train train) {

        // call to get # of containers before ask the user for entries
        int numContainers = getNumContainers();
        for ( int i = 0 ; i < numContainers ; i++) {
            System.out.print("What's in container #" + (i+1));
            train.addContainers(scnr.next()) ;
        }
    }

    /**
     * asks user for the number containers on the train,
     * only takes a valid index
     * @return a valid index for an array or arraylist
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
     * unloads the train based on user preference
     * @param train an object containing the train's container log/list
     */


    public static void unloadTrain(Train train) {
        String frontOrBack ;                  // user's preference for train ordering

        System.out.print("Unload from front or back? (f/b)");
        frontOrBack = scnr.next() ;           // assigns user's preference

        // determines whether the user wants the the train to log front to back or vice versa
        if (frontOrBack.charAt(0) == 'f') {
            for (int i = 0 ; i < train.length()  ; i++){
                System.out.println("Unloading " + train.getContainers(i) + ".");
            }
        }
        else if (frontOrBack.charAt(0) == 'b'){
            // prints out the log of the train's content in reverse order
            for ( int i = train.length() - 1 ; i >= 0 ; i-- ) {
                System.out.println("Unloading " + train.getContainers(i)+ "." );
            }
        }


    }

}
