package FinalProject;

import java.security.SecureRandom;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }

    public int roll() {
        int faceValue;
        SecureRandom randGen = new SecureRandom();

        faceValue = randGen.nextInt(10) + 1;
        return faceValue;
    }

    public boolean equals(Die x, Die y) {
        if (x.faceValue == y.faceValue) {
            return true;
        } else {
            return false;
        }
    }

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
