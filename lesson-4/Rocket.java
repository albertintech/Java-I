import java.util.Scanner;

public class Rocket {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rocketHeight = 0;
        int initialVelocity = 0;
        int timeSinceLaunch = 0;

        initialVelocity = scnr.nextInt();

        while (rocketHeight >= 0) {
            System.out.println(timeSinceLaunch + " " + rocketHeight);
            timeSinceLaunch = timeSinceLaunch + 1;
            rocketHeight = (initialVelocity * timeSinceLaunch) - (5 * timeSinceLaunch * timeSinceLaunch);
        }
        scnr.close();
    }
}
