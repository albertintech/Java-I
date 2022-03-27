import java.util.Scanner;

public class ChangeToDollars {
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
        quarters = scnr.nextInt();
        dimes = scnr.nextInt();
        nickels = scnr.nextInt();
        pennies = scnr.nextInt();

        dollars = (quarters * Q_VALUE) + (dimes * D_VALUE) +
        (nickels * N_VALUE) + (pennies * P_VALUE);

        System.out.printf("Amount: $%.2f\n", dollars);

        scnr.close();
    }
}
