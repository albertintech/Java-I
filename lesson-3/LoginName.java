/*
Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input. Output the login name, which is made up of the first five letters of the last name, followed by the first letter of the first name, and then the last two digits of the number (use the % operator). If the last name has less than five letters, then use all letters of the last name.
*/

import java.util.Scanner;

public class LoginName {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        String loginName;
        int fourDigits;

        firstName = scnr.next();
        lastName = scnr.next();
        fourDigits = scnr.nextInt();

        loginName = lastName;
        if (lastName.length() > 5) {
            loginName = lastName.substring(0, 5);
        }
        loginName += firstName.charAt(0);
        loginName += (fourDigits % 100);

        System.out.println("Your login name: " + loginName);

        scnr.close();
    }
}
