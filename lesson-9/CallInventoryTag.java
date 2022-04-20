import java.util.Scanner;

public class CallInventoryTag {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        InventoryTag redSweater = new InventoryTag();
        int sweaterShipment;
        int sweaterInventoryBefore;

        sweaterInventoryBefore = redSweater.getQuantityRemaining();
        sweaterShipment = scnr.nextInt();

        System.out.println("Beginning tests.");

        redSweater.addInventory(sweaterShipment);
        if (redSweater.getQuantityRemaining() != sweaterShipment + sweaterInventoryBefore) {
            System.out.println("UNIT TEST FAILED: addInventory()");
        }
        System.out.println("Tests complete.");
    }
}
