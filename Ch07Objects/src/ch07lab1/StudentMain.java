package ch07lab1;
import java.util.Scanner;

/**
 * Creates a list of student GPAs
 * 04/10/2017
 * @ Forrest Halterman
 * @ Randall Guidry
 */

public class StudentMain {

    public static Scanner scnr = new Scanner(System.in);      // for user input

    /**
     * Builds a list of students and their GPAs by creating StudentTest Objects
     * @param args unused console array
     */
    public static void main ( String [] args) {
        Student[] studentsGPAs;                     // set of students and their GPA


        System.out.print("Enter number of students: ") ;
        studentsGPAs = new Student[scnr.nextInt()] ;          // determining # of students

        // filling with objects
        for(int i = 0 ; i < studentsGPAs.length ; i ++ ) {
            studentsGPAs[i] = new Student() ;
        }

        // asking user for names and GPA
        for ( int i = 0 ; i < studentsGPAs.length ; i++) {

            System.out.print("Enter first name for student #" + (i +1));
            studentsGPAs[i].setFirstName(scnr.next());
            System.out.print ("Enter first name for student #" + (i+1)) ;
            studentsGPAs[i].setLastName(scnr.next());
            System.out.print ("Enter GPA for student#" + (i+1));
            studentsGPAs[i].setGpa(scnr.nextDouble());

        }

        // displaying results
        for ( int i = 0 ;  i < studentsGPAs.length ; i ++ ) {
            System.out.print(studentsGPAs[i].getFirstName() + " " + studentsGPAs[i].getLastName());
            System.out.println(" GPA: " + studentsGPAs[i].getGpa());
        }


    }
}
