import java.util.Scanner;

public class Mathy {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double x = 3.6;
        double y = 4.5;
        double z = 2.0;

        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        System.out.print(Math.pow(x, z) + " ");
        System.out.print(Math.pow(x, Math.pow(y, z)) + " ");
        System.out.print(Math.abs(y) + " ");
        System.out.println(Math.sqrt(Math.pow(x * y, z)));

        scnr.close();
    }

}
