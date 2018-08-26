package ch03lab01;

import java.util.Scanner;


public class CongressEligibility {
    public static void main (String [] args){
        Scanner scnr = new Scanner (System.in);

        final int minSenator = 30;
        final int minRepresentative = 25;
        int userAge;

        System.out.print ("What's your age?");
        userAge = scnr.nextInt();

       if (userAge >= minSenator) {
           System.out.print ("You are eligible to be a member of the House or the Senate.");

       }
       else if (userAge >= minRepresentative){
           System.out.print ("You are eligible to be a member of the House.");

       }
       else {
           System.out.print("You are not eligible to be a member of Congress.");
       }
    }
}
