package ro.mirodone;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int p1, p2, d1, d2, pTotal, dTotal, card;
        String pChoice = "hit";

        System.out.println( "Welcome to Blackjack Table!" );
        System.out.println();

        p1 = 2 + r.nextInt(10);
        p2 = 2 + r.nextInt(10);
        d1 = 2 + r.nextInt(10);
        d2 = 2 + r.nextInt(10);
        pTotal = p1 + p2;
        dTotal = d1 + d2;

        System.out.println( "You get a " + p1 + " and a " + p2 + "." );
        System.out.println( "Your total is " + pTotal + "." );
        System.out.println();
        System.out.println( "The dealer has a " + d2 + " showing, and a hidden card." );
        System.out.println( "His total is hidden, too." );

        while ( pTotal < 22 && pChoice.equals("hit") ) {

            System.out.print( "Would you like to \"hit\" or \"stay\"? " );
            pChoice = keyboard.next();

            if ( pChoice.equals("hit") ) {
                card = 2 + r.nextInt(10);
                pTotal += card;

                System.out.println( "You drew a " + card + "." );
                if ( pTotal > 21 ) {
                    System.out.println( "Bust!" );
                } else {
                    System.out.println( "Your total is " + pTotal + "." );
                }

            }

            System.out.println();
        }

        System.out.println( "Okay, dealer's turn." );
        System.out.println( "His hidden card was a " + d1 + "." );
        System.out.println( "His total was " + dTotal + "." );
        System.out.println();

        while ( dTotal <= 17 && pTotal <= 21 ) {

            card = 2 + r.nextInt(10);
            dTotal += card;

            System.out.println( "Dealer chooses to hit." );
            System.out.println( "He draws a " + card + "." );
            if ( dTotal > 21 ) {
                System.out.println( "Bust!" );
            } else {
                System.out.println( "His total is " + dTotal + "." );
            }

            System.out.println();
        }

        if ( dTotal <= 21 )  {
            System.out.println( "Dealer Stays." );
            System.out.println();
        }

        if ( dTotal > 21 ) {
            System.out.println( "Dealer bust" );
        } else {
            System.out.println( "Dealer total is " + dTotal + "." );
        }

        if ( pTotal > 21 ) {
            System.out.println( "You bust" );
        } else {
            System.out.println( "Your total is " + pTotal + "." );
        }

        System.out.println();

        if ( pTotal > 21 ) {
            System.out.println( "DEALER WINS!" );
        } else if ( dTotal > 21 ) {
            System.out.println( "YOU WIN!" );
        } else if ( pTotal > dTotal ) {
            System.out.println( "YOU WIN!" );
        } else if ( dTotal > pTotal ) {
            System.out.println( "DEALER WINS!" );
        } else {
            System.out.println( "IT'S A TIE!" );
        }

    }

}
