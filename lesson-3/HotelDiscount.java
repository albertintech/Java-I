import java.util.Scanner;

public class HotelDiscount {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hotelRate;
        int numYears;

        hotelRate = 150;

        System.out.print("Enter years married: ");
        numYears = scnr.nextInt();

        if (numYears >= 25) {
            System.out.print("Congrats on " + numYears + " years ");
            System.out.println("of marriage!");

            hotelRate = hotelRate / 2;
        }

        System.out.print("Your hotel rate: ");
        System.out.println(hotelRate);
        scnr.close();
    }
}
