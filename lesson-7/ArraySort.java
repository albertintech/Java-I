import java.util.Scanner;

public class ArraySort {

    public static void sortArray(int[] myArr, int arrSize) {
        // sort array using bubble sort so iterate over array
        for (int i = 0; i < arrSize; i++) {
            // iterater array from 1st index to arraysize-1
            for (int j = 1; j < (arrSize - i); j++) {
                // compare adjacent elements and if condition true swap the elements
                if (myArr[j - 1] < myArr[j]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j - 1];
                    myArr[j - 1] = temp;
                }
            }
        }
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int myArr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            myArr[i] = scnr.nextInt();
        }

        sortArray(myArr, arrSize);

        for (int i = 0; i < arrSize; i++) {
            System.out.printf("%d, ", myArr[i]);
        }
    }
}
