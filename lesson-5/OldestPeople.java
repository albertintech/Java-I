import java.util.Scanner;

public class OldestPeople {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] oldestPeople = new int[5];
        int nthPerson; // User input, Nth oldest person

        oldestPeople[0] = 122; // Died 1997 in France
        oldestPeople[1] = 119; // Died 1999 in U.S.
        oldestPeople[2] = 117; // Died 1993 in U.S.
        oldestPeople[3] = 117; // Died 1998 in Canada
        oldestPeople[4] = 116; // Died 2006 in Ecuador

        System.out.print("Enter N (1-5): ");
        nthPerson = scnr.nextInt();

        if ((nthPerson == 4) || (nthPerson == 5)) {
            System.out.print("The " + nthPerson + "th oldest person lived ");
            System.out.println(oldestPeople[nthPerson - 1] + " years.");
        }
        if (nthPerson == 3) {
            System.out.print("The " + nthPerson + "rd oldest person lived ");
            System.out.println(oldestPeople[nthPerson - 1] + " years and died in 1993 in the United States.");
        }
        if (nthPerson == 2) {
            System.out.print("The " + nthPerson + "nd oldest person lived ");
            System.out.println(oldestPeople[nthPerson - 1] + " years and died in 1999 in the United States.");
        }
        if (nthPerson == 1) {
            System.out.print("The " + nthPerson + "st oldest person lived ");
            System.out.println(oldestPeople[nthPerson - 1] + " years and died in 1997 in France.");
        }
        scnr.close();
    }
}
