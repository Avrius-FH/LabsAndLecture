package ch02lab01;
import java.util.Scanner;

/**
 * <Lab1.2>
 * 1/23/2018
 * @author Forrest Halterman
 * @author Bunguiu Ruben Norales
 */



public class TrainWeight {                          // Calculates the weight of an empty train
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        final double LOCOMOTIVE_WEIGHT  = 423000.0; // the constant weight for locomotives
        final double FREIGHT_CAR_WEIGHT = 58000.0;  // the constant weight for freight cars
        int              numLocomotives = 0;        // number of locomotives the train has
        int                numTrainCars = 0;        // number of freight cars the train has
        double    totalLocomotiveWeight = 0.0;      // Lbs of all locomotives added together
        double    totalFreightCarWeight = 0.0;      // Lbs of all freight cars added together
        double         totalEmptyWeight = 0.0;      // the total weight of the empty train

        System.out.print("Please enter the number of engines for the train: ");
        numLocomotives = scnr.nextInt();            // assigns user's input as # of locomotives

        System.out.print("Please enter the number of car for the train: ");
        numTrainCars = scnr.nextInt();              // assigns user's input as # of train cars

        // multiplies the # of locomotives by their weight
        totalLocomotiveWeight = numLocomotives * LOCOMOTIVE_WEIGHT;
        // multiplies the # of freight cars by their weight
        totalFreightCarWeight = numTrainCars * FREIGHT_CAR_WEIGHT;
        // The sum of freight cars and locomotives
        totalEmptyWeight = totalLocomotiveWeight + totalFreightCarWeight;
        //final output statement for the total weight of the train
        System.out.println("The total train weight is " + totalEmptyWeight + " pounds." );

        return;













    }
}
