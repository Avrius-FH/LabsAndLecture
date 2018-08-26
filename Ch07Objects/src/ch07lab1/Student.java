package ch07lab1;


/**
 * StudentTest class that sets and gets first name, last name, and GPA
 * 04/10/2018
 * @ Forrest Halterman
 * @ Randall Guidry
 */

public class Student {
    private String lastName = " ";                // a student's last name
    private String firstName = " ";               // a student's first name
    private double gpa = 0.0;                     // a student's gpa
    private final double GPA_MIN = 0.0 ;          // minimum gpa possible
    private final double GPA_MAX = 4.0 ;          // maximum gpa possible


    //Getters (Accessors)

    /**
     * outputs last name of student
     * @return the last name of student
     */

    public String getLastName () {
        return lastName ;
        }

    /**
     * outputs first name of student
     * @return first name
     */

    public String getFirstName () {
        return firstName ;
    }

    /**
     * outputs GPA of a student
     * @return GPA score #.##...
     */

    public double getGpa () {
        return gpa ;
        }

    // Setters (Mutators)

    /**
     * sets main input as the student's last name
     * @param lName a student's last name as input
     */

    public void setLastName ( String lName) {
        lastName = lName ;
    }

    /**
     * sets main input as student's first name
     * @param fname student's first name as input
     */

    public void setFirstName (String fname){
        firstName = fname ;
    }

    /**
     * sets GPA based on main input
     * 0.0 >= GPA >= 4.0
     * @param studentGPA main input as GPA decimal
     */
    public void setGpa (double studentGPA) {


        if ( studentGPA >= GPA_MIN  && studentGPA <= GPA_MAX ) {
            gpa = studentGPA ;
        }

        else if ( studentGPA < GPA_MIN) {
            gpa = GPA_MIN ;
        }
        else {
            gpa = GPA_MAX ;
        }

    }






}
