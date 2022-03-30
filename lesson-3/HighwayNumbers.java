/*
Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.
*/

import java.util.Scanner;

public class HighwayNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        highwayNumber = scnr.nextInt();
        if (highwayNumber > 99 && highwayNumber <= 999 && highwayNumber != 200) {
            primaryNumber = highwayNumber % 100;
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", "
                    + (primaryNumber % 2 == 0 ? "going east/west." : "going north/south."));
        } else if (highwayNumber > 0 && highwayNumber < 100) {
            if (highwayNumber % 2 == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
        scnr.close();
    }
}
