import java.util.Scanner;

public class PyramidVolume {

    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
        double baseArea;
        baseArea = baseLength * baseWidth;
        double volume;
        volume = baseArea * pyramidHeight * (1.0 / 3.0);
        return volume;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));
    }
}
