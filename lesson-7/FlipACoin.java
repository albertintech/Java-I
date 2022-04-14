import java.util.Scanner;
import java.util.Random;

public class FlipACoin {

    public static String coinFlip(Random rand) {
        int result;
        result = rand.nextInt(2);
        if (result == 0) {
            return "Tails";
        } else {
            return "Heads";
        }
    }

    @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      // Add more variables as needed
      int flips = scnr.nextInt();
      
      for (int i = 0; i < flips; ++i) {
         System.out.println(coinFlip(rand));
      }
   }
}
