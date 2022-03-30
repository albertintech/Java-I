/*
Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.
*/

import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int total = 0;

        Scanner scnr = new Scanner(System.in);
        total = scnr.nextInt();

        if (total <= 0) {
            System.out.println("No change");
        } else if (total >= 100) {
            dollars = total / 100;
                if (dollars > 1) {
                    System.out.println(dollars + " Dollars");
                } else {
                    System.out.println(dollars + " Dollar");
                }
                total = total - (dollars * 100);
            
            if (total >= 25) {
                quarters = total / 25;
                if (quarters > 1) {
                    System.out.println(quarters + " Quarters");
                } else {
                    System.out.println(quarters + " Quarter");
                }
            }
            total = total - (quarters * 25);

            if (total >= 10) {
                dimes = total / 10;
                if (dimes > 1) {
                    System.out.println(dimes + " Dimes");
                } else {
                    System.out.println(dimes + " Dime");
                }
            }
            total = total - (dimes * 10);
            if (total >= 5) {
                nickels = total / 5;
                 if (nickels > 1) {
                    System.out.println(nickels + " Nickels");
                } else {
                    System.out.println(nickels + " Nickel");
                }
            }
            total = total - (nickels * 5);
            if (total > 0) {
                pennies = total;
                if (pennies > 1) {
                    System.out.println(nickels + " Pennies");
                } else {
                    System.out.println(nickels + " Penny");
                }
            }

        } else if (total < 100) {
            if (total >= 25) {
                quarters = total / 25;
                if (quarters > 1) {
                    System.out.println(quarters + " Quarters");
                } else {
                    System.out.println(quarters + " Quarter");
                }
            }
            total = total - (quarters * 25);

            if (total >= 10) {
                dimes = total / 10;
                if (dimes > 1) {
                    System.out.println(dimes + " Dimes");
                } else {
                    System.out.println(dimes + " Dime");
                }
            }
            total = total - (dimes * 10);
            if (total >= 5) {
                nickels = total / 5;
                if (nickels > 1) {
                    System.out.println(nickels + " Nickels");
                } else {
                    System.out.println(nickels + " Nickel");
                }
            }
            total = total - (nickels * 5);
            if (total > 0) {
                pennies = total;
                if (pennies > 1) {
                    System.out.println(nickels + " Pennies");
                } else {
                    System.out.println(nickels + " Penny");
                }
            }
        }
        scnr.close();
    }
}
