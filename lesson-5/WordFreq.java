import java.util.Scanner;

public class WordFreq {

    public static int wordFrequency(String[] wordsList, int listSize, String currWord) {
        int wordCount = 0;
        for (int i = 0; i < listSize; ++i) {
            if (wordsList[i].equals(currWord)) {
                wordCount++;
            }
        }
        return wordCount;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[scanner.nextInt()];
        for (int i = 0; i < words.length; ++i) {
            words[i] = scanner.next();
        }
        for (int i = 0; i < words.length; ++i) {
            System.out.println(words[i] + " - " + wordFrequency(words, words.length, words[i]));
        }
    }
}
