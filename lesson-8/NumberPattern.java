import java.util.Scanner;

public class NumberPattern {
    static void printNumPattern(int num1, int num2) {
        if (num1 < 0) {
            System.out.print(num1 + " ");
        } else {
            System.out.print(num1 + " ");

            printNumPattern(num1 - num2, num2);
            System.out.print(num1 + " ");
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printNumPattern(num1, num2);
    }
}
