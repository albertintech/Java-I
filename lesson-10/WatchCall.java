import java.util.ArrayList;

public class WatchCall {
    public static void main(String[] args) {
        WatchSmart watch1;
        Watch watch2;
        Watch watch3;

        ArrayList<Watch> watchList = new ArrayList<Watch>();
        int i;

        watch1 = new WatchSmart();
        watch1.setHours(5);
        watch1.setMins(22);
        watch1.setPercentage(20);

        watch2 = new Watch();
        watch2.setHours(20);
        watch2.setMins(44);

        watch3 = new Watch();
        watch3.setHours(9);
        watch3.setMins(18);

        watchList.add(watch1);
        watchList.add(watch3);
        watchList.add(watch2);

        for (i = 0; i < watchList.size(); ++i) {
            watchList.get(i).printItem();
        }
    }
}
