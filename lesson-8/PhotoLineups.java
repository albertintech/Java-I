import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

    public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        if (nameList.isEmpty()) {
            for (int i = 0; i < permList.size() - 1; i++) {
                System.out.print(permList.get(i) + ", ");
            }
            System.out.println(permList.get(permList.size() - 1));
        } else {
            for (int i = 0; i < nameList.size(); ++i) {
                ArrayList<String> newPerm = new ArrayList<String>(permList);
                newPerm.add(nameList.get(i));
                ArrayList<String> newNameList = new ArrayList<String>(nameList);
                newNameList.remove(i);
                printAllPermutations(newPerm, newNameList);
            }
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;
        while (true) {
            name = scnr.next();
            if (name.equals("-1"))
                break;
            nameList.add(name);
        }
        printAllPermutations(permList, nameList);
    }
}
