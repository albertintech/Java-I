import java.util.Scanner;

public class OutputValues {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int n, m;

        n = scnr.nextInt();
        for (int i = 0; i < n; i++) {
            userValues[i] = scnr.nextInt();
        }
        m = scnr.nextInt();
        for (int i = 0; i < n; i++) {
            if (userValues[i] <= m) {
                System.out.print(userValues[i] + ",");
            }
        }
        System.out.println();
    }
}
