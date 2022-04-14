import java.util.Scanner;

public class SwapIndices {

    public static void swapValues(int[] array) {
        int temp1;
        int temp2;

        // swap indices 0 and 1
        temp1 = array[1];
        array[1] = array[0];
        array[0] = temp1;

        // swap indices 2 and 3
        temp2 = array[3];
        array[3] = array[2];
        array[2] = temp2;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElem = 4;
        int[] sortArray = new int[numElem];
        int i;

        for (i = 0; i < sortArray.length; ++i) {
            sortArray[i] = scnr.nextInt();
        }

        swapValues(sortArray);

        for (i = 0; i < sortArray.length - 1; ++i) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println(sortArray[sortArray.length - 1]);
    }
}
