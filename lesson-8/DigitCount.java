import java.util.Scanner;

public class DigitCount {
    public static int digitCount(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 1 + digitCount(n / 10);
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num, digits;

        num = scnr.nextInt();
        digits = digitCount(num);
        System.out.println(digits);
    }
}
