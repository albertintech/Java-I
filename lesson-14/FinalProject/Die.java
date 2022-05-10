/*
   Name:  Albert Ramos
   Class: CIS163AA, Lesson 14 Final Project
   Date:  May 9, 2022
   * See notes in DoubleDice.java for details
*/

package FinalProject;

import java.security.SecureRandom; // to generate nondeterministic random numbers

public class Die {
    private int faceValue;

    // Constructor
    public Die() {
        faceValue = 0;
    }

    // roll() method
    public int roll() {
        int faceValue;
        SecureRandom randGen = new SecureRandom();

        faceValue = randGen.nextInt(10) + 1;
        return faceValue;
    }

    // Did not implement this method
    public boolean equals(Die die2) {
        if (die2.faceValue == this.faceValue) {
            return true;
        } else {
            return false;
        }
    }

    // Switch case to return die face value as String
    public String toString(int x) {
        String faceValueAsString;
        switch (x) {
            case 1:
                faceValueAsString = "one";
                break;
            case 2:
                faceValueAsString = "two";
                break;
            case 3:
                faceValueAsString = "three";
                break;
            case 4:
                faceValueAsString = "four";
                break;
            case 5:
                faceValueAsString = "five";
                break;
            case 6:
                faceValueAsString = "six";
                break;
            case 7:
                faceValueAsString = "seven";
                break;
            case 8:
                faceValueAsString = "eight";
                break;
            case 9:
                faceValueAsString = "nine";
                break;
            case 10:
                faceValueAsString = "ten";
                break;
            default:
                faceValueAsString = "Error";
                break;
        }
        return faceValueAsString;
    }
}
