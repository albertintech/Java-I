import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int age;
        int weight;
        int heartRate;
        int time;

        age = scnr.nextInt();
        weight = scnr.nextInt();
        heartRate = scnr.nextInt();
        time = scnr.nextInt();

        System.out.println(age);
        System.out.println(weight);
        System.out.println(heartRate);
        System.out.println(time);

        scnr.close();
    }
}
