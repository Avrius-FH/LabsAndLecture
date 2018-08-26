package ch01lab2;

/**
 * <Lab1.2>
 * 1/17/2018
 * @author flh250
 * Forrest Halterman & Bunguiu Ruben Norales
 * CSC 201
 */

import java.util.Scanner;
public class CalcArea {
    public static void main(String[] args) {
        Scanner scnr      = new Scanner(System.in);
        int     triBase   = 0;       // Triangle base (cm)
        int     triHeight = 0;       // Triangle height (cm)
        int     triArea   = 0;        // Triangle area (cm)
        System.out.print("Enter triangle base (cm): ");
        triBase = scnr.nextInt();
        System.out.print("Enter triangle height (cm): ");
        triHeight = scnr.nextInt();
        // Calculate triangle area
        triArea = (triBase * triHeight) / 2;
     // Print triangle base, height, area
     System.out.print("Triangle area = (");
     System.out.print(triBase);
     System.out.print("*");
     System.out.print(triHeight);
     System.out.print(") / 2 = ");
     System.out.print(triArea);
     System.out.println(" cm^2");
     return;
  }
}
