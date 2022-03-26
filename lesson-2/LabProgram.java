//import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        // Scanner scnr = new Scanner(System.in);

        int num1 = 10000;
        int num2 = 20000;
        int num3 = 30000;
        int num4 = 50000;

        /*
         * num1 = scnr.nextInt();
         * num2 = scnr.nextInt();
         * num3 = scnr.nextInt();
         * num4 = scnr.nextInt();
         */

        int prodInt = (num1 * num2 * num3 * num4);
        int avgInt = (num1 + num2 + num3 + num4) / 4;
        double prodDouble = (double) (num1 * num2 * num3 * num4);
        double avgDouble = (num1 + num2 + num3 + num4) / 4.0;

        System.out.println(prodInt + " " + avgInt);
        System.out.printf("%.3f", prodDouble);
        System.out.print(" ");
        System.out.printf("%.3f", avgDouble);
        System.out.print(" ");

    }
}
