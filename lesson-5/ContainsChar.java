import java.util.Scanner;

public class ContainsChar {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        char ch = scanner.next().charAt(0);

        int count = 0;
        String[] wordsContainingChar = new String[n];
        for (String word : words) {
            if (word.indexOf(ch) != -1) {
                wordsContainingChar[count++] = word;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(wordsContainingChar[i] + ",");
        }
        System.out.println();
    }
}
