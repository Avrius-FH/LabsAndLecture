package challenges_lessons;

import java.util.Scanner;

public class GameBoardPrinter {
    public static void printTicTacToe(char horizChar, char vertChar) {

        int count = 0 ;
        for (int j = 3 ; j > 0 ; j-- ) {

            for ( int i = 3 ; i > 0 ; i-- ){
                System.out.print ("x");
                if ( !(i <= 1)) {
                    System.out.print("" + vertChar);
                }
            }
            System.out.println () ;

            if ( count >= 2 ) {
                break ;
            }
            else {
                for (int x = 5 ; x > 0 ; x--) {
                    System.out.print ("" + horizChar ) ;
                }
                System.out.println () ;
                count++ ;

            }
        }


        return;
    }

    public static void main (String [] args) {
        printTicTacToe('~', '!');

        return;
    }
}