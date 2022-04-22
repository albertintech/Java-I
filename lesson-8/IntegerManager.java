import java.util.ArrayList;

public class IntegerManager {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(4);
        intList.add(9);

        intList.set(0, intList.get(2) - intList.get(1));
        intList.set(2, intList.get(0) - intList.get(1));

        System.out.println(intList.get(2) + " " + intList.get(1));
    }
}
