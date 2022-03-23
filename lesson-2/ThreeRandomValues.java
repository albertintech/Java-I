import java.util.Random;

public class ThreeRandomValues {
   public static void main(String[] args) {
      Random randGen = new Random();  // New random number generator

      System.out.println(randGen.nextInt());
      System.out.println(randGen.nextInt());
      System.out.println(randGen.nextInt());
   }
}
