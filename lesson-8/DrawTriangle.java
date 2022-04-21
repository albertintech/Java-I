import java.util.Scanner;

public class DrawTriangle {

    public static void drawTriangle(int baseLength) {
        if (baseLength <= 0)
            return;
        else {
            drawTriangle(baseLength - 2);
            int temp = baseLength / 2;

            for (int i = 0; i < 9 - temp; i++)
                System.out.print(" ");

            for (int i = 0; i < baseLength; i++)
                System.out.print("*");

            System.out.println();
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseLength;

        baseLength = scnr.nextInt();
        drawTriangle(baseLength);
    }
}
