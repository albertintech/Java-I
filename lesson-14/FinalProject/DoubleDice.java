package FinalProject;

import java.util.Scanner;

public class DoubleDice {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double playerCash = 200.0;
        double bet = 0.0;
        double betWin = 0.0;
        double betLoss = 0.0;
        int faceValue1 = 0;
        int faceValue2 = 0;
        Die myDie1 = new Die();
        Die myDie2 = new Die();

        while (playerCash > 0.0) {
            System.out.printf("You have: $%.2f\n", playerCash);
            Scanner scnr = new Scanner(System.in);
            System.out.print("How much would you like to bet (Enter 0 to quit)? ");
            bet = scnr.nextDouble();
            if (bet == 0) {
                break;
            } else {
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
            }
        }
        System.out.println("Goodbye!");
    }
}
