package ch04lab1;

import java.util.Scanner ;

public class CharacterTables2
{
    public static void main ( String [] args)
    {
        Scanner scnr = new Scanner(System.in) ;
        final int MIN_INPUT = 0 ;
        final int MAX_INPUT = 118 ;
        final int NUM_ROW = 10 ;
        String userInput ;
        int userNum ;
        int initialNum ;
        char userChar ;
        int i ;
        boolean validEntry ;

        do
        {

            validEntry = true ;
            System.out.print("Enter your number");
            userInput = scnr.next();
            if (!(userInput.length() <= 3 && userInput.length() > 0))
            {
                System.out.println ("Invalid Input");
                break;


            }
            else

            {
                for (i = 0; i < userInput.length(); i++) {
                    if (!Character.isDigit(userInput.charAt(i))) {
                        validEntry = false;
                        break;
                    }
                }
                if (validEntry) {


                    userNum = Integer.parseInt(userInput);
                    initialNum = userNum ;
                    if (userNum >= MIN_INPUT && userNum <= MAX_INPUT)
                    {
                        for (i = 0; i < NUM_ROW; i++) {
                            if (initialNum + i <= MAX_INPUT) {
                                userChar = (char) userNum;
                                System.out.print(userNum);
                                System.out.println(" " + userChar);
                                ++userNum;
                            }
                        }
                    }
                    else
                    {
                        System.out.println ("Invalid Input");
                        break;
                    }


                }

                else {
                    System.out.println ("Invalid Input");
                    break;

                }

            }
            System.out.print("Press C or Q to continue: ");
            userInput = scnr.next() ;

        }while (userInput.equals("C"));
    }
}