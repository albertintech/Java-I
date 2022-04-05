import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String s = scnr.nextLine();
        while (!(s.equals("Done") || s.equals("done") || s.equals("d"))) {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
            s = scnr.nextLine();
        }
        scnr.close();
    }
}
