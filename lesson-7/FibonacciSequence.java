import java.util.Scanner;

public class FibonacciSequence {

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        int f0 = 0, f1 = 1, f;

        for (int i = 0; i < n; ++i) {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f0;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }
}
