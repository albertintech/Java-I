import java.util.Scanner;

public class Normalizing {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        while (size <= 0) {
            size = scan.nextInt();
        }

        float weights[] = new float[size];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = scan.nextFloat();
        }

        float max = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (max < weights[i]) {
                max = weights[i];
            }
        }

        for (int i = 0; i < weights.length; i++) {
            weights[i] = weights[i] / max;
        }

        for (int i = 0; i < weights.length; i++) {
            System.out.printf("%.2f ", weights[i]);
        }
        System.out.println();
    }
}
