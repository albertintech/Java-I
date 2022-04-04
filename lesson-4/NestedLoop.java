import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i = 0;
        int j = 0;

        System.out.print("Enter a non-zero positive integer: ");
        userNum = scnr.nextInt();
        
        for (i = 0; i <= userNum; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
        scnr.close();
    }
}
