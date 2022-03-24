import java.util.Random;

public class ThreeRandomValues {
   public static void main(String[] args) {
      Random randGen = new Random();  // New random number generator

      // System.out.println(randGen.nextInt(11));
      // System.out.println(randGen.nextInt(13));
      // System.out.println(randGen.nextInt(17));
      System.out.println(randGen.nextInt(11) + 10);
      System.out.println(randGen.nextInt(41) + -20);
   }
}
