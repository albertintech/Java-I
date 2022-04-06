import java.util.Scanner;

public class ArrayPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;
        int[] userVals = new int[NUM_ELEMENTS];
        int i;

        System.out.println("Enter " + NUM_ELEMENTS + " integer values: ");
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println("Value: " + userVals[i]);
            
        }

        System.out.println("You entered: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }

        System.out.println();
        scnr.close();
    }
}
