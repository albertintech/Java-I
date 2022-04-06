import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int test = 0;
        do {
            final int NUM_ELEMENTS = 8;
            int[] userVals = new int[NUM_ELEMENTS];
            int i;

            // Prompt user to populate array
            System.out.println("Enter " + NUM_ELEMENTS + " integer values: ");
            for (i = 0; i < userVals.length; ++i) {
                userVals[i] = scnr.nextInt();
                System.out.println("Value added to array: " + userVals[i]);
            }

            // Determine largest (max) number
            int maxVal = userVals[0];
            for (i = 0; i < userVals.length; ++i) {
                if (userVals[i] > maxVal) {
                    maxVal = userVals[i];
                }
            }
            System.out.println("The largest value in the array is: " + maxVal);
        } while (test != 0);
        scnr.close();
    }
}
