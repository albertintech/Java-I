/*
Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.
*/

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        double dollars;

        final double Q_VALUE = 0.25;
        final double D_VALUE = 0.10;
        final double N_VALUE = 0.05;
        final double P_VALUE = 0.01;

        Scanner scnr = new Scanner(System.in);
        pennies = scnr.nextInt();
        quarters = scnr.nextInt();
        dimes = scnr.nextInt();
        nickels = scnr.nextInt();

        dollars = (quarters * Q_VALUE) + (dimes * D_VALUE) +
                (nickels * N_VALUE) + (pennies * P_VALUE);

        System.out.printf("Amount: $%.2f\n", dollars);

        scnr.close();
    }
}
