import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char ch = scnr.next().charAt(0);
        String line = scnr.nextLine();
        int charCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch)
                ++charCount;
        }
        if (charCount == 1) {
            System.out.println(charCount + " " + ch);
        } else {
            System.out.println(charCount + " " + ch + "'s");
        }
        scnr.close();
    }
}
