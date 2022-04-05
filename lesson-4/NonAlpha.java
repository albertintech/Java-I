import java.util.Scanner;

public class NonAlpha {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String sentence = scnr.nextLine();
        String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i)))
                result += sentence.charAt(i);
        }
        System.out.println(result);
        scnr.close();
    }
}
