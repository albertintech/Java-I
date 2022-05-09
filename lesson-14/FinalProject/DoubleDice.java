package FinalProject;
// package L14_FinalProject;
import java.util.Scanner;

public class DoubleDice {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double playerCash = 0.0;
        double bet = 0.0;
        int faceValue = 3;

        System.out.println("You have: " + playerCash);
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much would you like to bet (Enter 0 to quit)? ");
        bet = scnr.nextDouble();
        System.out.println("You bet: " + bet);
        //System.out.println("You rolled a " + die.roll() + " and " + die.roll());
        System.out.println("You win/lose: " + playerCash);
        Die myDie = new Die();
        System.out.println("ToString test: " + myDie.toString(faceValue));

        // TODO: Reference your Die Class and corresponding methods for die
        // rolling.

    }
}
