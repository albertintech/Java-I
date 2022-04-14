import java.util.Scanner;

public class GasVolume {
    final static double GAS_CONST = 8.3144621;

    public static double computeGasVolume(double pressure, double temp, double moles) {
        return (moles * GAS_CONST * temp) / pressure;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double gasPressure;
        double gasMoles;
        double gasTemperature;
        double gasVolume;

        gasPressure = scnr.nextDouble();
        gasMoles = scnr.nextDouble();
        gasTemperature = scnr.nextDouble();

        gasVolume = computeGasVolume(gasPressure, gasTemperature, gasMoles);
        System.out.println("Gas volume: " + gasVolume + " m^3");
    }
}
