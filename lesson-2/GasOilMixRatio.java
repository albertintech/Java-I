import java.util.Scanner;

public class GasOilMixRatio {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double gasVolume;
        double oilVolume;
        double mixRatio;

        System.out.print("Enter gas volume: ");
        gasVolume = scnr.nextDouble();

        System.out.print("Enter oil volume: ");
        oilVolume = scnr.nextDobule();

        mixRatio = gasVolume / oilVolume;

        System.out.print("Gas to oil mix ratio is " +
            mixRatio + ":1");
    }
}
