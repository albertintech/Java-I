/*
   Name:  Albert Ramos
   Class: CIS163AA, Lesson 14 Final Project
   Date:  May 9, 2022
   Notes: Overall, the program behaves well. Please note the following:
       * Did not get the equals() method to work, so I do not use it in main
       * The program will exit the game if given bad input. I think it would
       *    take another loop to avoid this outcome, and I attempted to use one,
       *    but I kept getting infinte loops.
       * The spec calls for the constructor to instantiate the random object, but
       * it made more sense to me to put it int the roll() method
*/

package FinalProject;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math; // To use Math.abs

public class DoubleDice {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Declare variables
        double playerCash = 200.0;
        double bet = 0.0;
        double betWin = 0.0;
        double betLoss = 0.0;
        int faceValue1 = 0;
        int faceValue2 = 0;
        Die myDie1 = new Die();
        Die myDie2 = new Die();

        // Game will continue only as long as player has > $0 on hand
        while (playerCash > 0.0) {
            System.out.printf("You have: $%.2f\n", playerCash);
            Scanner scnr = new Scanner(System.in);
            System.out.print("How much would you like to bet (Enter 0 to quit)? ");

            // Try/catch block performs input validation check
            try {
                bet = scnr.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You must enter whole or decimal numbers only!");
                System.out.println("Goodbye!");
                System.exit(0);
            }

            // Main game logic
            // Game will quit if player bet is equal to zero or gives bad input
            if (bet == 0) {
                break;
            } else if (bet <= playerCash && bet > 0.0) {
                System.out.printf("You bet: $%.2f\n", bet);
                faceValue1 = myDie1.roll();
                faceValue2 = myDie2.roll();
                System.out.println("You rolled a " + myDie1.toString(faceValue1)
                        + " and " + myDie2.toString(faceValue2));
                if (faceValue1 == faceValue2) {
                    betWin = bet * 5;
                    playerCash = playerCash + betWin;
                    System.out.printf("You win: $%.2f\n", betWin);
                } else {
                    betLoss = bet;
                    playerCash = playerCash - betLoss;
                    System.out.printf("You lose: $%.2f\n", bet);
                }
            } else {
                System.out.println("You cannot bet less than zero or more than you have!");
            }
        }

        // Exit messages depending on player cash at end of game
        if (playerCash > 200.0001) {
            System.out.println("See you around, winner!");
        } else if (Math.abs(playerCash) < 0.0001) { // Use the Math.abs to make sure
            System.out.println("You are out of money!");
            System.out.println("Better luck next time!");
        } else {
            System.out.println("Goodbye!");
        }
    }
}
