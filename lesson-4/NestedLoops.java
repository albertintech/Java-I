import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

        System.out.println("Enter number of rows: ");
        numRows = scnr.nextInt();

        System.out.println("Enter number of columns: ");
        numColumns = scnr.nextInt();
        scnr.close();

        for (currentRow = 0; currentRow < numRows; currentRow++) {
            currentColumnLetter = 'A';
            for (currentColumn = 0; currentColumn < numColumns; currentColumn++) {
                System.out.print(currentRow + 1);
                System.out.print(currentColumnLetter + " ");
                currentColumnLetter++;
            }
        }

        System.out.println("");
    }
        
}
