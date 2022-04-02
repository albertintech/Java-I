import java.util.Scanner;

public class CountUp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int currPower;
        char userChar;

        currPower = 2;
        userChar = 'y';

        while (userChar == 'y') {
            System.out.println(currPower);
            currPower *= 2;
            System.out.print("Enter 'y' to continue, any other character to stop: ");
            userChar = scnr.next().charAt(0);
        }

        System.out.println("Done");
        scnr.close();
    }
}
