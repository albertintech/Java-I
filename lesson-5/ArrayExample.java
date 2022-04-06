public class ArrayExample {
    public static void main(String[] args) {
        int[] itemCounts = new int[3];
        int[] gameScores;
        gameScores = new int[5];

        itemCounts[0] = 122;
        itemCounts[1] = 119;
        itemCounts[2] = 117;

        gameScores[4] = 99;

        System.out.println(itemCounts[1]);
        System.out.println(gameScores[0]);
        System.out.println(gameScores[4]);
    }
}
