
import java.util.Scanner;

public class ArrayReversal {

    public static void reverseVals(int[] arrVals) {
        int i; // Loop index
        int tempValue;

        for (i = 0; i < (arrVals.length / 2); ++i) {
            tempValue = arrVals[i]; // Do swap
            arrVals[i] = arrVals[arrVals.length - 1 - i];
            arrVals[arrVals.length - 1 - i] = tempValue;
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALUES = 8; // Array size
        int[] userVals = new int[NUM_VALUES]; // User values
        int i; // Loop index

        // Prompt user to populate array
        System.out.println("Enter " + userVals.length + " values...");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print("Value:  ");
            userVals[i] = scnr.nextInt();
        }

        // Array values as entered by user
        System.out.print("\nOriginal values: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();

        // Call method to reverse array values
        reverseVals(userVals);

        // Print updated arrays
        System.out.print("\nReversed values: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();
    }
}
