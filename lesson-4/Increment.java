import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter two numbers with a space in between each : ");
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        scnr.close();

        if (num1 > num2) {
            System.out.print("Second integer can't be less than the first.");
        } else {
            for (int i = num1; i <= num2; i += 5) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
