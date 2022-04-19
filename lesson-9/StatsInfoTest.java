public class StatsInfoTest {
    public static void main(String[] args) {
        StatsInfo testData = new StatsInfo();
        // check set/get num1
        testData.setNum1(100);
        if (testData.getNum1() != 100) {
            System.out.println("   FAILED set/get num1");
        }

        // Check set/get num2
        testData.setNum2(50);
        if (testData.getNum2() != 50) {
            System.out.println("   FAILED set/get num2");
        }

        // Check getAverage()
        testData.setNum1(10);
        testData.setNum2(20);
        if (testData.getAverage() != 15) {
            System.out.println("   FAILED GetAverage for 10, 20");
        }
        System.out.println(testData.getAverage());
        testData.setNum1(-10);
        testData.setNum2(0);
        if (testData.getAverage() != -5) {
            System.out.println("   FAILED GetAverage for -10, 0");
        }
        System.out.println(testData.getAverage());
        System.out.println("Tests complete.");
    }
}
