import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;
        int sumVal = 0;

        // Prompt user to populate array
        System.out.println("Enter " + NUM_ELEMENTS + " integer values: ");
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println("Value added to array: " + userVals[i]);
        }

        // Determine sum of array
        for (i = 0; i < userVals.length; ++i) {
            sumVal = sumVal + userVals[i];
        }

        System.out.println("Sum of array integers: " + sumVal);
        scnr.close();
    }
}
