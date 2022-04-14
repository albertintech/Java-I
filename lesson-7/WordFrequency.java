import java.util.Scanner;

public class WordFrequency {

    public static int getWordFrequency(String[] wordsList, int listSize, String currword) {
        int count = 0;
        for (int i = 0; i < listSize; ++i) {
            if (currword.equalsIgnoreCase(wordsList[i])) {
                count += 1;
            }
        }
        return count;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arrSize = scnr.nextInt();

        int[] t = new int[arrSize];
        String[] array = new String[arrSize];

        System.out.println("Please enter strings: ");
        for (int i = 0; i < arrSize; i++) {
            array[i] = scnr.next();
        }

        for (int i = 0; i < arrSize; ++i) {
            t[i] = getWordFrequency(array, arrSize, array[i]);
            System.out.println(array[i] + " " + t[i]);
        }
    }
}
