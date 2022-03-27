import java.util.Scanner;

public class DistanceFormula {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double diff;

        Scanner scnr = new Scanner(System.in);
        x1 = scnr.nextDouble();
        y1 = scnr.nextDouble();
        x2 = scnr.nextDouble();
        y2 = scnr.nextDouble();
        
        diff = (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));

        System.out.println(Math.sqrt(diff));

        scnr.close();
    }
}
