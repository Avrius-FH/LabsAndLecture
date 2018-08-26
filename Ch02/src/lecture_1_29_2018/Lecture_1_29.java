package lecture_1_29_2018;

import java.util.Scanner;

/**
 * <purpose>
 * 1/29/2018
 * @author flh250
 */
public class Lecture_1_29 {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);


      /*int num1 = 4;
      int num2 = 3;
      int num3 = 6;
      int numOfnumbers = 3;
      double avgOfNum;
      String message = "Average number?";


      // \t ; \n ; \\ ; one character
      avgOfNum = (num1 + num2 + num3)/ (double) numOfnumbers;
      */

      final double PI_VAL = Math.PI;

      double circleRadius;
      double circleCircumference;
      double circleArea;

      System.out.print("Enter circumference: ");
      circleCircumference = scnr.nextDouble();

      circleRadius = circleCircumference /( 2 * PI_VAL) ;
      circleArea = PI_VAL * (circleRadius * circleRadius);

      System.out.println("Circle area is: " + circleArea);
   }
}
