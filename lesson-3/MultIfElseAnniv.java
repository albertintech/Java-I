import java.util.Scanner;

public class MultIfElseAnniv {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numYears;

        System.out.print("Enter number years married: ");
        numYears = scnr.nextInt();

        if (numYears == 1) {
            System.out.println("Your first year -- great!");
        } else if (numYears == 10) {
            System.out.println("A whole decade -- impressive.");
        } else if (numYears == 25) {
            System.out.println("Your silver anniversary -- enjoy.");
        } else if (numYears == 50) {
            System.out.println("Your golden anniversary -- amazing.");
        } else {
            System.out.println("Nothing special.");
        }
        scnr.close();
    }
}
