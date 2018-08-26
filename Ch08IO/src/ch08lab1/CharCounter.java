package ch08lab1;

import java.io.*;
import java.io.PrintWriter ;
import java.util.Scanner;

/**
 * Counts characters and lines in a text file and writes them to another text file
 * 04/24/2018
 * @author Forrest Halterman
 * @author Randall Guidry
 * @author John Maxfield
 */

public class CharCounter {
    public static Scanner scnr = new Scanner(System.in); // user input

    /**
     * outline of the program
     *
     * @param args unused
     * @throws IOException if something goes horribly wrong with file I/0
     */

    public static void main ( String[] args ) throws IOException {
        FileInputStream inFile ;          // the input file
        FileOutputStream outFile ;        // the output file
        String message ;                  // results of counting lines/chars in the input file

        inFile = getInfile() ;

        if(inFile != null) {
            outFile = getOutfile() ;
            message = readAndWrite(inFile, outFile) ;
            System.out.println( message);
        }

    }

    /**
     * Creates an input object based on .txt file given by the user
     * @return input object reference
     * @throws FileNotFoundException error if the file cannot be found or accessed
     */

    public static FileInputStream getInfile  () throws FileNotFoundException  {
        String inputFileName ;                                     // txt file name
        System.out.print("Enter the name of the input file: ");
        inputFileName = scnr.next() ;
        // txt file as input
        FileInputStream inStream = new FileInputStream(inputFileName);

        return inStream ;
    }

    /**
     * Creates an output object that creates a .txt file defined by user input
     * @return output object reference
     * @throws IOException if something bad happens with the IO
     */

    public static FileOutputStream getOutfile () throws IOException {
        String outputFileName ;             // user defined file name
        System.out.print( "Enter the name of the output file: ");
        outputFileName = scnr.next() ;

        // creates output file and a reference for writing to it
        FileOutputStream outStream = new FileOutputStream( outputFileName) ;

        return outStream ;
    }

    /**
     * For each line within input Object, method writes the line number and # of characters
     * to output object
     * @param inFile    input object ref that uses input txt file
     * @param outFile   output object ref that uses output txt file
     * @throws IOException just in case the file can't close or anything else goes wrong
     * @return a string that displays number of lines and total number of characters
     */
    public static String readAndWrite (FileInputStream inFile , FileOutputStream outFile)
            throws IOException {
        Scanner readInFile = new Scanner(inFile);            // for reading input file
        PrintWriter writeOutFile = new PrintWriter(outFile); // writes to output file
        String fileLineInput;                                // line taken from input file
        int lnCount = 0;                                     // counts lines in  input file
        int charCountr = 0;                                  // counts characters in input file

        while (readInFile.hasNextLine()) {

            fileLineInput = readInFile.nextLine();

            writeOutFile.printf("%-9d %9d ", lnCount, fileLineInput.length()) ;
            writeOutFile.println();

//            System.out.printf("%-9d %9d", lnCount, fileLineInput.length() ) ;
//            System.out.println () ;

            charCountr = charCountr + fileLineInput.length();
            lnCount++;
        }

        writeOutFile.flush();
        writeOutFile.close();

        return "The input file has " + lnCount + " lines and " + charCountr + " total characters.";
    }


}

