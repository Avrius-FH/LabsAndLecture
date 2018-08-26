package ch03lab1;
import java.util.Scanner;

/*
* Determines the user's eligibility for the United States Congress
* 02/07/2018
* @author Forrest Halterman
* @author Bunguiu Ruben Norales
*/

public class CongressEligibility {
    public static void main (String [] args){
        Scanner scnr = new Scanner (System.in);

        final int MIN_SENATOR = 30 ;                 // Minimum age for a Senator
        final int MIN_REPRESENTATIVE = 25 ;          // Minimum age for a representative
        final int MIN_SENATOR_CITIZEN = 9 ;          // Minimum citizenship for a Senator
        final int MIN_REPRESENTATIVE_CITIZEN = 7 ;   // Minimum citizenship for a representative
        int userAge;                                 //  user's age
        int yearsCitizen;                            // user's years of citizenship


        System.out.print ("What's your age?");
        userAge = scnr.nextInt();                   //assigns user's age

        System.out.print ("How long have you been a citizen of the United States?") ;
        yearsCitizen = scnr.nextInt () ;           //assigns user's years of citizenship

       // determines senator eligibility based on citizenship and age
       if (userAge >= MIN_SENATOR && yearsCitizen >= MIN_SENATOR_CITIZEN) {
           System.out.print ("You are eligible to be a member of the House or the Senate.");

       }

       // determines representative eligibility  based on citizenship and age
       else if (userAge >= MIN_REPRESENTATIVE && yearsCitizen >= MIN_REPRESENTATIVE_CITIZEN){
           System.out.print ("You are eligible to be a member of the House.");

       }
       // outputs a statement disqualifying the user for position in Congress
       else {
           System.out.print("You are not eligible to be a member of Congress.");
       }
    }
}
