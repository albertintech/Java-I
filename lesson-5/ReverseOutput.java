import java.util.Scanner;

public class ReverseOutput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;

        numElements = scnr.nextInt();

        for (int i = 0; i < numElements; i++) {
            userList[i] = scnr.nextInt();
        }
        for (int i = numElements - 1; i >= 0; i--) {
            System.out.print(userList[i] + ", ");
        }
    }
}
