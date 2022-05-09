package FinalProject;

import java.util.Scanner;

public class DoubleDice {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double playerCash = 0.0;
        double bet = 0.0;
        int faceValue1 = 0;
        int faceValue2 = 0;
        Die myDie = new Die();

        System.out.println("You have: " + playerCash);
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much would you like to bet (Enter 0 to quit)? ");
        bet = scnr.nextDouble();
        System.out.println("You bet: " + bet);
        faceValue1 = myDie.roll();
        faceValue2 = myDie.roll();
        System.out.println("You rolled a " + myDie.toString(faceValue1)
                + " and " + myDie.toString(faceValue2));
        System.out.println("You win/lose: " + playerCash);

    }
}
