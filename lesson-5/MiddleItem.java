import java.util.Scanner;

public class MiddleItem {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];
        int num;
        int i = 0;
        // int n = 0;
        int middle;

        try {
            while (true) {
                num = scnr.nextInt();
                if (num < 0) {
                    break;
                }
                userValues[i++] = num;
                // n++;
            }
            middle = i / 2;
            System.out.println("Middle item: " + userValues[middle]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many numbers");
        }
    }
}
