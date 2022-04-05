import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n;
        int i;

        System.out.println("Enter an integer:");
        n = scnr.nextInt();
        scnr.close();

        System.out.print("Sequence: ");

        if (n < 0) {
            n = 0;
        }

        if ((n % 2) == 1) {
            n = n - 1;
        }

        for (i = n; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
