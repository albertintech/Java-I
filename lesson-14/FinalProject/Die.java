package FinalProject;

import java.security.SecureRandom;

public class Die {
    private int faceValue;
    // TODO: create constructor method
    // Initializes the die’s value to 0 and instantiates the Random object.
    public Die() {
        faceValue = 0;
    }
    public static int roll() {
        int faceValue;
        SecureRandom randGen = new SecureRandom();

        faceValue = randGen.nextInt(10) + 1;
        return faceValue;
    }

    public boolean equals(Die die2) {
        if (faceValue != die2.faceValue) {
            return false;
        } else {
            return true;
        }
    }
    // TODO: create toString() method
    // returns the String “one”, “two”, “three”, “four”, “five”, “six”, “seven”,
    // “eight”, “nine”, or “ten” depending on the value of the die.
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
