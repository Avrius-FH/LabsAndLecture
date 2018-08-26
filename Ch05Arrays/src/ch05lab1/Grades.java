package ch05lab1;
import java.util.Scanner ;

/*
* Records the classes grades and then determines the average, worst, and best of the class.
* 03/11/2018
* @author Forrest Halterman
*/

public class Grades {
    public static void main (String [] args){
        Scanner scnr = new Scanner (System.in);            // takes user input

        final int CLASS_SIZE = 7 ;                         // the number of grades to be entered
        double[] recordedGrades = new double[CLASS_SIZE] ; // stores the user-inputted grades
        double userInput;                                  // stores user input
        double sumGrade ;                                  // the sum total of all grades
        double averageGrade ;                              // the average of all grades
        double lowestGrade ;                               // the lowest of all grades
        double highestGrade ;                              // highest of grades entered
        int i;                                             // looping number


        // records the grades
        for (i = 0 ; i < recordedGrades.length ; i++) {
            System.out.print("Enter grade for quiz " + (i+1) + ":");
            userInput = scnr.nextDouble() ;                // assigns user input
            recordedGrades[i] = userInput ;                // stores the grades
        }
        sumGrade = 0 ;                                     // sets the initial sum to zero
        // adds all the grades together
        for ( i = 0 ; i < recordedGrades.length ; i++) {
            sumGrade = sumGrade + recordedGrades[i] ;
        }

        averageGrade = sumGrade / recordedGrades.length ; // averages the grades and assigns

        lowestGrade = recordedGrades[0];                  // sets the initial lowest grade
        // compares all the grades and takes the lowest
        for ( i = 0 ; i < recordedGrades.length ; i++){
            if (lowestGrade > recordedGrades[i]) {
                lowestGrade = recordedGrades[i] ;         // assigns the lowest grade
            }
        }

        highestGrade = recordedGrades[0] ;               // sets the initial highest grade
        // compares all the grades and takes the highest
        for (i = 0 ; i < recordedGrades.length ; i++) {
            if (highestGrade < recordedGrades[i]) {
                highestGrade = recordedGrades[i] ;      // assigns the highest grade
            }
        }

        System.out.println("The average grade is: " + averageGrade);
        System.out.println("The lowest grade is: " + lowestGrade);
        System.out.println("The highest grade is: " + highestGrade);


    }
}
