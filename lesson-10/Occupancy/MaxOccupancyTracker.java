package Occupancy;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MaxOccupancyTracker {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxNumPeople = 10;
        int totalNumPeople = 0;
        
        while (totalNumPeople < maxNumPeople) {   
            try {
                totalNumPeople += scnr.nextInt();
                if (totalNumPeople < 0) {
                    totalNumPeople = 0;
                }
                System.out.println("Occupancy: " + totalNumPeople);
            } catch (InputMismatchException e) {
                scnr.nextLine();
                System.out.println("Error");
            }
        }
        System.out.println("We're full!");
    }
}
