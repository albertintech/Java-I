import java.util.Scanner;

public class PyramidVol2 {

    public static double calcBaseArea(double baseLength, double baseWidth) {
        return baseLength * baseWidth;
    }

    public static double calcPyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {
        double baseArea;
        baseArea = calcBaseArea(baseLength, baseWidth);
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

        System.out.println("Volume: " + calcPyramidVolume(userLength, userWidth, userHeight));
    }
}

