package ch02lab02;
import java.util.Scanner;

/**
 * <Lab2.2>
 * 02/01/2018
 * @author Forrest Halterman
 * @author Bunguiu Ruben Norales
 */

//finds the user's favorite ice cream flavor and calculates how much an ice cream cone would hold
public class IceCreamCone {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);       //initializes Scanner method

        String flavorStatement;                      // exclamation of the user's favorite flavor
        String iceCreamFlavor;                       // the user's favorite flavor
        double coneHeight   = 0.0 ;                  // the height of the ice cream cone
        double coneDiameter = 0.0;                   // the diameter of the ice cream cone
        double coneRadius   = 0.0;                   // half of the cone's diameter
        double coneVolume   = 0.0 ;                  // the total volume of ice cream cone

        System.out.print("What's your favorite ice cream flavor?");
        iceCreamFlavor = scnr.next();                // assigns user's favorite flavor

        System.out.print("Enter the height of the ice cream cone:");
        coneHeight = scnr.nextFloat();               // assigns user input as the cone's height

        System.out.print( "Enter the diameter of the ice cone:" );
        coneDiameter = scnr.nextFloat();             // assigns user input as the cone's diameter

        coneRadius   = coneDiameter / 2.0 ;          //divides diameter to make the radius

        //calculates the volume of the ice cream cone
        coneVolume = (1/3.0) * Math.PI * Math.pow(coneRadius,2) * coneHeight;

        //stores whole string statement
        flavorStatement = "I love " + iceCreamFlavor + " ice cream." ;
        System.out.println (flavorStatement);

        //capitalizes the stored string
        flavorStatement = flavorStatement.toUpperCase();
        System.out.println (flavorStatement);

        //states the number of letters in the favorite flavor
        System.out.print ( "There are " + iceCreamFlavor.length() + " letters in \"");
        System.out.println (iceCreamFlavor + ".\"");

        //States the result of the calculation of the cone's volume
        System.out.print ("An ice cream cone of that size will hold this much " + iceCreamFlavor);
        System.out.print (" ice cream: ");
        System.out.print (coneVolume);




    }
}
